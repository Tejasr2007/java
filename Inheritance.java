class Bike {
    void bike() {
        System.out.println("GT650");
    }
}

class Car extends Bike {

    Car() {
        System.out.println("BMW");
    }

    Car(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("RollsRoyce"); 
        }
    }

    Car(String car) {
        System.out.println(car);
    }

    Car(String car, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(car);
        }
    }
}

public class Inheritance extends Car {

    public static void main(String[] args) {

        Inheritance I = new Inheritance();

        Car c = new Car(6);

        Car C = new Car("Ferrari");

        Car d = new Car("Thar", 8);

        for (int j = 1; j <= 4; j++) {
            I.bike();
        }
    }
}