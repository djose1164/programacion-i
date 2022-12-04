package tarea4;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    Ventana() {
        super("Primer formulario");
        inicializar();
    }

    void inicializar() {
        //frame_ = new JFrame("Primer formulario");
        setSize(640, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        header();
        content();
        footer();

        setVisible(true);
    }

    void header() {
        var headerPanel = new JPanel();
        headerPanel.setBounds(10, 10, getWidth() - 20, 25);
        var lbl = new JLabel("Establecer propiedad...:");
        headerPanel.add(lbl);

        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};
        var comboBox = new JComboBox<String>(country);
        headerPanel.add(comboBox);
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
        add(headerPanel);
    }

    void content() {
        var pane = new JPanel();
        var border = BorderFactory.createLineBorder(Color.black);
        pane.setBounds(10, 45, getWidth() - 20, 500);
        pane.setBorder(border);
        pane.setLayout(null);


        var checkBox = new JCheckBox();
        var checkBoxPanel = new JPanel();
        checkBoxPanel.setPreferredSize(new Dimension(100, 40));
        checkBoxPanel.setMaximumSize(new Dimension(100, 40));
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.X_AXIS));
        checkBoxPanel.setBounds(12, 50, getWidth() - 35, 20);
        checkBoxPanel.add(checkBox);
        checkBoxPanel.add(new JLabel("Holalalalala"));
        pane.add(checkBoxPanel);

        final int multiplicador = 4;
        final int ancho = (int)((getWidth() / multiplicador) * .9);
        var font = new JPanel();
        font.setLayout(null);
        font.setBounds(12, 55, getWidth() / multiplicador, 300);
        var fuente = new JLabel("Fuente:");
        fuente.setBounds(12, 55, ancho, 25);
        font.add(fuente);
        var fontInput = new JTextField(15);
        fontInput.setBounds(12, 75, ancho, 25);
        font.add(fontInput);
        pane.add(font);

        var fontStyle = new JPanel();
        //fontStyle.setBackground(Color.lightGray);
        fontStyle.setLayout(null);
        fontStyle.setBounds((int)(ancho*1.1), 55, getWidth() / multiplicador, 300);
        var estiloFuente = new JLabel("Estilo de fuente:");
        estiloFuente.setBounds(20, 55, ancho, 25);
        fontStyle.add(estiloFuente);
        var fontStyleInput = new JTextField(15);
        fontStyleInput.setBounds(20, 75, ancho-20, 25);
        fontStyle.add(fontStyleInput);
        pane.add(fontStyle);

        var fontSize = new JPanel();
        fontSize.setLayout(new BoxLayout(fontSize, BoxLayout.Y_AXIS));
        fontSize.setBounds(ancho*2 + ancho/2, 55, ancho, 300);
        var jlabel = new JLabel("Tamano:");
        jlabel.setPreferredSize(new Dimension(20, 30));
        jlabel.setMaximumSize(new Dimension(ancho, 60));
        fontSize.add(jlabel);
        var textField = new JTextField(15);
        textField.setPreferredSize(new Dimension(20, 20));
        textField.setMaximumSize(new Dimension(ancho, 25));
        fontSize.add(textField);
        fontSize.add(panelScroleable(0, 0, 0, 0, false));
        pane.add(fontSize);

        font.add(panelScroleable(12, 105, ancho, 200, false));
        fontStyle.add(panelScroleable(15, 105, ancho, 200, false));

        pane.add(preview());
        add(pane);
    }

    public JScrollPane panelScroleable(int x, int y, int w, int h, boolean layout) {
        var scrollPane = new JPanel();
        scrollPane.setPreferredSize(new Dimension(50, 400));
        scrollPane.setLayout(new BoxLayout(scrollPane, BoxLayout.Y_AXIS));
        for (int i=0; i < 10; i++) {
            JLabel label = new JLabel("label " + i );
            label.setFont(new Font("Arial", Font.PLAIN, 20));
            scrollPane.add(label);

        }

        var paneScrollable = new JScrollPane(scrollPane);
        if (!layout)
            paneScrollable.setBounds(x, y, w, h);
        paneScrollable.setPreferredSize(new Dimension(100, 100));
        paneScrollable.setMaximumSize(new Dimension(200, 250));
        return paneScrollable;
    }

    public JPanel preview() {
        var previewPane = new JPanel();
        previewPane.setBounds(12, 375, getWidth()/2, 75);
        var previewBorder = BorderFactory.createTitledBorder("Vista previa");
        previewPane.setBorder(previewBorder);

        return previewPane;
    }
    void footer() {
        var pane = new JPanel();
        pane.setBounds(getWidth() - 270, getHeight() - 100, 256, 50);
        pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));

        pane.add(new JButton("Aceptar"));
        pane.add(Box.createHorizontalGlue());
        pane.add(new JButton("Cancelar"));
        pane.add(Box.createHorizontalGlue());
        pane.add(new JButton("Ayuda"));

        add(pane);
    }

    JFrame frame() {
        return this;
    }
}
