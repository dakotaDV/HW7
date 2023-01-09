package task2;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport){
        transports.offer(transport);
    }
    public void addMotorCar(MotorCar motorCar){
        add(motorCar);
    }
    public void addTruck(Truck truck){
        add(truck);

    }
    public void service(){
        if(!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.service();
            if(!result){
                transport.repair();
            }
        }
    }
}