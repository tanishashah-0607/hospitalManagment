package hospitalManagement;

import java.util.Scanner;

public class medical implements medical_Interface
{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    public void new_medi()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("name:-");
        med_name = scn.nextLine();
        System.out.print("comp:-");
        med_comp = scn.nextLine();
        System.out.print("exp_date:-");
        exp_date = scn.nextLine();
        System.out.print("cost:-");
        med_cost = scn.nextInt();
        System.out.print("no of unit:-");
        count = scn.nextInt();
    }
    public void show_medi()
    {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
}