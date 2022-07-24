
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author logan
 */
public class UserInterface {

    private Scanner scan;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner) {
        this.scan = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.println("File to read:");
        String file = this.scan.nextLine();
        this.readFile(file);

        while (true) {
            System.out.println("\nCommands:\n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program\n"
                    + "find name - searches recipes by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient\n");
            System.out.println("Enter command:");
            String cmd = this.scan.nextLine();

            if (cmd.equals("stop")) {
                return;
            } else if (cmd.equals("list")) {
                this.printList();
            } else if (cmd.equals("find name")) {
                this.findByName();
            } else if (cmd.equals("find cooking time")) {
                this.findByTime();
            } else if (cmd.equals("find ingredient")) {
                this.findByIngredient();
            }
        }
    }

    public void readFile(String file) {
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            String recipeName = "";
            int cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();

            boolean isName = true;
            boolean isCookingTime = false;
            boolean isIngredient = false;

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (isName) {
                    recipeName = line;
                    isName = false;
                    isCookingTime = true;
                } else if (isCookingTime) {
                    cookingTime = Integer.valueOf(line);
                    isCookingTime = false;
                    isIngredient = true;
                } else if (isIngredient && !line.isEmpty()) {
                    ingredients.add(line);
                } else if (line.isEmpty() || line.equals("") || line.equals(" ")) {
                    isIngredient = false;
                    isName = true;
                    this.recipes.add(new Recipe(recipeName, cookingTime, ingredients));
                    ingredients = new ArrayList<>();
                }
            }
            this.recipes.add(new Recipe(recipeName, cookingTime, ingredients));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printList() {
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
        System.out.println("");
    }

    public void findByName() {
        System.out.println("Searched word:");
        String searchFor = this.scan.nextLine();

        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(searchFor)) {
                System.out.println(recipe);
            }
        }
    }

    public void findByTime() {
        System.out.println("Max cooking time:");
        int searchFor = Integer.valueOf(this.scan.nextLine());

        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getTime() <= searchFor) {
                System.out.println(recipe);
            }
        }
    }

    public void findByIngredient() {
        System.out.println("Ingredient:");
        String searchFor = this.scan.nextLine();

        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            for (String ingredient : recipe.getIngredients()) {
                if (ingredient.equals(searchFor)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
