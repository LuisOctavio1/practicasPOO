package mx.com.softgame.poo1game.ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.FlowLayout;

public class VentanaPrincipal{
    JFrame f;
    JLabel lblFile;
    JTextField txtFile;
    JButton btnOpen;
    JTextArea txtCont;
    JLabel lblLeidos;
    JLabel lblN;
    JButton btnExit;
    public VentanaPrincipal(){
        f = new JFrame("Practica14");
        lblFile = new JLabel("Nombre del archivo");
        txtFile = new JTextField();
        btnOpen = new JButton("Abrir archivo");
        txtCont = new JTextArea(30,40);
        lblLeidos = new JLabel("Caracteres leidos");
        lblN = new JLabel();
        btnExit = new JButton();
    }

    public void initComponents(){
        f.setLayout(new FlowLayout());
        f.add(lblFile);
        f.add(txtFile);
        f.add(btnOpen);
        f.add(txtCont);
        f.add(lblLeidos);
        f.add(lblN);
        f.add(btnExit);
        f.setSize(550,440);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
          });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.initComponents();
    }


}