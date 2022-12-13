import task1.Data;
import task2.*;

public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("text!", "text", "text1");
        if (success) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные невалидны");
        }

        Bus vector = new Bus("Вектор", "NEXT 8.8", 11.6, TypeOfCapacity.AVERAGE);
        Bus kavz = new Bus("Кавз Аврора", "4235", 10.7, TypeOfCapacity.LARGE);
        Bus paz = new Bus("Паз", "4234", 12.1, TypeOfCapacity.EXTRA_LARGE);
        Bus maz = new Bus("Маз", "131020", 11.3, TypeOfCapacity.SMALL);

        MotorCar audi = new MotorCar("Audi", "A8 50 L TDI quattro", 3.0, TypeOfBody.COUPE);
        MotorCar bmw = new MotorCar("BMW", "Z8", 3.0, TypeOfBody.CROSSOVER);
        MotorCar kia = new MotorCar("Kia", "Sportage 4-го поколения", 2.6, TypeOfBody.MINIVAN);
        MotorCar lada = new MotorCar("Lada", "Granta", 1.7, TypeOfBody.SEDAN);

        Truck volvo = new Truck("Volvo", "FH", 12.8, TypeOfLiftingCapacity.N1);
        Truck man = new Truck("Man", "TGL", 6.0, TypeOfLiftingCapacity.N2);
        Truck hyundai = new Truck("Hyundai", "HD78", 3.9, TypeOfLiftingCapacity.N3);
        Truck mercedesBenz = new Truck("Mercedes-Benz", "Atego", 4.3, TypeOfLiftingCapacity.N1);

          service(
                vector, kavz, paz, maz,
                audi, bmw, kia, lada,
                volvo, man, hyundai, mercedesBenz

        );

       private static void service (Transport...transports){
            for (Transport transport : transports) {
                serviceTransport (transport); {

                }
            }
        }
        private static void serviceTransport (Transport transport){
            try {
                if (!transport.service()) {
                    throw new RuntimeException("Автомобиль" + transport.getBrand + transport.getModel + " не прошел диагностику");
                } catch(RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        Driver<MotorCar> sergei = new Driver<>("Зайцев Сергей Викторович", "категория B", 10, audi);
        Driver<Bus> alexei = new Driver<>("Белочкин Алексей Иванович", "Категория D", 8, vector);
        Driver<Truck> vadim = new Driver<>("Чернетта Вадим Александрович", "категория С", 9, volvo);


        System.out.println("Водитель " + sergei.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде ");
        sergei.start(audi);
        sergei.refuel(audi);
        sergei.stop(audi);
        audi.printType();
        System.out.println("Водитель " + alexei.getName() + " управляет автомобилем " + vector + " и будет участвовать в заезде ");
        alexei.start(vector);
        alexei.refuel(vector);
        alexei.stop(vector);
        vector.printType();
        System.out.println("Водитель " + vadim.getName() + " управляет автомобилем " + volvo + " и будет участвовать в заезде ");
        vadim.start(volvo);
        vadim.refuel(volvo);
        vadim.stop(volvo);
        volvo.printType();


    }
}





