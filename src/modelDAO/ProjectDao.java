/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDAO;

/**
 *
 * @author lenovo
 */
import connector.DatabaseConnection;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import connector.DatabaseConnection;
import modelDAOI.ProjectDaoi;
import model.ProjectModel;

public class ProjectDao implements ProjectDaoi{
    Connection con = DatabaseConnection.getConnection();
    String read = "SELECT * FROM project;";
    
    @Override
    public List<ProjectModel> getAll(){
        List<ProjectModel> pmodel = null;
        try {
            pmodel = new ArrayList<ProjectModel>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(read);
            while (rs.next()){
                ProjectModel pmod = new ProjectModel();
                pmod.setId_pm(rs.getInt("id_pm"));
                pmod.setName(rs.getString("name"));
                pmod.setDescription(rs.getString("desc"));
                pmod.setDeadline(rs.getDate("deadline"));
                pmod.setId(rs.getInt("id"));
                pmodel.add(pmod);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pmodel;
    }
}
