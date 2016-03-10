package py.com.cosmesoft.vtwfacturaspymes.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.ArticuloModel;
import py.com.cosmesoft.vtwfacturaspymes.interfaces.Entidad;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

class ButtonColumn extends AbstractCellEditor
        implements TableCellRenderer, TableCellEditor, ActionListener {

    private JTable table;
    private JButton renderButton;
    private JButton editButton;
    private String text;
    private String tipo;
    private int row;
    private JFrameForm jFrameForm;

    public ButtonColumn(JFrameForm jFrameForm, JTable table, int column, String tipo) {
        super();
        this.jFrameForm = jFrameForm;
        this.tipo = tipo;
        this.table = table;
        renderButton = new JButton();
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
        if (this.tipo.equals(ApplicationConstant.ELIMINAR)) {
            renderButton.setIcon(new javax.swing.ImageIcon(
                    ApplicationConstant.CARPETA_ICONOS + "\\bin.png"));
        } else if (this.tipo.equals(ApplicationConstant.EDITAR)) {
            renderButton.setIcon(new javax.swing.ImageIcon(
                    ApplicationConstant.CARPETA_ICONOS + "\\compose-4.png"));
        }

        //renderButton.setText((value == null) ? "" : value.toString());
        return renderButton;
    }

    public Component getTableCellEditorComponent(
            JTable table, Object value, boolean isSelected, int row, int column) {
        this.row = row;
        return editButton;
    }

    public Object getCellEditorValue() {
        return text;
    }

    public void actionPerformed(ActionEvent e) {
        fireEditingStopped();

        if (tipo.equals(ApplicationConstant.ELIMINAR)) {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea eliminar el registro?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                eliminarFila();
            }
        }
    }

    private void eliminarFila() {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        BigDecimal total = BigDecimal.ZERO;
        String totalStr = (String) table.getValueAt(row, 7);
        ArticuloModel a = (ArticuloModel) table.getValueAt(row, 3);
        try {
            total = new BigDecimal((long) df.parse(totalStr));
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        this.jFrameForm.updateTotales(total.negate(),a.getIva());
        this.jFrameForm.uptadeVuelto();
        dm.removeRow(row);
    }
}
