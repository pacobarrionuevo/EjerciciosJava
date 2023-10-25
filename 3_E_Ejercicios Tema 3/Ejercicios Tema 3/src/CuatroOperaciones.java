import java.util.Scanner;
public class CuatroOperaciones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime dos números y te hago sus 4 operaciones elementales");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double suma = x + y;
        double resta = x - y;
        double multiplicación = x * y;
        double división = x / y;
        System.out.printf("La suma de %.2f más %.2f es %.2f. \n", x, y, suma);
        System.out.printf("La resta de %.2f menos %.2f es %.2f. \n", x, y, resta);
        System.out.printf("La multiplicación de %.2f por %.2f es %.2f. \n", x, y, multiplicación);
        System.out.printf("La división de %.2f más %.2f es %.2f. \n", x, y, división);
        s.close();
    }
}
