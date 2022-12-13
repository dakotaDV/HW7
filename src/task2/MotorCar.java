package task2;

public class MotorCar extends Transport implements Сompeting {

    private TypeOfBody typeOfBody;

    public MotorCar(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    protected void startMoving() {
        System.out.println("Завести двигатель");
    }
    @Override
    protected void finishMovement() {
        System.out.println("Заглушить машину");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                "} " + super.toString();
    }

    @Override
    public void printType() {
        if(typeOfBody == null){
            System.out.println("Данных по авто недостаточно");
        }else {
            System.out.println("Тип кузова: " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }


    @Override
    public void pitStop() {
        System.out.println("Заехать в бокс");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшая скорость у машины");

    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время у машины");

    }
}
