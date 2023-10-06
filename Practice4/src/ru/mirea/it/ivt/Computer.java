package ru.mirea.it.ivt;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private manufacturer manufacturer;

    public enum manufacturer{
        Huawei,
        Xiaomi,
        Apple,
        Asus,
        Hp,
        Samsung;

    }

    public Computer(manufacturer manufacturer, Processor processor, Memory memory, Monitor monitor) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public void printSpecifications(){
        System.out.println("Computer specifications: \n Manufacturer - " + this.manufacturer + "\n Processor: "
                        + processor.toString() + "\n Memory: " + memory.toString() +
                "\n Monitor: " + monitor.toString());
    }
}
