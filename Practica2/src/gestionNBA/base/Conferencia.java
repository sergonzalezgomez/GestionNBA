package gestionNBA.base;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Conferencia implements Comparable<Conferencia>, Serializable {

    private String nombreConferencia;
    private int annoFundacion;
    private int titulos;
    private List<Equipo> equipos;
    private Icon fotoConferencia;


    public Conferencia(String nombreConferencia, int annoFundacion, int titulos, List<Equipo> equipos, Icon fotoConferencia) {
        this.nombreConferencia = nombreConferencia;
        this.annoFundacion = annoFundacion;
        this.titulos = titulos;
        this.equipos = equipos;
        this.fotoConferencia = fotoConferencia;
    }

    public String getNombreConferencia() { return nombreConferencia; }

    public void setNombreConferencia(String nombreConferencia) { this.nombreConferencia = nombreConferencia; }

    public int getAnnoFundacion() { return annoFundacion; }

    public void setAnnoFundacion(int annoFundacion) { this.annoFundacion = annoFundacion; }

    public int getTitulos() { return titulos; }

    public void setTitulos(int titulos) { this.titulos = titulos; }

    public List<Equipo> getEquipos() { return equipos; }

    public void setEquipos(List<Equipo> equipos) { this.equipos = equipos; }

    public Icon getFotoConferencia() { return fotoConferencia; }

    public void setFotoConferencia(Icon fotoConferencia) { this.fotoConferencia = fotoConferencia; }

    @Override
    public int compareTo(Conferencia conferencia) {

        if(conferencia == null){
            throw new NullPointerException("conferencia es null");
        }
        if(conferencia.getClass() != Conferencia.class){
            throw new ClassCastException("el objeto no es de tipo Conferencia");
        }

        if(nombreConferencia.equals(conferencia.nombreConferencia)){
            return String.valueOf(annoFundacion).compareTo(String.valueOf(conferencia.annoFundacion));
        }
        return nombreConferencia.compareTo(conferencia.nombreConferencia);
    }
}
