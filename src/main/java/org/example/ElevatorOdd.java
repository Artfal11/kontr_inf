package org.example;
public class ElevatorOdd extends Elevator {
    @Override
    public void call(Calling call) throws ElevatorCallException {
        if (call.type == ElevatorType.ODD) {
            status = StatusOfElevator.BUSY;
            System.out.println("Лифт для нечетных этажей едет на этаж "+ call.floor);
            status = StatusOfElevator.FREE;
        }
        else if (call.type == ElevatorType.EVEN) {
            throw new ElevatorCallException("Невозможно вызвать лифт для нечетных этажей на четный этаж");
        }
        else if (call.type == ElevatorType.EMPLOYEE) {
            throw new ElevatorCallException("Для сотрудников есть отдельный лифт");
        }
    }
}
