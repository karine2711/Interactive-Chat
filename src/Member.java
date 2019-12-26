import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Member {
    private String fullName;
private static final  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    public void sendMessage() {
        Scanner scanner=new Scanner(System.in);
        String letterEmoji = String.valueOf(Character.toChars(0x1F4E9));
        int i = Chatting.getIndexesofActiveMembers().indexOf(this);
        System.out.print(letterEmoji + dtf.format(LocalDateTime.now()) + " member" + i + " " + this.getFullName() + ":  ");
        scanner.next();
    }

    public static void setMemberOffline(int i) {
       Chatting.getIndexesofActiveMembers().remove(i);
    }
    public static void kickOut(Member member, int index) {
        System.out.println("We're sorry   " + member.getFullName() +
                String.valueOf(Character.toChars(0x1F61E)) +
                ". You have been kicked out for interrupting the chat. " +
                "To avoid this next time, please follow the instructions carefully!");
        Member.setMemberOffline(index);
    }
    public String getFullName() {
        return fullName;
    }

    public Member(String fullName) {
        this.fullName = fullName;
    }

}
