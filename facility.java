package Hospital_Management;

import java.util.Scanner;

public class facility implements facility_Interface
{
    String fec_name;
    public void add_facility()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = scn.nextLine();
    }
    public void show_facility()
    {
        System.out.println(fec_name);
    }
}