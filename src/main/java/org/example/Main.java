package org.example;

public class Main {
    public static void main(String[] args) throws ElevatorCallException {
        // для каждого типа создан отдельный список лифтов
        ManagerOfElevators emplElev = new ManagerOfElevators();
        ManagerOfElevators oddElev = new ManagerOfElevators();
        ManagerOfElevators evenElev = new ManagerOfElevators();
        emplElev.addElevator(new ElevatorEmployee());
        for (int i = 0; i < 3; ++i) {
            evenElev.addElevator(new ElevatorEven());
            oddElev.addElevator(new ElevatorOdd());
        }

        Calling call1 = new Calling(1);
        Calling call2 = new Calling(5);
        Calling call3 = new Calling(4);
        Calling call4 = new Calling(3, ElevatorType.EMPLOYEE);
        Calling call5 = new Calling(2);
        Calling call6 = new Calling(13);
        Calling call7 = new Calling(7);
        Calling call8 = new Calling(6);
        Calling call9 = new Calling(7, ElevatorType.EMPLOYEE);
        Calling call10 = new Calling(14);
        Calling call11 = new Calling(3);
        Calling call12 = new Calling(7);
        Calling call13 = new Calling(12);
        Calling call14 = new Calling(5, ElevatorType.EMPLOYEE);
        Calling call15 = new Calling(4);
        Calling call16 = new Calling(9);
        Calling call17 = new Calling(7);
        Calling call18 = new Calling(6);
        Calling call19 = new Calling(2, ElevatorType.EMPLOYEE);
        Calling call20 = new Calling(6);

        oddElev.free().call(call1);
        oddElev.free().call(call2);
        evenElev.free().call(call3);
        emplElev.free().call(call4);
        evenElev.free().call(call5);
        oddElev.free().call(call6);
        oddElev.free().call(call7);
        evenElev.free().call(call8);
        emplElev.free().call(call9);
        evenElev.free().call(call10);
        oddElev.free().call(call11);
        oddElev.free().call(call12);
        evenElev.free().call(call13);
        emplElev.free().call(call14);
        evenElev.free().call(call15);
        oddElev.free().call(call16);
        oddElev.free().call(call17);
        evenElev.free().call(call18);
        emplElev.free().call(call19);
        emplElev.free().call(call20);
    }
}
