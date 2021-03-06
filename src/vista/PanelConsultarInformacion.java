/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.InformacionLogica;
import logica.IntegranteLogica;
import modelo.Informacion;
import modelo.Integrante;

/**
 *
 * @author Konita
 */
public class PanelConsultarInformacion extends javax.swing.JPanel {
    
    InformacionLogica infoLogica;
    IntegranteLogica integranteLogica;
    DefaultTableModel modelo;
    /**
     * Creates new form PanelConsultarInformacion
     */
    public PanelConsultarInformacion() {
        initComponents();
        infoLogica = new InformacionLogica();
        integranteLogica = new IntegranteLogica();
        modelo = (DefaultTableModel) consultasTabla.getModel();
        modificarBoton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        ubicacionBoton = new javax.swing.JButton();
        cedulaBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultasTabla = new javax.swing.JTable();
        modificarBoton = new javax.swing.JButton();

        tituloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Consultar información");

        ubicacionBoton.setText("Buscar por ubicación");
        ubicacionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionBotonActionPerformed(evt);
            }
        });

        cedulaBoton.setText("Buscar por identificación");
        cedulaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaBotonActionPerformed(evt);
            }
        });

        consultasTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "# identificación", "Tipo", "Ubicación", "Cantidad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(consultasTabla);
        if (consultasTabla.getColumnModel().getColumnCount() > 0) {
            consultasTabla.getColumnModel().getColumn(0).setResizable(false);
            consultasTabla.getColumnModel().getColumn(0).setPreferredWidth(1);
            consultasTabla.getColumnModel().getColumn(1).setResizable(false);
            consultasTabla.getColumnModel().getColumn(1).setPreferredWidth(70);
            consultasTabla.getColumnModel().getColumn(2).setResizable(false);
            consultasTabla.getColumnModel().getColumn(2).setPreferredWidth(185);
            consultasTabla.getColumnModel().getColumn(3).setResizable(false);
            consultasTabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            consultasTabla.getColumnModel().getColumn(4).setResizable(false);
            consultasTabla.getColumnModel().getColumn(4).setPreferredWidth(40);
            consultasTabla.getColumnModel().getColumn(5).setResizable(false);
            consultasTabla.getColumnModel().getColumn(5).setPreferredWidth(35);
        }

        modificarBoton.setText("Modificar");
        modificarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(ubicacionBoton)
                        .addGap(43, 43, 43)
                        .addComponent(cedulaBoton)
                        .addGap(47, 47, 47)
                        .addComponent(modificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaBoton)
                    .addComponent(ubicacionBoton)
                    .addComponent(modificarBoton))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ubicacionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionBotonActionPerformed
        // TODO add your handling code here:
        
        try{
        
            String entrada = JOptionPane.showInputDialog(this, "Introduzca la ubicación");
            
            try{
                List<Informacion> info = infoLogica.buscarInformacion(entrada);
                info.get(0);
                int numeroFilas = modelo.getRowCount();
                for (int i = 0; i < numeroFilas; i++) {
                    modelo.removeRow(0);
                }
                for (int i = 0; i < info.size(); i++) {
                    modelo.addRow(new Object[]{info.get(i).getIdInformacion(),info.get(i).getCedulaIntegrante().getCedulaIntegrante(),
                                               info.get(i).getDescripcionInformacion(),info.get(i).getUbicacionInformacion(),
                                               info.get(i).getCantidadInformacion(), info.get(i).getEstadoInformacion()});
                }  
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "No existen registros en esa ubicación");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Introduzca una ubicación valida");
        }
        modificarBoton.setEnabled(true);
        
    }//GEN-LAST:event_ubicacionBotonActionPerformed

    private void cedulaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaBotonActionPerformed
        // TODO add your handling code here:
        try{
            String entrada = JOptionPane.showInputDialog(this, "Introduzca el numero de identificación:");
            try{
                Integrante integrante = integranteLogica.buscarIntegrante(Integer.parseInt(entrada));
                integrante.getCedulaIntegrante();
                List<Informacion> info = infoLogica.buscarInformacion(integrante);
                int numeroFilas = modelo.getRowCount();
                for (int i = 0; i < numeroFilas; i++) {
                    modelo.removeRow(0);
                }
                for (int i = 0; i < info.size(); i++) {
                    modelo.addRow(new Object[]{info.get(i).getIdInformacion(),info.get(i).getCedulaIntegrante().getCedulaIntegrante(),
                                               info.get(i).getDescripcionInformacion(),info.get(i).getUbicacionInformacion(),
                                               info.get(i).getCantidadInformacion(), info.get(i).getEstadoInformacion()});
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "El integrante no se encuentra registrado");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Introduzca un numero valido de identificación");
        }
        
        modificarBoton.setEnabled(true);
        
    }//GEN-LAST:event_cedulaBotonActionPerformed

    private void modificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBotonActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        PanelRegistrarInformacion panelModificar = new PanelRegistrarInformacion();
        panelModificar.setBounds(0, 0, 650, 450);
        panelModificar.setVisible(true);
        this.add(panelModificar);
        panelModificar.getModificarTitulo().setVisible(true);
        panelModificar.getRegistrarTitulo().setVisible(false);
        panelModificar.getRegistrarBoton().setVisible(false);
        panelModificar.getModificarBoton().setVisible(true);
        
        int fila = consultasTabla.getSelectedRow();
        panelModificar.getIdText().setText(modelo.getValueAt(fila, 0)+"");
        panelModificar.getCedulaText().setText(modelo.getValueAt(fila, 1)+"");
        panelModificar.getCedulaText().setEnabled(false);
        panelModificar.getDescripcionComboBox().setSelectedItem(modelo.getValueAt(fila, 2));
        panelModificar.getUbicacionText().setText(modelo.getValueAt(fila, 3)+"");
        panelModificar.getCantidadSpinner().setValue(modelo.getValueAt(fila, 4));
        panelModificar.getEstadoComboBox().setSelectedItem(modelo.getValueAt(fila, 5));
        this.repaint();
    }//GEN-LAST:event_modificarBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cedulaBoton;
    private javax.swing.JTable consultasTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBoton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton ubicacionBoton;
    // End of variables declaration//GEN-END:variables
}
