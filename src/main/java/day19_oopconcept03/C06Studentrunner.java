package day19_oopconcept03;

public class C06Studentrunner {

    public static void main(String[] args) {
        C05Student std = new C05Student();
        System.out.println("std.getStId() = " + std.getStId());
        System.out.println("std.getGpa() = " + std.getGpa());

        std.setStId("AC234");
        System.out.println(std.getStId());

        C05Student std2=new C05Student();
        System.out.println(std2.getStId());
    }


}
