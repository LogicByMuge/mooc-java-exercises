package Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    HashMap<String, String> abbreviation;

    public Abbreviations() {
        abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if(!this.abbreviation.containsKey(abbreviation)) {
            this.abbreviation.put(abbreviation,explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviation.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return  this.abbreviation.get(abbreviation);
    }
}
