/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDAO;

/**
 *
 * @author lenovo
 */

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import connector.DatabaseConnection;
import modelDAOI.PMDaoi;
import model.PMModel;
import view.AdminForm;

public class PMDao implements PMDaoi {
    Connection con = DatabaseConnection.getConnection();
    String login = "SELECT * FROM users WHERE username = ? AND password = ?";
    
    @Override
    public List<PMModel> login(String nama, String password){
        List<PMModel> pm = null;
        try {
            pm = new ArrayList<PMModel>();
            PreparedStatement st = con.prepareStatement(login);
            st.setString(1, nama);
            st.setString(2, password);
            st.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(PMDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pm;
    }
}
