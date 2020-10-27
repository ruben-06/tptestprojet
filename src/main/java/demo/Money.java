package demo;

public class Money {
    int amout;
    String devise;

    public  Money(int n, String s){
        amout=n;
        devise=s;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amout=" + amout + devise + '\'' +
                '}';
    }
}
