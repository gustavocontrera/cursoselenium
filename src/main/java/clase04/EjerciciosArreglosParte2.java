package clase04;

import java.util.Scanner;

public class EjerciciosArreglosParte2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] gananciasDiarias = new int[5];

        for(int i = 0; i < gananciasDiarias.length; ++i) {
            System.out.println("Ingrese lo ganado el dia " + i);
            gananciasDiarias[i] = input.nextInt();
        }

        int[] horasTrabajadas = new int[5];

        int j;
        for(j = 0; j < horasTrabajadas.length; ++j) {
            System.out.println("Ingrese las horas que trabajó el dia " + j);
            horasTrabajadas[j] = input.nextInt();
        }

        for(j = 0; j < horasTrabajadas.length; ++j) {
            System.out.println("Se trabajó en el dia " + j + " " + horasTrabajadas[j] + " horas");
        }

    }
}