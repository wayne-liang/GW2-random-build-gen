package com.wayne.weapons;

import com.wayne.build.StatType;

/**
 * Interface for all weapon classes, along with enum defining weapon type.
 */
public interface Weapon {

    public enum WeaponType {
        TWOHANDED,
        ONEHANDED
    }

    WeaponType getWeaponType();

}
