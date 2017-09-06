package com.wayne.professions.traits;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Represents a single trait line for a particular profession.
 */
public class Traitline {

    private String _name;
    private List<String> _adept;
    private List<String> _master;
    private List<String> _grandmaster;

    /**
     * Constructs a {@code Traitline} object with the given name and traits.
     * There should be 3 traits for each category.
     * @param name a name for the new {@code Traitline} object
     * @param adept an {@code ArrayList<String>} representing the adept traits
     * @param master an {@code ArrayList<String>} representing the master traits
     * @param grandmaster an {@code ArrayList<String>} representing the grandmaster traits
     */
    public Traitline(String name, List<String> adept, List<String> master, List<String> grandmaster) {
        _name = name;
        _adept = adept;
        _master = master;
        _grandmaster = grandmaster;
    }

    /**
     * Randomly selects an adept, master, and grandmaster trait from this trait line and returns
     * them in an {@code ArrayList<String>}.
     * @return an {@code ArrayList<String>} containing one adept, one master, and one grandmaster trait
     */
    public List<String> getRandomTraitSet() {
        Collections.shuffle(_adept);
        Collections.shuffle(_master);
        Collections.shuffle(_grandmaster);

        return Arrays.asList(_adept.get(0), _master.get(0), _grandmaster.get(0));
    }

}
