package leczner.jon.ReusingClasses2;

/**
 * Created by jonathanleczner on 9/20/16.
 */
public class main {
    public static void main(String[] args) {
        Human bob = new Human("Bob", 34, "unknown", "accountant", "123 Rockford Ave.");
        SuperHuman quailMan = new SuperHuman("Doug", 16, "male", "student", "TV", "good",
                "Quailman", "belt");
        Human aubrey = new Human("Aubrey", 22, "female", "musician", "1105 N Market St.");
        SuperHuman sabrina = new SuperHuman("Sabrina", 18, "female", "student", "1105 N Market St.",
                "bad", "Sabrina", "witch stuff");

        bob.print();
        quailMan.print();
        aubrey.print();
        sabrina.print();
    }
}
