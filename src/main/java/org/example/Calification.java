package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Calification {
    private List<Double> listQualification;
    private String nameSubject;

    public Calification (double qualification, String nameSubject) {
        this.nameSubject=nameSubject;
        this.listQualification=new ArrayList<>();
        this.listQualification.add(qualification);
    }

    public void setNameSubjet(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setListQualification(List<Double> listQualification) {
        this.listQualification = listQualification;
    }

    public List<Double> getListQualification() {
        return listQualification;
    }
    public void addRating (double rating) {
        this.listQualification.add(rating);
    }


    public String getNameSubject() {
        return nameSubject;
    }
    //calculo promedio de una materia
    public double calculateAverage (){

        double sum =0;
        if (listQualification.isEmpty()) {
            return 0;
        }
        for (double element : listQualification) {
            sum += element;
        }
        //System.out.println(listQualification.size());
        return sum / listQualification.size();

    }

}
