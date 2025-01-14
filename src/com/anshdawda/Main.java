/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package com.anshdawda;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Ansh Dawda
 */
public class Main extends javax.swing.JFrame {

    User user;
    LibraryConnection connection;

    /**
     * Creates new form NewMDIApplication
     */
    public Main() {
        connection = LibraryConnection.getInstance();
        user = User.getInstance();
        initComponents();
        buildSearch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        sidePanel = new javax.swing.JPanel();
        title = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        searchComboBox = new javax.swing.JComboBox<>();
        openButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        bookMenu = new javax.swing.JMenu();
        newBookMenuItem = new javax.swing.JMenuItem();
        editBookMenuItem = new javax.swing.JMenuItem();
        deleteBookMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        accountMenu = new javax.swing.JMenu();
        profileMenuItem = new javax.swing.JMenuItem();
        registerMenuItem = new javax.swing.JMenuItem();
        loginMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        settingsMenuItem = new javax.swing.JMenuItem();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setEditable(false);
        title.setBorder(null);
        title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        title.setText("Library\nManagement\nSystem");
        title.setAutoscrolls(false);
        title.setFocusable(false);
        title.setOpaque(false);

        searchComboBox.setEditable(true);
        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book 1", "Book 2", "Book 3", "Some Other Book", "Another Book", "A Random Book", "A Tale of a Random Book" }));
        searchComboBox.setSelectedItem("");
        searchComboBox.setMaximumSize(new java.awt.Dimension(190, 22));
        searchComboBox.setMinimumSize(new java.awt.Dimension(190, 22));
        searchComboBox.setName(""); // NOI18N
        searchComboBox.setPreferredSize(new java.awt.Dimension(190, 22));
        AutoCompleteDecorator.decorate(searchComboBox);
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(openButton))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(title)
                                .addComponent(jSeparator1)
                                .addComponent(searchComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(openButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addContainerGap())
        );

        bookMenu.setText("Book");

        newBookMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newBookMenuItem.setText("Add Book");
        newBookMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookMenuItemActionPerformed(evt);
            }
        });
        bookMenu.add(newBookMenuItem);

        editBookMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        editBookMenuItem.setText("Edit Book");
        bookMenu.add(editBookMenuItem);

        deleteBookMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        deleteBookMenuItem.setText("Delete Book");
        bookMenu.add(deleteBookMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        bookMenu.add(exitMenuItem);

        menuBar.add(bookMenu);

        accountMenu.setMnemonic('e');
        accountMenu.setText("Account");

        profileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        profileMenuItem.setMnemonic('d');
        profileMenuItem.setText("Profile");
        profileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(profileMenuItem);

        registerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        registerMenuItem.setMnemonic('t');
        registerMenuItem.setText("Register");
        registerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(registerMenuItem);

        loginMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loginMenuItem.setMnemonic('y');
        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(loginMenuItem);

        logoutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logoutMenuItem.setMnemonic('p');
        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(logoutMenuItem);

        menuBar.add(accountMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        settingsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        settingsMenuItem.setMnemonic('a');
        settingsMenuItem.setText("Settings");
        settingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(settingsMenuItem);

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_QUOTE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void newBookMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.removeAll();
        AddBook newBook = new AddBook();
        desktopPane.add(newBook);
        desktopPane.moveToFront(newBook);
        newBook.setSize(desktopPane.getWidth(), desktopPane.getHeight());
        newBook.setLocation(0, 0);
        newBook.setVisible(true);

    }//GEN-LAST:event_newBookMenuItemActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        // TODO add your handling code here:
        String title = searchComboBox.getSelectedItem().toString();
        ArrayList<Book> books = connection.getBooks();
        Book book = null;
        for (int i = 0; i < books.size(); i++) {
            if (title.equals(books.get(i).getTitle())) {
                book = books.get(i);
            }
        }
        if (book == null) {
            JOptionPane.showMessageDialog(null, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            desktopPane.removeAll();
            ViewBook viewBook = new ViewBook(book);
            desktopPane.add(viewBook);
            desktopPane.moveToFront(viewBook);
            viewBook.setSize(desktopPane.getWidth(), desktopPane.getHeight());
            viewBook.setLocation(0, 0);
            viewBook.setVisible(true);
        }
        //        System.out.println(title);
    }//GEN-LAST:event_openButtonActionPerformed

    private void registerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMenuItemActionPerformed
        // TODO add your handling code here:
        if (user.isLoggedIn()) {
            JOptionPane.showMessageDialog(null, "Already logged in!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            desktopPane.removeAll();
            Register register = new Register();
            desktopPane.add(register);
            desktopPane.moveToFront(register);
            register.setSize(desktopPane.getWidth(), desktopPane.getHeight());
            register.setLocation(0, 0);
            register.setVisible(true);
//            updateAccountMenu();
        }
    }//GEN-LAST:event_registerMenuItemActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        // TODO add your handling code here:
        if (user.isLoggedIn()) {
            JOptionPane.showMessageDialog(null, "Already logged in!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            desktopPane.removeAll();
            Login login = new Login();
            desktopPane.add(login);
            desktopPane.moveToFront(login);
            login.setSize(desktopPane.getWidth(), desktopPane.getHeight());
            login.setLocation(0, 0);
            login.setVisible(true);

//            updateAccountMenu();
        }
    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                null,
                "Library Management System\n"
                + "\n"
                + "By Ansh Dawda, 2022\n"
                + "For [CSE2608] Advanced Java Programming Lab\n"
                + "\n"
                + "A library management system is an example of an information system. An information system, whether it is computerised or not, is a system that represents objects in a physical system, for example, information resources in a library collection.",
                "About",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add code to check if user is logged in
        if (user.isLoggedIn() && JOptionPane.showConfirmDialog(null, "Are you sure?", "Logout", JOptionPane.YES_NO_OPTION) == 0) {
            user.logout();
            desktopPane.removeAll();
//            updateAccountMenu();
        } else {
            JOptionPane.showMessageDialog(null, "Not logged in!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void profileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileMenuItemActionPerformed
        // TODO add your handling code here:
        if (user.isLoggedIn()) {
            desktopPane.removeAll();
            Profile profile = new Profile();
            desktopPane.add(profile);
            desktopPane.moveToFront(profile);
            profile.setSize(desktopPane.getWidth(), desktopPane.getHeight());
            profile.setLocation(0, 0);
            profile.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Not logged in!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_profileMenuItemActionPerformed

    private void settingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsMenuItemActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        buildSearch();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        desktopPane.removeAll();
        Content content = new Content();
        desktopPane.add(content);
        desktopPane.moveToFront(content);
        content.setSize(desktopPane.getWidth(), desktopPane.getHeight());
        content.setLocation(0, 0);
        content.setVisible(true);
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchComboBoxActionPerformed

    private void buildSearch() {
        // ToDO fetch book names from database and store them in an array
        // TODO finally re-instantiate searchComboBox with array
//        String[] bookTitles = {
//            "The Hunger Games",
//            "Harry Potter and the Order of the Phoenix",
//            "To Kill a Mockingbird",
//            "Pride and Prejudice",
//            "The Book Thief",
//            "Twilight",
//            "Animal Farm",
//            "The Chronicles of Narnia",
//            "The Hobbit and The Lord of the Rings",
//            "The Fault in Our Starts"
//        };

        ArrayList<Book> books = connection.getBooks();
        String[] bookTitles = new String[books.size()];
        for (int i = 0; i < bookTitles.length; i++) {
            bookTitles[i] = books.get(i).getTitle();
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(bookTitles);
        searchComboBox.setModel(model);
        searchComboBox.setSelectedIndex(new Random().nextInt(bookTitles.length));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

//    private javax.swing.JComboBox searchComboBox;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenu accountMenu;
    private javax.swing.JMenu bookMenu;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem deleteBookMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem editBookMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newBookMenuItem;
    private javax.swing.JButton openButton;
    private javax.swing.JMenuItem profileMenuItem;
    private javax.swing.JButton refreshButton;
    private javax.swing.JMenuItem registerMenuItem;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JMenuItem settingsMenuItem;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextPane title;
    // End of variables declaration//GEN-END:variables

}
