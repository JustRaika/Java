package ch.hslu.oop.SW03.demo;

public class Demo {
    /* Gibt den grösseren Wert von a oder b zurück. */
    public int max(int a, int b) {
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public int min(int a, int b) {
        /* Gibt den kleineren Wert von a oder b zurück. */
        if (a<b){
            return a;
        }
        else{
            return b;
        } 
    }
    public int biggestnumber(int a, int b, int c) {
    /* Problem beim Code: bei n-Zahlen wird der Code extrem lang. */
    int biggestnumber=0;
        if (a>b && a>c) {
            biggestnumber=a;
            return a;
        }
        else if (b>c) {
            biggestnumber=b;
        }
        else if (b<=c) {
            biggestnumber=c; 
        }
        return biggestnumber;
        }
        }  

