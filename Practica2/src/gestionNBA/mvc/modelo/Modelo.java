package gestionNBA.mvc.modelo;

import gestionNBA.base.Conferencia;
import gestionNBA.base.Equipo;
import gestionNBA.base.Jugador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Modelo {
    private List<Conferencia> conferencias;
    private List<Equipo> equipos;
    private List<Jugador> jugadores;

    public Modelo() {
        conferencias = new ArrayList<>();
        equipos = new LinkedList<>();
        jugadores = new LinkedList<>();
    }

    public List<Conferencia> getConferencias() { return conferencias; }

    public List<Equipo> getEquipos() { return equipos; }

    public List<Jugador> getJugadores() { return jugadores; }
}
