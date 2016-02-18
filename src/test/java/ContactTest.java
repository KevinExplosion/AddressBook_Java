import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void contact_instantiatesCorrectly_true(){
    Contact myContact = new Contact("Daren", "Schaad", "January 23 1981");
    assertEquals(true, myContact instanceof Contact);
  }

  @Test
  public void contact_instantiatesWithFirstName_true() {
    Contact myContact = new Contact("Kevin", "Mattison", "November 13 1983");
    assertEquals("Kevin", myContact.getFirstName());
  }

  @Test
  public void contact_instantiatesWithLastName_true() {
    Contact myContact = new Contact("Kevin", "Mattison", "November 13 1983");
    assertEquals("Mattison", myContact.getLastName());
  }

  @Test
  public void contact_instantiatesWithBirthday_true() {
    Contact myContact = new Contact("Kevin", "Mattison", "November 13 1983");
    assertEquals("November 13 1983", myContact.getBirthday());
  }

  @Test
  public void all_returnsAllInstancesOfContacts_true() {
    Contact firstContact = new Contact("Kevin", "Mattison", "November 13 1983");
    Contact secondContact = new Contact("Daren", "Schaad", "January 23 1981");
    assertTrue(Contact.all().contains(firstContact));
    assertTrue(Contact.all().contains(secondContact));
  }
}
