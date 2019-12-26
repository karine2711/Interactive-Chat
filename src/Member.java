import java.util.*;

public class Member {
    private String fullName;



    public static void setMemberOffline(int i) {
        Object object = indexesofActiveMembers.get(i);
        indexesofActiveMembers.remove(object);
    }


    public String getFullName() {
        return fullName;
    }

    public Member(String fullName) {
        this.fullName = fullName;
    }
}
