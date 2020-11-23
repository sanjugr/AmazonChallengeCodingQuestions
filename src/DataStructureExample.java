import java.util.HashMap;
import java.util.TreeMap;

public class DataStructureExample {

    /* This is how to declare HashMap */
    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    public HashMap printHasMap() {
        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        return hmap;
    }

    /* This is how to declare Treemap - it will be sorted */
    TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
    public TreeMap printTreeMap() {
        /*Adding elements to HashMap*/
        tmap.put(12, "Chaitanya");
        tmap.put(2, "Rahul");
        tmap.put(7, "Singh");
        tmap.put(49, "Ajeet");
        tmap.put(3, "Anuj");
        return tmap;
    }

    /* This is how to declare Treemap - it will be sorted */
    TreeMap<String,Integer> tmap2 = new TreeMap<String,Integer>();
    public TreeMap printTreeMap2() {
        /*Adding elements to HashMap*/
        tmap2.put("Chaitanya", 12);
        tmap2.put("Rahul",2);
        tmap2.put("Singh",7);
        tmap2.put("Ajeet",49);
        tmap2.put("Anuj",3);
        return tmap2;
    }
}

