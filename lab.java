package Hospital_Management;

import java.util.Scanner;

public class lab implements lab_Interface
{
    String fecility;
    int lab_cost;
    public void new_faci()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("fecility:-");
        fecility = scn.nextLine();
        System.out.print("cost:-");
        lab_cost = scn.nextInt();
    }
    public void faci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}