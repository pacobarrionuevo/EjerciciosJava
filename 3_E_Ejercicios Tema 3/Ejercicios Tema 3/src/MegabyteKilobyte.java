import java.util.Scanner;
public class MegabyteKilobyte {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime cuántos MB quieres convertir en KB");
        double MB = s.nextDouble();
        double KB = MB*1024;
        System.out.printf("%.2f MB son %.10f KB", MB, KB);
        s.close();
    }
}
