public class Parking {
    private int car=0,bike=0,van=0; // vehicle values
    public int getCar() {
        return car;
    } // for car
    public void setCar(int car) {
        this.car = car;
    }
    public int getBike() {
        return bike;
    }  // for bike
    public void setBike(int bike) {
        this.bike = bike;
    }
    public int getVan() {
        return van;
    }  // for van
    public void setVan(int van) { this.van = van; }
    public void delete()
    {
        car=0;
        bike=0;
        van=0;
    }
}
