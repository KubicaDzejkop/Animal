package pl.gornik.model;
public class Cat extends Animal{
    String text;
    public Cat(String name, double weight, String type, String text) {
        super(name, weight, type);
        this.text = text;
    }

    public Cat(Animal animal, String text) {
        super(animal);
        this.text = text;
    }

    @Override
    public void giveVoice(String str) {
        str = "Miau, miau";
        super.giveVoice(str);
    }
}
