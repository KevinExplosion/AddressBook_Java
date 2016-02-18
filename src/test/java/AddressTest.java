import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class AddressTest {
  @Test
  public void address_instantiatesCorrectly_true() {
    Address myAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
    assertEquals(true, myAddress instanceof Address);
  }

  @Test
  public void address_instantiatesWithType() {
    Address myAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
    assertEquals("Home", myAddress.getType());
  }

  @Test
  public void address_instantiatesWithStreet() {
    Address myAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
    assertEquals("2315 NE Broadway", myAddress.getStreet());
  }

  @Test
  public void address_instantiatesWithCity() {
    Address myAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
    assertEquals("Portland", myAddress.getCity());
  }

  @Test
  public void address_instantiatesWithState() {
    Address myAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
    assertEquals("OR", myAddress.getState());
  }

  @Test
  public void address_instantiatesWithZipCode() {
    Address myAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
    assertEquals(97232, myAddress.getZipCode());  
  }
}
