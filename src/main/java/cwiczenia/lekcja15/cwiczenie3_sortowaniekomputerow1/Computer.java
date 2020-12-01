package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow1;

public class Computer implements Comparable<Computer> {

    private String name;
    private int cpu;
    private int memory;

    public Computer(String name, int cpu, int memory) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public int compareTo(Computer computer) {
        //w zależności od znaku czyli +1 albo -1 będzie sortowanie rosnąco lub malejąco
//        po prędkości procesora rosnąco
        if (this.cpu > computer.cpu)
            return 1; //-1 malejąco
        else if (this.cpu < computer.cpu)
            return -1;//1 malejąco
            //jeśli prędkość procesora jest taka sama, to uwzględnij ilość pamięci rosnąco
        else if (this.memory > computer.memory)
            return 1;
        else if (this.memory < computer.memory)
            return -1;
            //jeśli ilość pamięci jest taka sama to uwzględnij nazwę w kolejności alfabetycznej
        else
            return this.name.compareTo(computer.name);// stringi porównujemy przez comperto, malejąco dajemy - przed -this.name.compareTo(computer.name)
        //-this.name.compareTo(computer.name) w kolejności od końca alfabetu
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                ", memory=" + memory +
                '}';
    }
}
