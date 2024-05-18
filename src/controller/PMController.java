/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import connector.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.AdminForm;
import view.ClientForm;

/**
 *
 * @author lenovo
 */
public class PMController {
    Connection con = DatabaseConnection.getConnection();
    String login = "SELECT * FROM users WHERE username = ? AND password = ?";
    
    @Override
    public void login(){
        PreparedStatement preparedStatement = con.prepareStatement(login);
        preparedStatement.setString(1, usernameField.getText());
        preparedStatement.setString(2, new String(passwordField.getPassword()));
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String role = resultSet.getString("role");
            if ("admin".equals(role)) {
                // Buka jendela admin
                AdminForm adminForm = new AdminForm();
                adminForm.setVisible(true);
            } else if ("client".equals(role)) {
                // Buka jendela client
                ClientForm clientForm = new ClientForm();
                clientForm.setVisible(true);
            }
            dispose();
        } else {
        JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    }
}
