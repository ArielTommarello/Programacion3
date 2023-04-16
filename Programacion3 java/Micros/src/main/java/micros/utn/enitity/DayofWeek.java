package micros.utn.enitity;

public enum DayofWeek {
    MONDAY(11), TUESDAY(12), WEDNESDAY(13), THURSDAY(14), FRIDAY(15), SATURDAY(16), SUNDAY(17);
    private final int dayValue;
    DayofWeek(int dayValue) {
        this.dayValue = dayValue;
    }
    public int getDayValue() {
        return this.dayValue;
    }

}
