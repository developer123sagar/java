import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4;
    JLabel l1, l2, l3;

    Calc(){
        JFrame f = new JFrame("Arithmetic Operation");
        l1= new JLabel("First no.");
        l1.setBounds(10, 50, 150, 20);
        tf1 =  new JTextField();
        tf1.setBounds(100,50,150,20);
        l2= new JLabel("Second No.");
        l2.setBounds(10, 100, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(100,100,150, 20);
        l3= new JLabel("Rseults:");
        tf3 = new JTextField();
        tf3.setBounds(10, 150, 150, 20);
        tf3.setEditable(false);

        b1= new JButton("Add");
        b1.setBounds(50, 200, 150, 50);
        b2= new JButton("Sub");
        b2.setBounds(200, 200, 150, 50);
        b3= new JButton("Mul");
        b3.setBounds(400, 200, 150, 50);
        b4= new JButton("Div");
        b4.setBounds(550, 200, 150, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.add(l1);f.add(l2);f.add(l3);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public  void actionPerformed(ActionEvent e){
        String s1= tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }
        else if(e.getSource()==b2){
            c=a-b;
        }
        else if(e.getSource()==b3){
            c=a*b;
        }
        else if(e.getSource()==b4){
            c=a/b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[] args){
        new Calc();
    }
}