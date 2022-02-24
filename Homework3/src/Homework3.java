import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
public class Homework3 {

    public static void main(String[] args) throws FileNotFoundException {
        //Object used to print data in the text file
        PrintWriter out = new PrintWriter("problem2.txt");
        //Random object used to generated random numbers
        Random random = new Random();
        // number of processes/process ids
        int k = 50;
        //number of columns in the array
        int columns = 3;
        // ints used to store randomly generated values
        int CPUCycles;
        int sizeOfMemoryFootprint;
        //variables used to print the table
        int CPUInt=0;
        int memFootprintInt=0;
        int processInt=0;


        //creates 2d array with k rows and 3 columns one for PID, CPU cycles, size of memory footprint
        int [][] processRepresentation = new int [k][columns];

        //prints number of processes
        out.println("Number of Processes = " + k);

        //prints table header
        out.printf("%-30s%-30s%-30s%n", "Process ID: ", "CPU Cycles: ","Size of Memory Footprint: ");


        //prints random number between 1000 and 1100.
        for (int x = 0; x < k; x++){ // iterates through the rows
            for (int y = 0; y < columns; y++){
                //checks if we are in the first column of the array
                if(y==0){
                    //obtains all of the process ids which is just the the values of k (1-50)
                    processRepresentation [x][y] = x+1; //prints out process id/number to the first column
                    processInt = processRepresentation[x][y];

                }

                else if(y==1){
                    //generates CPU Cycle data using random generator
                    CPUCycles = (int) ((random.nextGaussian() * 3000) + 6000);
                    CPUCycles = (CPUCycles % (11000-1000) +1000);
                    processRepresentation[x][y]=CPUCycles;
                    CPUInt = processRepresentation[x][y];

                }

                else {
                    //generates memory footprint data using random generator
                    sizeOfMemoryFootprint = (int) ((random.nextGaussian() * 50) + 20);
                    sizeOfMemoryFootprint = (sizeOfMemoryFootprint % (100-1) + 1);
                    processRepresentation[x][y]= sizeOfMemoryFootprint;
                    memFootprintInt=processRepresentation[x][y];

                }


            }
            //Uses PrintWriter object to print out the table with the data in the text file in the correct format
            out.printf("%-30s%-30s%-30s%n", processInt, CPUInt, memFootprintInt);

        }
        //closes PrintWriter object
        out.close();

    }


}
