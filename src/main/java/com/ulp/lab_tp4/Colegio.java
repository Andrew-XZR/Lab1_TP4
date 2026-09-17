package com.ulp.lab_tp4;

public class Colegio {

    public static void main(String[] args) {
        Materia web2 = new Materia(8, "Web 2", 2);
        Materia matematica = new Materia(2, "Matemáticas", 1 );
        Materia lab1 = new Materia(4, "Laboratorio 1", 1 );
        Alumno martin = new Alumno(1001, "López", "Martin");
        Alumno brenda = new Alumno(1002, "Martínez", "Brenda");
        
        martin.agregarMateria(web2);
        martin.agregarMateria(matematica);
        martin.agregarMateria(lab1);
        brenda.agregarMateria(web2);
        brenda.agregarMateria(matematica);
        brenda.agregarMateria(lab1);
        
        brenda.agregarMateria(lab1);
        
        System.out.println("Cantidad de materias Martin: "
                + martin.cantidadMaterias());
        System.out.println("Cantidad de materias Brenda: "
                + brenda.cantidadMaterias());
    }
}