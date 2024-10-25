package Week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Scanner;

public class PayrollCalc {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            //reading file using filereader method
            FileReader fileReader = new FileReader("Employee.txt");

            //I make a string called filename to use later cant tell if its Important to be outside of loop
            String fileName;
            System.out.println("Please select a file name to list this under: ");
            fileName = input.nextLine();

            //I create buffered reader to be able to read employee.txt

            BufferedReader bufReader = new BufferedReader(fileReader);

            //I use a new string to take all the incoming text from txt file and store it
            String inputNew = bufReader.readLine();

            //I make a while loop to make sure it reads everything
            while((inputNew = bufReader.readLine()) != null) {
                // I make an array to make list everything in the file
                String[] empArray = inputNew.split("\\|");
                if(empArray[1].equals(fileName)){
                    PayrollEmployee emp = new PayrollEmployee(empArray[0],empArray[1], Double.parseDouble(empArray[2]), Double.parseDouble(empArray[3]));
                    FileWriter write = new FileWriter(fileName + ".txt" );
                    write.write("Employee ID is " + emp.getEmployeeID() + " Their name is " + emp.getName() + " and their gross pay is: " + emp.getGrossPay() );

                    write.close();
                    bufReader.close();
                    break;
                }


                //create employee in here
            }






//            String fileName;
//            System.out.println("Please name an employee file you would like to process: (e.g Dana Wyatt");
//            fileName = input.nextLine();
//

                                                //probably use some sort of .equals to grab whatever employee they asked for

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
