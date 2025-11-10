/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanel;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImage extends JPanel implements Serializable {

    private ImagenFondo imagenFondo;
    private boolean raton = false;
    private Point punto;
    private ArrastreListener arrastre;

    public JPanelImage() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (raton) {
                    Point posicion = e.getPoint();
                    if (Math.abs(punto.x - posicion.x)>50) {
                        if (arrastre != null) {
                            arrastre.arastre();
                        }
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                raton = true;
                punto = e.getPoint();
            }
            
        });
    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {
            if (imagenFondo.getRutaImagen() != null && imagenFondo.getRutaImagen().exists()) {
                ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }
    }

    public void addArrastreListener(ArrastreListener arrastreListener) {
        this.arrastre = arrastreListener;
    }
}
