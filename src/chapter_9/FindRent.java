package chapter_9;

import javax.swing.*;
/*
To determine a tenant's rent we need to know two pieces of info: the floor on which
the tenant rents an apt
and the number of bedrooms in the apt.
 */

public class FindRent {
    public static void main(String[] args) {
        int[][] rents = {                       // array of rents
                {400, 450, 510},
                {500, 560, 630},
                {625, 676, 740},
                {1000, 1250, 1600}
        };

        String entry;
        int floor;
        int bedrooms;
        entry = JOptionPane.showInputDialog(null, "Enter a floor number");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter number of bedroom");
        bedrooms = Integer.parseInt(entry);

        JOptionPane.showMessageDialog(null,
                "The rent for a " +
                bedrooms + " bedroom apartment on floor " + floor +
                " is $" + rents[floor][bedrooms]);

    }
}
