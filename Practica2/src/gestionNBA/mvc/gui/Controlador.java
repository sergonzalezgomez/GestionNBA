package gestionNBA.mvc.gui;

import gestionNBA.mvc.modelo.Modelo;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Controlador implements ActionListener, FocusListener, ListSelectionListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;

        anadirActionListeners(this);
        anadirFocusListeners(this);
        anadirListSelectionListeners(this);
    }

    private void anadirListSelectionListeners(Controlador controlador) {

    }

    private void anadirFocusListeners(Controlador controlador) {

    }

    private void anadirActionListeners(Controlador controlador) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
