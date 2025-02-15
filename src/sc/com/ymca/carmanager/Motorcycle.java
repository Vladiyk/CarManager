package sc.com.ymca.carmanager;

public class Motorcycle {
    // - name
    //- price
    //- weight
    //- color
    //- engineType
    //- isReadyToDrive
    String name;
    int yearOfProduction;
    int price;
    int weight;
    String color;
    String engineType;
    boolean isReadyToDrive;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Motorcycle: " +
                "name = '" + name + '\'' +
                ", yearOfProduction = " + yearOfProduction +
                ", price = " + price +
                ", weight = " + weight +
                ", color = '" + color + '\'' +
                ", engineType = '" + engineType + '\'' +
                ", isReadyToDrive = " + isReadyToDrive;
    }
}
