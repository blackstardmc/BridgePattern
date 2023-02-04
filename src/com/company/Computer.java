package com.company;

interface Computer {
    public void runPrograms();
    public void playGame();
}

class Laptop implements Computer{

    @Override
    public void runPrograms() {
        System.out.println("Running program on laptop");
    }

    @Override
    public void playGame() {
        System.out.println("Playing game on Laptop");
    }
}

class DesktopComputer implements Computer{

    @Override
    public void runPrograms() {
        System.out.println("Running program on desktop");

    }

    @Override
    public void playGame() {
        System.out.println("Running program on desktop");

    }
}

interface OS{
    void installOS();
    void runOS();
}

class Windows implements OS{

    @Override
    public void installOS() {
        System.out.println("Installing Windows");

    }

    @Override
    public void runOS() {
        System.out.println("Running Windows");

    }
}

class MacOS implements OS{

    @Override
    public void installOS() {
        System.out.println("Installing MacOS");

    }

    @Override
    public void runOS() {
        System.out.println("Running MacOS");

    }
}

class ComputerWithSystem{
    private Computer computer;
    private OS system;

    ComputerWithSystem(Computer computer, OS system) {
        this.computer = computer;
        this.system = system;
    }

    public void runPrograms(){
        computer.runPrograms();
    }

    public void playGame(){
        computer.playGame();
    }

    public void installSystem(){
        system.installOS();
    }

    public void runOS(){
        system.runOS();
    }
}

