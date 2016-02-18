import java.util.ArrayList;

public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mFirstName;
  private String mLastName;
  private String mBirthday;
  private int mId;
  private ArrayList<Address> mAddresses;

  public Contact(String firstName, String lastName, String birthday){
    mFirstName = firstName;
    mLastName = lastName;
    mBirthday = birthday;
    instances.add(this);
    mId = instances.size();
    mAddresses = new ArrayList<Address>();
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

  public int getId() {
    return mId;
  }

  public static ArrayList<Contact> all() {
    return instances;
  }

  public static Contact find(int id) {
    try {
      return instances.get(id -1);
    }
    catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }

  public ArrayList<Address> getAddresses() {
    return mAddresses;
  }

  public void addAddress(Address address) {
    mAddresses.add(address);
  }
}
