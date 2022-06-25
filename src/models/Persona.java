package models;

import java.util.Scanner;

public class Persona {
    public int dia;
    public int mes;
    public int año;
    public int suma ;

    public void hacerSuma(int dia , int mes , año ){
        suma= dia + mes + año;
        int digitos = Integer.toString(suma).length(); //almacena la cantidad de digitos
        int total=0;
        for (int i=0; i<digitos; i++){
            String num= String.valueOf(Integer.toString(suma).charAt(i));
            total+=Integer.parseInt(num);
        }
        System.out.println("Su numero de la suerte es: " + total);
    }

}
