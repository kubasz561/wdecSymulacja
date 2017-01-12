import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Grzegorz on 2017-01-12.
 */
public class Database {

    private ArrayList<DatabaseRecord> records;

    public Database() {
        this.records = new ArrayList<DatabaseRecord>();
    }

    public Database(String csvFilePath)
    {
        this.records = new ArrayList<DatabaseRecord>();
        ReadFromCSV(csvFilePath);
    }

    public void ReadFromCSV(String csvFilePath){
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            while ((line = br.readLine()) != null) {
                records.add(new DatabaseRecord(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void addRecord(DatabaseRecord record)
    {
        records.add(record);
    }
    
    public DatabaseRecord findBestRecordWithMoneyBelow(BigDecimal money)
    {
        DatabaseRecord bestRecord = null;
        for (DatabaseRecord record:records)
        {
                if(record.getMoney().compareTo(money) == -1)
                {
                    if(bestRecord == null)
                    {
                        bestRecord = record;
                    }
                    else if(record.getProfit().compareTo(bestRecord.getProfit()) == 1)
                    {
                        bestRecord = record;
                    }
                }
        }
        return bestRecord;
    }
    
    @Override
    public String toString() {
        return "Database{" +
                "records=" + records +
                '}';
    }
    
    
}
