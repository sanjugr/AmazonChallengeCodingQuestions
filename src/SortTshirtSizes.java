import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortTshirtSizes {

    public String Solution(String T) {

        // defining the possible sizes into a char array
        char[] possibleSizes = {'S', 'M', 'L'};

        //inserting the string into a hasmap to get the count of each sizes
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            countMap.put(T.charAt(i), countMap.getOrDefault(T.charAt(i), 0) + 1);
        }

        System.out.println(countMap);

        // appending the sizes into a new string with string builder
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < possibleSizes.length; i++) {
            for (int j = 0; j < countMap.getOrDefault(possibleSizes[i], 0); j++) {
                result.append(possibleSizes[i]);
            }
        }
        return result.toString();


    }

    public int Solution2(String S) {

        String[] sentancesArray = S.split("[.?!]");
        String[] wordsArray = new String[10000000];
        for (int i = 0; i < sentancesArray.length; i++) {
for(int j =0;j< sentancesArray[i].length();j++)
            wordsArray = sentancesArray[i].split(" ");
        }
        System.out.println(Arrays.toString(sentancesArray));
        System.out.println(Arrays.toString(wordsArray));

        return 0;
    }
}