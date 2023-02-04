package com.company;

public class Main {

    public static void main(String[] args) {
        ComputerWithSystem computer = new ComputerWithSystem(new Laptop(), new MacOS());
        computer.installSystem();
        computer.runPrograms();

        ComputerWithSystem computer1 = new ComputerWithSystem(new DesktopComputer(), new Windows());
        computer1.installSystem();
        computer1.runPrograms();

    }
}
