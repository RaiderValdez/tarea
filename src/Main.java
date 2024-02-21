
public class Main {
    public static void main(String[] args) {

        String Articulo = "Zapato";
        Boolean tienepermiso = true;

        if (!tienepermiso) {
            System.out.println("No tiene permiso de acceso");

        } else {
            System.out.println("Bienvenido");
        }


        int cifra = 950;

        if ( cifra > 0 && cifra <= 500 ){
            System.out.println("Rango Menor");

        }else if ( cifra > 501 && cifra <= 2000 ){
            System.out.println("Rango Intermedio");

        } else if ( cifra > 2000 && cifra < 10000 ){
            System.out.println("Rango Superior");

        } else {
            System.out.println("Rango Inválido");

        }

String respuesta;

        int n = 25;

        if ( n > 0 && n < 100){
           respuesta = "Si";

        }else {
            respuesta = "No";

        }

        boolean encendido = true;
        int cantidad;

        if (encendido) {
            cantidad = 20;

            if (cantidad == 20) {
                System.out.println("Correcto");

            }else {
                System.out.println("Incorrecto");

            }

        }
        }
    }
