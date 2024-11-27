public class Animal1 {
    String name;
    short age;

    public Animal1(String name, short age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void makeSound(){
        System.out.println("No idea!");
    }
}
