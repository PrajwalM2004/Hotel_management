import java.util.Scanner;
class personal_info1 {
    
     void customer_det()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer: ");
        String name = sc.nextLine();
        System.out.println("Customer name = "+name);
        System.out.println("Enter the date of booking");
        int date = sc.nextInt();
        System.out.println("Date of Booking= "+date);
    }
}
