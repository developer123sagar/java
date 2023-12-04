// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine() ;

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

              System.out.println("Name: " + name);
              System.out.println("Age :" + age);
        }catch (IOException | NumberFormatException e){
            System.out.println("Error reading input" + e.getMessage());
        }finally {
            try{
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}