package gui;
import model.Employee;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class StaffTableModel extends AbstractTableModel {

    private List<Employee> db;

    private String[] ColsName = {"Name", "Department","Age","Phone","Position","Gender"};

    public void setData(List<Employee> db){this.db = db;}

    public String getColumnName(int i){return  ColsName[i];}

    @Override
    public int getRowCount() {return db.size();}

    @Override
    public int getColumnCount() {return 6;}

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee emp = db.get(rowIndex);

        switch (columnIndex)
        {
            case 0:
                return emp.getName();
            case 1:
                return emp.getDepartment();
            case 2:
                return emp.getAge();
            case 3:
                return emp.getPhone();
            case 4:
                return emp.getPosition();
            case 5:
                return emp.getGender();
        }
        return null;
    }
}
