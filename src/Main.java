public class Main {
    public static void main(String[] args) {

        human human1 = new human();
        human1.name = "Максим";
        human1.town = "Минск";
        human1.yearOfBirth = 1988;
        human1.greeting();

        human human2 = new human();
        human2.name = "Аня";
        human2.town = "Москва";
        human2.yearOfBirth = 1993;
        human2.greeting();

        human human3 = new human();
        human3.name = "Катя";
        human3.town = "Калининград";
        human3.yearOfBirth = 1992;
        human3.greeting();

        human human4 = new human();
        human4.name = "Артем";
        human4.town = "Москва";
        human4.yearOfBirth = 1995;
        human4.greeting();
    }
}