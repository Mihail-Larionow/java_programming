import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PurchaseUnit extends Unit {

    public PurchaseUnit(String name, String customer) {
        super(name, customer);
    }

    @Override
    public String toString() {
        String info = "\n+-------ЧЕК-------+\n";
        info += "Список продуктов:\n" + this.check;
        info += "Итого: " + this.summary + "р\n";
        info += "Продавец: " + this.clientName + "\n";
        info += "Покупатель: " + this.name + "\n";
        info += "+------------------+\n";
        return info;
    }

    @Override
    public void saveUnit() {
        try (PrintWriter out = new PrintWriter(new FileWriter("Покупка" + encode() + ".txt"))) {
            out.print(this);
        } catch (IOException e) {
            System.err.println("Ошибка");
        }
    }

}
