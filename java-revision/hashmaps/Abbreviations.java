package hashmaps;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> directory;

    public Abbreviations() {
        this.directory = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        directory.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) { 
        return this.directory.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.directory.get(abbreviation);
    }

}
