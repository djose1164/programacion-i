package tarea4;

import javax.swing.*;
import java.awt.*;

public class Formulario extends Window {
    Formulario() {
        super("Formulario de cliente");
    }

    @Override
    void header() {
        var label = new JLabel("FORMULAIRO DE CLIENTES");
        label.setFont( new Font("Serif",Font.PLAIN,22));
       // label.setPreferredSize(new Dimension(200, 200));
        add(label);
    }

    @Override
    void content() {

    }

    @Override
    void footer() {

    }
}
