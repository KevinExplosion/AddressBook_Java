import java.time.LocalDateTime;
import java.util.ArrayList;

public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mFirstName;
  private String mLastName;
  private String mBirthday;

  public Contact(String firstName, String lastName, String birthday){
    mFirstName = firstName;
    mLastName = lastName;
    mBirthday = birthday;

  }
}
