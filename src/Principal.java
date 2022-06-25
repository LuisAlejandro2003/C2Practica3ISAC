import models.Persona;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Persona persona = new Persona();

        public void pedirDatos(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escriba su dia de nacimiento: ");
            dia = teclado.nextInt();
            System.out.println("Escriba su mes de nacimiento: ");
            mes = teclado.nextInt();
            System.out.println("Escriba su año de nacimiento: ");
            año = teclado.nextInt();
        }

        persona.hacerSuma();
    }
}
