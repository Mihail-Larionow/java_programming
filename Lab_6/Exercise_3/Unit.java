import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class Unit {

    protected ArrayList<Item> checkList;
    protected String clientName;
    protected String check;
    protected String name;
    protected int summary;


    protected Unit(String name, String clientName){
        checkList = new ArrayList<>();
        this.clientName = clientName;
        this.name = name;
        summary = 0;
    }

    protected String encode(){
        return name + clientName + summary;
    }

    public void makeCheckList(){
        check = "";
        if(checkList.isEmpty()) check = "Пусто\n";
        for (Item item : checkList) {
            check += item.getName() + " ";
            check += item.getPrice() + "р ";
            check += item.getQuantity() + "шт ";
            check += item.getCost() + "р\n";
            summary += item.getCost();
        }
    }

    public void addItem(Item item){
        checkList.add(item);
    }

    public abstract String toString();

    public abstract void saveUnit();

}
