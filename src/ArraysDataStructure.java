import java.util.*;

public class ArraysDataStructure {
// printing arrya

    //Finding one missing integer in and array
    int getMissingIneger(int a[], int n){
        int total = 0,sum = 0;
        total = n*(n+1)/2;
        for(int i=0;i<a.length;i++){
            sum= sum+a[i];
        }
        return total - sum;
    }
    //finding missing number without overflow
    int getMissingInegerWithoutOverflow(int a[], int n){
        int total = 1;
        for(int i=2;i<=n;i++){
            total = total+i;
            total = total-a[i-2];
        }
        return total;
    }
    //---------------------------------- REmove array with duplicate -------------------------------------

    //with substituting zero
    int[] removeDuplicateElements(int a[]){
        int[] result = new int[a.length];
       //sorting the arraays first to bring duplicates together
        Arrays.sort(a);
        int previous = a[0];
        for (int i=0;i<a.length;i++){
            result[0] = previous;
            int temp =a[i];
            if (temp!=previous){
                result[i] = temp;
            }
            else result[i] = 0;
            previous = temp;

        }
        return result;
    }


    // remove duplicates of sorted array using o(n)time and o(1) space
    public int removeDuplicatesWithOnTimeComplexity(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }

    // remove duplicates of sorted char array using o(n)time and o(1) space
    public  int removeDulicatesOfCharArray(char[] ch, int n){
        if(ch.length ==0) return 0;
        int len =1;
    for(int i=1;i<n;i++){
    if(ch[i] != ch[i-1]){
        ch[len++]=ch[i];
    }

}
return len;
    }


    // Array list to remove duplicates using a hashset
    public List<String> removeDuplicateStringsWithHashSet(String[] stringArray){
        HashSet<String> resultStringHashSet= new HashSet<String>();
        for(String str : stringArray){
            resultStringHashSet.add(str);
        }

        List<String> findalResultList = new ArrayList<String>(resultStringHashSet);

        return findalResultList;
    }



    //CountNumberOfOccurance - regular method - Linear search --- Time Complexity: O(n)
    int CountNumberOfOccurance (int arr[], int elem){
        int count = 0;
        for(int i: arr){
            if(i == elem) count ++;
        }
        return count;
    }

    //CountNumberOfOccurance -  with hashmap
    int CountNumberOfOccuranceHashMap (int arr[], int elem){

        HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();

        for(int i:arr){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        // System.out.println(hmap);

        /** to check if the map has a unique set of occurances**/
        HashSet<Integer> set = new HashSet<>();
        for(int n : hmap.values()) {
            set.add(n);
        }
        // System.out.println(set);
        Boolean resultUnique =  hmap.size() == set.size();

        /**--end of unique occurance function**/
        return hmap.get(elem);
    }

    // get number of occurances of character

    int getNumberOfOccurances(String str, char ch){
        char[] charArr = str.toCharArray();
        HashMap<Character,Integer> chMap = new HashMap<Character,Integer>();
        //  TreeMap<Character,Integer> chMap = new TreeMap<Character,Integer>();
        for(char i:charArr){
            chMap.put(i,chMap.getOrDefault(i,0)+1);
        }
        System.out.println(" hashmap"+ chMap);
        return chMap.get(ch);
    }

    // Move Zeros To End
    int[] moveZerosToEnd (int[] arr){
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] != 0)
            {   arr[index] = arr[i];
            index++;}
        }
        Arrays.fill(arr, index, arr.length, 0);
        return arr;
    }

    // merge two sorted arrays
    int[] mergeTwoArrays(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
int n1 = arr1.length;
int n2 =arr2.length;
int[] arr3 = new int[n1+n2];
        // Traverse both array
        while (i<n1 && j <n2)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
        return arr3;
    }






    // reverse a string - simple swap
    public void reverseString(char[] s) {

        if (s.length == 0)
        {
            return;
        }

        for (int i = 0; i < (s.length / 2); i++) // O(n/2) ==> O(n).
        {
            char temp = s[i];
            s[i] = s[s.length-i-1];    // Swap polar elements in the array.
            s[s.length-i-1] = temp;
        }

        System.out.println(s); // Given input has not been tamper with ==> O(1).
    }

    // reverse a string - simple swap
    public void reverseStringtwoPointerApproach(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    /* reverse words in a string */

    String reverseWordsInString(String str){
        String[] wordsArray = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(int i= wordsArray.length-1; i>=0 ; --i){
            reversedString.append(wordsArray[i] + " ");
        }
        return reversedString.toString();
    }




    // Java program to reverse every sub-array formed by
// consecutive k elements

    int[] reverseSubArrays (int arr[],  int k){
        int n = arr.length;
        for (int i = 0; i < n; i += k)
        {
            int left = i;

            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;

            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
        return arr;
    }


// Second largest number in array
int secondHighest(int... nums) {
    int high1 = Integer.MIN_VALUE;
    int high2 = Integer.MIN_VALUE;
    for (int num : nums) {
        if (num > high1) {
            high2 = high1;
            high1 = num;
        } else if (num > high2) {
            high2 = num;
        }
    }
    return high2;
}
// o(n) & 0(1)space
    public static void print2largest(int arr[],
                                     int arr_size)
    {
        int i, first, second;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is smaller than
            first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                    + " element\n");
        else
            System.out.print("The second largest element"
                    + " is " + second);
    }

/*Efficient search in an array where difference between adjacent is 1
 *The idea is to start comparing from the leftmost element and find the difference between current array element and x. Let this difference be ‘diff’.
 * From the given property of array, we always know that x must be at-least ‘diff’ away, so instead of searching one by one, we jump ‘diff’.
 */
int getIndexOfFirstOccuranceOfArray(int[]arr, int x){
    int length = arr.length;
    int index =0;
    while(index < length){
        if (arr[index] == x) return index;
        else
        {
            index = index + Math.abs(arr[index] - x);
        }
    }
    return -1;
}

/*Find the minimum element in a sorted and rotated array
* We can do it in O(Logn) using Binary Search. If we take a closer look at the above examples
The minimum element is the only element whose previous is greater than it. If there is no previous element, then there is no rotation (the first element is minimum).
We check this condition for the middle element by comparing it with (mid-1)’th and (mid+1)’th elements.
If the minimum element is not at the middle (neither mid nor mid + 1), then the minimum element lies in either the left half or right half.
If the middle element is smaller than the last element, then the minimum element lies in the left half
Else minimum element lies in the right half.
*
* */
    int getSmallestIntegerPosition(int arr[], int low, int high)
    {
        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low)  return arr[0];

        // If there is only one element left
        if (high == low) return arr[low];

        // Find mid
        int mid = low + (high - low)/2; /*(low + high)/2;*/

        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return arr[mid+1];

        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];

        // Decide whether we need to go to left half or right half
        if (arr[high] > arr[mid])
            return getSmallestIntegerPosition(arr, low, mid-1);
        return getSmallestIntegerPosition(arr, mid+1, high);
    }




    /** check if anagram  words tht can be formed with rearranging the letters */
    boolean isAnagram(String s, String t) {
        if((s==null || t==null )|| (s.length() != t.length()) ){
            return false;
        }
        char a[]= s.toCharArray();
        char b[]= t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(new String(a).equals(new String(b))){
            return true;
        }
        return false;
    }

    boolean isAnagramHasMap(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))!=0){
                int curr = map.get(t.charAt(i));
                map.put(t.charAt(i), curr-1);
                continue;
            }
            return false;
        }
        return true;
    }


}
