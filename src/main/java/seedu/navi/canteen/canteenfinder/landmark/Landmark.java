package seedu.navi.canteen.canteenfinder.landmark;

import seedu.navi.canteen.canteenfinder.landmark.canteen.Canteen;
import seedu.navi.canteen.canteenfinder.landmark.canteen.stall.Stall;
import seedu.navi.canteen.canteenfinder.nearestcanteendata.NearestCanteenData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Landmark {
    protected String name;
    // nearest canteen starting at index 0
    protected ArrayList<Canteen> nearestCanteens;
    protected Map<Canteen, Integer> canteenDistances; // Add distance storage

    public Landmark(String name) {
        this.name = name;
        nearestCanteens = new ArrayList<>();
        canteenDistances = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setNearestCanteens(Canteen canteen) {
        nearestCanteens.add(canteen);
    }

    public NearestCanteenData getNearestCanteen(boolean isOrSearchType, String[] canteenCriteria) {
        for (Canteen nearestCanteen : nearestCanteens) {
            ArrayList<Stall> validStalls = nearestCanteen.findValidStalls(isOrSearchType, canteenCriteria);
            if (!validStalls.isEmpty()) {
                return new NearestCanteenData(nearestCanteen, canteenDistances.get(nearestCanteen), validStalls);
            }
        }
        return null;
    }

    public void setCanteenDistance(Canteen canteen, int distance) {
        canteenDistances.put(canteen, distance);
    }

    public int getCanteenDistance(Canteen canteen) {
        return canteenDistances.getOrDefault(canteen, -1);
    }
}
