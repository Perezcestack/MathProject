package Week7MiniExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Person> correctMatch = new ArrayList<>();
        List<Person> people = new ArrayList<>();
        Person jake = new Person("Jake", 24,"Perez");
        Person stephanie = new Person("Stephanie", 26,"Perez");
        Person jaimee = new Person("Jaimee", 22,"Perez");
        Person zach = new Person("Zach", 22,"Perez");
        Person isaac = new Person("Isaac", 28,"Perez");
        Person isabel = new Person("Isabel", 23,"Perez");
        Person lulu = new Person("Lulu", 25,"Perez");
        Person kevin = new Person("Kevin", 26,"Perez");
        Person maaike = new Person("Maaike", 21,"Perez");
        Person javier = new Person("Javier", 27,"Perez");
        Person osmig = new Person("Osmig",22,"Torres");
        people.add(jaimee);
        people.add(stephanie);
        people.add(zach);
        people.add(isabel);
        people.add(isaac);
        people.add(kevin);
        people.add(maaike);
        people.add(lulu);
        people.add(javier);
        people.add(jake);
        people.add(osmig);

        System.out.print("Please enter a name to search: ");
        String choice = input.nextLine();

        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(choice)) {
                correctMatch.add(p);
            }
        }




// Calculate the average age of all people in the original list and display it.
//Display the age of the oldest person in the list.
//Display the age of the youngest person in the list.

    }
}
