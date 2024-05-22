/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class VendorModel {

    /**
     * @return the username
     */
    public VendorModel (String username, String email, String password, String role, int pm_id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.pm_id = pm_id;
    }
    
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the pm_id
     */
    public Integer getPm_id() {
        return pm_id;
    }

    /**
     * @param pm_id the pm_id to set
     */
    public void setPm_id(Integer pm_id) {
        this.pm_id = pm_id;
    }
    
    
    
    private String username;
    private String email;
    private String password;
    private String role;
    private Integer pm_id;
    
    
}
