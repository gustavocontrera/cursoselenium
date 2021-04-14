package clase02;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese numeros hasta ingresar un numero negativo");
        int suma = 0;

        int contador;
        for(contador = 0; num >= 0; ++contador) {
            System.out.println("Ingrese un numero: ");
            num = input.nextInt();
            suma += num;
        }

        System.out.println("La suma total es " + suma);
        System.out.println("El promedio es " + suma / contador);
        System.out.println("Se ha ingresado un numero negativo. Fin del programa");
    }

}
