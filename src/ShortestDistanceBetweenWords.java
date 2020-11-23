import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list.
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = “coding”, word2 = “practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 *
 * **/
public class ShortestDistanceBetweenWords {

    // converting the given string arry into a hasmap with words as key and value as the location indices of the words
    private HashMap<String, ArrayList<Integer>> convertStringArrayIntoHasMap(String[] s){
        HashMap<String, ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();
        for (int i=0; i< s.length;i++){
            if(hm.containsKey(s[i])){
                hm.get(s[i]).add(i);
            }
            else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                hm.put(s[i],list);
            }
        }
        return hm;
    }
    //Time complexity is o(M * N)
    public int shortDistance(String[] words, String word1, String word2){

        ArrayList<Integer> l1 = this.convertStringArrayIntoHasMap(words).get(word1);
        ArrayList<Integer> l2 = this.convertStringArrayIntoHasMap(words).get(word2);

        int result = words.length+1;
        int i = 0,j =0;
        while(i<l1.size() && j<l2.size()){
            result = Math.min(result, Math.abs(l1.get(i) - l2.get(j)));
            if(l1.get(i)<l2.get(j)) i++;
            else j++;
        }
        return result;
    }

    //Time complexity is o(M+N)
    int shortDistanceNonOptimalMethod(String inputString, String w1, String w2){

        String[] strArray = inputString.split("\\s+");
        ArrayList<Integer> w1indices = new ArrayList<>();
        ArrayList<Integer> w2indices = new ArrayList<>();

        System.out.println("word Array-> " + Arrays.toString(strArray));
        for(int i=0;i<strArray.length; i++){
            if(strArray[i].equals(w1)){
                w1indices.add(i);
            }
            if(strArray[i].equals(w2)){
                w2indices.add(i);
            }
        }
        System.out.println("Word ! indeices-> " +w2indices);
        System.out.println("Word ! indeices-> " + w2indices.toString());
        int result =  strArray.length;
        for(int i=0;  i<w1indices.size();i++){
            for (int j=0;j<w2indices.size();j++){

              int  min = Math.abs(w1indices.get(i) -w2indices.get(j));
                result = Math.min(result,min);
            }
        }
          return result;
    }
}

