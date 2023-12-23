package org.example;
public class Calling {
    public Calling(int floor, ElevatorType type) throws ElevatorCallException {
        if (floor < 1) {
            throw new ElevatorCallException("Этажа с таким номером не существует");
        }
        this.floor = floor;
        this.type = type;
    }
    public Calling(int floor) throws ElevatorCallException {
        if (floor < 1) {
            throw new ElevatorCallException("Этажа с таким номером не существует");
        }
        this.floor = floor;
        if (floor % 2 == 0) {
            type = ElevatorType.EVEN;
        }
        else {
            type = ElevatorType.ODD;
        }
    }
    int floor;
    ElevatorType type;
}
