package day20_oopconcept04;

public class C16CarRunner {
    public static void main(String[] args) {
        C13Honda myHonda = new C13Honda();
        myHonda.price(); // price() is a concrete method in interface. It is "Default Concrete metd"
        // to access default concrete mtds we need object.
        C10Engine.accelerate(); //  accelerate() is concrete mtd in interface. It is "Static Concrete Mtd"
        // to access static concrete mtd we use only class name.
        System.out.println("C10Engine.ENGINE_NAME = " + C10Engine.ENGINE_NAME);
        // C10Engine.ENGINE_NAME = C10Engine.ENGINE_NAME + "!"; //we can not update final variables


    }
}