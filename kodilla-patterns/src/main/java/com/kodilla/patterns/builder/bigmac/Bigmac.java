package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final boolean bun;
    private final int burgers;
    private final String sause;
    private final List<String> ingredients;

    private Bigmac(boolean bun, int burgers, String sause, List<String> ingredients) {
        this.bun = bun;
        this.sause = sause;
        this.ingredients = ingredients;
        this.burgers = burgers;
    }

    public boolean isBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSause() {
        return sause;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sause='" + sause + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {

        private boolean bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        private int burgers;

        public BigmacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
