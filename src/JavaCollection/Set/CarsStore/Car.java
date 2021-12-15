package JavaCollection.Set.CarsStore;

public class Car {
    private String make;
    private String model;
    private int year;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public Car(String make, String model, int year, int price) {
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                String.format("Make: %s | Model: %s | Year: %s | Price: $ %s", make, model, year, price);
    }


}
