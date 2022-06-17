package visao;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelador.Conectador;
import modelador.JDBCCliente;
import modelos.Cliente;


public class Principal extends javax.swing.JFrame implements ActionListener, MouseListener, WindowListener {
    JDBCCliente clientes = new JDBCCliente(new Conectador().abrirConnection());
   
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btn_NovoCadastro = new javax.swing.JButton();
        tabelaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(this);

        jPanel1.setBackground(new java.awt.Color(142, 81, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));

        jButton3.setText("jButton3");
        jButton3.addActionListener(this);

        btn_NovoCadastro.setText("NOVO CADASTRO");
        btn_NovoCadastro.addMouseListener(this);
        btn_NovoCadastro.addActionListener(this);

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Pedro", "Rua Alves", "9666", "14", "136"}
            },
            new String [] {
                "Código", "Nome", "Endereço", "Telefone", "RG", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 863, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(334, 334, 334))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_NovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(310, 310, 310))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tabelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(tabelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_NovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton3) {
            Principal.this.jButton3ActionPerformed(evt);
        }
        else if (evt.getSource() == btn_NovoCadastro) {
            Principal.this.btn_NovoCadastroActionPerformed(evt);
        }
    }

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == btn_NovoCadastro) {
            Principal.this.btn_NovoCadastroMouseClicked(evt);
        }
    }

    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
    }

    public void windowActivated(java.awt.event.WindowEvent evt) {
    }

    public void windowClosed(java.awt.event.WindowEvent evt) {
    }

    public void windowClosing(java.awt.event.WindowEvent evt) {
    }

    public void windowDeactivated(java.awt.event.WindowEvent evt) {
    }

    public void windowDeiconified(java.awt.event.WindowEvent evt) {
    }

    public void windowIconified(java.awt.event.WindowEvent evt) {
    }

    public void windowOpened(java.awt.event.WindowEvent evt) {
        if (evt.getSource() == Principal.this) {
            Principal.this.formWindowOpened(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void carregarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();
        modelo.setNumRows(0);
        for(Cliente cliente : clientes.listarCliente()){
            Object [] objeto = new Object[6];
            objeto[0] = cliente.getCodigo();
            objeto[1] = cliente.getNome();
            objeto[2] = cliente.getEndereco();
            objeto[3] = cliente.getTelefone();
            objeto[4] = cliente.getRG();
            objeto[5] = cliente.getCPF();
            modelo.addRow(objeto);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        carregarTabela();
    }//GEN-LAST:event_formWindowOpened

    private void btn_NovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoCadastroActionPerformed
        CadastroUsuario cadusu = new CadastroUsuario();
        cadusu.setVisible(true);
        Principal.add(cadusu);
    }//GEN-LAST:event_btn_NovoCadastroActionPerformed

    private void btn_NovoCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NovoCadastroMouseClicked
       
    }//GEN-LAST:event_btn_NovoCadastroMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NovoCadastro;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tabelaCliente;
    // End of variables declaration//GEN-END:variables
}