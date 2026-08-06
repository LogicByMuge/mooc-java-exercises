package SimpleDictionary;
import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> hashMap;

    public SimpleDictionary() {
        hashMap = new HashMap<>();
    }

    public void addWord(String word, String translation) {
        hashMap.put(word, translation);
    }

    public String translate(String word) {
        if(!hashMap.containsKey(word)) {
            return null;
        }
        return hashMap.get(word);
    }
}
