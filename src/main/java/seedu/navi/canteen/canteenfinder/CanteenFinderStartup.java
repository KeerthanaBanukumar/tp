package seedu.navi.canteen.canteenfinder;

import seedu.navi.canteen.canteenfinder.canteenfinder.CanteenFinder;
import seedu.navi.canteen.canteenfinder.canteenfinderparser.CanteenFinderParser;
import seedu.navi.canteen.canteenfinder.nearestcanteendata.NearestCanteenData;
import seedu.navi.canteen.canteenfinder.userfields.UserFields;
import seedu.navi.exceptions.CanteenNotFound;
import seedu.navi.exceptions.DuplicateCanteenCriterion;
import seedu.navi.exceptions.EmptyCanteenFinderCommand;
import seedu.navi.exceptions.HCAndMOCrtieriaError;
import seedu.navi.exceptions.InvalidCanteenCriteria;
import seedu.navi.exceptions.InvalidSearchType;
import seedu.navi.exceptions.LocationNotFound;
import seedu.navi.exceptions.MissingCanteenFinderFields;
import seedu.navi.exceptions.NILWithOtherCriteria;
import seedu.navi.textui.TextUi;

public class CanteenFinderStartup {

    public static void startCanteenFinder() {
        TextUi.printCanteenFinderGreetingCF();
        String command;
        while (true) {
            command = TextUi.IN.nextLine().trim();

            if (command.equalsIgnoreCase("e") ||
                    command.equalsIgnoreCase("exit")) {
                TextUi.printExitCanteenFinderCF();
                break;
            }

            UserFields userFields;
            try {
                userFields = CanteenFinderParser.parseCanteenFinderCommand(command);
            } catch (InvalidSearchType e) {
                TextUi.printInvalidSearchTypeCF();
                continue;
            } catch (EmptyCanteenFinderCommand e) {
                TextUi.printEmptyCanteenFinderCommandCF();
                continue;
            } catch (MissingCanteenFinderFields e) {
                TextUi.printMissingCanteenFinderFieldsCF();
                continue;
            } catch (InvalidCanteenCriteria e) {
                TextUi.printInvalidCanteenCriteriaCF();
                continue;
            } catch (NILWithOtherCriteria e) {
                TextUi.printNILWithOtherCriteriaErrorCF();
                continue;
            } catch (DuplicateCanteenCriterion e) {
                TextUi.printDuplicateCanteenCriteriaCF();
                continue;
            } catch (HCAndMOCrtieriaError e) {
                TextUi.printHCAndMOCriteriaErrorCF();
                continue;
            }

            assert userFields != null : "userFields should never be null";

            try {
                NearestCanteenData nearestCanteenData = CanteenFinder.findNearestCanteen(userFields);
                TextUi.printNearestCanteenCF(nearestCanteenData);
            } catch (LocationNotFound e) {
                TextUi.printLocationNotFoundCF();
            } catch (CanteenNotFound e) {
                TextUi.printCanteenNotFoundCF();
            }
        }
    }
}

