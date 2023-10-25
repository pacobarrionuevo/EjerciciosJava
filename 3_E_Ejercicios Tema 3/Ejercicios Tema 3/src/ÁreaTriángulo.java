import java.util.Scanner;
public class ÁreaTriángulo {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime la altura y base de tu triángulo (en cm)");
        double altura = s.nextDouble();
        double base = s.nextDouble();
        double area = (altura * base) / 2;
        System.out.printf("El triángulo tiene una base de %.2f cm^2", area);
        s.close();
    }
}
