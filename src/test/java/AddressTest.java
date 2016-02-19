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

  @Test
  public void all_returnsAllInstancesOfAddress_true() {
    Address firstAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
    Address secondAddress = new Address("Buisness", "400 SW 6th", "Portland", "OR", 97203);
    assertTrue(Address.all().contains(firstAddress));
    assertTrue(Address.all().contains(secondAddress));
  }

  @Test
    public void newId_addressInstantiateWithAnID_true() {
      Address myAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
      assertEquals(Address.all().size(), myAddress.getId());
    }

    @Test
    public void find_returnsAddressWithSameId_secondAddress() {
      Address firstAddress = new Address("Home", "2315 NE Broadway", "Portland", "OR", 97232);
      Address secondAddress = new Address("Buisness", "400 SW 6th", "Portland", "OR", 97203);
      assertEquals(Address.find(secondAddress.getId()), secondAddress);
    }

    @Test
    public void find_returnsNullWhenNoAddressFound_null() {
      assertTrue(Address.find(999) == null);
    }

    @Test
    public void clear_emptiesAllAddressesFromArrayList() {
      Address myAddress = new Address("Buisness", "400 SW 6th", "Portland", "OR", 97203);
      Address.clear();
      assertEquals(Address.all().size(), 0);
    }
}
