package AWT;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JTextField;
public class Calculator extends Frame implements ActionListener 
{
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnx;
    JButton btnsum, btnsub, btndel, btnequal, btnper, btnc, btnce,btndot, btnslas;
    JTextField txtcal;
    double num1,num2,result;
    int op;
    DecimalFormat df = new DecimalFormat("0");
    public Calculator() 
    {
        
        txtcal = new JTextField("0");
        txtcal.setHorizontalAlignment(JTextField.RIGHT);
        txtcal.setEditable(false);
        txtcal.setBounds(20, 40, 300, 40);
        txtcal.setBackground(Color.white);
        txtcal.setForeground(Color.BLACK);
        txtcal.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(txtcal);
        txtcal.addActionListener(this);
      

        btnper = new JButton("%");
        btnper.setBounds(20, 100, 60, 50);
        btnper.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnper.setForeground(Color.cyan);
        btnper.setBackground(Color.darkGray);
        btnper.addActionListener(this);
        add(btnper);

        btnc = new JButton("C");
        btnc.setBounds(100, 100, 60, 50);
        btnc.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnc.setForeground(Color.cyan);
        btnc.setBackground(Color.darkGray);
        btnc.addActionListener(this);
        add(btnc);

        btnce = new JButton("/");
        btnce.setBounds(180, 100, 60, 50);
        add(btnce);
        btnce.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnce.setForeground(Color.cyan);
        btnce.setBackground(Color.darkGray);
        btnce.addActionListener(this);

        btndel = new JButton("DE");
        btndel.setBounds(260, 100, 60, 50);
        btndel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btndel.setForeground(Color.cyan);
        btndel.setBackground(Color.darkGray);
        btndel.addActionListener(this);
        add(btndel);

        btn7 = new JButton("7");
        btn7.setBounds(20, 180, 60, 50);
        btn7.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn7.setForeground(Color.white);
        btn7.setBackground(Color.black);
        btn7.addActionListener(this);
        add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(100, 180, 60, 50);
        btn8.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn8.setForeground(Color.white);
        btn8.setBackground(Color.black);
        btn8.addActionListener(this);
        add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(180, 180, 60, 50);
        btn9.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn9.setForeground(Color.white);
        btn9.setBackground(Color.black);
        btn9.addActionListener(this);
        add(btn9);

        btnx = new JButton("X");
        btnx.setBounds(260, 180, 60, 50);
        btnx.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btnx.setForeground(Color.red);
        btnx.setBackground(Color.blue);
        btnx.addActionListener(this);
        add(btnx);

        btn4 = new JButton("4");
        btn4.setBounds(20, 260, 60, 50);
        btn4.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn4.setForeground(Color.white);
        btn4.setBackground(Color.black);
        btn4.addActionListener(this);
        add(btn4);

        btn5 = new JButton("5");
        btn5.setBounds(100, 260, 60, 50);
        add(btn5);
        btn5.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn5.setForeground(Color.white);
        btn5.setBackground(Color.black);
        btn5.addActionListener(this);
        add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(180, 260, 60, 50);
        btn6.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn6.setForeground(Color.white);
        btn6.setBackground(Color.black);
        btn6.addActionListener(this);
        add(btn6);

        btnsub = new JButton("-");
        btnsub.setBounds(260, 260, 60, 50);
        btnsub.setFont(new Font("Times New Roman", Font.BOLD, 40));
        btnsub.setForeground(Color.white);
        btnsub.setBackground(Color.black);
        btnsub.addActionListener(this);
        add(btnsub);

        btn1 = new JButton("1");
        btn1.setBounds(20, 340, 60, 50);
        btn1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.black);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("2");
        btn2.setBounds(100, 340, 60, 50);
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn2.setForeground(Color.white);
        btn2.setBackground(Color.black);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new JButton("3");
        btn3.setBounds(180, 340, 60, 50);
        btn3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn3.setForeground(Color.white);
        btn3.setBackground(Color.black);
        btn3.addActionListener(this);
        add(btn3);

        btnsum = new JButton("+");
        btnsum.setBounds(260, 340, 60, 50);
        btnsum.setFont(new Font("Times New Roman", Font.BOLD, 25));
        btnsum.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btnsum.setForeground(Color.white);
        btnsum.setBackground(Color.black);
        btnsum.addActionListener(this);
        add(btnsum);

        btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn2.setForeground(Color.red);
        btn2.setBackground(Color.blue);
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn2.setForeground(Color.white);
        btn2.setBackground(Color.black);

        btnslas = new JButton("+/-");
        btnslas.setBounds(20, 420, 60, 50);
        btnslas.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnslas.setForeground(Color.white);
        btnslas.setBackground(Color.black);
        btnslas.addActionListener(this);
        add(btnslas);

        btn0 = new JButton("0");
        btn0.setBounds(100, 420, 60, 50);
        btn0.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btn0.setForeground(Color.white);
        btn0.setBackground(Color.black);
        btn0.addActionListener(this);
        add(btn0);

        btndot = new JButton(".");
        btndot.setBounds(180, 420, 60, 50);
        btndot.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btndot.setForeground(Color.white);
        btndot.setBackground(Color.black);
        btndot.addActionListener(this);
        add(btndot);

        btnequal = new JButton("=");
        btnequal.setBounds(260, 420, 60, 50);
        btnequal.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btnequal.setForeground(Color.white);
        btnequal.setBackground(Color.black);
        btnequal.addActionListener(this);
        add(btnequal);
          
        setLayout(null);
        setSize(340, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setBackground(Color.gray);
        setTitle("Calculator");
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
        new Calculator();
       
    }
    void setNumber(String num)
    {
        if(txtcal.getText().equals("0"))
        {
            txtcal.setText(num);
        }
        else
        {
            txtcal.setText(txtcal.getText()+num);
        }
    }
    void Calculator()
    {
        switch(op)
        {
            case 1-> //  %
            {
                num2 = Double.parseDouble(txtcal.getText());
                result = num1%num2;
                txtcal.setText(String.valueOf(result));
            }
            case 2-> //    /
            {
                num2 = Double.parseDouble(txtcal.getText());
                result = num1/num2;
                txtcal.setText(String.valueOf(result));
            }
              case 3-> //    X
            {
                num2 = Double.parseDouble(txtcal.getText());
                result = num1*num2;
                txtcal.setText(String.valueOf(result));
            }
             case 4-> //    -
            {
                num2 = Double.parseDouble(txtcal.getText());
                result = num1-num2;
                txtcal.setText(String.valueOf(result));
            }
            case 5-> //    +
            {
                num2 = Double.parseDouble(txtcal.getText());
                result = num1+num2;
                txtcal.setText(String.valueOf(result));
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==btn7)
      {
         setNumber("7");
      }
      else if(e.getSource()==btn8)
      {
          setNumber("8");
      }
      else if(e.getSource()==btn9)
      {
          setNumber("9");
      }
      else if(e.getSource()==btn4)
      {
          setNumber("4");
      }
      else if(e.getSource()==btn5)
      {
          setNumber("5");
      }
      else if(e.getSource()==btn6)
      {
          setNumber("6");
      }
      else if(e.getSource()==btn1)
      {
          setNumber("1");
      }
      else if(e.getSource()==btn2)
      {
          setNumber("2");
      }
      else if(e.getSource()==btn3)
      {
          setNumber("3");
      }
      else if(e.getSource()==btn0)
      {
          setNumber("0");
      }
      else if(e.getSource()==btnc)
      {
          txtcal.setText("0");
      }
      else if(e.getSource()==btndel)
      {
          String r = txtcal.getText();
          r  =  r.substring(0, r.length()-1);
          txtcal.setText(r);
          if(txtcal.getText().equals(""))
          {
              txtcal.setText("0");
          }
                 
      }
      else if(e.getSource()==btnslas)
      {
          String r = txtcal.getText();
          if(r.contains("-")==true)
          {
              r = r.replace("-","");
              txtcal.setText(r);
          }
          else
          {
              txtcal.setText("-"+r);
          }
      }
      else if(e.getSource()==btndot)
      {
          String num = txtcal.getText();
          if(num.contains(".")==true)
          {
              txtcal.setText(num);
          }
          else
          {
              txtcal.setText(num+".");
          }
      }
      else if(e.getSource()==btnper)
      {
          num1 = Double.parseDouble(txtcal.getText());
          txtcal.setText("0");
          op=1;
      }
      else if(e.getSource()==btnce)
      {
          num1 = Double.parseDouble(txtcal.getText());
          txtcal.setText("0");
          op=2;
      }
      else if(e.getSource()==btnx)
      {
          num1 = Double.parseDouble(txtcal.getText());
          txtcal.setText("0");
          op=3;
      }
        else if(e.getSource()==btnsub)
      {
          num1 = Double.parseDouble(txtcal.getText());
          txtcal.setText("0");
          op=4;
      }
      else if(e.getSource()==btnsum)
      {
          num1 = Double.parseDouble(txtcal.getText());
          txtcal.setText("0");
          op=5;
      }
      else if(e.getSource()==btnequal)
      {
          Calculator();
      }
         
      

}
    
}
