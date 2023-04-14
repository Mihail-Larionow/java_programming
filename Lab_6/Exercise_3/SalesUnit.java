import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SalesUnit extends Unit{

    public SalesUnit(String name, String vendor){
        super(name, vendor);
    }

    @Override
    public String toString(){
        String info = "\n+-------ЧЕК-------+\n";
        info += "Список продуктов:\n" + this.check;
        info += "Итого: " + this.summary + "р\n";
        info += "Продавец: " + this.name + "\n";
        info += "Покупатель: " + this.clientName + "\n";
        info += "+------------------+\n";
        return info;
    }

    @Override
    public void saveUnit(){
        try (PrintWriter out = new PrintWriter(new FileWriter("Продажа" + encode() + ".txt"))) {
            out.print(this);
        } catch (IOException e) {
            System.err.println("Ошибка");
        }
    }

}
