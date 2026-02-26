[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22617105)
# AP CSA Mini‑Project: Data Analysis with Arrays & File Input
### Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality

---

## 📌 Project Overview
In this mini‑project, you will choose a dataset (CSV file), design a **custom class** to represent each row, read the dataset using the **Scanner** class, store all data as **objects** in an ArrayList or array, and answer a **guiding question** by analyzing the data.

This project reinforces:

- Arrays & ArrayLists  
- File input with `Scanner`  
- Class design (attributes, constructors, methods)  
- Algorithms (min, max, average, filtering)  
- Data quality & ethics  
- Documentation using **Javadoc**  
- Creating a **UML class diagram**  

By the end, you will produce insights and answer your original question using your program.

---

## 🎯 Your Task
You will:

1. **Choose a dataset** (teacher provided or public).  
2. **Write a guiding question** for your dataset.  
3. **Design a Java class** with ≥ 3 attributes.  
4. **Use `Scanner` to read a CSV file**, parse rows, and construct objects.  
5. **Store all objects** in an array or ArrayList.  
6. **Analyze the dataset** using algorithms you create.  
7. **Print insights** and answer your guiding question.  
8. **Document your code** with Javadoc.  
9. **Create a UML class diagram** representing your custom class.  

Optional stretch challenges are included at the bottom!

---

## 🧪 Example Questions You Might Ask
Your dataset might allow you to answer things like:

- *"Which Pokémon type has the highest average Attack?"*  
- *"Which U.S. state had the lowest obesity rate in 2020?"*  
- *"What country had the highest CO₂ emissions in 2000?"*  
- *"What is the average HP for Fire-type Pokémon?"*  

Think simple, clear, and answerable.

---

## 📁 Project Structure
Your repository should follow this structure:
```
/src
    Main.java
    YourClass.java
/data
    your_dataset.csv
README.md   ← this file
UML_Diagram.png (or UML_Diagram.pdf)
```

---

## 🧩 Step 1 — Choose Your Dataset

**Dataset Name:**  pokemon.csv
**Source / Link:**  

**What this dataset contains (2–3 sentences):**  
This dataset contains all the information for the first 152 Pokemon in generation 1. 
This dataset contains the battle stats, types, and pokedex descriptors for all 152 gen 1 pokemon.

---

## ❓ Step 2 — Write Your Guiding Question

Your guiding question should be something you can answer using your dataset.

**My guiding question:**  
"How many Pokemon are statistically-speaking, strong?"

Examples:

- "Which Pokémon has the highest HP?"  
- "What is the average life expectancy in this dataset?"  
- "Which state had the highest vaccination rate?"  

---

## 🧱 Step 3 — Design Your Class

You must create a class that represents **one row** of your dataset.

### ✔ Your class must include:

- **At least 3 private attributes**  
- **A constructor** that takes all attributes as parameters  
- **Getter methods** for attributes you plan to analyze  
- **`toString()`** for easy printing  
- Any additional analysis/helper methods as needed  

### ✏ Include your class diagram


---

## 📥 Step 4 — Read Your CSV File Using Scanner

In `Main.java`, you must:

- Create a `File` object  
- Use `Scanner` to read the file  
- Skip the header row (if needed)  
- Read each line  
- Split by commas using `.split(",")`  
- Trim whitespace  
- Parse numbers using `Integer.parseInt()` or `Double.parseDouble()`  
- Construct objects  
- Add them to an ArrayList or array  

### Column → Attribute Map

| Attribute Name | CSV Column Name | Column Index # | Notes |
|----------------|------------------|----------------|-------|
|     name       |     Pokemon      |        1       |       |
|     type1      |     Type 1       |        2       |       |
|     type2      |     Type 2       |        3       |       |
|     attack     |     Attack       |        6       |       |
|     defense    |     Defense      |        7       |       |

---

## 📊 Step 5 — Analyze Your Data

You must write **at least two algorithms** to analyze your dataset.

### Required: Choose 2 or more algorithms
- [ ] Minimum value of attribute  
- [ ] Maximum value of attribute  
- [ ] Average of attribute  
- [X] Filter by category  
- [X] Count items matching a condition  

**Algorithms I will implement:**

1. Filter by category.
2. Count items matching a condition.

Optional extras:  
- Sorting  
- Top/bottom N items  
- Grouping by category  
- Comparison between groups  

---

## 🧠 Step 6 — Insights & Answer to Your Question

After analyzing your objects, print:

- ✔ How many rows were loaded  
- ✔ Your algorithm results  
- ✔ A clear answer to your guiding question  

**My findings:**  
Machamp is, statistically-speaking, a strong Pokemon.  
There are 12 fire-type, 32 water-type, and 14 grass-type Pokemon total in Gen 1.  

**My answer to the guiding question:**  
Any Pokemon, like Machamp, with an attack and defense stat  
greater than 50 is generally strong.  

---

## 📝 Step 7 — Documentation Requirements

### ✔ Javadoc Comments
You MUST use Javadoc for:

- Every **class**  
- Every **method**  
- Every **parameter**  
- Every **return value**  

Example:
```java
/**
 * Returns the highest HP among all Pokémon.
 * @param list the ArrayList of Pokémon objects
 * @return highest HP value in the dataset
 */
public static int findMaxHP(ArrayList<Pokemon> list) {
    // implementation
}
```

### ✔ UML Class Diagram
Add a UML diagram showing:

- Class name
- Attributes
- Methods
- Visibility (private/public)

Save as `UML_Diagram.png` or `.pdf` in the repo.

---

## 🛡 Step 8 — Data Ethics & Quality Reflection
Write a short reflection (3–5 sentences):

- What data-quality issues did you find?
- Could your dataset be biased?
- How might incomplete or inaccurate data affect results?
- How trustworthy are your insights?

**My reflection:**  
Data quality can be outdated as the fairy type did not exist back in Gen 1, and now
some Gen 1 pokemon are considered fairy types. My data is biased as I do not take speed
into consideration. Incomplete or inaccurate data can result in neglecting or underestimating
the strength of extremely fast pokemon. My insights are relatively trustworthy for older generation
pokemon players.

---

## ⭐ Optional Challenges (Not Required but Fun!)

### 🔹 User Input
Allow the user to choose:

- Which attribute to analyze
- Which category to filter
- What statistics they want to calculate

### 🔹 Additional Algorithms

- Sorting objects
- Multiple comparisons
- Generating summaries
- Exporting results to a file

### 🔹 Data Cleaning

- Skip rows with missing values
- Detect invalid entries
- Normalize units

---

## ✅ Submission Checklist

- [X] Dataset selected
- [X] Guiding question written
- [X] Class created with ≥3 attributes
- [X] File reading implemented
- [X] ArrayList/array of objects created
- [X] At least 2 analysis algorithms implemented
- [X] Findings printed
- [X] Javadoc comments added
- [X] UML diagram included
- [X] Reflection completed
- [X] Code compiles & runs

---

Good luck, and have fun exploring your dataset! 🚀  
You're now doing real data analysis — just like professional software engineers.
