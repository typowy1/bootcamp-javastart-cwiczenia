package cwiczenia.lekcja4.Notebook;

public class Notebook {

    String model;
    String producer;
    int ram;
    int cpu;
    boolean operatingSystem;

    Notebook(String model, String producer, int ram, int cpu, boolean operatingSystem) {
        this(model, producer, cpu, operatingSystem);
        this.ram = ram;
    }

    Notebook(String model, String producer, int ram, int cpu) {
        this(model, producer, cpu);
        this.ram = ram;
    }

    Notebook(String model, String producer, int cpu, boolean operatingSystem) {
        this(model, producer, cpu);
        this.operatingSystem = operatingSystem;
    }

    Notebook(String model, String producer, int cpu) {
        this.model = model;
        this.producer = producer;
        this.cpu = cpu;
    }

    String getDescription() {
        return "Producer: " + producer + ", model: " + model + ", ram: " + ram
                + ", cpu: " + cpu + ", OS: " + operatingSystem;
    }

}
