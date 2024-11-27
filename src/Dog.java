public class Dog extends Animal1 {
    String breed;

    public Dog(String name, short age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog(String name, short age) {
        super(name, age);
    }



    // Overloaded display method with no parameters
    void display(){
        super.display();
        // System.out.println("Breed: " + breed);
    }

    void display(String owner) {
        super.display();
        System.out.println("Owner: " + owner);
    }

    void makeSound() {
        System.out.println("Woof!");
    }

}
