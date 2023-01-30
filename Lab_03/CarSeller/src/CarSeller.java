import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSeller {
    private final List<Car> cars;

    public CarSeller() {
        this.cars = new ArrayList<>();
    }

    public void CarReaderFile(File file) throws FileNotFoundException{
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
            String marca = input.nextLine();
            String model = input.nextLine();
            int anno = Integer.parseInt(input.nextLine());
            double costo = Double.parseDouble(input.nextLine());
            Car car = new Car(marca, model, anno, costo);
            this.cars.add(car);
        }
    }

    public List<Car> findBrandModel(String brand, String model){
        List<Car> cars = new ArrayList<>();
        for(Car car : this.cars){
            if(car.getBrand().equalsIgnoreCase(brand)
                    && car.getModel().equalsIgnoreCase(model))
                cars.add(car);
        }
        return cars;
    }

    public List<Car> findBrandModelByYear(String brand, String model, int year){
        List<Car> cars = new ArrayList<>();
        for(Car car : this.cars){
            if(car.getBrand().equalsIgnoreCase(brand)
                    && car.getModel().equalsIgnoreCase(model)
                    && car.getManufacturingYear() >= year)
                cars.add(car);
        }
        return cars;
    }

    public List<Car> findBrandModelByPrice(String brand, String model, double maxPrice){
        List<Car> cars = new ArrayList<>();
        for(Car car : this.cars){
            if(car.getBrand().equalsIgnoreCase(brand)
                    && car.getModel().equalsIgnoreCase(model)
                    && car.getPrice() <= maxPrice)
                cars.add(car);
        }
        return cars;
    }


}