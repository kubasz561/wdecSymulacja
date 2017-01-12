import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by HP on 2017-01-12.
 */
public class Model {

    private BigDecimal startingMoney;
    private Database database;

    public Model() {
        startingMoney = new BigDecimal(0);
    }

    public void importDatabase(String path) {
        database = new Database(path);
    }

    public BigDecimal getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(BigDecimal startingMoney) {
        this.startingMoney = startingMoney;
    }

    public void setStartingMoney(int startingMoney) {
        this.startingMoney = new BigDecimal(startingMoney);
    }

    public void printDatabase() {
        System.out.println(database.toString());
    }

    public String decide() {
        DatabaseRecord decision = DecisionMaker.decide(database, startingMoney);
        if(decision == null) return "No idea :(";
        String result = "You should prepare " + decision.getVolume()  +
                " samples of quality " + decision.getQuality() + "%.\n" +
                "Sell them for " + decision.getPrice() + " each." +
                "Do not forget about spending " + decision.getCommCosts() + "for commercials.";
        return result;
    }
}
