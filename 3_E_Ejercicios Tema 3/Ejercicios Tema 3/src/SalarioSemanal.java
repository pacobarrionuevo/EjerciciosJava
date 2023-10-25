import java.util.Scanner;
public class SalarioSemanal {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime cuántas horas trabajas a la semana");
        double horasTrabajadas = s.nextDouble();
        double salarioSemanal = horasTrabajadas*12;
        System.out.printf("El salario semanal del empleado es %.2f", salarioSemanal);
        s.close();
    }
}
