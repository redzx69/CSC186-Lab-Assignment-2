import java.util.Scanner;;

public class Main {
    
    public static void main(String[] args) 
    {
        int choice = selectProgram();
        if(choice == 1 )
        {
            //instantiate an object
            Program p = new Program();
            
            //input data
            Scanner in = new Scanner(System.in);
            System.out.print("\nEnter program code: ");
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
        else if(choice == 2)
        {
            Land l = new Land();

            Scanner in = new Scanner(System.in);
            System.out.print("\nEnter land id: ");
            String id = in.nextLine();
            System.out.print("Enter owner name: ");
            String ownerName = in.nextLine();
                // capitalize each of the first letter of the owner name
                for (int i = 0; i < ownerName.length(); i++)
                {
                    if (i == 0) {
                        ownerName = ownerName.substring(0, 1).toUpperCase() + ownerName.substring(1);
                    } else if (ownerName.charAt(i) == ' ') {
                        ownerName = ownerName.substring(0, i + 1) + ownerName.substring(i + 1, i + 2).toUpperCase()
                                + ownerName.substring(i + 2);
                    }
                }

            System.out.print("Enter house type [T,S,B,C]: ");
            String houseType = in.nextLine();
                switch (houseType.charAt(0)) {
                    case 't':
                    case 'T':
                        houseType = "Terrace";           
                        break;
                    case 's':
                    case 'S':
                        houseType = "Semi-Detached";           
                        break;
                    case 'b':
                    case 'B':
                        houseType = "Bungalow";           
                        break;
                    case 'c':
                    case 'C':
                        houseType = "Condominium";           
                        break;
                    default:
                        System.out.println("Invalid house type.");
                        System.exit(1);
                        break;
                }
            System.out.print("Enter area: ");
            double area = in.nextDouble();
            in.close();

            l = new Land(id, ownerName, houseType, area);

            System.out.println(l.toString());
        }
    }

    public static int selectProgram()
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("%n1.University Program Level%n2.Land details%n%nSelect program[1-2]: ");
        int choice = in.nextInt();
            if(choice != 1 && choice != 2)
            {
                System.out.println("Invalid choice.");
                System.exit(1);
            }
        return choice;
    }
}