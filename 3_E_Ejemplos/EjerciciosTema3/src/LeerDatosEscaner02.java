import java.util.Scanner;

public class LeerDatosEscaner02 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");
    String nombre = s.next();
    int edad = s.nextInt();
    System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
    s.close();
    }
}
