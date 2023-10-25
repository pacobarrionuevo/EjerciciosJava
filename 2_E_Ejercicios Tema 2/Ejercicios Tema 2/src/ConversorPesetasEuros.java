public class ConversorPesetasEuros {
    public static void main (String [] args) {
        int pesetas = 166000;
        double euros = (double) pesetas/166.386;
        System.out.printf("%d pesetas son %.2f euros. \n", pesetas, euros);
    }
}
