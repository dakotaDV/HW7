package task2;

public class Bus extends Transport implements Сompeting {

    private TypeOfCapacity typeOfCapacity;

    public Bus(String brand, String model, double engineVolume, TypeOfCapacity  typeOfCapacity) {
        super(brand, model, engineVolume);
        this.typeOfCapacity = typeOfCapacity;
    }

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }

    @Override
    protected void startMoving() {
        System.out.println("Вставить ключ в замок зажигания");
    }
    @Override
    protected void finishMovement() {
        System.out.println("Выключить зажигание и выйти из автобуса");
    }
    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                "} " + super.toString();
    }

    @Override
    public void printType() {
        if(typeOfCapacity == null){
            System.out.println("Данных по авто недостаточно");
        }else {
            System.out.println("Вместимость автобуса: от " + typeOfCapacity.getFrom() + " чел. до " + typeOfCapacity.getTo() + " чел.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус" + getBrand() + getModel() + " в диагностике не требуется.");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + getModel() + " починен!");
    }


    @Override
    public void pitStop() {
        System.out.println("Заправить машину и сменить резину");
        return;
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для автобуса");
        return;
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшая скорость круга у автобуса ");
        return;
    }
}
