package module1.level13_classesAndStatic;

public class Auto {

    static int count;

    public void hank() {
        System.out.println("Beeep beeep");
    }

    public static void someMethod() {
        System.out.println("Я статический метод класса автомобиль");
    }

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

    static class ManufacturerAddress {
        static String address = "Автомобильная, 1";

        public void checkReceipt() {
            System.out.println("Завод производства находится по адресу: " + address);
        }
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

        auto1.hank(); // вызов обычного метода из класса
        Auto.someMethod(); // вызов статического метода из класса
        auto1.someMethod(); // ! здесь на самом деле вызов из класса - синтаксический сахар/рефликсивный вызов

        System.out.println(Auto.ManufacturerAddress.address);

        Auto.ManufacturerAddress manufacturerAddress = new Auto.ManufacturerAddress();
        // вызов статической переменной из вложенного статического класса

        manufacturerAddress.checkReceipt(); // вызов обычного метода из
    }
}



// для чего может понадобиться внешний и внутренний класс?
class Display {
    int h;
    int w;

    Pixel[][] pixels;

    public Display(int h, int w) {
        this.h = h;
        this.w = w;
    }

    class Pixel{
        double color;
    }
}