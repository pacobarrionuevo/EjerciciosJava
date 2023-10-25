public class DimeTuNombre {

  public static void main(String[] args) {
    String nombre;
    System.out.print("Por favor, dime cómo te llamas: ");
    nombre = System.console().readLine();
    System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
  }
}
//También es importante reseñar que los datos introducidos por teclado se recogen
//como una cadena de caracteres (un String).