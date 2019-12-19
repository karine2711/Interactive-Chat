import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] members = new Member[10];
        int number = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        System.out.println("Please enter the number of members");
        number = scanner.nextInt();
                for (int i = 0; i < number; i++) {
                System.out.print("Enter your name  ");
                members[i] = new Member(scanner.next());
                System.out.println("Hi "+members[i].getFullName()+". Do you want to input message? 1 for 'Yes' and 0 for 'No'");
                int order = scanner.nextInt();
                if(order==1) {
                    members[i].setHasMessage(true);
                    System.out.print(members[i].getFullName() + ":  ");
                    scanner.nextLine();
                    members[i].setMessage(scanner.next());
                    members[i].date = (dtf.format(LocalDateTime.now()) + "    ");
                }
            }
            for (int i = 0; i < number; i++) {
                if (members[i].HasMessage()) {
                    System.out.println();
                    System.out.print(members[i].getDate() + "  " + members[i].getFullName() + "  " + members[i].getMessage());
                }
            }



    }
}
