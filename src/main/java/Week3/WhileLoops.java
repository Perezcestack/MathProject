package Week3;

//Create a class called WhileLoop. Add a main() method and create a while
//loop to display the text "I love Java" 5 times.
    public class WhileLoops {


    public static void main(String[] args) {

        int count = 0;
        while(count < 5){
            System.out.println("I love Java");
            count++;
        }

        int counter = 0;
        do{
            System.out.println("I love java" + " " + "DO while style");
            counter++;
        } while (counter < 5);
    }
}

