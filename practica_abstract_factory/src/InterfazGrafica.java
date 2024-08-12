import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioNotas;
import FabricaConcreta.SegundoConcreto;
import FabricaConcreta.TercerConcreto;
import FabricaConcreta.primerConcreto;

public class InterfazGrafica extends JFrame {

    private JComboBox<String> periodoComboBox;
    private JButton mostrarNotasButton;
    private JButton cerrarButton;
    private JTextArea resultadoTextArea;

    public InterfazGrafica() {
        setTitle("Sistema de Notas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear componentes
        periodoComboBox = new JComboBox<>(new String[]{"Primer Período", "Segundo Período", "Tercer Período"});
        mostrarNotasButton = new JButton("Mostrar Notas");
        cerrarButton = new JButton("Cerrar");
        resultadoTextArea = new JTextArea();
        resultadoTextArea.setEditable(false);

        // Panel para los controles
        JPanel controlPanel = new JPanel();
        controlPanel.add(periodoComboBox);
        controlPanel.add(mostrarNotasButton);
        controlPanel.add(cerrarButton);

        // Agregar componentes a la ventana
        add(controlPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultadoTextArea), BorderLayout.CENTER);

        // Configurar acción del botón de mostrar notas
        mostrarNotasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarNotas();
            }
        });

        // Configurar acción del botón de cerrar
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void mostrarNotas() {
        String selectedPeriodo = (String) periodoComboBox.getSelectedItem();
        ServicioFactory factory = null;

        // Seleccionar la fábrica según el período seleccionado
        switch (selectedPeriodo) {
            case "Primer Período":
                factory = new primerConcreto();
                break;
            case "Segundo Período":
                factory = new SegundoConcreto();
                break;
            case "Tercer Período":
                factory = new TercerConcreto();
                break;
        }

        // Obtener la instancia de ServicioNotas y mostrar las notas
        if (factory != null) {
            ServicioNotas notas = factory.crearNota();
            resultadoTextArea.setText("");
            notas.NotaParcial();
            notas.NotaQuiz();
            notas.NotaTrabajo();
        }
    }
}
