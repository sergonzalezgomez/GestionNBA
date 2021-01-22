package gestionNBA.mvc.gui;

import com.github.lgooddatepicker.components.DatePicker;
import gestionNBA.base.Conferencia;
import gestionNBA.base.Equipo;
import gestionNBA.base.Jugador;
import javax.swing.*;

public class Vista {
    private JFrame frame;
    private JPanel panelGeneral;
    private JLabel lblNombre;
    private JPanel panelInferiorDerecha;
    private JLabel lblNombreUsuario;
    private JTextField txtNombreJugador;
    private JTextField txtApellidosJugador;
    private JSpinner spnPuntosJugador;
    private JComboBox cmboxEquipos;
    private JButton botSeleccionarFotoJugador;
    private JLabel lblFotoJugador;
    private JList<Jugador> listaJugadores;
    private JButton botCrearJugador;
    private DatePicker datePickerFechaJugador;
    private JButton botGrafico;
    private JButton botConfiguracion;
    private JButton botEliminarJugador;
    private JButton botAnnadirJugadores;
    private JButton botEliminarEquipo;
    private JButton botAnnadirEquipo;
    private JButton botEliminarConferencia;
    private JList listaEquipos;
    private JList listaConferencias;
    private JButton botGuardar;
    private JButton botAbrir;
    private JButton botUsuarios;
    private JTextField txtNombreEquipo;
    private JTextField txtNombreEstadio;
    private JComboBox cmboxJugadoresEquipo;
    private JButton botCrearEquipo;
    private JButton botSeleccionarFotoEquipo;
    private JTextField txtNombreConferencia;
    private JSpinner spnTitulosConferencia;
    private JComboBox cmboxEquiposConferencia;
    private JButton botCrearConferencia;
    private JRadioButton radioBotConferenciaEste;
    private JRadioButton radioBotConferenciaOeste;
    private JTextField txtAnnoFundaconEquipo;
    private JTextField txtAnnoFundacionConferencia;

    DefaultListModel<Jugador> jugadoresDlm;
    DefaultListModel<Equipo> equiposDlm;
    DefaultListModel<Conferencia> conferenciasDlm;
    DefaultComboBoxModel<Jugador> jugadoresDcbm;
    DefaultComboBoxModel<Equipo> equiposDcbm;

    public Vista() {
        frame = new JFrame("NBA");
        frame.setContentPane(panelGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon(getClass().getResource("/pelotaBaloncesto.png")).getImage());
        frame.setVisible(true);
        frame.setSize(800,520);
        frame.setLocationRelativeTo(null);

        iniciarModelos();
        controlPorTeclado();
    }

    private void iniciarModelos() {
        jugadoresDlm = new DefaultListModel<>();
        equiposDlm = new DefaultListModel<>();
        conferenciasDlm = new DefaultListModel<>();
        jugadoresDcbm = new DefaultComboBoxModel<>();
        equiposDcbm = new DefaultComboBoxModel<>();

        listaJugadores.setModel(jugadoresDlm);
        listaEquipos.setModel(equiposDlm);
        listaConferencias.setModel(conferenciasDlm);
        cmboxJugadoresEquipo.setModel(jugadoresDcbm);
        cmboxEquipos.setModel(equiposDcbm);
    }

    private void controlPorTeclado() {



    }

}
