package gestionNBA.mvc.modelo;

import gestionNBA.base.Conferencia;
import gestionNBA.base.Equipo;
import gestionNBA.base.Jugador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Modelo {
    private List<Jugador> jugadores;
    private List<Equipo> equipos;
    private List<Conferencia> conferencias;

    public Modelo() {
        jugadores = new LinkedList<>();
        equipos = new LinkedList<>();
        conferencias = new ArrayList<>();
    }

    public List<Jugador> getJugadores() { return jugadores; }

    public List<Equipo> getEquipos() { return equipos; }

    public List<Conferencia> getConferencias() { return conferencias; }

    public void annadirJugador(Jugador jugador){
        jugadores.add(jugador);
        Collections.sort(jugadores);
    }

    public void annadirEquipo(Equipo equipo){
        equipos.add(equipo);
        Collections.sort(equipos);
    }

    public void annadirConferencia(Conferencia conferencia){
        conferencias.add(conferencia);
        Collections.sort(conferencias);
    }

    public void eliminarJugador(Jugador jugadorEliminado){
        jugadores.remove(jugadorEliminado);
    }

    public void eliminarEquipo(Equipo equipoEliminado){ equipos.remove(equipoEliminado); }

    public void eliminarConferencia(Conferencia conferenciaEliminada) { conferencias.remove(conferenciaEliminada); }

    public boolean existeJugador(String nombre, String apellidos){
        for(Jugador jugador : jugadores){
            String cadena = jugador.getNombreJugador() + " " + jugador.getApellidosJugador();
            if(cadena.equalsIgnoreCase(nombre + " " + apellidos)){
                return true;
            }
        }
        return false;
    }

    public boolean existeEquipo(String nombre){
        for(Equipo equipo : equipos){
            if(equipo.getNombreEquipo().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }

    public boolean existeConferencia(String nombre){
        for(Conferencia conferencia : conferencias){
            if(conferencia.getNombreConferencia().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
}
