import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] members = new Member[10];
        int number = 0;

        System.out.print("Please enter the number of members    ");
        number = scanner.nextInt();
Chatting.getMemberList(number, members);
          //  for (int i = 0; i < number; i++) {
           //     Chatting.printChat(members[i]);
          //  }



    }
}
