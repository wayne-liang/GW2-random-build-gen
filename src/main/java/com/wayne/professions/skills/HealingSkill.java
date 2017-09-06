package com.wayne.professions.skills;

import java.util.ArrayList;
import java.util.List;

public class HealingSkill implements ProfessionSkill {

    private String _name;

    public HealingSkill(String name) {
        _name = name;
    }

    public List<ProfessionSkill> createSkills(List<String> skillNames) {
        List<ProfessionSkill> skills = new ArrayList<>();

        for (String name : skillNames) {
            skills.add(new HealingSkill(name));
        }

        return skills;
    }

}
