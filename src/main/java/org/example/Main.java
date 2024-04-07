package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Student estudiante =new Student("ale",59);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        estudiante.addCalification("matematica",5.5);
        estudiante.addCalification("matematica",6.5);
        estudiante.addCalification("matematica",9.5);
        estudiante.addCalification("quimica",9.5);


        estudiante.printStudent();
    }
}