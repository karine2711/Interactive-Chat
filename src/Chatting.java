import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.*;
public class Chatting {
    public static void getmessages( Member member){
        Scanner scanner=new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");


            System.out.println("Hi "+member.getFullName()+". Do you want to input message? 1 for 'Yes' and 0 for 'No'");
            int order = scanner.nextInt();
            if(order==1) {
                member.setHasMessage(true);
                System.out.print(member.getFullName() + ":  ");
                scanner.nextLine();
                member.setMessage(scanner.next());
                member.date = (dtf.format(LocalDateTime.now()) + "    ");
            }
        }
public static void printChat(Member member){
    if (member.HasMessage()) {
        System.out.println();
        System.out.print(member.getDate() + "  " + member.getFullName() + "  " + member.getMessage());
    }
}
}
