/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controllerInterface.InterfaceControlPM;
import java.util.List;
import javax.swing.JOptionPane;
import model.PMModel;
import view.LoginForm;
import modelDAO.PMDao;
import modelDAOI.PMDaoi;
import view.AdminForm;

/**
 *
 * @author lenovo
 */
public class PMController implements InterfaceControlPM{
    LoginForm frame;
    PMDaoi pmi;
    List<PMModel> lpm;
    
    public PMController(LoginForm frame) {
        this.frame = frame;
        pmi = new PMDao();
    }
    
    @Override
    public void loginAdmin(){
        AdminForm adminForm = new AdminForm();
        adminForm.setVisible(true);
    }
    
    @Override
    public void login(){
        if(!frame.getPasswordInput().getText().trim().isEmpty() & !frame.getUsernameInput().getText().trim().isEmpty()){
            pmi.login(frame.getUsernameInput().getText(), frame.getPasswordInput().getText());
            loginAdmin();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
}
