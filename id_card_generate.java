import java.util.*;

public class id_card_generate{
    public static void main(String[] args){
        String name;
        int age;
        String bloodGroup;
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Name : ");
            name =scanner.nextLine();
            System.out.println("Enter age : ");
            age = scanner.nextInt();
            System.out.println("Enter BloodGroup : ");
            bloodGroup = scanner.nextLine();

        System.out.println("______________________________________");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("BloodGroup : "+bloodGroup);
        System.out.println("______________________________________");

        if(age >= 20){
            System.out.println("Your group is RED");
        }
        else if(age >= 15) {
            System.out.println("Your group is BLUE");
        }
        else{
            System.out.println("Your group is YELLOW");
        }
        System.out.println("______________________________________");    
    }
}