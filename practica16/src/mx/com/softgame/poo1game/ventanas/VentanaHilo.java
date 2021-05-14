package mx.com.softgame.poo1game.ventanas;
import java.awt.event.ActionListener;
import mx.com.softgame.poo1game.hilos.Hilo; 
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;


public class VentanaHilo extends JFrame{
    JMenuBar menuBar = new JMenuBar();
    JLabel iblA = new JLabel("A");
    JLabel iblB = new JLabel("B");
    JLabel iblC = new JLabel("C");
    JLabel iblD = new JLabel("D");
    JMenu mnuArchivo = new JMenu("Archivo");
    JMenuItem mnuInicio = new JMenuItem("Inicio");
    JMenuItem mnuSalir = new JMenuItem("Salir");

    public VentanaHilo(){
        initComponents();
    }

    public void initComponents(){
        setLayout (new GridLayout(4,0));
        add(iblA);
        add(iblB);
        add(iblC);
        add(iblD);
        menuBar.add(mnuArchivo);
        mnuArchivo.add(mnuInicio);
        mnuArchivo.add(mnuSalir);
        mnuInicio.addActionListener(new  ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                iniciarHilos();
            }

        });
        mnuSalir.addActionListener(new  ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                
            }

        });
        this.setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iniciarHilos(){
        
        Hilo hilo1 = new Hilo("hilo1",iblA);
        Hilo hilo2 = new Hilo("hilo2",iblB);
        Hilo hilo3 = new Hilo("hilo3",iblC);
        Hilo hilo4 = new Hilo("hilo4",iblD);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }


    



    
}
