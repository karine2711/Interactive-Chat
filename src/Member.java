import java.sql.Time;
import java.util.*;
public class Member {
    public String date;
    private String fullName;
    private String message="";
private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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
