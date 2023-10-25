import java.util.Scanner;
public class NotaDeseada {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Qué nota tenías en el primer examen?");
        double nota1 = s.nextDouble();
        System.out.println("¿Qué nota quieres a final del trimestre?");
        double notaFinal = s.nextDouble();
        double nota2 = (notaFinal - (0.4*nota1)) / 0.6;
        System.out.printf("La nota que necesitas en el segundo examen es %.2f", nota2);
        s.close();
    }
}
