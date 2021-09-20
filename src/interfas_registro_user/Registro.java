/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfas_registro_user;


import java.awt.HeadlessException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

//import java.util.*;


//import java.sql.Connection;

//import java.lang.ClassNotFoundException;


/**
 *
 * @author edgo1
 */
public class Registro extends javax.swing.JFrame {
    // Configuracion de la conexion de mi base de datos, puerto, usuario, y contraseña
    public static  String URL = "jdbc:mysql://127.0.0.1:3306/registro_personas";
    public static  String usuario = "root";
    public static  String contraseña = "admin";
    
    //Preparacion de la ejecucion de consultas parametrizadas en SQL
    PreparedStatement ps;
    //Resultados de ejecutar una consulta SQL
    ResultSet rs;

    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    public Connection getconnection(){
        Connection conexion=null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion =  (Connection) DriverManager.getConnection(URL,usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            System.out.println("Error"+ex);
        }
        return conexion;
    }
    
//    public void agregardatos(){
//        try{
//            object dato[]=new object[5];
//            do{
//                dato[0]=Integer.parseInt(txtidentificacion.getText());
//                dato[1]=txtnombre.getText();
//                if (buttonmasculino.isSelected()) {
//                    buttonmasculino.setSelected(true);
//                    dato[2]=buttonmasculino.getText();
//                }else{
//                    dato[2]=buttonfemenino.getText();
//                }
//                
//            }while((!txtnombre.getText().equals(""))&&(txtidentificacion.getText().equals(""))&&(!txtfechanacimiento.getText().equals("")));
//            Table_datos1.addRow(dato);
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revisar");
//        }
//    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ec = new javax.swing.JComboBox<>();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        fechan = new javax.swing.JTextField();
        sexof = new javax.swing.JRadioButton();
        sexom = new javax.swing.JRadioButton();
        buttonSalir = new javax.swing.JButton();
        cargartabla = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        ButtonLimpiar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        ButtonRegistrar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Aprendiz");
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 220, -1));

        jLabel2.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel2.setText("Identificacion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 104, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel4.setText("Estado Civil");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 153, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel5.setText("Sexo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 312, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel7.setText("Numero de Identificacion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, 20));

        ec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Soltero(a)", "Casado(a)", "Union Libre", "Divorciado(a)", "Viudo(a)" }));
        getContentPane().add(ec, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 148, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 59, 205, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 102, 205, -1));
        getContentPane().add(fechan, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 310, 180, -1));

        sexo.add(sexof);
        sexof.setText("Femenino");
        getContentPane().add(sexof, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        sexo.add(sexom);
        sexom.setText("Masculino");
        getContentPane().add(sexom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 80, 40));

        cargartabla.setText("Cargar Tabla");
        cargartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargartablaActionPerformed(evt);
            }
        });
        getContentPane().add(cargartabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 120, 40));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 90, 40));

        ButtonLimpiar.setText("Limpiar");
        ButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        ButtonRegistrar.setText("Registrar");
        ButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 110, 50));
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 160, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Estado Civil", "Sexo", "Fecha de nacimiento"
            }
        ));
        jScrollPane4.setViewportView(tabla);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 560, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        
    }//GEN-LAST:event_txtidActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
       Connection conexion = getconnection();
               
        try {
            ps= conexion.prepareStatement("update persona set identificacion = ?, nombre = ?, estado_civil = ?, sexo = ?, fecha_nacimiento = ? where identificacion=?");
            ps.setString(1, txtid.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, ec.getSelectedItem().toString());
            if (sexof.isSelected()) {
                ps.setString(4, sexof.getText());
            }else{
                if (sexom.isSelected()) {
                    ps.setString(4, sexom.getText());
                }
            }
            ps.setDate(5, Date.valueOf(fechan.getText()));
            ps.setInt(6, Integer.parseInt(txtbuscar.getText()));
            
            int resp= ps.executeUpdate();
            if (resp >0) {
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Los datos no fueron Actualiados");
            }
            
        } catch (SQLException | IllegalArgumentException | HeadlessException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No hay datos a modificar");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Connection conexion= getconnection();
        
        try{
        ps = conexion.prepareStatement("delete from persona where identificacion = ?");
        ps.setInt(1, Integer.parseInt(txtbuscar.getText()));
        
        int resultado =ps.executeUpdate();
            if (resultado>0) {
                JOptionPane.showMessageDialog(null, "Se han Eliminado los datos correctamente");
                limpiarcajas();
            }else{
                JOptionPane.showMessageDialog(null, "No se han podido eliminar los datos");
            }
                
        }catch (SQLException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Por favor digite el numero de cedula para borrar el registro");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarActionPerformed

        
        try{
            Connection conexion = getconnection();
            ps = conexion.prepareStatement("insert into persona(identificacion, nombre, estado_civil, sexo, fecha_nacimiento) values(?,?,?,?,?)");
            ps.setString(1, txtid.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, ec.getSelectedItem().toString());
            if (sexof.isSelected()) {
                ps.setString(4, sexof.getText());
            }else{
                ps.setString(4, sexom.getText());
            }
            ps.setDate(5, Date.valueOf(fechan.getText()));
            
            int respuesta = ps.executeUpdate();
            
            //Conocer si los datos ya fueron registrados
            if (respuesta>0) {
                JOptionPane.showMessageDialog(null, "Registro Almacenado");
                limpiarcajas();
            }else{
                JOptionPane.showMessageDialog(null, "Los mensajes no fueron almacenados");
            }
            
        }catch (SQLException | HeadlessException | NullPointerException | IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, "Por favor, Agregar los datos / Ese numero de cedula ya existe");
        } 
        
    }//GEN-LAST:event_ButtonRegistrarActionPerformed
//limpiar
    public void limpiarcajas(){
        txtid.setText(null);
        txtnombre.setText(null);
        sexo.clearSelection();
        ec.setSelectedItem(null);
        fechan.setText(null);
        txtbuscar.setText(null);
    }
    
    private void ButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpiarActionPerformed
       limpiarcajas();
    }//GEN-LAST:event_ButtonLimpiarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Connection conexion = getconnection();

        try {
            ps = conexion.prepareStatement("select * from persona where identificacion = ?");
            ps.setString(1, txtbuscar.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                txtid.setText(rs.getString("identificacion"));
                txtnombre.setText((rs.getString("nombre")));
                ec.setSelectedItem(rs.getString("estado_civil"));
                String sexo = rs.getString("sexo");
                if (sexo.equals(sexof.getText())) {
                    sexof.setSelected(true);
                }else {
                    if (sexo.equals(sexom.getText())) {
                        sexom.setSelected(true);
                    }
                }
                fechan.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                
            }
                    
                    } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void cargartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargartablaActionPerformed
      DefaultTableModel mt = new DefaultTableModel();
      tabla.setModel(mt);
      String campo = txtbuscar.getText();
      String idb= "" ;
      if(!"".equals(campo)){
          idb = "where identificacion = '"+campo+"'";
      }  
        Connection conexion = getconnection();
        
               try { 
                   ps = conexion.prepareStatement("select * from persona"+idb);
                   rs = ps.executeQuery();
                   
                   mt.addColumn("Ienditificacion");
                   mt.addColumn("Nombre");
                   mt.addColumn("Estado Civil");
                   mt.addColumn("sexo");
                   mt.addColumn("Fecha de nacimiento ");
                   
                   ResultSetMetaData RSMD = rs.getMetaData();
                   int cantcolum = RSMD.getColumnCount();
                   
                   while(rs.next()){
                       Object fila [] = new Object[cantcolum];
                       for (int i = 0; i < cantcolum; i++) {
                           fila[i] = rs.getObject(i+1);   
                       }
                       mt.addRow(fila);
                   }
                   
               } catch (SQLException ex) {
                   java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }

    }//GEN-LAST:event_cargartablaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JButton ButtonRegistrar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JButton cargartabla;
    private javax.swing.JComboBox<String> ec;
    private javax.swing.JTextField fechan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JRadioButton sexof;
    private javax.swing.JRadioButton sexom;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
