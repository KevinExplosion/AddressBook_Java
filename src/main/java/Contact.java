import java.time.LocalDateTime;
import java.util.ArrayList;

public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mFirstName;
  private String mLastName;
  private String mBirthday;
  private int mId;

  public Contact(String firstName, String lastName, String birthday){
    mFirstName = firstName;
    mLastName = lastName;
    mBirthday = birthday;
    instances.add(this);
    mId = instances.size();
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public String getBirthday() {
    return mBirthday;
  }

  public static ArrayList<Contact> all() {
    return instances;
  }
}
