package OOP;

public class Main {
    public static void main(String[] args){
        Lamp Lamp1 = new Lamp("green", true, 10);
        Lamp Lamp2 = new Lamp("red", true, 25);

        Lamp1.setColor("blue");
        Lamp2.size(6, 6);
        Lamp2.changeLight(true);
        Lamp2.changeLight(false);

        

    }
}
