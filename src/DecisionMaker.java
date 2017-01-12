import java.math.BigDecimal;

/**
 * Created by Grzegorz on 2017-01-12.
 */
public class DecisionMaker {
    public static DatabaseRecord decide(Database database, BigDecimal availableMoney)
    {
        DatabaseRecord decision = database.findBestRecordWithMoneyBelow(availableMoney);
        recalculate(decision, availableMoney);
        return decision;
    }

    private static void recalculate(DatabaseRecord decision, BigDecimal availableMoney)
    {
        /*
        * TODO
        */
    }
}
