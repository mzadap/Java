package Test.CoreJava.composition;

public class PC {
    private Monitor monitor;
    private Case aCase;
    private Motherboard motherboard;

    public PC(Monitor monitor, Case aCase, Motherboard motherboard) {
        this.monitor = monitor;
        this.aCase = aCase;
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getaCase() {
        return aCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
