import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println("Hola, ¿Cuál es tu nombre?");
        String name = scanner.nextLine();
        System.out.println("¿Cuál es tu apellido?");
        String surname = scanner.nextLine();
        System.out.println("¿Qué nombre de usuario deseas poner?");
        String user = scanner.nextLine();
        System.out.println("Introduce la contraseña deseada");
        String password = scanner.nextLine();
        //Imprimir el siguiente resultado:
        System.out.println("A continuación, se muestra el registro realizado: ");
        System.out.println("Hola " +name+" "+ surname+", tu nombre de usuario es " +user+" y tu contraseña es "+password+", gracias por registrarte.");
        //Añade una nueva línea antes de mostrar la respuesta
        scanner.close();
    }
}