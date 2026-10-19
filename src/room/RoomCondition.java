package room;

public class RoomCondition {
   private String stat;
   private int minValue;
   private String message;

    public RoomCondition(String stat, int minValue, String message) {
        this.setStat(stat);
        this.setMinValue(minValue);
        this.setMessage(message);
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}