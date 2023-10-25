import java.util.Scanner;
public class ConvertirPesetasEuros {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime cuántas pesetas quieres pasar a euros");
        double pesetas = s.nextDouble();
        double euros = pesetas / (166.368);
        System.out.printf("%f pesetas son %.2f euros. \n", pesetas, euros);
        s.close();
    }
}
