package sc.com.ymca.carmanager;

public class CarManager {
    public static void main(String[] args) {
/*
Створити два екземпляри(об'єкти) класа Car:
- біла Toyota Prius, 2012 року випуску, вартістю 13500, вагою 1350кг.
- синя Renaut Laguna, 2006 року випуску, вартістю 10850, та вагою 1720кг.
 */
        Car toyota = new Car("Prius", 2012, 13500, 1350, "white");

        Car renaut = new Car("Laguna", 2006, 10850, 1720, "blue");

        Motorcycle suzuki = new Motorcycle("GSX-R1000", 2021, 16000,600,
                "black", "disel", true);

        Motorcycle yamaha = new Motorcycle("FZ1", 2007, 9000, 700,
                "orange", "gas", false);

        System.out.println(toyota + "\n" + renaut + "\n" + suzuki + "\n" + yamaha);
    }
}
