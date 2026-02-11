import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project using Pokemon data.
 *
 * This program reads a CSV file containing Pokemon information, creates
 * Pokemon objects for each row, and performs simple analysis such as:
 * counting types and checking if specific Pokemon are strong.</p>
 *
 * @author Quan Nguyen
 * @version 1.0
 */
public class PokeCalculator {

    /**
     * Entry point for the PokeCalculator application.
     *
     * This method:
     * Reads a CSV file containing Pokemon data.
     * Creates Pokemon objects from each row.
     * Stores the Pokemon in an array.
     * Performs simple analyses such as counting types and checking strength.
     * Prints insights to the console.
     *
     * @param args Command-line arguments (not used)
     * @throws FileNotFoundException if the CSV file cannot be found at the specified path
     */
    public static void main(String[] args) throws FileNotFoundException {

        // Update this with your CSV file path
        File file = new File("data/pokemon.csv");
        Scanner scanner = new Scanner(file);

        // Array to store Pokemon objects (assumes Gen 1 Pokemon)
        Pokemon[] pokemonList = new Pokemon[152];
        int count = 0;

        // Skip header row if present
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        // Read CSV rows and create Pokemon objects
        while (scanner.hasNextLine() && count < pokemonList.length) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");

            // Assuming columns: Name, Type1, Type2, Attack, Defense (adjust indices)
            String name = columns[1];
            String type1 = columns[2];
            String type2 = columns[3];
            int attack = Integer.parseInt(columns[6]);
            int defense = Integer.parseInt(columns[7]);

            Pokemon pokemon = new Pokemon(name, type1, type2, attack, defense);
            pokemonList[count] = pokemon;
            count++;
        }

        // Example analyses
        int fireCount = pokemonList[0].howManyTypes(pokemonList, count, "Fire");
        int waterCount = pokemonList[0].howManyTypes(pokemonList, count, "Water");
        int grassCount = pokemonList[0].howManyTypes(pokemonList, count, "Grass");

        boolean is0Strong = pokemonList[0].isStrong(pokemonList, 0);
        boolean is21Strong = pokemonList[21].isStrong(pokemonList, 21);
        boolean is67Strong = pokemonList[67].isStrong(pokemonList, 67);

        // Print insights
        System.out.println("Total Pokemon loaded: " + count);
        System.out.println("Number of Fire type Pokemon: " + fireCount);
        System.out.println("Number of Water type Pokemon: " + waterCount);
        System.out.println("Number of Grass type Pokemon: " + grassCount);

        System.out.println("Is the Pokemon " + pokemonList[0].getName() + " strong? " + is0Strong);
        System.out.println("Is the Pokemon " + pokemonList[21].getName() + " strong? " + is21Strong);
        System.out.println("Is the Pokemon " + pokemonList[67].getName() + " strong? " + is67Strong);

        scanner.close();
    }
}
