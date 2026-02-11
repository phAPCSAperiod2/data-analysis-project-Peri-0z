/**
 * Represents a single Pokemon from a dataset.
 * 
 * Each Pokemon object stores basic battle statistics including
 * its name, types, attack, and defense values.
 * 
 * This class can be used for data analysis, filtering, and displaying
 * formatted Pokemon information.
 * 
 * @author Quan Nguyen
 * @version 1.0
 */
public class Pokemon {

    /** The name of the Pokemon. */
    private String name;

    /** The primary type of the Pokemon. */
    private String type1;

    /** The secondary type of the Pokemon. May be null or empty. */
    private String type2;

    /** The attack stat of the Pokemon. */
    private int Attack;

    /** The defense stat of the Pokemon. */
    private int Defense;

    /**
     * Constructs a new Pokemon with the specified attributes.
     *
     * @param name    The name of the Pokemon
     * @param type1   The primary type of the Pokemon
     * @param type2   The secondary type of the Pokemon
     * @param Attack  The attack stat of the Pokemon
     * @param Defense The defense stat of the Pokemon
     */
    public Pokemon(String name, String type1, String type2, int Attack, int Defense) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.Attack = Attack;
        this.Defense = Defense;
    }

    /**
     * Returns the name of the Pokemon.
     *
     * @return The Pokemon's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the primary type of the Pokemon.
     *
     * @return The Pokemon's primary type
     */
    public String getType1() {
        return type1;
    }

    /**
     * Returns the secondary type of the Pokemon.
     *
     * @return The Pokemon's secondary type
     */
    public String getType2() {
        return type2;
    }

    /**
     * Returns the attack stat of the Pokemon.
     *
     * @return The attack value
     */
    public int getAttack() {
        return Attack;
    }

    /**
     * Returns the defense stat of the Pokemon.
     *
     * @return The defense value
     */
    public int getDefense() {
        return Defense;
    }

    /**
     * Determines if the Pokemon at the specified index in the array is strong.
     * 
     * A Pokemon is considered strong if both its attack and defense are greater than 80.
     *
     * @param pokemonList The array of Pokemon objects
     * @param index       The index of the Pokemon to check
     * @return true if the Pokemon is strong; false otherwise
     */
    // Filter by condition.
    public boolean isStrong(Pokemon[] pokemonList, int index) {
        return pokemonList[index].getAttack() > 50 && pokemonList[index].getDefense() > 50;
    }

    /**
     * Counts how many Pokemon in the given array have the specified type.
     *
     * Checks both primary and secondary types for a match.
     *
     * @param pokemonList The array of Pokemon objects
     * @param limit       The number of Pokemon in the array to check
     * @param type        The type to match against
     * @return The number of Pokemon matching the given type
     */
    // Count items matching a condition.
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
     * Returns a formatted string representation of this Pokemon.
     *
     * @return A string containing the Pokemon's name, attack, and defense stats
     */
    @Override
    public String toString() {
        return "Pokemon{'" + name + "', Attack = " + Attack + " | Defense = " + Defense + "}";
    }
}
