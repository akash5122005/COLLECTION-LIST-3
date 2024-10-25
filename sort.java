import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> strings = new ArrayList<>(Arrays.asList(input.split(" ")));
        Collections.sort(strings, Comparator.comparingInt(String::length));
        System.out.print("Sorted list by length: ");
        for(String str : strings){
            System.out.print(str + " ");
        }
        
    }
}
