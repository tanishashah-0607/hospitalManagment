package hospitalManagement;

import java.util.Scanner;

public class patient implements patient_Interface
{
    String pid, pname, disease, Gender, admit_status;
    int age;
    public void new_patient()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("id:-");
        pid = scn.nextLine();
        System.out.print("name:-");
        pname = scn.nextLine();
        System.out.print("disease:-");
        disease = scn.nextLine();
        System.out.print("Gender:-");
        Gender = scn.nextLine();
        System.out.print("admit_status:-");
        admit_status = scn.nextLine();
        System.out.print("age:-");
        age = scn.nextInt();
    }
    public void info_patient()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + Gender + "      \t" + admit_status + "\t" + age);
    }
}