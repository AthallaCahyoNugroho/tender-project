/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelTable;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ProjectModel;

/**
 *
 * @author azkan
 */
public class ProjectTable extends AbstractTableModel {
    
    List<ProjectModel> pmodel;
    
    public ProjectTable (List<ProjectModel> pmodel){
        this.pmodel = pmodel;
    }
    @Override
    public int getRowCount() {
        return this.pmodel.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    public String getColumnName (int row, int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Projek";
            case 2:
                return "Deskripsi";
            case 3:
                return "Deadline";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return pmodel.get(rowIndex).getId();
            case 1:
                return pmodel.get(rowIndex).getName();
            case 2:
                return pmodel.get(rowIndex).getDescription();
            case 3:
                return pmodel.get(rowIndex).getDeadline();
            default:
                return null;
        }
    }
    
}
