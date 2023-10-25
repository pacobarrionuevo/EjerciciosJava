import java.util.Scanner;
public class FacturaVariables {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el precio de tu producto y le hacemos la factura");
        double baseImponible = s.nextDouble();
        double impuesto = baseImponible * 0.21;
        double total = baseImponible + impuesto;
        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.printf("IVA %19.2f\n", impuesto);
        System.out.println("-----------------------------");
        System.out.printf("TOTAL %17.2f\n", total);
        s.close();
    }
}
