package pl.gornik.model;

public class Dog extends Animal{
    public Dog(String name, double weight, String type) {
        super(name, weight, type);
    }

    public Dog(Animal animal) {
        super(animal);
    }

    @Override
    public void giveVoice(String str) {
        str = "Hau, hau";
        super.giveVoice(str);
        System.out.println(str);
    }
}
