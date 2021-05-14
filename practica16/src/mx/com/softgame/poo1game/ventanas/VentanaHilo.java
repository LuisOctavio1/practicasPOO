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
    JMenuBar menuBar;
    JLabel iblA;
    JLabel iblB ;
    JLabel iblC;
    JLabel iblD;
    JMenu mnuArchivo;
    JMenuItem mnuInicio;
    JMenuItem mnuSalir;

    public VentanaHilo(){
        initComponents();
    }

    public void initComponents(){
        setLayout (new GridLayout(4,1));
        menuBar = new JMenuBar();
        iblA = new JLabel("A");
        iblB = new JLabel("B");
        iblC = new JLabel("C");
        iblD = new JLabel("D");
        mnuArchivo = new JMenu("Archivo");
        mnuInicio = new JMenuItem("Inicio");
        mnuSalir = new JMenuItem("Salir");
        add(iblA);
        add(iblB);
        add(iblC);
        add(iblD);
        menuBar.add(mnuArchivo);
        mnuArchivo.add(mnuInicio);
        mnuArchivo.add(mnuSalir);
        setJMenuBar(menuBar);
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
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iniciarHilos(){
        
        Hilo hilo1 = new Hilo("hilo1",iblA);
        Hilo hilo2 = new Hilo("hilo2",iblB);
        Hilo hilo3 = new Hilo("hilo3",iblC);
        Hilo hilo4 = new Hilo("hilo4",iblD);
        System.out.println(iblA.getText());
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }


    



    
}
