package hospitalManagement;
import java.util.Scanner;
    class Doctortemp{
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("id:-");
        did = scn.nextLine();
        System.out.print("name:-");
        dname = scn.nextLine();
        System.out.print("specilization:-");
        specilist = scn.nextLine();
        System.out.print("work time:-");
        appoint = scn.nextLine();
        System.out.print("qualification:-");
        doc_qual = scn.nextLine();
        System.out.print("room no.:-");
        droom = scn.nextInt();
    }
    void doctor_info()
    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }
}
public class Doctor extends Doctortemp {
       void dynamic(){
           System.out.println("This statement can't be accessible");
       }
}
    
