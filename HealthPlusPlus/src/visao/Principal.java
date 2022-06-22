package visao;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelador.Conectador;
import modelador.JDBCCliente;
import modelos.Cliente;


public class Principal extends javax.swing.JFrame implements ActionListener, MouseListener, WindowListener, FocusListener {
    private JDBCCliente clientes = new JDBCCliente(new Conectador().abrirConnection());
   
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
        btn_agendamento = new javax.swing.JButton();
        btn_NovoCadastro = new javax.swing.JButton();
        tabelaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HeatlhPlusPlus - Tela Principal");
        addFocusListener(this);
        addWindowListener(this);

        jPanel1.setBackground(new java.awt.Color(142, 81, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));
        jPanel1.setLayout(null);

        btn_agendamento.setText("AGENDAR CONSULTA");
        btn_agendamento.addActionListener(this);
        jPanel1.add(btn_agendamento);
        btn_agendamento.setBounds(1300, 650, 250, 86);

        btn_NovoCadastro.setText("NOVO CADASTRO");
        btn_NovoCadastro.addMouseListener(this);
        btn_NovoCadastro.addActionListener(this);
        jPanel1.add(btn_NovoCadastro);
        btn_NovoCadastro.setBounds(1300, 560, 250, 83);

        tabelaCliente.setBackground(new java.awt.Color(153, 153, 153));
        tabelaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
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
        tabelaCliente.setShowGrid(true);
        jPanel1.add(tabelaCliente);
        tabelaCliente.setBounds(10, 10, 1040, 670);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-130, -50, 1600, 900);

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
        if (evt.getSource() == btn_agendamento) {
            Principal.this.btn_agendamentoActionPerformed(evt);
        }
        else if (evt.getSource() == btn_NovoCadastro) {
            Principal.this.btn_NovoCadastroActionPerformed(evt);
        }
    }

    public void focusGained(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == Principal.this) {
            Principal.this.formFocusGained(evt);
        }
    }

    public void focusLost(java.awt.event.FocusEvent evt) {
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
            Object[] objeto = {cliente.getCodigo(), cliente.getNome(), cliente.getEndereco(), cliente.getTelefone(), cliente.getRG(), cliente.getCPF()};
            modelo.addRow(objeto);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        carregarTabela();
    }//GEN-LAST:event_formWindowOpened

    private void btn_NovoCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NovoCadastroMouseClicked
        
    }//GEN-LAST:event_btn_NovoCadastroMouseClicked

    private void btn_agendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendamentoActionPerformed
        
    }//GEN-LAST:event_btn_agendamentoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        carregarTabela();
    }//GEN-LAST:event_formFocusGained

    private void btn_NovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoCadastroActionPerformed
       Cadastrar_Cliente cadastro = new Cadastrar_Cliente(this);
       cadastro.setVisible(true);
    }//GEN-LAST:event_btn_NovoCadastroActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        
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

         Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NovoCadastro;
    private javax.swing.JButton btn_agendamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tabelaCliente;
    // End of variables declaration//GEN-END:variables
}