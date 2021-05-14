package mx.com.softgame.poo1game.ventanas;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaHilo extends JFrame{
    JMenuBar menuBar;
    JLabel iblA;
    JLabel iblB;
    JLabel iblC;
    JLabel iblD;
    JMenu mnuArchivo;
    JMenuItem mnuInicio;
    JMenuItem mnuSalir;

    public VentanaHilo(){
        initComponents();
    }

    public void initComponents(){
        f.setLayout (new GridLayout(4));
        iblA = new jLabel("A");
        iblB = new jLabel("B");
        iblC = new jLabel("C");
        iblD = new jLabel("D");
        mnuArchivo = new JMenu("Archivo");
        mnuInicio = new JMenuItem("Inicio");
        mnuSalir = new JMenuItem("Salir");
        mnuInicio.addActionListener(new  ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                iniciarHilos();
            }

        });
        mnuSalir.addActionListener(new  ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                ventanaHilo.dispose();
            }

        });
        ventanaHilo.setSize(1024,400);
    }

    public void iniciarHilos(){
        Thread hilo1 = new Thread(r);
        Thread hilo2 = new Thread(r);
        Thread hilo3 = new Thread(r);
        Thread hilo4 = new Thread(r);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }


    



    
}
