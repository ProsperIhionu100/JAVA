import java.io.FileInputStream;
import java.io.IOException;

public class ClassNay {
    public static void main(String[] args) {
        String dob = "16102010";
        String date = dob.substring(0, 2);
        System.out.println(date);
        String year = dob.substring(4, 8);
        System.out.println(year);
        String month = dob.substring(2, 4);
        System.out.println(month); 
        String prof, name;
        name = "Prosper";
        prof = " Pharmarcist";
        System.out.println(name.concat(prof));

        System.out.println(prof.stripLeading());
        System.out.println(prof.stripTrailing());
        System.out.println(prof.strip());

        // Using SPLIT TO SPLIT STRINGS
        String favs = "Blue,Rice,Soccer,Munirat";
        String [] favourites = favs.split(",");
        System.out.println(favourites[0]);
        System.out.println(favourites[1]);
        System.out.println(favourites[2]);

        // System.out.println(favs.split(","));

        String animal = "Monkey,Baboon,Chiwawa,Orangotan,Gorilla";
        String [] ani =  animal.split(",");
        System.out.println(ani[0]);
        System.out.println(ani[1]);
        System.out.println(ani[2]); 

        // Replace Method
        String sug = "21 Savage is Average";
        System.out.println(sug.replaceFirst("age","none"));
        System.out.println(sug.replaceAll("age","none"));
        
        // Formated STRINGS
        String sentence = "not";
        int num = 2;
        String formattedString = String.format( "promise is %s in %days class %s ",sentence, num, "null");
        System.out.println(formattedString);

        String diff = " Hard";
        System.out.println(diff.repeat(num));
        System.out.println(diff.isBlank());

        //LINES() \n
        String listing = "Monoplex\nDuplex\nHyperplex\nReflex";
        listing.lines().forEach(System.out::println);

        // Specify the path to the file you want to read 
        String filePath = "C:\\Users\\DELL\\Desktop\\JAVA\\write.txt";

        // Create a FileInputStream
        try (FileInputStream fileInputStream = new FileInputStream(filePath)){
            // Read and pr
            int data;
            while ((data = fileInputStream.read()) != -1){
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
