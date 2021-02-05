import java.util.Scanner; 
public class lab1ex2{
    public static void main(String[]args){
    String ffund, sfund;
    int fnumshar, snumshar;
    float fsharp, ssharp;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the type of the first investment: ");
        ffund = input.nextLine();
        System.out.print("Please enter the number of the shares purshaed: how far");
        fnumshar = input.nextInt();
        System.out.print("Please enter the share price: : ");
        fsharp = input.nextFloat();
        
        input.nextLine();
        System.out.print("\n\n\nPlease enter the type of the Second investment: ");
        sfund = input.nextLine();
        System.out.print("Please enter the number of the shares purshaed: ");
        snumshar = input.nextInt();
        System.out.print("Please enter the share price: : ");
        ssharp = input.nextFloat();    
        System.out.println("\t\t==================================");
        System.out.println("\t\t\tInvestment Detials");
         System.out.println("\t\t==================================");
         System.out.println("\nInvestment Type\t\t# Shares\tShare Price");
         System.out.println("----------------\t--------\t-----------");
         System.out.println(String.format("%-25s%-15d%-4.2f",ffund,fnumshar,fsharp));
         System.out.println(String.format("%-25s%-15d%-4.2f",sfund,snumshar,ssharp));
    }
}
