package Lab8;

import javax.swing.*;
import java.util.Locale;

public class TNumValidator {
    public static void main(String[] args) {
        String[] allTNums = new String[3];
        StringBuilder output = new StringBuilder();
        boolean valid;

        for (int i = 0; i < allTNums.length ; i++) {
            String tNum = JOptionPane.showInputDialog("Please enter a T-Number (Return to Exit)");
            valid = false;
            while (!valid) {
                if ((tNum == null)|| tNum.equals("")){
                    JOptionPane.showMessageDialog(null,"You entered no valid T-Numbers!");
                    System.exit(0);
                }
                else {
                    if (!(tNum.length()==9 && tNum.toLowerCase(Locale.ROOT).charAt(0)=='t')) {
                        tNum = JOptionPane.showInputDialog("Invalid! Please enter a T-Number (Return to Exit)");
                    }
                    else {
                        for (int c = 1; c < 9 ; c++) {
                            if (!Character.isDigit(tNum.charAt(c))) {
                                tNum = JOptionPane.showInputDialog("Invalid! Please enter a T-Number (Return to Exit)");
                            }
                        }
                        valid = true;
                        allTNums[i] = tNum;
                    }
                }
            }
        }

        output.append("Number of valid T-Numbers entered: ").append(allTNums.length).append("\nList of valid T-Numbers:\n\n");
        for (String str:allTNums) output.append(str).append("\n");

        JOptionPane.showMessageDialog(null, output,"Valid T-Numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
