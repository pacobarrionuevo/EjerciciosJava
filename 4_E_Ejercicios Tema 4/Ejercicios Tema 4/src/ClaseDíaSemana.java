public class ClaseDíaSemana {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime el número de un día de la semana");
        int diaSemana = Integer.parseInt(System.console().readLine());
        String clasePrimera;
        switch (diaSemana) {
            case 1:
                clasePrimera = "Sistemas Informáticos";
                break;
            case 2:
                clasePrimera = "Sistemas Informáticos";
                break;
            case 3:
                clasePrimera = "Base De Datos";
                break;
            case 4:
                clasePrimera = "Lenguaje de Marcas";
                break;
            case 5:
                clasePrimera = "Base De Datos";
                break;
            default:
                clasePrimera = "no existe";
        }
        System.out.println("A primera hora el día " + diaSemana + " de la semana hay "
                            + clasePrimera);
    }
}