import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PracticeCollection {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Nigeria","Abuja");
        capitalCities.put("England","London");
        capitalCities.put("France","Paris");
        capitalCities.put("Russia","Paris");

        for (String map : capitalCities.keySet()){
            System.out.println(map);
        }
        for (String maps : capitalCities.values()){
            System.out.println(maps);
        }

        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 1; i <=10; i++){
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set."); // 4, 7, 8
            } else{
                System.out.println(i + " was not found in the set"); 
                // 1, 2,3,,5,6,9,10
            }
            numbers.remove(81);
            numbers.clear();
            Iterator<Integer> it = numbers.iterator();
            System.out.println(it.hasNext());

            List<String> list = List.of("solve","plove", "glove");
            ListIterator<String> it = list.listIterator();

            while (it.hasNext()) {
                System.out.println(it.next() + " \n");
            }
        }
    }
}
