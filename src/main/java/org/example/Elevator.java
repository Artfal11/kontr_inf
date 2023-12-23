package org.example;
public abstract class Elevator {
    StatusOfElevator status;
    Elevator next;

    public Elevator() {
        this.status = StatusOfElevator.FREE;
    }

    public abstract void call(Calling call) throws ElevatorCallException;

}