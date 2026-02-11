import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class PokeCalculator {

    public static void main(String[] args) throws FileNotFoundException {

        // TODO: Update this with your CSV file path
        File file = new File("data/pokemon.csv");
        Scanner scanner = new Scanner(file);

        // TODO: Create an array of Data objects to store data
        Pokemon[] pokemonList = new Pokemon[152]; // Assuming only gen 1 Pokemon.
        int count = 0;

        // TODO: Read file using Scanner
        // - Skip header if needed
        // - Loop through rows
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Skip header
        }

        while (scanner.hasNextLine() && count < pokemonList.length) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");

            // Assuming columns are: Name, Attack, Defense
            String name = columns[1];
            String type1 = columns[2];
            String type2 = columns[3];
            int attack = Integer.parseInt(columns[6]);
            int defense = Integer.parseInt(columns[7]);

            Pokemon pokemon = new Pokemon(name, type1, type2, attack, defense);
            pokemonList[count] = pokemon;
            count++;
        }


        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);
        int fireCount = pokemonList[0].howManyTypes(pokemonList, count, "Fire");
        int waterCount = pokemonList[0].howManyTypes(pokemonList, count, "Water");
        int grassCount = pokemonList[0].howManyTypes(pokemonList, count, "Grass");

        boolean isStrong = pokemonList[0].isStrong(pokemonList, 0);

        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
        System.out.println("Total Pokemon loaded: " + count);
        System.out.println("Number of Fire type Pokemon: " + fireCount);
        System.out.println("Number of Water type Pokemon: " + waterCount);
        System.out.println("Number of Grass type Pokemon: " + grassCount);
        System.out.println("Is the Pokemon " + pokemonList[0].getName() + " strong? " + isStrong);

        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
    }


}