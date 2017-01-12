import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by HP on 2017-01-12.
 */
public class Model {
    private int startingMoney;
    private ArrayList<String[]> dataCSV;

    public Model(){
        startingMoney = 0;
        dataCSV = new ArrayList<String[]>();
    }

    public int getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(int startingMoney) {
        this.startingMoney = startingMoney;
    }

    public void readCSV(String csvFile){
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                dataCSV.add(line.split(csvSplitBy));

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

    public void printLoadedCSV(){
        for (String[] line : dataCSV) {
            for(String single : line){
                System.out.print("  " + single);
            }
            System.out.println();
        }
    }

}
