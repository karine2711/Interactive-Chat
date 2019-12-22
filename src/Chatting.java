import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Chatting {
  private static Scanner scanner = new Scanner(System.in);
    public static void getMemberList(int number, Member members[]){
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the name of member"+(i+1)+":  ");
            members[i]= new Member(scanner.next());
           // Chatting.getmessages(members[i]);
        }
    }

    public static void getmessages(Member member) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        System.out.println("Hi " + member.getFullName() + ". Do you want to input message? 1 for 'Yes' and 0 for 'No'");
        int order = scanner.nextInt();
        if (order == 1) {
            member.setHasMessage(true);
            System.out.print(member.getFullName() + ":  ");
            scanner.nextLine();
            member.setMessage(scanner.next());
            member.date = (dtf.format(LocalDateTime.now()) + "    ");
        }
    }

    public static void printChat(Member member) {
        if (member.HasMessage()) {
            System.out.println();
            System.out.print(member.getDate() + "  " + member.getFullName() + "  " + member.getMessage());
        }
    }
}
