import task1.Data;
import task2.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("text!", "text", "text1");
        if (success) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные невалидны");
        }


        Mechanic<Transport>ivan = new Mechanic<Transport>("Иван", "Зайцев", "Bus");
        Sponsor rosNeft = new Sponsor("rosNeft", 5_000_000);
        Bus bus = new Bus("Вектор", "NEXT 8.8", 11.6, TypeOfCapacity.AVERAGE);
        bus.addDriver(new Driver<>("Белочкин Алексей Иванович", "Категория D", 8,bus));
        bus.addMechanic(ivan);
        bus.addSponsor(rosNeft);

        Mechanic<MotorCar>petr = new Mechanic<MotorCar>("Петр", "Заплохов", "Auto");
        Sponsor lukoil = new Sponsor("lukoil", 3_000_000);
        Sponsor Mishlen = new Sponsor("Mishlen", 2_000_000);
        MotorCar motorCar = new MotorCar("Audi", "A8 50 L TDI quattro", 3.0, TypeOfBody.COUPE);
        motorCar.addDriver(new Driver<>("Зайцев Сергей Викторович", "категория B", 10, motorCar));
        motorCar.addMechanic(petr);
        motorCar.addSponsor(lukoil, Mishlen);

        Truck truck = new Truck("Volvo", "FH", 12.8, TypeOfLiftingCapacity.N1);
        truck.addDriver(new Driver<>("Чернетта Вадим Александрович", "категория С", 9, truck));
        truck.addMechanic(ivan);
        truck.addSponsor(lukoil);

        List<Transport> transports= List.of(
                motorCar,
                bus,
                truck
        );

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addMotorCar(motorCar);
        serviceStation.addTruck(truck);
        serviceStation.service();
        serviceStation.service();

        for(Transport transport:transports){
           printInfo(transport);
        }
    }
    private static void printInfo(Transport transport){
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + "transport.getModel()");
        System.out.println("Водители:" + transport.getDrivers());
        System.out.println("Механики:" + transport.getMechanics());
        System.out.println("Спонсоры:" + transport.getSponsors());
        System.out.println();
        }


    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
            {
            }
        }
    }
    private static void serviceTransport(Transport transport) {
        try {
            throw new RuntimeException("Автомобиль" + transport.getBrand() + transport.getModel() + " не прошел диагностику");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}






