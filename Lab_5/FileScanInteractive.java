
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } catch(IOException e) {
            System.err.print("Caught IOException\n");
        }
        return instanceCount;
    }

    public static void main(String[] args) {

        if(args.length < 1){
            System.err.print("Необходимо ввести название файла\n");
            System.exit(-1);
        }
        String fileName = args[0].toString();
        String searchLine;
        FileScanInteractive fileScanInteractive = new FileScanInteractive();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter the search string or q to exit: ");
            searchLine = in.nextLine();
            if(searchLine.equals("q"))
                break;
            int count = fileScanInteractive.countTokens(fileName, searchLine);
            System.out.printf("The word \"%s\" appears %s times in the file.\n", searchLine, count);
        }
        
    }
}