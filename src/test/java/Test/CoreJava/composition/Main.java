package Test.CoreJava.composition;

public class Main {

    Dimensions dimensions = new Dimensions(20,10,2);
    Case aCase = new Case("220A", "Dell", "240", dimensions);
    Monitor monitor = new Monitor("33" , "HP", 28, new Resolution(40, 30));
    Motherboard motherboard = new Motherboard("BJ", "Nvida", 4, 6, "windows");
    PC pc = new PC(monitor, aCase, motherboard);
    //pc.getMonitor();

}
