import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class View extends JFrame {

    private JTextField moneyInput;
    private JButton saveMoneyButton;

    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public View() {
        moneyInput = new JTextField("1500");
        saveMoneyButton = new JButton("Zapisz kwote");

        setLayout(new GridLayout(2, 1));

        add(moneyInput);
        add(saveMoneyButton);
        pack();
        setTitle("Wprowadzenie kwoty poczatkowej");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setVisible(true);
    }

    public void setSaveMoneyButtonListener(ActionListener listener) {
        saveMoneyButton.addActionListener(listener);
    }

    public int getMoneyInput(){
        return Integer.parseInt(moneyInput.getText());
    }
}
