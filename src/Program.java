public class Program {
    public static void main(String[] args) {
/*        Animal animal = new Animal("Paddington",3);
        Animal animal2 = new Animal("Pikachu",6);

        // System.out.println("This animal is called " + animal.getName() + " and is " + animal.getAge() + " years old.");
        animal.display();
        animal2.display();
        animal.setName("Yogi");
        animal.getOlder();
        animal.display();


        System.out.println(Animal.getCount());
        Animal.resetCount();
        System.out.println(Animal.getCount());
        */

        // Animal1 newAnimal = new Animal1("Fred");
        // Dog newDog = new Dog("Fred", (short) 3,"Border Collie");
        // Animal1 newAnimal = newDog; // Upcasting - no explicit cast required
        // newAnimal.display();
        // newDog.display();
        // newDog.display("Trevor");

        //Animal1 a = new Animal1("Fred", (short) 3); // upcasting
        //a.display();

        Dog d = new Dog("Spot", (short)4);
        System.out.println("Dog name: " + d.name);
        System.out.println("Dog age: " + d.age);
        System.out.println("Dog breed: " + d.breed);

        d.breed = "Spaniel";
        System.out.println("Dog name: " + d.name);
        System.out.println("Dog age: " + d.age);
        System.out.println("Dog breed: " + d.breed);

        Cat c = new Cat("Garfield",(short)7,"Tabby");
        Animal1 a = new Animal1("Nelly",(short)20);

        d.makeSound();
        c.makeSound();
        a.makeSound();


    }
}
