import java.sql.Time;
import java.util.*;
public class Member {
    public String date;
    private String fullName;
    private String message="";
private boolean isActive;
private static int numberOfActiveMembers=0;
    public boolean isActive() {
        return isActive;
    }

    public void setActive(int order) {
        if (order==1) {
            this.isActive = true;
            Member.numberOfActiveMembers++;
        } else{
            this.isActive=false;
           if(Member.numberOfActiveMembers>0)
               Member.numberOfActiveMembers--;
        }
    }



    public String getFullName() {
        return fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Member(String fullName) {
        this.fullName = fullName;
    }
}
