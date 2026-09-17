package com.ulp.lab_tp4;

import java.util.HashSet;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet<Materia> Materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.Materias = new HashSet<Materia>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m) {
        Materias.add(m);
    }

    public int cattidadMaterias() {
        return Materias.size();
    }
}
