package Lab8;

import javax.swing.*;
import java.util.Locale;

public class TNumValidator {
    public static void main(String[] args) {
        String[] allTNums = new String[3];
        StringBuilder output = new StringBuilder();
        int i = 0;
        String tNum;
        String msg = "Please enter a T-Number (Return to Exit)";
        boolean valid = false;
        while(i < 3) {
            tNum = JOptionPane.showInputDialog(msg);
            if (!(tNum == null)){
                if ((tNum.length()==9 && tNum.toLowerCase(Locale.ROOT).charAt(0)=='t')) {
                    allTNums[i] = tNum;
                    i++;
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"You entered no valid T-Numbers!");
                System.exit(0);
            }
        }
        output.append("Number of valid T-Numbers entered: 3\nList of valid T-Numbers:\n\n");
        for (String str:allTNums) {
            output.append(str).append("\n");
        }

        JOptionPane.showMessageDialog(null, output,"Valid T-Numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
