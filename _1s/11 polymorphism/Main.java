public class Main {

    public static void main(String[] args) {

        // ѕозднее св€зывание & восход€щее преобразование
        Phone p1 = new Phone("Nokia 3310", 1995, 300.00);
        Phone p2 = new Phone("IPhone 4", 2010, 10000.00);
        SmartPhone p3 = new SmartPhone("IPhone 5", 2012, 15000.00);
        Phone p4 = new SmartPhone("IPhone 6", 2014, 30000.00);
        p3.call();
        p4.call();

        Human human1 = new Human("Adam", new Phone("Iphone 1", -3760, 0));
        Human human2 = new Human("Eve", new SmartPhone("Iphone 2", -3760, 1));
        human1.callSomebody(human2);
        System.out.println();
        human2.callSomebody(human1);

        // Basic example of polymorphism
        final int n = 10;
        Animal [] animals = new Animal[n];

        for (int i = 0; i < n; i+=2) {
            animals[i] = new Dog();
            animals[i+1] = new Cat();
        }

        for (Animal animal : animals) {
            animal.voice();
        }



    }

}