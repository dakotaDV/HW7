package task2;

public class Driver <T extends Transport > {

    private String name;
    private String driverLicense;
    private double experience;
    private T car;


    public Driver(String name, String driverLicense, double experience, T car) {
        setName(name);
        setDriverLicense(driverLicense);
        setExperience(experience);
        setCar(car);
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        if (car != null) {
            this.car = car;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Укажите ФИО";
        } else {
            this.name = name;
        }
    }
    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null || driverLicense.isEmpty()) {
            throw new IllegalArgumentException("Укажите категорию водтельских прав");
        } else {
            this.driverLicense = driverLicense;
        }
    }
    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience < 0) {
            this.experience = 0;
            System.out.println("Укажите опыт вождения");
        } else {
            this.experience = experience;
        }
    }
    public void start(T transport) {
        System.out.println("Начать движение на " + transport.getBrand() + " " + transport.getModel());
    }

    public void stop(T transport){
        System.out.println("Остановиться на " + transport.getBrand() + " " + transport.getModel());
    }


    public void refuel(T transport) {
        System.out.println("Заправиться на " + transport.getBrand() + " " + transport.getModel());

    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                ", experience=" + experience +
                ", car=" + car +
                '}';
    }
}

