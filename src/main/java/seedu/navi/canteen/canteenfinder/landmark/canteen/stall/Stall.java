package seedu.navi.canteen.canteenfinder.landmark.canteen.stall;

public class Stall {
    private final String name;
    private final StallCharacteristic stallCharacteristic;

    public Stall(String name, boolean halalCertified, boolean muslimOwned,
                 boolean vegetarian, boolean inAirconArea) {
        this.name = name;
        stallCharacteristic = new StallCharacteristic(halalCertified, muslimOwned,
                vegetarian, inAirconArea);
    }

    public String toString() {
        return name + "\n" +
                "  " + stallCharacteristic.getHalalCertifiedIcon() + "\n" +
                "  " + stallCharacteristic.getMuslimOwnedIcon() + "\n" +
                "  " + stallCharacteristic.getVegetarianIcon() + "\n" +
                "  " + stallCharacteristic.getInAirconAreaIcon() + "\n";
    }

    public String getName() {
        return name;
    }

    public StallCharacteristic getStallCharacteristic() {
        return stallCharacteristic;
    }

    public boolean isValidStall(boolean isOrSearchType, String[] canteenCriteria) {
        assert stallCharacteristic != null : "stallCharacteristic should not be null";
        if (isOrSearchType) {
            return stallCharacteristic.containsAnyField(canteenCriteria);
        }
        return stallCharacteristic.containsAllFields(canteenCriteria);
    }
}
