package seedu.navi.textui;

import seedu.navi.canteen.canteenfinder.landmark.canteen.stall.Stall;
import seedu.navi.canteen.canteenfinder.nearestcanteendata.NearestCanteenData;

import java.util.ArrayList;
import java.util.Scanner;


public class TextUi {
    public static final Scanner IN = new Scanner(System.in);

    private static final String LOGO = """
                
                 _   _             _
                | \\ | | __ ___   _(_)
                |  \\| |/ _` \\ \\ / / |
                | |\\  | (_| |\\ V /| |
                |_| \\_|\\__,_| \\_/ |_|""";

    public static void printLineSeparator() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    /**
     * @author kevinchangckc
     */
    public static void printGreeting() {
        printLineSeparator();
        System.out.println("Welcome! I'm:" + LOGO);
        System.out.println("Alright, what can I do for you?");
        printLineSeparator();
    }

    /**
     * @author kevinchangckc
     */
    public static void printExitMessage() {
        printLineSeparator();
        System.out.println("Ah, you’re heading off? No worries!");
        System.out.println("We’ll catch you next time!");
        printLineSeparator();
    }

    public static void printInvalidCommand() {
        printLineSeparator();
        System.out.print("""
                You've entered an invalid command!
                Remember that I can help you with:
                - "canteen" to find canteens
                - "budget" to set or check your budget
                - "favorites" to manage your favorite spots
                - "exit" to quit Navi
                """);
        printLineSeparator();
    }

    public static void printCanteenFinderGreetingCF() {
        printLineSeparator();
        System.out.print("""
                So you wanna find where's the nearest canteen to you?
                You can enter the command as follows:
                "search type | your location | canteen criteria 1, canteen criteria 2"
                """);
        printLineSeparator();
    }

    public static void printEmptyCanteenFinderCommandCF() {
        printLineSeparator();
        System.out.print("""
                Oh no! You did not enter anything!
                Please enter the command as follows:
                "search type | your location | canteen criteria 1, canteen criteria 2"
                """);
        printLineSeparator();
    }

    public static void printMissingCanteenFinderFieldsCF() {
        printLineSeparator();
        System.out.print("""
                Oh no! You did not fill in all the required fields!
                Please enter the command as follows:
                "search type | your location | canteen criteria 1, canteen criteria 2"
                """);
        printLineSeparator();
    }

    public static void printInvalidSearchTypeCF() {
        printLineSeparator();
        System.out.println("Oh no! You did not enter a valid search type!");
        System.out.println("Please enter either 1 (match any criteria) or 2 (match all criteria).");
        printLineSeparator();
    }

    public static void printNearestCanteenCF(NearestCanteenData nearestCanteenData) {
        printLineSeparator();
        System.out.println("Alright! The nearest canteen to you that fit your criteria is");
        System.out.println(nearestCanteenData.nearestCanteen().getName());
        System.out.println("which is: ");
        printValidStallsCF(nearestCanteenData.validStalls());
        System.out.println("and it is approximately at most " + nearestCanteenData.canteenDistance()
                + "m from where you are.");
        printRepeatCanteenFinderCF();
        printLineSeparator();
    }

    public static void printLocationNotFoundCF() {
        printLineSeparator();
        System.out.println("Sorry! The location you entered does not exist in my data. :(");
        System.out.println("Please try another location!");
        printRepeatCanteenFinderCF();
        printLineSeparator();
    }

    public static void printCanteenNotFoundCF() {
        printLineSeparator();
        System.out.println("Sorry! I couldn't find any canteen that meets your criteria. :(");
        System.out.println("Please try another set of criteria!");
        printRepeatCanteenFinderCF();
        printLineSeparator();
    }

    public static void printInvalidCanteenCriteriaCF() {
        printLineSeparator();
        System.out.println("Please enter a valid criteria that is,");
        System.out.println("""
                "Halal Certified", "Muslim Owned", "Vegetarian", "Aircon"
                or "NIL" if you're fine with anything!""");
        printLineSeparator();
    }

    public static void printNILWithOtherCriteriaErrorCF() {
        printLineSeparator();
        System.out.println("You can't include other criteria with \"NIL\"!");
        printLineSeparator();
    }

    public static void printDuplicateCanteenCriteriaCF() {
        printLineSeparator();
        System.out.println("You've entered the same type of criteria more than once!");
        printLineSeparator();
    }

    public static void printHCAndMOCriteriaErrorCF() {
        printLineSeparator();
        System.out.println("Please enter either Halal Certified or Muslim Owned and not both!");
        printLineSeparator();
    }

    public static void printExitCanteenFinderCF() {
        printLineSeparator();
        System.out.println("You have exited the Canteen Finder feature!");
        printLineSeparator();
    }

    private static void printRepeatCanteenFinderCF() {
        System.out.println("You can enter your canteen criteria again to start the search again,");
        System.out.println("or \"exit\" to exit canteen finder.");
    }

    public static void printValidStallsCF(ArrayList<Stall> validStalls) {
        for (Stall stall : validStalls) {
            System.out.print(stall);
        }
    }

    public static void printCanteenGreetingC() {
        printLineSeparator();
        System.out.println("You've entered the Canteen feature!");
        System.out.println("You can enter \"finder\" to look for the nearest canteen to you,");
        System.out.println("or you can enter \"lookup\" to see a canteen's stalls information.");
        printLineSeparator();
    }

    public static void printExitCanteenC() {
        printLineSeparator();
        System.out.println("You've exited the Canteen feature!");
        printLineSeparator();
    }

    public static void printInvalidCommandC() {
        printLineSeparator();
        System.out.println("You've entered an invalid command!");
        System.out.println("Please only enter \"finder\", \"lookup\" or \"exit\".");
        printLineSeparator();
    }

    public static void printCanteenLookupGreetingCL() {
        printLineSeparator();
        System.out.println("You've entered the Canteen Lookup feature!");
        System.out.println("Enter any Canteen in NUS to check what kind of stalls it have!");
        System.out.println("Eg. Techno Edge");
        printLineSeparator();
    }

    public static void printExitCanteenLookupCL() {
        printLineSeparator();
        System.out.println("You've exited the Canteen Lookup feature");
        printLineSeparator();
    }

    public static void printCanteenStallsCL(String canteenName, ArrayList<Stall> stalls) {
        printLineSeparator();
        System.out.println("Here are all the stalls in " + canteenName + ":");
        printValidStallsCF(stalls);
        printLineSeparator();
    }

    public static void printCanteenNotFoundCL() {
        printLineSeparator();
        System.out.println("Sorry, we could not find the canteen you're looking for!");
        printLineSeparator();
    }
}
