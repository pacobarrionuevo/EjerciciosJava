import java.util.Scanner;
public class ÁreaRectángulo {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime la altura y base de tu rectángulo (en cm)");
        double altura = s.nextDouble();
        double base = s.nextDouble();
        double area = altura * base;
        System.out.printf("El rectángulo tiene una base de %.2f cm^2", area);
        s.close();
    }
}