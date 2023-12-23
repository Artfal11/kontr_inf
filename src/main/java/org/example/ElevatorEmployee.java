package org.example;
public class ElevatorEmployee extends Elevator {
    @Override
    public void call(Calling call) throws ElevatorCallException {
        if (call.type == ElevatorType.EMPLOYEE) {
            status = StatusOfElevator.BUSY;
            System.out.println("Лифт для сотрудников ушёл на этаж "+ call.floor);
            status = StatusOfElevator.FREE;
        }
        else {
            throw new ElevatorCallException("Лифт только для сотрудников");
        }
    }
}
