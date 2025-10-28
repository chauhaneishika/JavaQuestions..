public class Main{

    static void main() {
        Car car = new Car("2022 Blue Ferrari 296" +
                " GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue" +
                " Ferrari 296 GTS",15.4,6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla" +
                " Model 3",568,75);
        runRace(tesla);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
