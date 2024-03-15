import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class Lab13_EX3 {
    public static void main(String[] args) {
        JFrame JF =new JFrame();
        JF.setDefaultCloseOperation(JF.EXIT_ON_CLOSE);
        JF.setBounds(1300,200,500,310);
        JF.setTitle("Register Data");
        JF.getContentPane().setLayout(null);

        JLabel Username = new JLabel("Username : ");
        Username.setBounds(60,20,160,30);
        JF.getContentPane().add(Username);
        JTextField username = new JTextField();
        username.setBounds(200,20,170,30);
        JF.getContentPane().add(username);

        JLabel Password = new JLabel("Password : ");
        Password.setBounds(60,60,160,30);
        JF.getContentPane().add(Password);
        JPasswordField password = new JPasswordField();
        password.setBounds(200,60,170,30);
        JF.getContentPane().add(password);

        JLabel ConfirmPassword = new JLabel("Confirm Password : ");
        ConfirmPassword.setBounds(60,100,160,30);
        JF.getContentPane().add(ConfirmPassword);
        JPasswordField confirmPassword = new JPasswordField();
        confirmPassword.setBounds(200,100,170,30);
        JF.getContentPane().add(confirmPassword);

        JLabel Name = new JLabel("Name : ");
        Name.setBounds(60,140,160,30);
        JF.getContentPane().add(Name);
        JTextField name = new JTextField();
        name.setBounds(200,140,220,30);
        JF.getContentPane().add(name);

        JLabel Email = new JLabel("Email : ");
        Email.setBounds(60,180,160,30);
        JF.getContentPane().add(Email);
        JTextField email = new JTextField();
        email.setBounds(200,180,220,30);
        JF.getContentPane().add(email);

        JButton save = new JButton("save");
        save.setBounds(210,230,80,30);
        JF.getContentPane().add(save);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String passwords = password.getText();
                String pass = new String(password.getPassword());
                String confirmPass = new String(confirmPassword.getPassword());
                    if (username.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(JF, "Please input your username");
                    } else if (password.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(JF, "Please input your password");
                    } else if (confirmPassword.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(JF, "Please confirm your password");
                    } else if (!pass.equals(confirmPass)) {
                        JOptionPane.showMessageDialog(JF, "Password Not Match! Try Again please");
                    } else if (name.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(JF, "Please input your name");
                    } else if (email.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(JF, "Please input your email");
                    } else{
                        JOptionPane.showMessageDialog(JF,"Register Data Successfully \n" +
                                "Name : " + name.getText() +"\n"+
                                "Email : " + email.getText());
                    }
            }
        });

        JF.setVisible(true);
    }
}
