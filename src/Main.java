import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of members. The maximum number is 30.");
        System.out.print("Number of members:  ");
        int number = scanner.nextInt();
        Member[] members = new Member[number];
        Chatting.initMembers(number, members);
        for (int i = 0; i < number; i++)
            Chatting.getIndexesofActiveMembers().add(i);
        System.out.println("Dear members please enter 1 if you wanna continue chatting and 2 if you wanna exit");

        while (!Chatting.getIndexesofActiveMembers().isEmpty()) {
            int index = Chatting.selectRandomMemberIndex();
            int currentIndex = (int) Chatting.getIndexesofActiveMembers().get(index);
            Chatting.askForOrder(members[currentIndex]);
            String order = scanner.next();
            int attempts = 0;
            while (!order.equals("1") && !order.equals("2")) {
                if (attempts > 2) {
                    Chatting.kickOut(members[currentIndex], index);
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
