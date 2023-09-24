package hospitalManagement;

import java.util.Scanner;
class staffTemp{
    public String sid, sname, desg, Gender;
    public int salary;
    public void new_staff()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("id:-");
        sid = scn.nextLine();
        System.out.print("name:-");
        sname = scn.nextLine();
        System.out.print("desigination:-");
        desg = scn.nextLine();
        System.out.print("Gender:-");
        Gender = scn.nextLine();
        System.out.print("salary:-");
        salary = scn.nextInt();
    }
}

public class staff extends staffTemp implements staff_Interface
{
    public void staff_info()
    {
        System.out.println(sid + "\t" + sname + "\t" + Gender + "\t" + salary);
    }
}