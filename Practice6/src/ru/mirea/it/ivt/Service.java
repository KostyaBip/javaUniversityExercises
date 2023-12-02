package ru.mirea.it.ivt;

public class Service implements Priceable{
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    public double getPrice() {
        return hourlyRate;
    }
}
