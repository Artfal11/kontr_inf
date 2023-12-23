package org.example;
public class ElevatorEven extends Elevator {
    @Override
    public void call(Calling call) throws ElevatorCallException {
        if (call.type == ElevatorType.EVEN) {
            status = StatusOfElevator.BUSY;
            System.out.println("Лифт для четных этажей едет на этаж "+ call.floor);
            status = StatusOfElevator.FREE;
        }
        else if (call.type == ElevatorType.ODD) {
            throw new ElevatorCallException("Невозможно вызвать лифт для четных этажей на нечетный этаж");
        }
        else if (call.type == ElevatorType.EMPLOYEE) {
            throw new ElevatorCallException("Для сотрудников есть отдельный лифт");
        }
    }
}
