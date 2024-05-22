/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author lenovo
 */
import controllerInterface.InterfaceControlProject;
import java.util.List;
import model.ProjectModel;
import modelDAO.ProjectDao;
import modelDAOI.ProjectDaoi;
import modelTable.ProjectTable;
import view.AdminFormProject;

public class ProjectController implements InterfaceControlProject {
    AdminFormProject frame;
    ProjectDaoi pri;
    List<ProjectModel> pmodel;
    
    public ProjectController (AdminFormProject frame){
        this.frame = frame;
        pri = new ProjectDao();
        pmodel = pri.getAll();
    }
    
    @Override
    public void TableContent()
    {
        pmodel = pri.getAll();
        ProjectTable pt = new ProjectTable(pmodel);
        frame.getTblProject().setModel(pt);
    }
    
}
