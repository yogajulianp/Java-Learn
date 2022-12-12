import java.util.Arrays;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        foreach();
    }

    public static void foreach() {
        List<String> listString = Arrays.asList("Coding", "A", "C");
        System.out.println("List of array: ");
        for(String item: listString){
            System.out.print(item+"\t");
        }

        System.out.println("List of number");
        //List itu dinamis
        List<Integer> listNumber = Arrays.asList(1,2,5,6,7,10);
        for(Integer itemNum: listNumber){
            System.out.print(itemNum+"\t");
        }
    }
}
