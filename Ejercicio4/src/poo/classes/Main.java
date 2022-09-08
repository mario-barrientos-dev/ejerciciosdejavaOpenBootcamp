package poo.classes;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone("marca1", "j1", "samsung", "5g", 4);
        SmartWatch smartWatch = new SmartWatch("marca2", "h1", "xiaomi", 2.22, 1.1);
        System.out.println("El SmartPhone es: "+ smartphone + " Y el Relojito es" + smartWatch);
    }
}
