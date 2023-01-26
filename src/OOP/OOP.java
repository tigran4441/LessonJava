package OOP;

import model.Human;
import model.Car;

public class OOP {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Aram";
        human1.lastName = "Gevorgyan";
        human1.year = 1995;
        human1.isArmenian = true;
        human1.gender = 'm';

        Human human2 = new Human();
        human2.firstName = "Ani";
        human2.lastName = "Poghosyan";
        human2.year = 1965;
        human2.isArmenian = true;
        human2.gender = 'f';

        System.out.println(human1.firstName + " " + human1.lastName);

        if (human1.year < human2.year)
            System.out.println(human1.firstName);
        else System.out.println(human2.firstName);

        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName);

        Car car1 = new Car();
        car1.setModel("BMW");
        car1.getEngine();
        car1.setYear(2004);

        human1.sayHello();
        human2.sayHello();

        //     System.out.println(human1.firstName + " " + human1.lastName);
        //     System.out.println(human2.firstName + " " + human2.lastName);

        human1.printFullName();
        human2.printFullName();

        String s = human1.fullName();
        System.out.println("Full name of human1 is" + " " + s);

        human1.sum(4, 6);

        human2.print1toN(7);

        Car car2 = new Car();
        car2.setEngine(8.8);
        System.out.println(car2.getEngine());

        car2.setModel("Mercedes");
        car2.setEngine(2.4);
        System.out.println(car2.getModel() + " " + car2.getEngine());

        String text = "Hello from Yerevan";
        System.out.println(text.length());
        System.out.println(text.charAt(0));


        int countOfE = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e')
                countOfE++;
        }
        System.out.println(countOfE);

    }

}

