import java.util.*;
import java.util.Random;

public class Chat {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of members.");
        System.out.print("Number of members:  ");
        int number = scanner.nextInt();
        Member[] members = new Member[number];
        initMembers(number, members);
        for (int i = 0; i < number; i++)
          indexesofActiveMembers.add(i);
        System.out.println("Dear members please enter 1 if you wanna continue chatting and 2 if you wanna exit");

        while (!indexesofActiveMembers.isEmpty()) {
            int index = selectRandomMemberIndex();
            int currentIndex = (int) indexesofActiveMembers.get(index);
            askForOrder(members[currentIndex]);
            String order = scanner.next();
            int attempts = 0;
            while (!order.equals("1") && !order.equals("2")) {
                if (attempts > 2) {
                    Member.kickOut(members[currentIndex], index);
                    break;
                }
                attempts++;
                System.out.println("This is your attempt   " + attempts + " / 3!   After that, you'll be kicked out.   ");
                System.out.print("Your order(1 or 2):  ");
                order = scanner.next();
            }
            if (order.equals("2")) {
                Member.setMemberOffline(index);
            } else if (order.equals("1")) {
                members[currentIndex].sendMessage();
            }
        }
    }


}

