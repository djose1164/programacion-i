package tarea4;

import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Fri Oct 28 17:15:33 AST 2022
 */



/**
 * @author unknown
 */
public class Espejo extends JFrame {
    public Espejo() {
        super("Espejo");
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Daniel Victoriano
        panel1 = new JPanel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        panel2 = new JPanel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        panel3 = new JPanel();
        spinner1 = new JSpinner();
        spinner2 = new JSpinner();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //======== panel1 ========
        {
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

            //---- radioButton1 ----
            radioButton1.setText("Opcion 1");
            panel1.add(radioButton1);

            //---- radioButton2 ----
            radioButton2.setText("Opcion 2");
            panel1.add(radioButton2);

            //---- radioButton3 ----
            radioButton3.setText("Opcion 3");
            panel1.add(radioButton3);
        }
        contentPane.add(panel1);
        panel1.setBounds(35, 25, 190, 215);

        //======== panel2 ========
        {
            panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

            //---- checkBox1 ----
            checkBox1.setText("Opcion 4");
            panel2.add(checkBox1);

            //---- checkBox2 ----
            checkBox2.setText("Opcion 5");
            panel2.add(checkBox2);

            //---- checkBox3 ----
            checkBox3.setText("Opcion 6");
            panel2.add(checkBox3);
        }
        contentPane.add(panel2);
        panel2.setBounds(250, 30, 190, 145);

        //======== panel3 ========
        {
            panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

            //---- spinner1 ----
            spinner1.setModel(new SpinnerListModel(new String[] {"Hola", "Adios", "Daniel"}));
            panel3.add(spinner1);
            panel3.add(spinner2);
        }
        contentPane.add(panel3);
        panel3.setBounds(450, 75, 125, 95);

        //---- textField1 ----
        textField1.setPreferredSize(new Dimension(49, 10));
        contentPane.add(textField1);
        textField1.setBounds(450, 35, 130, 35);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Daniel Victoriano
    private JPanel panel1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JPanel panel2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JPanel panel3;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
