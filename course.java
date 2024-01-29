import java.util.Scanner;
public class course{
    public static void main(String args[]){
        System.out.println("Enter the semister");
        Scanner s=new Scanner(System.in);
        int sem=s.nextInt();
        switch(sem)
        {
            case 1:
            System.out.println("Course\tMarks");
            System.out.println("c\t82");
            System.out.println("Maths\t65");
            break;

            case 2:
            System.out.println("Course\tMarks");
            System.out.println("c++\t90");
            System.out.println("Os\t78");
            break;

            case 3:
            System.out.println("Course\t\tMarks");
            System.out.println("Java\t\t85");
            System.out.println("database\t92");
            break;

            case 4:
            System.out.println("Course\tMarks");
            System.out.println("C#\t90");
            System.out.println("ML\t95");
            break;

            default:
            System.out.println("Enter the correct semester");

        }
    }
}