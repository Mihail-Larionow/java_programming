import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ListOfNumbers2 {
    
    private ArrayList<Integer> arr;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        arr = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            arr.add(new Integer(i));
    }

    public void readList(String fileName) {
        Scanner in = null;

        try {
            in = new Scanner(new File(fileName));
            int a;
            while(in.hasNextInt())
            {
                a = in.nextInt();
                arr.add(a);
                System.out.println(a);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
        
            for (int i = 0; i < arr.size(); i++)
                out.println("Value at: " + i + " = " + arr.get(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) {

        ListOfNumbers2 list = new ListOfNumbers2();
        list.readList("infile.txt");
        list.writeList();

    }
}

