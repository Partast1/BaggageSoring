public class Destination {
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public Destination(String des)
    {
        setPlace(des);
    }

    public String toString()
    {
        return getPlace();
    }
}
