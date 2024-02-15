
package AWT;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class LoginForm extends Frame implements ActionListener{
    Label lbemail,lbpassword,lbtitle;
    Button btnlogin,btnexit;
    TextField txtemail;
    JPasswordField jpasword;
    boolean Isemail=false;
    boolean Ispassword = false;
    ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    ImageIcon icon1 = new ImageIcon("D:\\MyFile\\Picture\\Icon\\Error.png");
    
    public LoginForm() {
         
        // title
         lbtitle = new Label("LOGIN FORM",Label.CENTER);
         lbtitle.setBounds(0, 50, 700, 30);
         lbtitle.setFont(new Font("Times New Roman",Font.BOLD,30));
         lbtitle.setForeground(Color.black);
         lbtitle.setBackground(Color.pink);
         add(lbtitle);
         // email
         lbemail = new Label("Email");
         lbemail.setBounds(100, 200, 50, 30);
         lbemail.setFont(new Font("Times New Roman",Font.BOLD,18));
         lbemail.setForeground(Color.blue);
         lbemail.setBackground(Color.pink);
         add(lbemail);
         // textield email
         txtemail = new TextField();
         txtemail.setBounds(250, 200, 200, 30);
         txtemail.setFont(new Font("Times New Roman",Font.BOLD,18));
         add(txtemail);
         // password
         lbpassword = new Label("Password");
         lbpassword.setBounds(100, 250, 100, 30);
         lbpassword.setFont(new Font("Times New Roman",Font.BOLD,18));
         lbpassword.setForeground(Color.blue);
         lbpassword.setBackground(Color.pink);
         add(lbpassword);
         // jpassword
         jpasword = new JPasswordField();
         jpasword.setBounds(250, 250, 200, 30);
         jpasword.setFont(new Font("Times New Roman",Font.BOLD,18));
         add(jpasword);
         // button login
         btnlogin = new Button("Login");
         btnlogin.setBounds(150, 350, 150, 30);
         btnlogin.setBackground(Color.green);
         btnlogin.setFont(new Font("Times New Roman",Font.BOLD,18));
         add(btnlogin);
         btnlogin.addActionListener(this);
         // btnexit
         btnexit = new Button("Exit");
         btnexit.setBounds(400, 350, 150, 30);
         btnexit.setBackground(new Color(204, 252, 50));
         btnexit.setFont(new Font("Times New Roman",Font.BOLD,18));
         add(btnexit);
         btnexit.addActionListener(this);
         
        setLayout(null);
        setVisible(true);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setBackground(Color.pink);
        setTitle("Login Form");
         addWindowListener(new WindowAdapter() 
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        
    }
    public static void main(String[] args) {
        new LoginForm();
    }
    void Clear()
    {
          txtemail.setText("");
          jpasword.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnlogin)
        {
            String email = txtemail.getText();
            String  password = jpasword.getText();
            //String password = jpasword.getPassword().toString();
            if(email.equals("M"))
            {
                Isemail=true;
            }
            if(password.equals("1"))
            {
                Ispassword=true;
            }
             // 1...  no data
            if(email.equals("") && password.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Input Data...", JOptionPane.MESSAGE_PROPERTY, HEIGHT,icon1 );
            }
            // 2... true email and password
            else if(Isemail==true && Ispassword==true)
            {
                JOptionPane.showMessageDialog(null,"Welcome to Your Account..", JOptionPane.MESSAGE_PROPERTY, HEIGHT,icon );
                Clear();
            }
            // 3... true email and wrong password
            else if(Isemail==true && Ispassword==false)
            {
                JOptionPane.showMessageDialog(null,"Incorrect Password", JOptionPane.MESSAGE_PROPERTY, HEIGHT,icon1 );
                 txtemail.setText("");
                jpasword.setText("");
            }
            // 4... wrong email and true password
             else if(Isemail==false && Ispassword==true)
            {
                JOptionPane.showMessageDialog(null,"Incorrect Email...", JOptionPane.MESSAGE_PROPERTY, HEIGHT,icon1 );
                 txtemail.setText("");
                 jpasword.setText("");
            }
            // 5... wrong email and password
             else if(Isemail==false && Ispassword==false)
            {
                JOptionPane.showMessageDialog(null,"Incorrect Email and Password...", JOptionPane.MESSAGE_PROPERTY, HEIGHT,icon1 );
                 txtemail.setText("");
                jpasword.setText("");
            }
           
        }
        else
        {
            dispose();
        }
        
    }
    
}
