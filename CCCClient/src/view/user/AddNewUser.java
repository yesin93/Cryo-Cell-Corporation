/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.user;

import connector.ServerConnector;
import controller.UserController;
import java.awt.Color;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Admin;

/**
 *
 * @author thanu
 */
public class AddNewUser extends javax.swing.JDialog {

    /**
     * Creates new form AddNewUser
     */
    public AddNewUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        usearchLabel = new javax.swing.JLabel();
        priviledgeText = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        userButton = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();
        usernameText = new javax.swing.JTextField();
        priviledgeLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        psearchLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        usearchLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        usearchLabel.setForeground(new java.awt.Color(0, 0, 255));

        priviledgeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priviledgeTextKeyReleased(evt);
            }
        });

        cancelButton.setText("cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        userButton.setText("Create new User");
        userButton.setEnabled(false);
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTextKeyReleased(evt);
            }
        });

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        usernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTextKeyReleased(evt);
            }
        });

        priviledgeLabel.setText("Priviledge");

        passwordLabel.setText("Password");

        usernameLabel.setText("User Name");

        psearchLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usernameLabel)
                                .addGap(73, 73, 73)
                                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 108, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordLabel)
                                        .addGap(73, 73, 73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(priviledgeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priviledgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(psearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usearchLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordText))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priviledgeLabel)
                            .addComponent(priviledgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(psearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userButton)
                    .addComponent(cancelButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priviledgeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priviledgeTextKeyReleased
        setUserButtonEnabled();
        usearchLabel.setText("");
        psearchLabel.setText("");
        int caretPosition = priviledgeText.getCaretPosition();
        String privi = priviledgeText.getText();
        if (!privi.matches("^[()0-9 ]*$")) {
            priviledgeText.setText(privi.substring(0, caretPosition - 1) + privi.substring(caretPosition));
            priviledgeText.setCaretPosition(caretPosition - 1);
        }
    }//GEN-LAST:event_priviledgeTextKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        String name = usernameText.getText();
        String pass = new String(passwordText.getPassword());
        int privi = Integer.parseInt(priviledgeText.getText());
        Admin user = new Admin(name, pass, privi);
        try {
            UserController userController=ServerConnector.getServerConnector().getUserController();
            int res = userController.addUser(user);
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "User created successfully");
                usernameText.setText("");
                passwordText.setText("");
                priviledgeText.setText("");
                userButton.setEnabled(false);
                usearchLabel.setText("");
                psearchLabel.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "user created failed");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_userButtonActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        priviledgeText.requestFocus();
    }//GEN-LAST:event_passwordTextActionPerformed

    private void passwordTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyReleased
        setUserButtonEnabled();
        usearchLabel.setText("");
        String password = new String(passwordText.getPassword());
        int length = password.length();
        if (length <= 5) {
            psearchLabel.setForeground(Color.red);
            psearchLabel.setText("Strength: Weak");
        } else if (length > 5 & length < 10) {
            psearchLabel.setForeground(Color.pink);
            psearchLabel.setText("Strength: Medium");
        } else if (length >= 10) {
            psearchLabel.setForeground(Color.orange);
            psearchLabel.setText("Strength: Strong");
        }
    }//GEN-LAST:event_passwordTextKeyReleased

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        passwordText.requestFocus();
    }//GEN-LAST:event_usernameTextActionPerformed

    private void usernameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextKeyReleased
        try {
            setUserButtonEnabled();
            psearchLabel.setText("");
            String utext = usernameText.getText();

            UserController userController=ServerConnector.getServerConnector().getUserController();
            
            String[] usernamearray = userController.getAllUsers();
            System.out.println(usernamearray);
            if (usernamearray != null) {
                for (String name : usernamearray) {
                    if (utext.equals(name)) {
                        usearchLabel.setForeground(Color.blue);
                        usearchLabel.setText("UserName Already exists");
                        break;
                    } else if (!utext.equals(name)) {
                        int length = utext.length();
                        if (length <= 5) {
                            usearchLabel.setForeground(Color.red);
                            usearchLabel.setText("Strength: Weak");
                        } else if (length > 5 & length < 10) {
                            usearchLabel.setForeground(Color.pink);
                            usearchLabel.setText("Strength: Medium");
                        } else if (length >= 10) {
                            usearchLabel.setForeground(Color.orange);
                            usearchLabel.setText("Strength: Strong");
                        }
                    }
                }
            } else {
                int length = utext.length();
                if (length <= 5) {
                    usearchLabel.setForeground(Color.red);
                    usearchLabel.setText("Strength: Weak");
                } else if (length > 5 & length < 10) {
                    usearchLabel.setForeground(Color.pink);
                    usearchLabel.setText("Strength: Medium");
                } else if (length >= 10) {
                    usearchLabel.setForeground(Color.orange);
                    usearchLabel.setText("Strength: Strong");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_usernameTextKeyReleased

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
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewUser dialog = new AddNewUser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel priviledgeLabel;
    private javax.swing.JTextField priviledgeText;
    private javax.swing.JLabel psearchLabel;
    private javax.swing.JLabel usearchLabel;
    private javax.swing.JButton userButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
//buuton enable
    public void setUserButtonEnabled() {
        boolean b = usernameText.getText().isEmpty() || new String(passwordText.getPassword()).isEmpty() || priviledgeText.getText().isEmpty();
        userButton.setEnabled(!b);
    }

}
