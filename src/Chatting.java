import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Random;

public class Chatting {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList indexesofActiveMembers = new ArrayList();
    public static ArrayList getIndexesofActiveMembers() {
        return indexesofActiveMembers;
    }
    public static void initMembers(int number, Member[] members) {
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the name of member" + (i + 1) + ":  ");
            members[i] = new Member(scanner.next());

        }
    }

    public static int selectRandomMemberIndex() {
        Random rand = new Random();
        return rand.nextInt(indexesofActiveMembers.size());
    }



    public static void askForOrder(Member member) {
        System.out.println(member.getFullName() + String.valueOf(Character.toChars(0x1F495)));
        System.out.print("Your order(1 or 2):  ");
    }



}

