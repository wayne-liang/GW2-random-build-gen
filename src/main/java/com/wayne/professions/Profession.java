package com.wayne.professions;

import com.wayne.professions.traits.Traitline;
import com.wayne.weapons.Weapon;

import java.util.List;

public interface Profession {

    List<Weapon> getRandomWeaponSet();

    List<Traitline> getRandomTraitLines();



}
