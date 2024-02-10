import java.util.Scanner;
class customer_info1 extends personal_info
{
    void room_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter room number");
        int rnum=sc.nextInt();
        System.out.println("Room Number="+rnum);
        System.out.println("Enter the floor number");
        int fnum = sc.nextInt();
        System.out.println("Floor Number =" +fnum);
    }
    public static void main(String args[])
    {
        customer_info1 pi = new customer_info1();
        pi.customer_det();
        pi.room_details();
    }
}