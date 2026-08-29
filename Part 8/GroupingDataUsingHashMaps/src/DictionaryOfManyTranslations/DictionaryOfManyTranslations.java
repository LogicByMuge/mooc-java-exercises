package DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }

    // adds the translation for the word and preserves the old translations.
    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, new ArrayList<>());
        dictionary.get(word).add(translation);
    }

    // returns a list of the translations added for the word.
    // If the word has no translations, the method should return an empty list.
    public ArrayList<String> translate(String word) {
        if(dictionary.get(word) == null) {
            return new ArrayList<>();
        }
        return dictionary.get(word);
    }

    // removes the word and all its translations from the dictionary.
    public void remove(String word) {
        dictionary.remove(word);
    }
}
