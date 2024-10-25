package Week5;
import java.util.Scanner;

public class Dog {
    static Scanner input = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Dog(String breed, String sound, String name) {
        this.breed = breed;
        this.sound = sound;
        this.name = name;
    }

    private String breed;
    private String sound;
    private String name;

    public String bark() {
        return name + " said " + sound + sound + sound;
    }

    public void walkTime() {
        System.out.println("Who is " + name + "'s Owner?");
        String owner = input.nextLine();
        System.out.println(owner + " is taking " + name + " on a walk!");
    }
}

