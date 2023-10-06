package ru.mirea.it.ivt;

public class ConvertMoney {

    public static double RubToUsd(double Rub){
        double USD = Rub / 96.1;
        return USD;
    }

    public static double RubToEur(double Rub){
        double Eur = Rub / 102.48;
        return Eur;
    }

    public static double RubToYuan(double Rub){
        double Yuan = Rub / 13.15;
        return Yuan;
    }

    public static double UsdToEur(double USD){
        double EUR =  USD / 0.94;
        return EUR;
    }

    public static double UsdToYuan(double USD){
        double Yuan =  USD * 7.31;
        return Yuan;
    }

    public static double EurToYuan(double Eur){
        double Yuan = Eur * 7.67;
        return Yuan;
    }
}
