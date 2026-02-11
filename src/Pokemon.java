/**
 * Represents a single Pokemon from a dataset.
 * 
 * Each Pokemon object stores basic battle statistics including
 * its name, attack value, and defense value.
 * 
 * This class can be used for data analysis, sorting, comparisons,
 * or displaying formatted Pokemon information.
 * 
 * @author Quan Nguyen
 * @version 1.0
 */
public class Pokemon {

    /**
     * Returns the name of the Pokemon.
     *
     * @return The Pokemon's name as a String
     */
    private String name;
    /**
     * Returns the first type of the Pokemon.
     *
     * @return The Pokemon's first type as a String
     */
    private String type1;
        /**
     * Returns the second type  of the Pokemon.
     *
     * @return The Pokemon's second type as a String
     */
    private String type2;
    /**
     * Returns the attack stat of the Pokemon.
     *
     * @return The Pokemon's attack value as an int
     */
    private int Attack;
    /**
     * Returns the defense stat of the Pokemon.
     *
     * @return The Pokemon's defense value as an int
     */
    private int Defense;


    // TODO: Create a constructor that takes all attributes as parameters
    public Pokemon(String name, String type1, String type2, int Attack, int Defense) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.Attack = Attack;
        this.Defense = Defense;
    }

    // TODO: Add getters for attributes you need
    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getAttack() {
        return Attack;
    }

    public int getDefense() {
        return Defense;
    }

    // TODO: Add other data analysis methods
    // Count items matching a condition.
    public boolean isStrong(Pokemon[] pokemonList, int index) {
        if (pokemonList[index].getAttack() > 80 && pokemonList[index].getDefense() > 80) {
            return true;
        } else {
            return false;
        }
    }

    // Filter by category.
    public int howManyTypes(Pokemon[] pokemonList, int limit, String type) {
        int count = 0;
        for (int i = 0; i < limit; i++) {
            if (pokemonList[i].getType1().equals(type) || pokemonList[i].getType2().equals(type)) {
                count++;
            }
        }
        return count;
    }


    /**
     * Returns a formatted String representation of this Pokemon.
     *
     * @return A readable String containing the Pokemon's name,
     *         attack, and defense stats
     */
    @Override
    public String toString() {
        return "Pokemon{'" + name + "', Attack = " + Attack + " | Defense = " + Defense + "}";
    }

}