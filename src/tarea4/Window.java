package tarea4;

import javax.swing.*;

public abstract class Window extends JFrame {
    Window(String title) {
        super(title);
        init();
    }

    void init() {
        setSize(640, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        header();
        content();
        footer();

        setVisible(true);
    }

    abstract void header();

    abstract void content();

    abstract void footer();

}
