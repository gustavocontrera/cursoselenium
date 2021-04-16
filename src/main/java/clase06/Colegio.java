package clase06;

import clase05.Camion;

public class Colegio {
    public Colegio() {
    }

    public static void main(String[] args) {

        //Camion c1 = new Camion();

        Persona alumno1 = new Alumno("Juan Perez", 133333, "Cocina");
        Persona alumno2 = new Alumno("Ana Lopez", 44444, "Pintura");
        Persona profe1 = new Profesor("Jose Rodriguez", 90000, 30000);
        Persona profe2 = new Profesor("Maria Schmidt", 55555, 45000);
        Persona profe3 = new Profesor("josefo suarez", 225889, 80000);

        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(profe1);
        System.out.println(profe2);
        System.out.println(profe3);

    }
}