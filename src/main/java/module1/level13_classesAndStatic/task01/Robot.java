package module1.level13_classesAndStatic.task01;

/*
        В методе main создается 5 роботов и выводится информация о них.
        Убери максимально возможное количество модификаторов static так, чтобы функционал программы не изменился.
        В методе main менять ничего не нужно.

        Требования:
        •	Модификатор static должен быть расставлен правильно.
 */

public class Robot {
    public static int robotCounter;

    public int id;

    public String model;

    public int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                id, robotCounter, model, vendor, productionYear);
    }
}
