import java.util.ArrayList;

public class Address {
  private static ArrayList<Address> instances = new ArrayList<Address>();

  private String mAddressType;
  private String mStreet;
  private String mCity;
  private String mState;
  private int mZipCode;
  private int mId;

  public Address(String addressType, String street, String city, String state, int zipCode) {
    mAddressType = addressType;
    mStreet = street;
    mCity = city;
    mState = state;
    mZipCode = zipCode;
    instances.add(this);
    mId = instances.size();
  }

  public String getType() {
    return mAddressType;
  }

  public String getStreet() {
    return mStreet;
  }

  public String getCity() {
    return mCity;
  }

  public String getState() {
    return mState;
  }

  public int getZipCode() {
    return mZipCode;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Address> all() {
    return instances;
  }

  public static Address find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}
