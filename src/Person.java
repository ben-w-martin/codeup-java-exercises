public class Person {
    private String name;

    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    private Person(String name) { // Name constructor;
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("I say, hello %s!\n", getName());
    }

    public static void main(String[] args) {
        Person bob = new Person("Bobby");
        bob.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2); // No two instances of objects are the same;

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        Person person5 = new Person("John");
        Person person6 = person5; // Both variables refer to the same object;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }
}
