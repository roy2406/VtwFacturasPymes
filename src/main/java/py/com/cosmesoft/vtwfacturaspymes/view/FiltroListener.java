/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.view;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import py.com.cosmesoft.vtwfacturaspymes.client.ClienteClient;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

/**
 *
 * @author usuario
 */
class FiltroListener implements DocumentListener {

    public void insertUpdate(DocumentEvent e) {
        updateInput(e);
    }

    public void removeUpdate(DocumentEvent e) {
        updateInput(e);
    }

    public void changedUpdate(DocumentEvent e) {
        updateInput(e);
    }

    private void updateInput(DocumentEvent e) {
        Document doc = (Document) e.getDocument();
        try {
            System.out.println(">>>" + doc.getText(0, doc.getLength()));
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
