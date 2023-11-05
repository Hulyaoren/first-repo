package day_15dateandtime_enum_stringbuilder;

public class C04StringBuildersStringBuffers {
    public static void main(String[] args) {
        //There are three classes to create a String in Java:
        // 1)String Class
        // 2)StringBuilder Class
        // 3)StringBuffer Class
        //String Class is "immutable" but other two are "mutable"

        String s = "Java";
        String t = "Java";

        System.out.println(s);
       // s.concat("!");  //Java doesn't change the original data, duplicates it then change the copy
        s = s.concat("!"); //if you don't use = operator, s will not change
        System.out.println(s);

        StringBuilder x = new StringBuilder("Phyton");
        StringBuilder y = new StringBuilder("Phyton");
        x.append("!");
        System.out.println(x); //even if you don't use = operator, x will change
        //Stringbuilder
    }
}
