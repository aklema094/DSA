import java.util.ArrayList;
import java.util.List;

public class FindSubstring {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("crab", "slab", "rabbit", "habbit", "stable","table","cabin");
        String substring = "ab";
        
        List<String> result = findSubstrings(listOfStrings, substring);
        System.out.println(result);
    }
    

    public static List<String> findSubstrings(List<String> list, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (str.contains(substring) && str.length() > 4) {
                result.add(str);
            }
        }
        return result;
    }
}
