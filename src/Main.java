import models.*;
import models.dataSaver.DataSaver;
import models.dataSaver.FileDataSaver;
import models.dataSaver.InMemoryDataSaver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        final int x = 10; //"final" nastavuje proměnnou na danou hodnotu, která již nepůjde změnit
        final double pi = 3.14;

        ExampleClass2 exampleClass2 = new ExampleClass2();
        /* exampleClass2.   ->  dovoluje použít pouze public metody a proměnné */

        System.out.println(MyMathClass.pi);

        int resultSum = MyMathClass.sum(10, 20);

        //Vehicle skoda = new Vehicle("Skoda");
        Car skodaFabia = new Car("Skoda", "Fabia");

        Box<Car> boxOfCar = new Box<>(skodaFabia);

        Box<String> boxOfString = new Box<>("Hello");

        Box<Integer> boxOfInt = new Box<>(20);

        Car car2 = boxOfCar.getData();


        Pair<Integer, Car> pairOfCar = new Pair<>(1, skodaFabia);

        Pair<String, String> pairOfStrings = new Pair<>("key", "val");

        Box<Pair<Integer, Car>> boxOfPair = new Box<>(pairOfCar);


        DataSaver<String> dataSaver;

        if (true) {
            dataSaver = new FileDataSaver<>();
        } else {
            dataSaver = new InMemoryDataSaver<>();
        }

        dataSaver = new FileDataSaver<>();
        dataSaver.save("My text");
        System.out.println(dataSaver.load());

        try {
            dataSaver.save("My text");
        }
        catch (NullPointerException e){
            System.out.println("Couldn't save");
        }
        catch (Exception e){
            dataSaver = new InMemoryDataSaver<>();
            dataSaver.save("My text");

            System.out.println("Couldn't save");
        }

        /*
         ## TEST ##
          Co je vlákno?
            = zpracování kódu po řádku se říká vlákno

          Typy souborů (XML)

          Co je VCS? (Version Control System - Systém pro zprávu verzí)

          Co je http?

          Co je protokol?
            = sada pravidel určující jak komunikovat
            - standartem je http/https

          Co je stream?

          Co je socket?
         */
    }
}
