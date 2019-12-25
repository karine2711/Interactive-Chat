import java.util.*;

public class Member {
    private String fullName;

    private static ArrayList indexesofActiveMembers = new ArrayList();

    public static ArrayList getIndexesofActiveMembers() {
        return indexesofActiveMembers;
    }

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
