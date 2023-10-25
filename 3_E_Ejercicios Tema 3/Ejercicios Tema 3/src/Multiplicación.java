import java.util.Scanner;
public class Multiplicación{
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime dos números y te los multiplico");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double mult = x * y;
        System.out.println("La multiplicación de tus números es " + mult);
        s.close();
    }
}