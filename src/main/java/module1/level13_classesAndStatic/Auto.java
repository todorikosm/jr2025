package module1.level13_classesAndStatic;

public class Auto {

    static int count;

    double power;
    double volume;
    String color;
    String model;

    public Auto(String color, String model, double power, double volume) {
        this.color = color;
        this.model = model;
        this.power = power;
        this.volume = volume;
        count++;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "power=" + power +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


class Application {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Yellow", "Honda", 100.0, 1500.0);
        Auto auto2 = new Auto("Green", "Mazda", 100.0, 1500.0);
        Auto auto3 = new Auto("Black", "Mitsubishi", 200.0, 1200.0);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println("Всего машин: " + Auto.count);
    }
}