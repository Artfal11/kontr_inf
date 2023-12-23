package org.example;

public class ManagerOfElevators implements FreeElevator {
    Elevator elevator;
    // создание списка лифтов
    public void addElevator(Elevator elevator) {
        if (this.elevator == null) {
            this.elevator = elevator;
            this.elevator.next = elevator;
        }
        else {
            Elevator temp = this.elevator;
            while (temp.next != this.elevator) {
                temp = temp.next;
            }
            temp.next = elevator;
            temp = temp.next;
            temp.next = this.elevator;
        }

    }
    // перебор лифтов для определения свободности лифта
    @Override
    public Elevator free() throws ElevatorCallException {
        Elevator temp = elevator;
        while (temp.status != StatusOfElevator.FREE) {
            temp = temp.next;
            if (temp == elevator) {
                throw new ElevatorCallException("Свободных лифтов нет");
            }
        }
        return temp;
    }

}
