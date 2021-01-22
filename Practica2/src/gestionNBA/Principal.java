package gestionNBA;

import gestionNBA.mvc.gui.Controlador;
import gestionNBA.mvc.gui.Vista;
import gestionNBA.mvc.modelo.Modelo;


public class Principal {

    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
    }
}
