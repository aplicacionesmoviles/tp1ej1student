package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int number_student;
    //  una materia con sus calificaci
    private List<Calification> califications;

    public Student(String name, int number_student) {
        this.name = name;
        this.number_student = number_student;
        this.califications = new ArrayList<>();//lista con asignatura y sus calificaciones
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber_student() {
        return number_student;
    }

    public void setNumber_student(int number_student) {
        this.number_student = number_student;
    }

    // tengo q ver como implemento si al alumno le paso una lista
    public void addCalification(String nameSubject, double rate) {


            int index = 0;
            boolean found = false;
            while (!false && index < califications.size()) {
                Calification calification = califications.get(index);

                if (calification.getNameSubject() == nameSubject) {
                    found = true;
                    calification.addRating(rate);
                }
                index++;

            }
            if (!found) {
                System.out.println("No esta la asignatura en la lista entonces lo agrego al final");
                califications.add(new Calification(rate,nameSubject));
            }
        }
        public void printStudent () {
            System.out.println("Nombre del estudiante " + getName() + "/");
            System.out.println("El numero de estudiante es " + getNumber_student() + "/");
            for (Calification aCalification : califications) {
                System.out.println("El nombre de la asignatura es " + aCalification.getNameSubject() + "/");
                System.out.println("Las notas son :");
                for (double nota : aCalification.getListQualification()) {
                    System.out.println(nota + ", ");
                }
                System.out.println("El promedio es: " + aCalification.calculateAverage());
            }
        }
    }
