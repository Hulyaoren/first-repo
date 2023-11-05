package day16_stringbuilder_stringbuffer_accessmodifiers;

public class C01StringBuilderAndStringBuffer {
    public static void main(String[] args) {
       /*  1)  There are three classes to create a String in Java:
       i)String Class, ii) StringBuilder Class and iii)StringBuffer Class

       2) String Class is "immutable" but other two are "mutable"
          When a new data is created in String Class, Java checks String pool and if data exists it does not create new container
          if data is updates it creates a new container, and it does not change the original data.---> immutable.
          If a new data is created in StringBuilder or StringBuffer java does not check String pool.

       3) When a data is updated in StringBuilder or StringBuffer java updates the original value
​
        // The difference between StringBuilder and StringBuffer:
        // StringBuilder is faster
        // StringBuffer is "thread-safe" and "synchronised"
        // "thread-safe": doing multiple tasks at the same time.
        // "synchronised": putting multiple tasks( threads) in a logical order.
*/
        String s = "Java";
        String t = "Java";
        String w = "Apex";

        System.out.println(s);
        s= s.concat("!"); //if you don't put "=" sign, you don't assign the value so it will not change
        System.out.println(s);

        StringBuilder x = new StringBuilder("Phyton");
        StringBuilder y = new StringBuilder("Phyton");
        x.append("!"); //concat is in string, append in stringbuilder
        System.out.println(x);

        StringBuffer z= new StringBuffer("Ruby");
        System.out.println(z);

        //Methods used in StringBuilder

        StringBuilder a = new StringBuilder();
        a.append("Hi!").append("Java!...");
        System.out.println(a);

        StringBuilder stateAbbr = new StringBuilder(3);
        stateAbbr.append("FL").append("Why"); //extra capacity = currentCapacity*2 + 2; -->
                                              // --> bu formul her yeni append de uygulanir
                                              //-->bir defa uygulandikdan sonra ihtiyaci kadar capacity ekler

        System.out.println("a.length() = " + a.length()); //12
        System.out.println("a.capacity() = " + a.capacity()); //16
        System.out.println("stateAbbr.capacity() = " + stateAbbr.capacity()); //8
        System.out.println("stateAbbr.length() = " + stateAbbr.length()); //5

        StringBuilder b = new StringBuilder(4);
       // b.append("12345678901"); // length:11 capacity:11
        b.append("12345678912").append("345"); //length:14 capacity:24
        System.out.println("b.length() = " + b.length());
        System.out.println("b.capacity() = " + b.capacity());

        b.reverse(); //stringde bunu for loop ile yapariz, stringbuilrderde bu methodla yapiyoruz
        System.out.println(b);

        a.replace(7,11, "***");
        System.out.println(a); //Hi!Java***
        a.insert(2,"!!"); //Hi!!!Java***
        System.out.println(a);
        a.delete(9,11);
        System.out.println(a); //Hi!!!Java*
        a.deleteCharAt(9);
        System.out.println(a); //Hi!!!Java

        //StringBuffer methods:
        StringBuffer sbf = new StringBuffer("Java");
        StringBuffer sbf1 = new StringBuffer("Kava");
        StringBuffer sbf2 = new StringBuffer("Fava");
        System.out.println(sbf.compareTo(sbf1)); //-1 cunku J, K'den once
        System.out.println(sbf.compareTo(sbf2)); // 4 cunku J, F'den 4 sonra


    }

}
