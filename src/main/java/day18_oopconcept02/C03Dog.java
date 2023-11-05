package day18_oopconcept02;

public class C03Dog extends C02Mammal{
    public double price;
    public int weight = 8;

    public void eat() {
        System.out.println("Dogs eat..");
    }

    public C03Dog() {
        super();
        System.out.println("super var:" + super.weight);
        System.out.println("this var:" + this.weight);

        System.out.println("D No Parameters");
    }

    public C03Dog(double price) {
       super();
        System.out.println("Price Parameter");
        this.price=price;
    }
}
