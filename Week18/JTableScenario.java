package Week18;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


/**
 * Write a description of class JTableScenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JTableScenario
{
    public static void main(String[] args) 
    {

        JFrame frame = new JFrame("Student Table");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columns = {"ID", "Name", "Age", "Department"};

        Object[][] data = {
            {1, "Samrat", 20, "CS"},
            {2, "Ram", 22, "IT"},
            {3, "Hari", 19, "SE"},
            {4, "Gita", 21, "BBA"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columns) 
        {
            public boolean isCellEditable(int row, int column) 
            {
                return false; 
            }
        };

        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
