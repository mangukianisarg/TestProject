import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        Bike bike = new Bike();
        ArrayList list = bike.countOdds(7, 38758);
        int size = list.size();
        System.out.println(size + " IS SIZE OF ARRAY");
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        System.out.println("ODD COUNT : " + bike.countOdds(7, 38758).toString().split(",").length);
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear();
        bicycle.changeGear();
        bicycle.changeGear();
        Car car = new Car();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
    }
}

interface Vehicle {
    void changeGear();
}

class Bicycle implements Vehicle {
    static int MAX_GEAR = 2;
    int gear = 0;

    @Override
    public void changeGear() {
        if (MAX_GEAR == gear) {
            System.out.println("GEAR NOT ALLOWED");
            return;
        }
        gear++;
        System.out.println(gear);
    }
}

class Bike implements Vehicle {
    static int MAX_GEAR = 5;
    static int gear = 0;

    public void changeGear() {
        if (MAX_GEAR == gear) {
            System.out.println("GEAR NOT ALLOWED");
            return;
        }
        gear++;
        System.out.println(gear);
    }

    public ArrayList<Integer> countOdds(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (i % 2 == 1) {
                list.add(i);
            }
        }
        return list;
    }
}

class Car implements Vehicle {
    static int MAX_GEAR = 7;
    int gear = 0;

    @Override
    public void changeGear() {
        if (MAX_GEAR == gear) {
            System.out.println("GEAR NOT ALLOWED");
            return;
        }
        gear++;
        System.out.println(gear);
    }
}
