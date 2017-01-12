import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by HP on 2017-01-12.
 */
public class Controller {
    private Model theModel;
    private View theView;

    public Controller(Model theModel, View theView){
        this.theModel = theModel;
        this.theView = theView;
        this.theView.setSaveMoneyButtonListener(new SaveMoneyButtonListener());
    }

    class SaveMoneyButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            theModel.readCSV("C:\\Users\\HP\\IdeaProjects\\wdecSymulacja\\csv.csv");
            theModel.setStartingMoney(theView.getMoneyInput());
            System.out.println("Piniondz: " + theModel.getStartingMoney());
            theModel.printLoadedCSV();
        }
    }

}
