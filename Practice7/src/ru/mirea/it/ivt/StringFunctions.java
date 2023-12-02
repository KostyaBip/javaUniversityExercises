package ru.mirea.it.ivt;

public class StringFunctions implements StringFunc{
    @Override
    public int numOfCharInString(String str) {
        return str.length();
    }

    @Override
    public String stringConsistOfUneven(String str) {
        String strToRet ="";
        for(int i = 0; i < this.numOfCharInString(str); i+=2){
            strToRet += str.charAt(i);
        }
        return strToRet;
    }

    @Override
    public String reverseString(String str) {
        String strToRet = "";
        for(int i = str.length()-1; i >= 0; i--){
            strToRet+=str.charAt(i);
        }
        return strToRet;
    }
}
