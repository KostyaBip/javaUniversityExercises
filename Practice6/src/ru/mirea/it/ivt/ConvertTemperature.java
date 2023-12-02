package ru.mirea.it.ivt;

public class ConvertTemperature implements Convertable{

    public double convert(double temperature, int toTemp) {
        double tempToRet;
        if(toTemp == 1){
            return temperature + 273.15;
        }else return (temperature * 9/5) + 32;
    }
}
