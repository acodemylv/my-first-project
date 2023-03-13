package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        // Create getters and setters for: weight;
        // For all others fields create getter method;

        barsik.setWeight(6.5);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        // Create Constructor with name, color, breed, gender, hasFur - done
        // Create cat with all these field passed into constructor
        // Print your cat

        // My cat's name is: %s, My cat is %d years old. printf;

        Cat marusya = new Cat( "Marusya", "gray", "unknown", "female", true);
        marusya.setAge(1);
        marusya.setWeight(2.0);
        System.out.println(marusya);

        System.out.printf("My cat's name is: %s. My cat is %d years old.\n", marusya.getName(), marusya.getAge());

        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        System.out.println(marusya.getEnergy());

        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
    }
}
