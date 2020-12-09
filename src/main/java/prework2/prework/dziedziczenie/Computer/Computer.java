package prework2.prework.dziedziczenie.Computer;

public class Computer {

    private double cpuTemperature; // temperatura
    private int ramMemory; // ilość pamięci w MB

    // konstruktor
    public Computer(double cpuTemperature, int ramMemory) {
        this.cpuTemperature = cpuTemperature;
        this.ramMemory = ramMemory;
    }

    public double getCpuTemperature() {
        return cpuTemperature;
    }

    public void setCpuTemperature(double cpuTemperature) {
        this.cpuTemperature = cpuTemperature;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void coolDown() {
        cpuTemperature = cpuTemperature - 1;
    }
}
