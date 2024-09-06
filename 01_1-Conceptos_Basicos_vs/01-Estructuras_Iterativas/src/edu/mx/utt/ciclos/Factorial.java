package edu.mx.utt.ciclos;

public class Factorial {
    private int n;

    public Factorial() {
        this.n = 1;
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public long calcularFor(){
        long fact = 1;
        for(int i = 0; i<=this.n; i++){
            fact*=i;
        }
        return fact;
    }
    
    public long calcularForReverse(){
        long fact = 1;
        for(int i = this.n; i>=1; i--){
            fact*=i;
        }
        return fact;
    }
}
