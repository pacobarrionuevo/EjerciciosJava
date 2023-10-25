import java.util.Scanner;
public class ConvertirEurosPesetas {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime los euros que quieres convertir a pesetas");
        double euros = s.nextDouble();
        double pesetas = euros * (166.368);
        System.out.println(euros + " euros son " + pesetas + " pesetas");
        s.close();
    }
}