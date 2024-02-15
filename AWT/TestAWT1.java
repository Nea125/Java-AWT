
package AWT;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TestAWT1 extends Frame{
    
    Label title,lbname;
    Button btnsave;
    TextField txtname;
    TestAWT1()
    {
        
         title = new Label("HELLO AWT",Label.CENTER);
         title.setBounds(0, 100, 500, 50);
         title.setBackground(Color.blue);
         title.setForeground(Color.white);
         title.setFont(new Font("Times New Roman",Font.ITALIC,20));
         add(title);
          
         lbname = new Label("Name : ");
         lbname.setBounds(50, 200, 70, 30);
         add(lbname);
         lbname.setForeground(Color.BLUE);
         //lbname.setBackground(Color.red);
         lbname.setFont(new Font("Times New Roman",Font.BOLD,20));
         txtname = new TextField();
         txtname.setBounds(200, 200, 200, 30);
         add(txtname);
         
         
         setLayout(null);
         setSize(500,500);
         setLocationRelativeTo(null);
         setTitle("Test Form1");
         setBackground(Color.pink);
         setVisible(true);
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
        new TestAWT1();
    }
}
