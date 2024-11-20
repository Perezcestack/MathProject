package Week7MiniExercises;

public class Bird extends animalsExercise implements Flyable{
    public void caw(){
        System.out.println("KAKAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAW");
    }

    @Override
    public void eat() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public void fly() {
        System.out.println("flap wings");
    }
}
