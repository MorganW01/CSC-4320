import java.util.Arrays;
import java.util.Random;
public class Homework3 {

    public static void main(String[] args){
        Random random = new Random ();

        int k = 50; // number of processes; can be changed
        int processID;
        int CPUCycles;
        int sizeOfMemoryFootprint;

        int lowerBound = 1000;
        int upperBound = 11000;

        //k rows, and 3 columns one for PID, CPU cycles, size of memory footprint
        int [][] processRepresentation = new int [k][3];


        //print statement to create table
        System.out.println("Number of Processes = " + k);
        System.out.println("Process ID:           CPU Cycles:             Size of Memory Footprint: ");

        //prints random number between 1000 and 11000


        for (int i =0; i <= k; i++){ // iterates through the rows

                CPUCycles = random.nextInt((11000-1000)+1) + 1000;

                sizeOfMemoryFootprint = random.nextInt((100-1)+1) + 1;


        }








    }
}
