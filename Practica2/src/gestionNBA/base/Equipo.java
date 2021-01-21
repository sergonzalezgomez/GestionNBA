package gestionNBA.base;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipo implements Comparable<Equipo>, Serializable {

    private String nombreEquipo;
    private int annoFundacion;
    private String estadio;
    private List<Jugador> jugadores;
    private Icon fotoEquipo;

    public Equipo(String nombre, int annoFundacion, String estadio, Icon fotoEquipo) {
        super();
        this.nombreEquipo = nombre;
        this.annoFundacion = annoFundacion;
        this.estadio = estadio;
        jugadores = new ArrayList<>();
        this.fotoEquipo = fotoEquipo;
    }

    public String getNombreEquipo() { return nombreEquipo; }

    public void setNombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public int getAnnoFundacion() { return annoFundacion; }

    public void setAnnoFundacion(int annoFundacion) { this.annoFundacion = annoFundacion; }

    public String getEstadio() { return estadio; }

    public void setEstadio(String estadio) { this.estadio = estadio; }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Icon getFotoEquipo() {
        return fotoEquipo;
    }

    public void setFotoEquipo(Icon fotoEquipo) {
        this.fotoEquipo = fotoEquipo;
    }

    @Override
    public String toString() { return nombreEquipo; }

    @Override
    public int compareTo(Equipo equipo) {
        if(equipo == null){
            throw new NullPointerException("equipo es null");
        }
        if(equipo.getClass() != Equipo.class){
            throw new ClassCastException("el objeto no es de tipo Equipo");
        }

        if(nombreEquipo.equalsIgnoreCase(equipo.nombreEquipo)){
            return estadio.compareTo(equipo.estadio);
        }
        return nombreEquipo.compareTo(equipo.nombreEquipo);
    }
}
