import javax.swing.*;

public class ObjekGUI extends JFrame {
    
    public void ObjekGUI(){
        
        JTextField username = new JTextField(15);
        JPasswordField password = new JPasswordField(15);
        
        JLabel Judul = new JLabel(" LOGIN ");
        JLabel lusername = new JLabel(" Username ");
        JLabel lpassword = new JLabel(" Password ");

        JButton btnSignup = new JButton("SignUP");
        JButton btnLogin = new JButton("Login");
        
        setLayout(null);
        add(Judul);
        add(username);
        add(password);
        add(lusername);
        add(lpassword);
        add(btnSignup);
        add(btnLogin);
        
        Judul.setBounds(100,10,100,20);
        username.setBounds(80,30,150,20);
        password.setBounds(80,50,150,20);
        lusername.setBounds(10,30,150,20);
        lpassword.setBounds(10,50,150,20);
        btnSignup.setBounds(10,90,100,40);
        btnLogin.setBounds(150,90,100,40);
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}