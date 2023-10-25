import java.util.Scanner;
public class KilobyteMegabyte {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime cuántos KB quieres convertir en MB");
        double KB = s.nextDouble();
        double MB = KB/1024;
        System.out.printf("%.2f KB son %.10f MB", KB, MB);
        s.close();
    }
}
