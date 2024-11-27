public class Cat extends Animal1 {
    String breed;

    public Cat(String name, short age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void makeSound(){
        System.out.println("Meow!");
    }
}
