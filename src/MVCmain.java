/**
 * Created by HP on 2017-01-12.
 */
public class MVCmain {

    public static void main(String[] args) {

        Controller theController = new Controller(new Model(), new View());

        System.out.println("Program WYSTARTOWANY");
    }
}
