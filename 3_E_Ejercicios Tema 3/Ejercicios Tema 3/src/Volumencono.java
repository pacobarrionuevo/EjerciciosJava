import java.util.Scanner;
public class Volumencono {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el radio y la altura de tu cono");
        double radio = s.nextDouble();
        double altura = s.nextDouble();
        double volumenCono = ((Math.PI)*(Math.pow(radio,2))*altura)/3;
        System.out.printf("El volumen de tu cono es %.2f", volumenCono);
        s.close();
    }
}
