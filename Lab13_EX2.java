import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab13_EX2 {
    public static void main(String[] args) {
        JFrame JF = new JFrame();
        JF.setDefaultCloseOperation(JF.EXIT_ON_CLOSE);
        JF.setBounds(10,10,600,300);
        JF.getContentPane().setLayout(null);
        JF.setTitle("My Calculator");

        JLabel number1 = new JLabel("Number1 ");
        number1.setBounds(160,70,90,30);
        JF.getContentPane().add(number1);
        JTextField numF1 = new JTextField();
        numF1.setBounds(120,100,130,20);
        JF.getContentPane().add(numF1);

        JLabel number2 = new JLabel("Number2 ");
        number2.setBounds(380,70,90,30);
        JF.getContentPane().add(number2);
        JTextField numF2 = new JTextField();
        numF2.setBounds(340,100,130,20);
        JF.getContentPane().add(numF2);

        JLabel OperatorL = new JLabel("Operator");
        OperatorL.setBounds(270,70,90,30);
        JF.getContentPane().add(OperatorL);
        Character [] Operator = {'+','-','x','/'};
        JComboBox OperatorC = new JComboBox(Operator);
        OperatorC.setBounds(275,100,40,20);
        JF.getContentPane().add(OperatorC);

        JButton Calculate = new JButton("Calculate");
        Calculate.setBounds(250,200,90,20);
        JF.getContentPane().add(Calculate);

        Calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int type_Operator;
                int number11 = Integer.parseInt(numF1.getText());
                int number22 = Integer.parseInt(numF2.getText());
                if(OperatorC.getSelectedItem().equals('+')){
                    JOptionPane.showMessageDialog(JF, numF1.getText() + " +  " + numF2.getText() + " = " + (number11 + number22));
                }
                if(OperatorC.getSelectedItem().equals('-')){
                    JOptionPane.showMessageDialog(JF, numF1.getText() + " -  " + numF2.getText() + " = " + (number11 - number22));
                }
                if(OperatorC.getSelectedItem().equals('x')){
                    JOptionPane.showMessageDialog(JF, numF1.getText() + " x  " + numF2.getText() + " = " + (number11 * number22));
                }
                if(OperatorC.getSelectedItem().equals('/')){
                    JOptionPane.showMessageDialog(JF, numF1.getText() + " /  " + numF2.getText() + " = " + (number11 / number22));
                }
            }
        });

        JF.setVisible(true);
    }
}
