package seedu.navi;

import seedu.navi.canteenfinder.CanteenFinderParser;
import seedu.navi.storage.Storage;
import seedu.navi.textui.TextUi;
import seedu.navi.budget.Budget;
import seedu.navi.budget.BudgetParser;
import seedu.navi.favorites.Favorites;
import seedu.navi.favorites.FavoritesParser;

import java.util.Scanner;

public class Navi {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        Storage.processDataFromFiles();

        TextUi.printGreeting();
        Scanner in = new Scanner(System.in);
        TextUi.printGreetUser(in.nextLine());

        // Initialize Budget instance
        Budget budget = new Budget();
        Favorites favorites = new Favorites();
        // Start command processing
        Navi ui = new Navi();
        Parser parser = new Parser(ui, budget, favorites);

        while (true) {
            String input = in.nextLine();
            parser.handleCommand(input);
        }
    }

    public void showExitMessage() {
        TextUi.printLineSeparator();
        System.out.println("Ahh, you’re headin’ off? No worries!");
        System.out.println("Keep on keepin’ on, and we’ll catch ya next time!");
        TextUi.printLineSeparator();
    }

    public void showError(String message) {
        TextUi.printLineSeparator();
        System.out.println("⚠ Whoops! " + message);
        System.out.println("That one’s a bit crook, but no dramas – give it another go!");
        TextUi.printLineSeparator();
    }
}

/**
 * Custom exception class for chatbot errors.
 */
class NaviException extends Exception {
    public NaviException(String message) {
        super("⚠ Oi! " + message +
                "\nLet's get this sorted, mate.");
    }
}

class Parser {
    private final Navi ui;
    private final Budget budget;
    private final Favorites favorites;

    public Parser(Navi ui, Budget budget, Favorites favorites) {
        this.ui = ui;
        this.budget = budget;
        this.favorites = favorites;
    }

    public void handleCommand(String input) {
        try {
            switch (input.toLowerCase()) {
            case "bye":
                ui.showExitMessage(); // Use instance method via object
                System.exit(0);
                break;
            case "canteen":
                CanteenFinderParser.startCanteenFinder();
                break;
            case "budget":
                BudgetParser budgetParser = new BudgetParser(budget);
                budgetParser.start();
                break;
            case "favorites":
                FavoritesParser favoritesParser = new FavoritesParser(favorites);
                favoritesParser.start();
                break;
            default:
                throw new NaviException("That’s not quite right, mate. Give it another shot!");
            }
        } catch (NaviException e) {
            ui.showError(e.getMessage());
        }
    }
}
