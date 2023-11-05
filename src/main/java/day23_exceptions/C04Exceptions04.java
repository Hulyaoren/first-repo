package day23_exceptions;

public class C04Exceptions04 {
    /*
        1) In Java "Exceptions" and "Error" can be thrown.
        2)What is the difference between "Exceptions" and "Error" can be thrown.
                    Exceptions can be handled but "Errors" can not.
                    Examples of Errors: StackOverFlowError: Stack Memory is full.
                    OutOfMemoryError: Heap Memory is full
                    VirtualMachineError:
         Examples of Exceptions: i) RunTimeExceptions
                                            ArithmeticException
                                            NullPointerException
                                            NumberFormatException
                                            ArrayIndexOutOfBoundsException
                                            StringIndexOutOfBoundsException
                                    ii) CompileTimeExceptions
                                        FileNotFoundException
                                        IOException
        3) When we use multiple catch blocks, if there is parent child relation
        between Exceptions, we must put child catch block first.



     */
    public static void main(String[] args) {
        System.out.println(convertCharToIntInString("12345", 2));
        System.out.println(convertCharToIntInString("12345", 4));
        System.out.println(convertCharToIntInString("12345", 5));// StringIndexOutOfBoundsException. Java throws exception
                                                                         //When given idx is out of the string
        System.out.println(convertCharToIntInString("12a45", 2)); //NumberFormatException

        System.out.println(convertCharacterToIntInString("12345", 2));                                                                  //when String contains non-numerical chars
        System.out.println(convertCharacterToIntInString("12345", 5));                                                                  //when String contains non-numerical chars
        System.out.println(convertCharacterToIntInString("12a45", 2));                                                                  //when String contains non-numerical chars

    }
    //Create a method gets a character from a String and convert it to int

    //First Way: we can handle multiple exceptions seperately
    public static int convertCharToIntInString(String s, int idx){
       int result = 0;
       try {
           String ch = s.substring(idx, idx + 1); //indexof metodu char doner, parseint char ile calismaz, string ile calisir o yuzden stringof kullandik
           result = Integer.parseInt(ch);
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("Index given should not exceed the length of the string..");
       } catch (NumberFormatException e){
           System.out.println("String shouldn't contain non-numerical characters");
       }
       return result;
    }

    //Second Way: We can handle all types of exceptions in single try-catch blog:
    public static int convertCharacterToIntInString(String s, int idx){
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1); //indexof metodu char doner, parseint char ile calismaz, string ile calisir o yuzden stringof kullandik
            result = Integer.parseInt(ch);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    //Third way :
    public static int convertCharToIntInStr(String s, int idx){
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1); //indexof metodu char doner, parseint char ile calismaz, string ile calisir o yuzden stringof kullandik
            result = Integer.parseInt(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index given should not exceed the length of the string..");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


}
