package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {
//        1. Create a new ArrayList for your favorite songs
//        2. Add at least 3 songs
//        3. Remove your least favorite song
//        4. Sort them alphabetically
        List<String> songs = new ArrayList<>();
        songs.add("Californiacation");
        songs.add("Not_Like_Us");
        songs.add("Am_I_Dreaming");
        songs.add("South_to_West");
        songs.add("Rip_&_Tear");

        songs.remove(4);

        System.out.println(songs);

        Collections.sort(songs);
        System.out.println(songs);

//        1. Create a list of the ages of the people in your breakout room
//        2. Make a new list, and add all the ages times 2
//        3. Sort them (the second list) numerically
//        4. Calculate the sum and the average

        List<Integer> ages = new ArrayList<>();
        ages.add(29);
        ages.add(29);
        ages.add(21);
        ages.add(30);

        Collections.sort(ages);
        System.out.println(ages);

        List<Integer> ages2 = new ArrayList<>();
        ages2.add(29);
        ages2.add(29);
        ages2.add(21);
        ages2.add(30);


        for (int i = 0; i < ages2.size(); i++) {
            ages2.set(i, ages2.get(i) * 2);

        }
        System.out.println(ages2);


        class Puppy{
            private String name = "";
            private String breed = "";

            public Puppy(String name, String breed) {
                this.name = name;
                this.breed = breed;
            }
            @Override
            public String toString() {
                return "Puppy{Name='" + name + "', Breed='" + breed + "'}";
            }
        }

        Puppy poodle = new Puppy("Buddy","Miniature_Poodle");
        Puppy german = new Puppy("Fido","German_Shepard");
        Puppy shiba = new Puppy("Shooby","Shiba_Inu");

        List<Puppy> dog = new ArrayList<>();
        dog.add(poodle);
        dog.add(german);
        dog.add(shiba);

        dog.remove(1);

        System.out.println(dog);
        }



    }

