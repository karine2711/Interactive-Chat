import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] members = new Member[30];
        System.out.println("Please enter the number of members. The maximum number is 30.");
        System.out.print("Number of members:  ");
        int number = scanner.nextInt();
        while (number>=30 || number<=0){
            System.out.println("Enter a number bigger than 0 and smaller than 30.");
            System.out.print("Number of members:  ");
        number = scanner.nextInt();
        }

        Chatting.getMemberList(number, members);

        for (int i = 0; i < number; i++)
            Member.getIndexesofActiveMembers().add(i);
        System.out.println("Dear members please enter 1 if you wanna continue chatting and 2 if you wanna exit");

        while (!Member.getIndexesofActiveMembers().isEmpty()) {
            int index = Chatting.selectRandomMemberIndex();
            int currentIndex = (int) Member.getIndexesofActiveMembers().get(index);
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
                Chatting.sendMessage(members, currentIndex);
            }
        }
    }
}
