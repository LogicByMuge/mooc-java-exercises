package PrintMeMyHashMap;

import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String,String> hashmap) {
        for(String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }
}
