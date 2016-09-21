package leczner.jon.ReusingClasses2;

/**
 * Created by jonathanleczner on 9/20/16.
 */
public class SuperHuman extends Human {
    private String goodOrEvil;
    private String heroName;
    private String superAbility;

    public SuperHuman(String name, int age, String gender, String occupation, String address, String goodOrEvil, String heroName, String superAbility) {
        super(name, age, gender, occupation, address);
        this.goodOrEvil = goodOrEvil;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

//    public String getGoodOrEvil() {
//        return goodOrEvil;
//    }
//
//    public String getHeroName() {
//        return heroName;
//    }
//
//    public String getSuperAbility() {
//        return superAbility;
//    }
    public void print() {
        super.print();
        System.out.println("Good or evil: " + goodOrEvil);
        System.out.println("Hero Name: " + heroName);
        System.out.println("Super Ability: " + superAbility);
    }
}
