import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Random;

public class Chatting {
    private static Scanner scanner = new Scanner(System.in);

    public static void getMemberList(int number, Member[] members) {
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the name of member" + (i + 1) + ":  ");
            members[i] = new Member(scanner.next());

        }
    }


    public static int selectRandomMemberIndex() {
        Random rand = new Random();
        ArrayList indexes = Member.getIndexesofActiveMembers();
        return rand.nextInt(indexes.size());

    }

    public static void sendMessage(Member[] members, int index) {
        scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String letterEmoji = String.valueOf(Character.toChars(0x1F4E9));
        int i = index + 1;
        System.out.print(letterEmoji + dtf.format(LocalDateTime.now()) + " member" + i + " " + members[index].getFullName() + ":  ");
        scanner.next();


    }

    public static void askForOrder(Member member) {
        System.out.println(member.getFullName() + String.valueOf(Character.toChars(0x1F495)));
        System.out.print("Your order(1 or 2):  ");
    }

    public static void kickOut(Member member, int index) {
        System.out.println("We're sorry   " + member.getFullName() +
                String.valueOf(Character.toChars(0x1F61E)) +
                ". You have been kicked out for interrupting the chat. " +
                "To avoid this next time, please follow the instructions carefully!");
        Member.setMemberOffline(index);
    }

}

