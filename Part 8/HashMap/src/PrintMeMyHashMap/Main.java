package PrintMeMyHashMap;

import java.util.HashMap;

import static PrintMeMyHashMap.Program.printKeys;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
    }
}
