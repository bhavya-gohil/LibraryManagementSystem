/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.anshdawda;

import javax.swing.JOptionPane;

/**
 *
 * @author anshd
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        backButton = new javax.swing.JButton();
        newUserLabel = new javax.swing.JLabel();
        titleTextPane = new javax.swing.JTextPane();
        clickHereLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        togglePasswordButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setTitle("Login");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        newUserLabel.setText("New User?");

        titleTextPane.setEditable(false);
        titleTextPane.setBorder(null);
        titleTextPane.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        titleTextPane.setText("Library\nManagement\nSystem");
        titleTextPane.setAutoscrolls(false);
        titleTextPane.setFocusable(false);
        titleTextPane.setOpaque(false);
        titleTextPane.setRequestFocusEnabled(false);

        clickHereLabel.setText("Click Here");
        clickHereLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clickHereLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickHereLabelMouseClicked(evt);
            }
        });

        usernameLabel.setText("Username:");
        usernameLabel.setToolTipText("");

        passwordLabel.setText("Password:");

        togglePasswordButton.setText("Show Password");
        togglePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePasswordButtonActionPerformed(evt);
            }
        });

        helpButton.setText("?");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleTextPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(usernameTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(togglePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newUserLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clickHereLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(togglePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(submitButton)
                    .addComponent(newUserLabel)
                    .addComponent(clickHereLabel)
                    .addComponent(backButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(backButton, "Are you sure?", "Back", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void clickHereLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickHereLabelMouseClicked
        // TODO add your handling code here:
        Register register = new Register();
        getParent().add(register);
//        Main.getInstance().getPortada().getDesktop().moveToFront(register);
        register.setSize(getParent().getWidth(), getParent().getHeight());
        register.setLocation(0, 0);
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_clickHereLabelMouseClicked

    private void togglePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePasswordButtonActionPerformed
        // TODO add your handling code here:
        if (passwordField.getEchoChar() == (char) 0) {
            passwordField.setEchoChar('\u2022');
            togglePasswordButton.setText("Show Password");
        } else {
            passwordField.setEchoChar((char) 0);
            togglePasswordButton.setText("Hide Password");
        }
    }//GEN-LAST:event_togglePasswordButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
            null,
            "Username:\n"
            + "1. The username length should have greater than 6 and less than 25 characters.\n"
            + "2. The username shouldn't contain any spances.\n"
            + "\n"
            + "Password:\n"
            + "1. The password should be atleast 8 characters long.\n"
            + "2. The password should contain atleast one uppercase letter.\n"
            + "3. The password should contain atleast one of the following symbols - '!', '@' and/or '#'.",
            "Username & Password help",
            JOptionPane.QUESTION_MESSAGE
        );
    }//GEN-LAST:event_helpButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(clearButton, "Are you sure?", "Clear", JOptionPane.YES_NO_OPTION) == 0) {
            usernameTextField.setText("");
            passwordField.setText("");
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordField.getPassword());
        boolean areAllFieldsFilled
        = !username.isBlank()
        && !password.isBlank();
        if (areAllFieldsFilled) {
            String passwordMessage = isValidPassword(password);
            if (!isValidUsername(username)) {
                JOptionPane.showMessageDialog(submitButton,
                    "Username does not exist!",
                    "Invalid Username",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (passwordMessage != null) {
                JOptionPane.showMessageDialog(submitButton,
                    passwordMessage,
                    "Invalid Password",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(submitButton,
                    "Successfully logged in!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(submitButton,
                "The form data is missing.",
                "Empty fields",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    boolean isValidUsername(String username) {
        return (6 <= username.length() && username.length() <= 25);
    }

    String isValidPassword(String password) {
        if (password.length() < 8
                || password.chars().filter(Character::isUpperCase).findAny().isEmpty()
                || !(password.contains("!") || password.contains("@") || password.contains("#"))) {
            return "Invalid password!";
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel clickHereLabel;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextPane titleTextPane;
    private javax.swing.JButton togglePasswordButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
