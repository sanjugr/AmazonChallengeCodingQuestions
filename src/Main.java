import java.util.Arrays;

public class Main {


    /** driver for Binary data structure*/
    public static void BinaryTreeOutPut() {

        /****
         * Lowest COmmon Ancestor
         *
         */
        // Let us construct the BST shown in the above figure
        BinayTreeDataStructure tree = new BinayTreeDataStructure();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(22);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(12);
        tree.root.left.right.left = new TreeNode(10);
        tree.root.left.right.right = new TreeNode(14);


        int n1 = 10;
        int n2 =14;
        TreeNode t = tree.lowestCommonAncestor(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.val);


        int x1 = 14;
        int x2 = 8;
        t = tree.lowestCommonAncestor(tree.root, x1, x2);
        System.out.println("LCA of " + x1 + " and " + x2 + " is " + t.val);

        int y1 = 10;
        int y2 = 22;
        t = tree.lowestCommonAncestor(tree.root, y1, y2);
        System.out.println("LCA of " + y1 + " and " + y2 + " is " + t.val);

        /****
         * MInimum depth Driver Code
         *
         */
        BinayTreeDataStructure tree2 = new BinayTreeDataStructure();
        tree2.root = new TreeNode(1);
        tree2.root.left = new TreeNode(2);
        tree2.root.right = new TreeNode(3);
        tree2.root.left.left = new TreeNode(4);
        tree2.root.left.right = new TreeNode(5);
        System.out.println("Minimum Depth of the Tree using BFS is  "+tree2.minDepth(tree2.root));
        System.out.println("Minimum Depth of the Tree using DFS is  "+tree2.minDepthUsingDFS(tree2.root));
        System.out.println("Maximum Depth/height of the Tree using DFS is  "+tree2.maxDepthUsingBFS(tree2.root));
        System.out.println("Maximum Depth/height of the Tree using DFS is  "+tree2.maxDepthDFS(tree2.root));

        BinayTreeDataStructure tree3 = new BinayTreeDataStructure();
        tree3.root = new TreeNode(1);
        tree3.root.left = new TreeNode(2);
        tree3.root.right = new TreeNode(3);
        tree3.root.left.left = new TreeNode(4);
        tree3.root.left.right = new TreeNode(5);
        tree3.root.left.left.left = new TreeNode(6);
        tree3.root.left.right.left = new TreeNode(7);
        tree3.root.left.left.right = new TreeNode(8);
        tree3.root.left.right.right = new TreeNode(9);
        tree3.root.left.left.right.left = new TreeNode(10);
        tree3.root.left.left.right.right = new TreeNode(11);
        System.out.println("Minimum Depth of the Tree using BFS is  "+tree3.minDepth(tree3.root));
        System.out.println("Minimum Depth of the Tree using DFS is  "+tree3.minDepthUsingDFS(tree3.root));
        System.out.println("Maximum Depth/height of the Tree using DFS is  "+tree3.maxDepthUsingBFS(tree3.root));
        System.out.println("Maximum Depth/height of the Tree using DFS is  "+tree3.maxDepthDFS(tree3.root));

    }

    /** driver for array data structure*/
 /*   public static void ArraysOutPut(){
        System.out.println("Arrays Data structure");
        ArraysDataStructure Arr = new ArraysDataStructure();
        int a[] = {1,2,3,4,6,7,8};
        int a2[] = {1,2,3,4,6,7,8,5};
        System.out.println( " Missing Integer in array is " + Arr.getMissingIneger( a,8));
        System.out.println( " Missing Integer in array is " + Arr.getMissingIneger( a2,9));
        System.out.println( " Missing Integer in array is " + Arr.getMissingInegerWithoutOverflow( a,8));
        System.out.println( " Missing Integer in array is " + Arr.getMissingInegerWithoutOverflow( a2,9));

        int x[] = {1,2,3,3,3,3,4,5,6,6,6,7,8,5,5,5,3,2,1,1,1};
        System.out.println( " Array without duplicates " +Arrays.toString(Arr.removeDuplicateElements(x)));

        //String arrya list rmove duplicates with hashset
        String strArray[] = {"Android", "Android", "iOS", "Windows mobile"};
        System.out.println( " Array without duplicates " +Arr.removeDuplicateStringsWithHashSet(strArray));
    }

    /** driver for Linked List  data structure*/
  /*  public static void LinkedListOutput(){
        System.out.println("Linked List structure");
        LinkedListsDataStructure Arr = new LinkedListsDataStructure();
        linkedListCustom l1 = Arr.initializeListAndPrint();
        System.out.println("reversing");
        Node x = Arr.reverseLinkList(l1.getHead());
        Arr.printList(x);
    }


    /**
    * Main Function
    * */
    public static void main(String[] args) {

        /** ShorttestDistance Program **/
        String[] words = {"practice", "makes", "", "perfect", "coding", "practice","",  "makes", "perfect","makes"};
        String word1 = "makes";
        String word2 = "coding";
        ShortestDistanceBetweenWords s = new ShortestDistanceBetweenWords();
        String wordNew = "practice makes perfect coding practice makes perfect makes";
        System.out.println("Shorttest distance between words is  = " +s.shortDistance(words,word1,word2));
        System.out.println("Shorttest distance between words is  = " +s.shortDistanceNonOptimalMethod(wordNew,word1,word2));

        /** Data Structure pgrogram outs**/
    //    ArraysOutPut();
    //    LinkedListOutput();
        BinaryTreeOutPut();

        /** Random program outs  **/
        /**Triangle sides**/
     /*   TriangleSides Tri = new TriangleSides();
        System.out.println( Tri.checkTriangleSide(1,1,1));
        System.out.println( Tri.checkTriangleSide(1,2,1));
        System.out.println( Tri.checkTriangleSide(1,32,112));

*/
        /** DataStructure Examples in Java**/
     /*   DataStructureExample h = new DataStructureExample();
        System.out.println(h.printHasMap());
        System.out.println(h.printTreeMap());
        System.out.println(h.printTreeMap2());


        EightHousesProbelm eight = new EightHousesProbelm();
        int[] data ={1,0,0,0,0,1,0,0};
        int[] data2 ={1,1,1,0,1,1,1,1};
        System.out.println(eight.cellCompete(data,1));
        System.out.println(eight.cellCompete(data2,2));

        FindGCDIntegers g = new FindGCDIntegers();
        int [] arr = {2,4,6,8,10};
        int [] arr2 = {2,3,4,5,6};
        int num = 5;
        System.out.println(g.generalizedGCD(5,arr));
        System.out.println(g.generalizedGCD(5,arr2));
*/

     /** count number of occurance**/
     int[] inputarry = {9,9,9,7,8,8,8,1,2,3,1,2,2,5,5,5,1,3,3,3};
        ArraysDataStructure cnobj = new ArraysDataStructure();
        System.out.println(" count of "+1+" is -> "+ cnobj.CountNumberOfOccurance(inputarry, 1));
        System.out.println(" count of "+2+" is -> "+  cnobj.CountNumberOfOccurance(inputarry, 2));
        System.out.println(" count of "+3+" is -> "+  cnobj.CountNumberOfOccurance(inputarry, 3)+"\n" );
        System.out.println(" count of "+1+" is -> "+cnobj.CountNumberOfOccuranceHashMap(inputarry,1));
        System.out.println(" count of "+2+" is -> "+  cnobj.CountNumberOfOccuranceHashMap(inputarry, 2));
        System.out.println(" count of "+3+" is -> "+  cnobj.CountNumberOfOccuranceHashMap(inputarry, 3) );



        /**---move Zeros to end*/
        int[] arrwithzero = {1,2,3,4,5,0,1,0,0,0,4,1,0,9};
        System.out.println(" arrya after moving zeros " + Arrays.toString(cnobj.moveZerosToEnd(arrwithzero)));

        /**--merge sored array--**/
        int[] inpArr1 = {1,2,3,4,5,0,0,0};
        int[] inpArr2 = {7,8,9};
        System.out.println(" arrya after merge " + Arrays.toString(cnobj.mergeTwoArrays(inpArr1,inpArr2)));

        /**---get char occurances*/
        String strInp = "Write a script to print the no. of occurrences of a given character or all letters in a strin";
        System.out.println(" number of occurances" +(cnobj.getNumberOfOccurances(strInp,'s')));

        /**--reverse subset of an arrray-**/
        { int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int[] reverArry = cnobj.reverseSubArrays(arr, k);
            System.out.println("reversed Array ->" + Arrays.toString(reverArry));
        }


        {
            /*Efficient search in an array where difference between adjacent is 1*/
            int arr1[] = {1, 0, -1,-2,-1,0,1,2,3 };
            System.out.println("Occurance of 3 is at index ->" + cnobj.getIndexOfFirstOccuranceOfArray(arr1,3));
            System.out.println("Occurance of 8 is at index ->" + cnobj.getIndexOfFirstOccuranceOfArray(arr1,1));
            System.out.println("Occurance of 10 is at index ->" + cnobj.getIndexOfFirstOccuranceOfArray(arr1,-2));
            System.out.println("Occurance of 2 is at index ->" + cnobj.getIndexOfFirstOccuranceOfArray(arr1,-1));
            System.out.println("Occurance of 4 is at index ->" + cnobj.getIndexOfFirstOccuranceOfArray(arr1,4));

        }

        /*Reverse a String*/
        {
          String  Str ="I AM A GEEK";
            System.out.println("reversed words ->" + cnobj.reverseWordsInString(Str));
        }

        {
            EncodeString  a =new EncodeString();
            System.out.println("encoded ->" + a.EncodeWOrking("mmmmmmmaaaassttttiiiirrrstams"));
        }

        {
            char[] ch = {'a','a','a' ,'b','c','c','d'};
            int len = cnobj.removeDulicatesOfCharArray(ch,ch.length);
            for(int i=0;i<len;i++){
                System.out.println(ch[i]);
            }
        }
        {

            SortTshirtSizes stest = new SortTshirtSizes();
            System.out.println(stest.Solution2("Forget CVs..Save time . x x"));
        }
    }


}
