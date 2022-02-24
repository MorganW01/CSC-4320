import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
public class Homework3 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("problem2.txt");
        Random random = new Random();
        int k = 50; // number of processes & process id. It is just the value of k from 1-50
        int columns = 3;
        int CPUCycles;
        int sizeOfMemoryFootprint;
        int CPUInt=0;
        int memFootprintInt=0;
        int processInt=0;


        //creates 2d array with k rows and 3 columns one for PID, CPU cycles, size of memory footprint
        int [][] processRepresentation = new int [k][columns];

        //print statement to create table header
        out.println("Number of Processes = " + k);
        out.printf("%-30s%-30s%-30s%n", "Process ID: ", "CPU Cycles: ","Size of Memory Footprint: ");


        //prints random number between 1000 and 1100.
        for (int x = 0; x < k; x++){ // iterates through the rows
            for (int y = 0; y < columns; y++){
                //checks if we are in the first column of the array
                if(y==0){
                    processRepresentation [x][y] = x+1; //prints out process id/number to the first column
                    processInt = processRepresentation[x][y];

                }

                else if(y==1){
                    CPUCycles = random.nextInt((11000-1000)+1) + 1000;
                    processRepresentation[x][y]=CPUCycles;
                    CPUInt = processRepresentation[x][y];

                }

                else {
                    sizeOfMemoryFootprint = random.nextInt((100-1)+1) + 1;
                    processRepresentation[x][y]= sizeOfMemoryFootprint;
                    memFootprintInt=processRepresentation[x][y];

                }


            }
            out.printf("%-30s%-30s%-30s%n", processInt, CPUInt, memFootprintInt);

        }


        /*to do:
        - fix random generator
        print it in table format with for loops
        print into a text file
        use excel to create graphs


         */

        out.close();

    }


}
