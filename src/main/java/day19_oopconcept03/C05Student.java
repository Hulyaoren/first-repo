package day19_oopconcept03;

/*
    Encapsulation : Data hiding..
    Why we hide data?
    i) Because some data are private ; ssn no, id, credit card
    ii) We may want people to reach that data.

    How we can hide data?
    we use private keyboard in front of the class member
 */

public class C05Student {
    private String stId = "TH001";
    private  String illness = "depression";
    private double gpa = 3.98;
    private boolean disability = false;

    public String getStId(){
        return stId;
    }

    public String getIllness(){
        return illness;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isDisability() {
        return disability;
    }

    //If we want to update encapsulated data we use setters;

    public void setStId(String stId){
        this.stId = stId;
    }
}
