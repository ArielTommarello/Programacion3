package micros.utn.enitity;

public enum Jeronime {

    HOLANDA(11), CROACIA(12), WEDNESDAY(13), THURSDAY(14), FRIDAY(15), SATURDAY(16), SUNDAY(17);
    private final int JeronimeValue;
   Jeronime(int JeronimeValue) {
        this.JeronimeValue = JeronimeValue;
    }
    public int getJeronimeValue() {
        return this.JeronimeValue;
    }
}
