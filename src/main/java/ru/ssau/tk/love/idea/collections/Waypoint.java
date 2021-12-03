package ru.ssau.tk.love.idea.collections;

public class Waypoint extends Location {

    private WaypointType type;
    private Settlement settlement;

    public enum WaypointType {
        DEPOT,
        WAREHOUSE,
        EMPTY
    }

    public WaypointType getType() {
        return type;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }
}
