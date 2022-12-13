package task2;

public class Truck extends Transport implements Сompeting {

    private TypeOfLiftingCapacity typeOfLiftingCapacity;

    public Truck(String brand, String model, double engineVolume, TypeOfLiftingCapacity typeOfLiftingCapacity) {
        super(brand, model, engineVolume);
        this.typeOfLiftingCapacity = typeOfLiftingCapacity;
    }

    public TypeOfLiftingCapacity getTypeOfLiftingCapacity() {
        return typeOfLiftingCapacity;
    }

    public void setTypeOfLiftingCapacity(TypeOfLiftingCapacity typeOfLiftingCapacity) {
        this.typeOfLiftingCapacity = typeOfLiftingCapacity;
    }

    @Override
    protected void startMoving() {
        System.out.println("Запрыгнуть в кабину и завести двигатель");
    }
    @Override
    protected void finishMovement() {
        System.out.println("Выключить двигатель и спрыгнуть с подножки");
    }
    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                "} " + super.toString();
    }

    @Override
    public void printType() {
        if(typeOfLiftingCapacity == null){
            System.out.println("Данных по авто недостаточно");
        }else {
            String from = typeOfLiftingCapacity.getFrom() == null? "" : "от " + typeOfLiftingCapacity.getFrom() + " т.";
            String to = typeOfLiftingCapacity.getTo() == null? "" : "до " + typeOfLiftingCapacity.getTo() + " т.";
            System.out.println("Грузоподьемность: " + from + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }


    @Override
    public void pitStop() {
        System.out.println("Заехать на запраку");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для грузовика ");
    }
}
