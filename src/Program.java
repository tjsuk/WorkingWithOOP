public class Program {
    public static void main(String[] args) {
        Animal animal = new Animal("Paddington",3);
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

    }
}
