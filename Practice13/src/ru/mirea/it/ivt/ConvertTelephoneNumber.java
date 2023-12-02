package ru.mirea.it.ivt;

public class ConvertTelephoneNumber {
    public String covertTelephoneNumber(String telephoneNumber){
        if(telephoneNumber.charAt(0) == '+'){
            char[] convTelNumbChar = new char[telephoneNumber.length()+2];

            telephoneNumber.getChars(0,telephoneNumber.length()-7,convTelNumbChar,0);
            convTelNumbChar[telephoneNumber.length()-7] = '-';

            telephoneNumber.getChars(telephoneNumber.length()-7,
                    telephoneNumber.length()-4,convTelNumbChar,telephoneNumber.length()-6);
            convTelNumbChar[telephoneNumber.length()-3] = '-';

            telephoneNumber.getChars(telephoneNumber.length()-4,
                    telephoneNumber.length(),convTelNumbChar,telephoneNumber.length()-2);

            return new String(convTelNumbChar);
        }
        else{
            char[] convTelNumbChar = new char[telephoneNumber.length()+3];

            convTelNumbChar[0] = '+';
            char[] tmpChar = new char[telephoneNumber.length()-10];
            telephoneNumber.getChars(0,telephoneNumber.length()-10,tmpChar,0);
            int tmpInt = Integer.parseInt(String.valueOf(tmpChar)) - 1;
            tmpChar = ("+"+tmpInt).toCharArray();
            for(int i = 0; i < tmpChar.length; i++){
                convTelNumbChar[i] = tmpChar[i];
            }

            telephoneNumber.getChars(telephoneNumber.length()-10,telephoneNumber.length()-7,convTelNumbChar,tmpChar.length);
            convTelNumbChar[telephoneNumber.length()-6] = '-';

            telephoneNumber.getChars(telephoneNumber.length()-7,
                    telephoneNumber.length()-4,convTelNumbChar,telephoneNumber.length()-5);
            convTelNumbChar[telephoneNumber.length()-2] = '-';

            telephoneNumber.getChars(telephoneNumber.length()-4,
                    telephoneNumber.length(),convTelNumbChar,telephoneNumber.length()-1);

            return new String(convTelNumbChar);
        }
    }
}
