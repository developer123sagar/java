import javax.swing.*;

public class JavaDialog {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter first number") ;
        String n2 = JOptionPane.showInputDialog("Enter second number") ;

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int sum = a + b;
        JOptionPane.showMessageDialog(null, "The sum is" + sum, "Sum of two numbers",JOptionPane.INFORMATION_MESSAGE);
    }
}