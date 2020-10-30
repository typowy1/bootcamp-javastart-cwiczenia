package prework.dziedziczenie.Computer;

public class Notebook extends Computer {

    private int batteryCapacity; // pojemność baterii mAh

    public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
        super(cpuTemperature, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void coolDown() {
        super.coolDown();
        turboCool();
    }

    private void turboCool() {
        setCpuTemperature(getCpuTemperature() - 2);
    }


//    Nawet jeśli tego nie zapiszesz, to pierwszą instrukcją w konstruktorze zawsze jest super().
//    Korzystając z instrukcji super() możemy z konstruktora naszej klasy wywołać konstruktor z klasy nadrzędnej.
//    Jeżeli w klasie nadrzędnej będzie kilka konstruktorów, to wywołany będzie ten, który odpowiada przekazanym do super()
//    argumentom. Używając notacji super.nazwaMetody() możesz wywołać dowolną metodę z klasy nadrzędnej,
//    co jest przydatne szczególnie wtedy, kiedy nadpisałeś metodę z klasy nadrzędnej w swojej klasie, a nadal potrzebujesz
//    do niej dostępu.

}
