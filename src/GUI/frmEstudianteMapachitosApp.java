/*

 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * // @author 21TE0284 y 21TE0704
 *
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Clases.*;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

public class frmEstudianteMapachitosApp extends javax.swing.JFrame {

    /**
     * Creates new form frmEstudianteMapachitosApp
     */
    Lectura lectura;
    Escritura escritura;
    EstudianteArrayList estudiante;
    DefaultTableModel modelo;
    
    public frmEstudianteMapachitosApp() {
        initComponents();
        estudiante = new EstudianteArrayList();
        lectura = new Lectura();
        modelo = (DefaultTableModel) tblEstudiantes.getModel();
        LlenarTabla();
        setLocationRelativeTo(null);
    }
    
    private void LimpiarTabla() {
        int filas = tblEstudiantes.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }
    
    private void LlenarTabla() {
        lectura.DefinirPath("C:/ED/21TE0284.txt");
        estudiante.Copiar(lectura.ObtenerEstudiantesArrayList());
        LimpiarTabla();
        List<Estudiante> ptemp = estudiante.ConsultaEstudiante();
        for (Estudiante e : ptemp) {
            modelo.addRow(new Object[]{e.getMatricula(), e.getNombre(), e.getCalificacion(), e.getEstatus()});
        }
    }
    
    private void Escribir() {
        escritura = new Escritura();
        escritura.DefinirPath("C:/ED/21TE0284.txt", false);
        for (Estudiante e : estudiante.ConsultaEstudiante()) {
            escritura.Escribir(e.toString());
        }
        escritura.CerrarArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbAgregarEstudiantes = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCalificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbIntegrantesEquipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));

        tblEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        tblEstudiantes.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tblEstudiantes.setForeground(new java.awt.Color(0, 0, 0));
        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Calificación", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstudiantesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblEstudiantesMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstudiantes);

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabla de estudiantes");

        jPanel3.setBackground(java.awt.SystemColor.control);

        jbAgregarEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAgregarEstudiantes.setText("Agregar");
        jbAgregarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarEstudiantesActionPerformed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jbAgregarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarEstudiantes)
                    .addComponent(jbBuscar)
                    .addComponent(jbActualizar)
                    .addComponent(jbEliminar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Matricula");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Calificación");

        tfMatricula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCalificacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(tfNombre)
                    .addComponent(tfCalificacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Aplicación de registro");

        jbIntegrantesEquipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbIntegrantesEquipo.setText("Integrantes del equipo de examen ");
        jbIntegrantesEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIntegrantesEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jbIntegrantesEquipo))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbIntegrantesEquipo)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarEstudiantesActionPerformed
        
        if (estudiante.BuscarEstudiante(tfMatricula.getText()) != true) {
            String matricula = tfMatricula.getText();
            String nombre = tfNombre.getText();
            if (Byte.parseByte(tfCalificacion.getText()) < 0 || Byte.parseByte(tfCalificacion.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "Ingrese una calificación del 0-100");
                
            } else {
                byte calificacion = Byte.parseByte(tfCalificacion.getText());
                
                Estudiante p = new Estudiante(matricula, nombre, calificacion);
                estudiante.AgregarEstudiante(p);
                Escribir();
                JOptionPane.showMessageDialog(null, "Agregado");
                LlenarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe una matricula llamada:" + tfMatricula.getText());
            JOptionPane.showMessageDialog(null, "ESTUDIANTE: " + "\n " + estudiante.ObtenerEstudiante(tfMatricula.getText()));
        }
        

    }//GEN-LAST:event_jbAgregarEstudiantesActionPerformed

    private void tblEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstudiantesMouseClicked
        tfMatricula.setEnabled(false);
        int nf = tblEstudiantes.getSelectedRow();
//        tfMatricula.setEnabled(false);
        String matri = tblEstudiantes.getValueAt(nf, 0).toString();
        String nom = tblEstudiantes.getValueAt(nf, 1).toString();
        short calificacion = (byte) tblEstudiantes.getValueAt(nf, 2);
        
        tfMatricula.setText(String.valueOf(matri));
        tfNombre.setText(nom);
        tfCalificacion.setText(String.valueOf(calificacion));
    }//GEN-LAST:event_tblEstudiantesMouseClicked

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (estudiante.BuscarEstudiante(tfMatricula.getText()) == false) {
            JOptionPane.showMessageDialog(null, "No existe un estudiante con la matricula: " + tfMatricula.getText());
        } else {
            JOptionPane.showMessageDialog(null, "ESTUDIANTE ENCONTRADO: " + "\n " + estudiante.ObtenerEstudiante(tfMatricula.getText()));
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        
        int index = tblEstudiantes.getSelectedRow(); //indica la fila que seleccionas
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun alumno de la tabla");
        } else {
            int nf = tblEstudiantes.getSelectedRow();
            
            String matri = tblEstudiantes.getValueAt(nf, 0).toString();
            String nombre = tfNombre.getText();
            if (Byte.parseByte(tfCalificacion.getText()) < 0 || Byte.parseByte(tfCalificacion.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "La calificación debe estar en un rango de 0-100");
            } else {
                byte calif = Byte.parseByte(tfCalificacion.getText());
                int indice = tblEstudiantes.getSelectedRow();
                
                Estudiante p = new Estudiante(matri, nombre, calif);
                estudiante.ActualizarEstudiante(indice, p);
                JOptionPane.showMessageDialog(null, "Actualizado");
                Escribir();
                LlenarTabla();
            }
            
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        String matricula = JOptionPane.showInputDialog("Ingrese una matricula");
        
        Estudiante e = estudiante.ObtenerEstudiante(matricula);
        if (estudiante.ConocerEstatus(matricula) == "Bueno" || estudiante.ConocerEstatus(matricula) == "Excelente") {
            int decision;
            decision = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminarlo?");
            if (decision != 0) {
                JOptionPane.showMessageDialog(null, "Estudiante no eliminado");
            } else {
                if (e != null) {
                    estudiante.Eliminar(e);
                    Escribir();
                    LlenarTabla();
                    JOptionPane.showMessageDialog(null, "Eliminado");
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden eliminar alumnos reprobados");
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbIntegrantesEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIntegrantesEquipoActionPerformed
        JOptionPane.showMessageDialog(null, "Alejandro Tejeda Moreno 3A 21TE0284\n" + "Carlos Jorge Conde 3A 21TE0704");
    }//GEN-LAST:event_jbIntegrantesEquipoActionPerformed

    private void tblEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstudiantesMouseExited
        tfMatricula.setEnabled(true);
    }//GEN-LAST:event_tblEstudiantesMouseExited

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
            java.util.logging.Logger.getLogger(frmEstudianteMapachitosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstudianteMapachitosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstudianteMapachitosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstudianteMapachitosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEstudianteMapachitosApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbAgregarEstudiantes;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbIntegrantesEquipo;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTextField tfCalificacion;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
