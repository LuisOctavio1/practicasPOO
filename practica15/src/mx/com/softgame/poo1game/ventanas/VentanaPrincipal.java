package mx.com.softgame.poo1game.ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
        btnExit = new JButton("salir");
    }

    public void initComponents(){
        f.setLayout(new FlowLayout());
        f.add(lblFile);
        f.add(txtFile);
        f.add(btnOpen);
        btnOpen.addActionListener(new  ActionListener(){
            public void actionPerformed(ActionEvent e){
                e.openFile();

            }

        }
        );
        f.add(txtCont);
        f.add(lblLeidos);
        f.add(lblN);
        f.add(btnExit);
        btnExit.addActionListener(new  ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();

            }

        });
        f.setSize(550,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.initComponents();
    }


}