package day16_stringbuilder_stringbuffer_accessmodifiers;

public class C02AccessModifiers01 {
    /*
    1) Access Modifiers are used to modify who can acccess to data
    2) There are 4 types of access modifiers: public > protected > default > private
    3) Private access modifiers can not be reached from other classes
    4) Public data can be reached from anywhere in the project
    5) Default(package private) data be reached by Classes only on the same package
    6)Protected data can be reached from the same package and from other packeges as well if it is child.
     */
    public static void main(String[] args) {
        C03AccessModifiersClass obj = new C03AccessModifiersClass();
        System.out.println("obj.name = " + obj.name);
        int a = obj.age;
    }
}
