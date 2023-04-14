import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    private static Scanner in;
    
    public static void main(String[] args) {
        in = new Scanner(System.in);

        System.out.print("Приветствуем Вас!\n");

        System.out.print("""
                Что вы хотите?
                Введите 1, если совершить покупку
                Введите 2, если совершить продажу
                Введите 3, если посмотреть сделку
                """);
        int choice = in.nextInt();

        switch (choice) {
            case 1 -> makePurchase();
            case 2 -> makeSale();
            case 3 -> showUnit();
            default -> System.err.print("Неверные данные\n");
        }

    }

    private static void makePurchase(){
        System.out.print("Введите Ваше имя: ");
        String name = in.next();

        System.out.print("Введите имя продавца: ");
        String clientName = in.next();

        Unit  unit = new PurchaseUnit(name, clientName);
        readListOfProducts(unit);
        unit.makeCheckList();
        System.out.print(unit);
        unit.saveUnit();
    }

    private static void makeSale(){
        System.out.print("Введите Ваше имя: ");
        String name = in.next();

        System.out.print("Введите имя покупателя: ");
        String clientName = in.next();

        Unit unit = new SalesUnit(name, clientName);
        readListOfProducts(unit);
        unit.makeCheckList();
        System.out.print(unit);
        unit.saveUnit();
    }

    private static void showUnit(){
        System.out.print("Введите название сделки: ");
        String fileName = in.next() + ".txt";

        try {
            Scanner fileReader = new Scanner(new File(fileName));
            String row;
            while(fileReader.hasNextLine())
            {
                row = fileReader.nextLine();
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден\n");
        }

    }

    private static void readListOfProducts(Unit unit){
        System.out.print("""
                Вводите данные о товарах, в следующем формате:
                <товар> <цена> <количество>
                Чтобы закончить перечисление товаров, введите q
                """);

        while(true){
            try{
                String nameOfProduct = in.next();
                if(nameOfProduct.equals("q")) break;
                int priceOfProduct = in.nextInt();
                int quantityOfProduct = in.nextInt();
                unit.addItem(new Item(nameOfProduct, priceOfProduct, quantityOfProduct));
            }catch (Exception e){
                System.err.print("Неверный формат\n");
            }
        }
    }

}