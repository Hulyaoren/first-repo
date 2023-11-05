package day19_oopconcept03;


public class C03Dog extends C02Mammal{

    @Override
    public void drink() {
        System.out.println("Arlo drinks..");
    }

    @Override
    public int getWeight() {
        return 27;
    }

    @Override
    public C01Animal create() {
        return new C03Dog();
    }

    @Override //" @Override" Annotation: checks for override rules.
    public void eat() {
        {
            System.out.println("Arlo eats...");
        }


    }
}
