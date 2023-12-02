package ru.mirea.it.ivt;

import java.util.StringTokenizer;

public class Adress {
    public String country;
    public String region;
    public String city;
    public String street;
    public int house;
    public int building;
    public int flat;

    public Adress() {
    }

    public void getParametersFromString(String string){
        String[] separatedParameters = string.split(",");
        for (int i = 0; i < separatedParameters.length; i++) separatedParameters[i] = separatedParameters[i].trim();
        country = separatedParameters[0];
        region = separatedParameters[1];
        city = separatedParameters[2];
        street = separatedParameters[3];
        house = Integer.parseInt(separatedParameters[4]);
        building = Integer.parseInt(separatedParameters[5]);
        flat = Integer.parseInt(separatedParameters[6]);
    }

    public void getParametersFromString(String string, String separator){
        StringTokenizer st = new StringTokenizer(string, separator);
        String[] separatedParameters = new String[7];
        int i = 0;
        while(st.hasMoreTokens()){
            separatedParameters[i] = st.nextToken().trim();
            i++;
        }
        country = separatedParameters[0];
        region = separatedParameters[1];
        city = separatedParameters[2];
        street = separatedParameters[3];
        house = Integer.parseInt(separatedParameters[4]);
        building = Integer.parseInt(separatedParameters[5]);
        flat = Integer.parseInt(separatedParameters[6]);
    }

    public String toString(){
        return "Country - " + country + ", region - " + region + ", city - " + city + ", street - " + street +
                ", house - " + house + ", building - " + building + ", flat - " + flat;
    }
}
