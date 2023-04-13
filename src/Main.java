import java.util.Scanner;;

public class Main {
    
    public static void main(String[] args) 
    {
        //instantiate an object
        Program p = new Program();
        
        //input data
        Scanner in = new Scanner(System.in);
        System.out.print("Enter program code: ");
        String pc = in.nextLine();
        System.out.print("Enter program description: ");
        String pd = in.nextLine();
        System.out.print("Enter duration: ");
        String dr = in.nextLine();
        System.out.print("Enter faculty: ");
        String fc = in.nextLine();
        System.out.print("Enter program head: ");
        String ph = in.nextLine();
        in.close();

        //store onto object
        //normal constructor
        p = new Program(pc, pd, dr, fc, ph);

        //OR
        //Setter
        p.setProgCode(pc);
        p.setProgDesc(pd);
        p.setDuration(dr);
        p.setFaculty(fc);
        p.setProgHead(ph);

        //manipulate data
        System.out.println(p.toString());
    }
}