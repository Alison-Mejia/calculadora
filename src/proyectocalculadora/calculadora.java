package proyectocalculadora;

import java.awt.Color;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JTextField;

public class calculadora extends JFrame {

    JPanel panel = new JPanel();

    JTextField tex = new JTextField();

    double valor = 0;

    char signo = ' ';

    public calculadora() {

        this.setVisible(true);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //Panel 
    public void panel() {

        this.getContentPane().add(panel);

        //panelcalculadora.setBackground(Color.black); 
        panel.setLayout(null);

    }

    //texto 
    public void tex() {

        tex.setBounds(25, 10, 320, 80);

        panel.add(tex);

    }

    //botones 
    public void boton() {

        JButton suma = new JButton("+");

        suma.setBounds(320, 100, 60, 40);

        panel.add(suma);

        suma.repaint();

        ActionListener sum = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                if (tex.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");

                } else {

                    valor += Double.parseDouble(tex.getText());

                    signo = '+';

                    tex.setText("");

                }

            }

        };

        suma.addActionListener(sum);

        JButton resta = new JButton("-");

        resta.setBounds(320, 160, 60, 40);

        panel.add(resta);

        resta.repaint();

        ActionListener res = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                if (tex.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");

                } else {

                    if (valor == 0) {

                        valor = Double.parseDouble(tex.getText());

                    } else {

                        valor -= Double.parseDouble(tex.getText());

                    }

                    signo = '-';

                    tex.setText("");

                }

            }

        };

        resta.addActionListener(res);

        JButton multi = new JButton("x");

        multi.setBounds(320, 200, 60, 40);

        panel.add(multi);

        multi.repaint();

        ActionListener mult = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                if (tex.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");

                } else {

                    if (valor == 0) {

                        valor = Double.parseDouble(tex.getText());

                    } else {

                        valor -= Double.parseDouble(tex.getText());

                    }

                }

                signo = 'x';

                tex.setText("");

            }

        };

        multi.addActionListener(mult);

        JButton division = new JButton("%");

        division.setBounds(320, 260, 60, 40);

        panel.add(division);

        division.repaint();

        ActionListener divis = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                if (tex.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");

                } else {

                    if (valor == 0) {

                        valor = Double.parseDouble(tex.getText());

                    } else {

                        valor -= Double.parseDouble(tex.getText());

                    }

                    signo = '%';

                    tex.setText("");

                }

            }

        };

        division.addActionListener(divis);

        JButton igual = new JButton("=");

        igual.setBounds(210, 260, 75, 40);

        panel.add(igual);

        igual.repaint();

        ActionListener igua = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                double resultado = 0;

                if (signo == '+') {

                    resultado = valor + Double.parseDouble(tex.getText());

                } else if (signo == '-') {

                    resultado = valor - Double.parseDouble(tex.getText());

                } else if (signo == 'x') {

                    resultado = valor * Double.parseDouble(tex.getText());

                } else if (signo == '%') {

                    resultado = valor / Double.parseDouble(tex.getText());

                }

                tex.setText(String.valueOf(resultado));

                valor = 0;

            }

        };

        igual.addActionListener(igua);

        JButton btn1 = new JButton("1");

        btn1.setBounds(25, 100, 75, 40);

        panel.add(btn1);

        btn1.repaint();

        ActionListener num1 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "1";

                tex.setText(une);

            }

        };

        btn1.addActionListener(num1);

        JButton btn2 = new JButton("2");

        btn2.setBounds(110, 100, 75, 40);

        panel.add(btn2);

        btn2.repaint();

        ActionListener num2 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "2";

                tex.setText(une);

            }

        };

        btn2.addActionListener(num2);

        JButton btn3 = new JButton("3");

        btn3.setBounds(210, 100, 75, 40);

        panel.add(btn3);

        btn3.repaint();

        ActionListener num3 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "3";

                tex.setText(une);

            }

        };

        btn3.addActionListener(num3);

        JButton btn4 = new JButton("4");

        btn4.setBounds(25, 160, 75, 40);

        panel.add(btn4);

        btn4.repaint();

        ActionListener num4 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "4";

                tex.setText(une);

            }

        };

        btn4.addActionListener(num4);

        JButton btn5 = new JButton("5");

        btn5.setBounds(110, 160, 75, 40);

        panel.add(btn5);

        btn5.repaint();

        ActionListener num5 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "5";

                tex.setText(une);

            }

        };

        btn5.addActionListener(num5);

        JButton btn6 = new JButton("6");

        btn6.setBounds(210, 160, 75, 40);

        panel.add(btn6);

        btn6.repaint();

        ActionListener num6 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "6";

                tex.setText(une);

            }

        };

        btn6.addActionListener(num6);

        JButton btn7 = new JButton("7");

        btn7.setBounds(25, 210, 75, 40);

        panel.add(btn7);

        btn7.repaint();

        ActionListener num7 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "7";

                tex.setText(une);

            }

        };

        btn7.addActionListener(num7);

        JButton btn8 = new JButton("8");

        btn8.setBounds(110, 210, 75, 40);

        panel.add(btn8);

        btn8.repaint();

        ActionListener num8 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "8";

                tex.setText(une);

            }

        };

        btn8.addActionListener(num8);

        JButton btn9 = new JButton("9");

        btn9.setBounds(210, 210, 75, 40);

        panel.add(btn9);

        btn9.repaint();

        ActionListener num9 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "9";

                tex.setText(une);

            }

        };

        btn9.addActionListener(num9);

        JButton btn0 = new JButton("0");

        btn0.setBounds(110, 260, 75, 40);

        panel.add(btn0);

        btn0.repaint();

        ActionListener num0 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + "0";

                tex.setText(une);

            }

        };

        btn0.addActionListener(num0);

        JButton punto = new JButton(".");

        punto.setBounds(25, 260, 75, 40);

        panel.add(punto);

        punto.repaint();

        ActionListener pun = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String une = tex.getText() + ".";

                tex.setText(une);

            }

        };

        punto.addActionListener(pun);

        JButton C = new JButton("C");

        C.setBounds(25, 310, 75, 40);

        panel.add(C);

        C.repaint();

        ActionListener borrarTodo = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String union = "";

                for (int i = 0; i < tex.getText().length() - tex.getText().length(); i++) {

                    union = union + tex.getText().charAt(i);

                }

                tex.setText(union);

            }

        };

        C.addActionListener(borrarTodo);

        JButton raiz = new JButton("√");

        panel.add(raiz);

        raiz.setBounds(110, 310, 75, 40);

        ActionListener resRaiz = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                if (tex.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "ingresar un valor");

                } else {

                    if (Double.parseDouble(tex.getText()) >= 0) {

                        double total = Math.sqrt(Double.parseDouble(tex.getText()));

                        tex.setText(String.valueOf(total));

                        valor = 0;

                    } else {

                        JOptionPane.showMessageDialog(null, "Syntaxis Error");

                    }

                }

            }

        };

        raiz.addActionListener(resRaiz);

    }

}
