import java.math.BigDecimal;

/**
 * Created by Grzegorz on 2017-01-12.
 */
public class DatabaseRecord {


    private BigDecimal money;
    private BigDecimal volume;
    private BigDecimal quality;
    private BigDecimal price;
    private BigDecimal commCosts;
    private BigDecimal profit;

    public DatabaseRecord(String LineOfCSV)
    {
        String csvSplitBy = ",";
        String[] values = LineOfCSV.split(csvSplitBy);
        money = new BigDecimal(values[0]);
        volume = new BigDecimal(values[1]);
        quality = new BigDecimal(values[2]);
        price = new BigDecimal(values[3]);
        commCosts = new BigDecimal((values[4]));
        profit = new BigDecimal(values[5]);
    }

    public DatabaseRecord(BigDecimal money, BigDecimal volume, BigDecimal quality, BigDecimal price, BigDecimal commCosts, BigDecimal profit)
    {
        this.money = money;
        this.volume = volume;
        this.quality = quality;
        this.price = price;
        this.commCosts = commCosts;
        this.profit = profit;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public BigDecimal getQuality() {
        return quality;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getCommCosts() {
        return commCosts;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "DatabaseRecord{" +
                "money=" + money +
                ", volume=" + volume +
                ", quality=" + quality +
                ", price=" + price +
                ", commCosts=" + commCosts +
                ", profit=" + profit +
                '}'
                + "\n";
    }


}
