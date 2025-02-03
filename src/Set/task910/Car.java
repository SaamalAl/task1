package Set.task910;

public class Car {
    String brandName;
    String modelCar;
    int yearRelease;

    public Car(String brandName, String modelCar, int yearRelease) {
        this.brandName = brandName;
        this.modelCar = modelCar;
        this.yearRelease = yearRelease;
    }


    @Override
    public String toString() {
        return brandName + " " + modelCar + " (" + yearRelease + ")";
    }
}


