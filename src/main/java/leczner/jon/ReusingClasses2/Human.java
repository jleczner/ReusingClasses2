package leczner.jon.ReusingClasses2;

/**
 * Created by jonathanleczner on 9/20/16.
 */
public class Human {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public String getOccupation() {
//        return occupation;
//    }
//
//    public String getAddress() {
//        return address;
//    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Occupation: " + occupation);
        System.out.println("Address: " + address);
    }
}
