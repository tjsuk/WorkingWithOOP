public class Animal {
    // Private fields, only accessible within the class
    private String name;
    private int age;

    // A static field
    private static int count = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    // Public getter method for name
    public String getName(){
        return name;
    }

    // Public setter method for name
    public void setName(String name){
        this.name = name;
    }

    // Public getting method for age
    public int getAge(){
        return age;
    }

    // Static method for getting a count on the number of animals
    public static int getCount(){
        return count;
    }

    // Static method for resetting the count on the number of animals
    public static void resetCount(){
        count = 0;
    }

    // Display animal details
    public void display(){
        System.out.println("This animal is called " + name + " and is " +  age + " years old.");
    }

    // Allow the animal to get older by 1 year
    public void getOlder(){
        age++;
    }

}
