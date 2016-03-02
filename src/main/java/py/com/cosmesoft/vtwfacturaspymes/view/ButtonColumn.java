package py.com.cosmesoft.vtwfacturaspymes.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import py.com.cosmesoft.vtwfacturaspymes.interfaces.Entidad;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

class ButtonColumn extends AbstractCellEditor
        implements TableCellRenderer, TableCellEditor, ActionListener {

    private JTable table;
    private JButton renderButton;
    private JButton editButton;
    private String text;
    private JFrameLista jFrame;
    private Object object;
 
    public ButtonColumn(JFrameLista jFrame,JTable table, int column) {
        super();
        this.table = table;
        renderButton = new JButton();
        this.jFrame = jFrame;
        editButton = new JButton();
        editButton.setFocusPainted(false);
        editButton.addActionListener(this);

        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(column).setCellRenderer(this);
        columnModel.getColumn(column).setCellEditor(this);
    }

    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (hasFocus) {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(UIManager.getColor("Button.background"));
        } else if (isSelected) {
            renderButton.setForeground(table.getSelectionForeground());
            renderButton.setBackground(table.getSelectionBackground());
        } else {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(UIManager.getColor("Button.background"));
        }
        renderButton.setIcon(new javax.swing.ImageIcon(
                ApplicationConstant.CARPETA_ICONOS+"\\accept.png"));

        //renderButton.setText((value == null) ? "" : value.toString());
        return renderButton;
    }

    public Component getTableCellEditorComponent(
            JTable table, Object value, boolean isSelected, int row, int column) {
        //text = (value == null) ? "" : value.toString();
        //editButton.setText(text);
        this.object = value;
        return editButton;
    }

    public Object getCellEditorValue() {
        return text;
    }

    public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
        //System.out.println(this.object + " : " + table.getSelectedRow());
        jFrame.setObject(object);
        jFrame.dispose();
    }
}
