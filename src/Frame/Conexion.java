package Frame;
    
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Hashtable;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.lang.String;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

 
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/PF";
    public static final String USER = "root";
    public static final String CLAVE = "german001";
    public String CategoriaEquipo = "", FechaEvento = "";
    public ArrayList<String> names = new ArrayList<String>();
    public ArrayList<String> dates = new ArrayList<String>();
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }


    public void InsertarEvento(JTextField jTFNombreEvento, JTextField jTFFechaEvento1, JTextField jTFLocalizacionEvento)
    {
        try{
            Connection conecta = getConexion();
            CallableStatement procedimiento1 = conecta.prepareCall(" CALL alta_eve(?, ?, ?)");
            procedimiento1.setString(1, jTFNombreEvento.getText());
            procedimiento1.setString(2, jTFFechaEvento1.getText());
            procedimiento1.setString(3, jTFLocalizacionEvento.getText());
            procedimiento1.execute();
            
            procedimiento1.close();
            conecta.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void InsertarEquipo(JTextField jTFNombreEquipo, JComboBox jTFCategoria1, JTextField jTFInstitucion, JComboBox jTFNombreEvento1 , JTextField  jTFecha1)
    {
        try{
            Connection conecta = getConexion();
            CallableStatement procedimiento3 = conecta.prepareCall(" CALL alta_equi(?,?,?,?,?)");
            procedimiento3.setString(1, jTFNombreEquipo.getText());
            procedimiento3.setString(2, (String) jTFCategoria1.getSelectedItem());
            procedimiento3.setString(3, jTFInstitucion.getText());
            procedimiento3.setString(5, jTFecha1.getText()); 
            procedimiento3.setString(4, (String) jTFNombreEvento1.getSelectedItem());
            procedimiento3.execute();
            
            procedimiento3.close();
            conecta.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public String obtenerCategoriaEquipo (JTextField jTFNombreEquipo) {
        ResultSet rs = null;
        
        try {
            Connection conecta = getConexion();
            CallableStatement procedimiento = conecta.prepareCall(" CALL get_categoriaEquipo(?)");
            rs = procedimiento.executeQuery();
            int i = 0;
            
            while(rs.next()){
                CategoriaEquipo = rs.getString(i);
                i++;
            }
        } catch(Exception e){
            System.out.println(e);
        }
        return CategoriaEquipo;
    }
    
    public void InsertarIntegrantes (JTextField jTFCurp1, JTextField jTFNombreIntegrante1, JSpinner JSpinner1, JComboBox jCBNombreEquipo, JComboBox jComboBoxNombreEvento, JTextField jTFFechaEvento) {
        try {
            Connection conecta = getConexion();
            CallableStatement procedimiento = conecta.prepareCall(" CALL alta_inte(?,?,?,?,?,?)");
            if (CategoriaEquipo == "Primaria") {
                if ((Integer)JSpinner1.getValue() > 6  && (Integer)JSpinner1.getValue() < 13){
                    procedimiento.setString(1, jTFCurp1.getText());
                    procedimiento.setString(2, jTFNombreIntegrante1.getText());
                    procedimiento.setInt(3, (Integer) JSpinner1.getValue());
                    procedimiento.setString(4, (String) jCBNombreEquipo.getSelectedItem());
                    procedimiento.setString(5, (String) jComboBoxNombreEvento.getSelectedItem());
                    procedimiento.setString(6, jTFFechaEvento.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Edad no Coincide con Categoria");
                }
            } else if (CategoriaEquipo == "Secundaria") {
                if ((Integer) JSpinner1.getValue() > 12 && (Integer) JSpinner1.getValue() < 16){
                    procedimiento.setString(1, jTFCurp1.getText());
                    procedimiento.setString(2, jTFNombreIntegrante1.getText());
                    procedimiento.setInt(3, (Integer) JSpinner1.getValue());
                    procedimiento.setString(4, (String) jCBNombreEquipo.getSelectedItem());
                    procedimiento.setString(5, (String) jComboBoxNombreEvento.getSelectedItem());
                    procedimiento.setString(6, jTFFechaEvento.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Edad no Coincide con Categoria");
                }
            } else if (CategoriaEquipo == "Preparatoria") {
                if ((Integer) JSpinner1.getValue() > 15 && (Integer) JSpinner1.getValue() < 18){
                    procedimiento.setString(1, jTFCurp1.getText());
                    procedimiento.setString(2, jTFNombreIntegrante1.getText());
                    procedimiento.setInt(3, (Integer) JSpinner1.getValue());
                    procedimiento.setString(4, (String) jCBNombreEquipo.getSelectedItem());
                    procedimiento.setString(5, (String) jComboBoxNombreEvento.getSelectedItem());
                    procedimiento.setString(6, jTFFechaEvento.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Edad no Coincide con Categoria");
                }
            } else if (CategoriaEquipo == "Profesional") {
                if ((Integer) JSpinner1.getValue() > 17){
                    procedimiento.setString(1, jTFCurp1.getText());
                    procedimiento.setString(2, jTFNombreIntegrante1.getText());
                    procedimiento.setInt(3, (Integer) JSpinner1.getValue());
                    procedimiento.setString(4, (String) jCBNombreEquipo.getSelectedItem());
                    procedimiento.setString(5, (String) jComboBoxNombreEvento.getSelectedItem());
                    procedimiento.setString(6, jTFFechaEvento.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Edad no Coincide con Categoria");
                }
            }
        } catch(Exception e){
            System.out.println(e);
        } 
    }
    
    public void InsertarJurado(JTextField nombre, JComboBox Categoria, JComboBox NombreEvento, JTextField Fecha)
    {
        try{
            Connection conecta = getConexion();
            CallableStatement procedimiento2 = conecta.prepareCall(" CALL alta_jur(?,?,?,?)");
            procedimiento2.setString(1, nombre.getText());
            procedimiento2.setString(2, (String) Categoria.getSelectedItem());
            procedimiento2.setString(3, (String) NombreEvento.getSelectedItem());
            procedimiento2.setString(4, Fecha.getText());
            procedimiento2.execute();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
    
    public ArrayList<String> obtenerEventos () {
        
        ResultSet rs = null;
        try {
            
            Connection conecta = getConexion();
            CallableStatement procedimiento = conecta.prepareCall("CALL ver_eventosTodos()");
            rs = procedimiento.executeQuery();

            while(rs.next()){
                names.add(rs.getString(1));
                dates.add(rs.getString(2));
            }


        } catch(SQLException e) {
            System.out.println("Error: "+(String)e.getMessage());
        }
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println("size = "+names.size());
        return names;
    }
    
    public Integer obtenerIDs (){
        ResultSet rs = null;
        Integer Id = 0;
        try {
            Connection conecta = getConexion();
            CallableStatement procedimiento = conecta.prepareCall("{CALL get_EquipoIDs()}");
            rs = procedimiento.executeQuery();
            
            while(rs.next()){
                Id = rs.getInt(1);
                //System.out.println(FechaEvento);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        //System.out.println(FechaEvento);
        return Id+1;
    }
    
    public void BajaEquipo (JTextField jTFNombreEquipo) {
    try{
            Connection conecta = getConexion();
            CallableStatement procedimiento5 = conecta.prepareCall("CALL baja_equip(?)");
            procedimiento5.setString(1, jTFNombreEquipo.getText());
            procedimiento5.execute();
        
    } catch(Exception e){
        System.out.println(e);
        }
    }

}