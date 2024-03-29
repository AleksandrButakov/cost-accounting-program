package com.anbngm.data;

import java.util.Arrays;

public enum Category {
    SHOP("Магазины"), FUEL("АЗС"), BAR("Бары");

    private final String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    /*
    public static Category findCategory(String description) {
        return Arrays.stream(values())
                .filter(category -> category.getDescription().equals(description))
                .findFirst()
                .orElseThrow();
    }

     */

}
