package Lab9;

import javax.swing.*;

public class NegativeNumberValidation {
    public static void main(String[] args) {
        int[] nums = new int[7];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, evens = 0;
        double avg = 0, neg = 0, over1K = 0;

        for (int i = 0; i < nums.length; i++) {
            String input = JOptionPane.showInputDialog("Enter any whole number: ");
            boolean valid = false;
            while (!valid) {
                if (input == null || input.equalsIgnoreCase("x") || input.equals("")){
                    JOptionPane.showMessageDialog(null,"Kthxbye");
                    System.exit(0);
                }
                else {
                    if (input.equals("-0"))
                        input = JOptionPane.showInputDialog("Enter any WHOLE NUMBER u monke: ");
                    else{
                        try {
                            nums[i] = (Integer.parseInt(input));
                            valid = true;
                        } catch (Exception e) {
                            input = JOptionPane.showInputDialog("Enter any WHOLE NUMBER u monke: ");
                        }
                    }
                }
            }
        }

        for (int n : nums) {
            avg+=n;
            if(n < min) min = n;
            if(n > max) max = n;
            if(n < 0) neg++;
            if(n > 1000) over1K++;
            if(n%2 == 0) evens++;
        }
        avg/= nums.length;
        neg = neg/nums.length*100;
        over1K = over1K/nums.length*100;

        String output = String.format("""
                The average of the numbers entered: %.2f
                The largest of the numbers entered: %d
                The smallest of the numbers entered: %d
                The percentage of the numbers entered that were negative: %.2f%%
                The percentage of the numbers entered that exceeded 1000: %.2f%%
                The number of even values entered: %d
                """,avg,max,min,neg,over1K,evens);

        JOptionPane.showMessageDialog(null,output,"Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
