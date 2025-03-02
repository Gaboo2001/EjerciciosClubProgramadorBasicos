package EjemplosBasicosResueltos;

import java.util.Scanner;

/*Escribir un programa que a partir de un número ingresado diga si es mayor, menor o igual a 9.*/
public class MayorA9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingresa un numero");
        int num = leer.nextInt();
        
        if (num > 9) 
        {
            System.out.println("El numero " +num+ " Es mayor a 9");
        } else if (num < 9) {
            System.out.println("El numero " +num+ " Es menor a 9");
        } else {
            System.out.println("El numero es igual a 9");
        }

    }
}
