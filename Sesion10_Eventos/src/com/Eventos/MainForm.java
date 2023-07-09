package com.Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JButton calcularButton;
    private JTextPane totalPane;
    private JTextPane taxPane;
    private JTextPane pricePane;
    private JPanel FormTaxPane;

    public MainForm() {


        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                calcularPrecio();

            }
        });
        pricePane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                System.out.println("pusiste la tecla :" +e.getKeyChar());


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().FormTaxPane);
        frame.setVisible(true);
    }
    public void calcularPrecio(){
        try { 
            double precio = Double.parseDouble(pricePane.getText());
            double iva = Double.parseDouble(taxPane.getText());
            String result = String.valueOf(precio + (precio / 100 * iva));
            totalPane.setText(result);
        }catch (Exception e)
        {
            totalPane.setText("ATENCION!! debes ingresar solo numeros, revisa los valores");
        }

    }
}
