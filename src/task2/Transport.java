package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  abstract class Transport {


    protected String brand;
    protected String model;
    protected double engineVolume;
    protected final List<Driver<?>> drivers = new ArrayList<>();
    protected final List<Mechanic<?>> mechanics = new ArrayList<>();
    protected final List<Sponsor> sponsors = new ArrayList<>();
    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Укажите бренд";
        }else{
            this.brand = brand;
        }
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "Укажите марку";
        }else{
            this.model = model;
        }
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = 0;
            System.out.println("Укажите объем двигателя");
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void addDriver(Driver<?>...drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>...mechanics){

        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor...sponsors){

        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    protected abstract void startMoving();

    protected abstract void finishMovement();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public abstract void printType();

    public abstract boolean service();
    public abstract void repair ();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}


