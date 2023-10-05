import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> cofeeMenu = new ArrayList<>();
     public void loadMenuData(){
        File file = new File("C:\\Users\\KStol\\OneDrive\\Dokumenter\\Afleveringer Datamatiker\\Torsdagsopgaver-5");

        try{

            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                cofeeMenu.add(line);
                System.out.println(line);
            }
        }catch(FileNotFoundException e){

            System.out.println("Filen blev ikke fundet. Check path og filnavn");
        }
    }
    public void printMenu(){
        for(String k : cofeeMenu ){
            System.out.println(k);
        }
    }
}