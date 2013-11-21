/*
 * ColorPane.java
 *
 * Created on 14 de febrero de 2007, 14:36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ColorPane extends JPanel implements MouseListener {

        private static final long serialVersionUID = 1L;

        private Canvas canvas;

        private Canvas canvas1;

        private JCheckBox jCheckBox;

        private JCheckBox jCheckBox1;

        private Color stateColor1;

        private Color stateColor2;

        private boolean stateCheckBox;

        private boolean stateCheckBox1;

        public ColorPane(String label, Color color1, Color color2) {

                setBorder(BorderFactory.createCompoundBorder(BorderFactory
                                .createEmptyBorder(10, 5, 10, 5), BorderFactory
                                .createTitledBorder(null, label, TitledBorder.LEFT,
                                                TitledBorder.DEFAULT_POSITION, null, null)));
                GridLayout gridLayout = new GridLayout(1, 2, 5, 5);
                setLayout(gridLayout);

                add(getJPanel(color1, color2), null);
                add(new JLabel("Doble click en un color para cambiarlo."), null);

        }

        public void saveState() {
                stateColor1 = getColor1();
                stateColor2 = getColor2();
                stateCheckBox = jCheckBox.isSelected();
                stateCheckBox1 = jCheckBox1.isSelected();
        }

        public void restoreState() {
                canvas.setBackground(stateColor1);
                canvas1.setBackground(stateColor2);
                jCheckBox.setSelected(stateCheckBox);
                jCheckBox1.setSelected(stateCheckBox1);
        }

        private JPanel getJPanel(Color color1, Color color2) {
                JPanel panel = new JPanel();
                GridLayout gridLayout = new GridLayout(2, 3, 5, 5);
                panel.setLayout(gridLayout);

                canvas = new Canvas();
                canvas1 = new Canvas();

                canvas.addMouseListener(this);
                canvas1.addMouseListener(this);

                canvas.setBackground(color1);
                canvas1.setBackground(color2);

                jCheckBox = new JCheckBox("Mostrar", true);
                jCheckBox1 = new JCheckBox("Mostrar", true);

                panel.add(new JLabel("Regular:"), null);
                panel.add(canvas, null);
                panel.add(jCheckBox, null);
                panel.add(new JLabel("Match:"), null);
                panel.add(canvas1, null);
                panel.add(jCheckBox1, null);

                return panel;
        }

        public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                        Canvas c = (Canvas) e.getSource();
                        Color newColor = JColorChooser.showDialog(getParent(), "Color", c
                                        .getBackground());
                        if (newColor != null)
                                c.setBackground(newColor);

                }

        }

        public void mousePressed(MouseEvent arg0) {

        }

        public void mouseReleased(MouseEvent arg0) {

        }

        public void mouseEntered(MouseEvent arg0) {

        }

        public void mouseExited(MouseEvent arg0) {

        }

        public Color getColor1() {
                return canvas.getBackground();
        }

        public Color getColor2() {
                return canvas1.getBackground();
        }

        public boolean mustShowColor1() {
                return jCheckBox.isSelected();
        }

        public boolean mustShowColor2() {
                return jCheckBox1.isSelected();
        }
}