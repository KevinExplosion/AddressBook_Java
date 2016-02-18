import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void contact_instantiatesCorrectly_true(){
    Contact myContact = new Contact("Daren", "Schaad", "January 23 1981");
    assertEquals(true, myContact instanceof Contact);
  }
}
