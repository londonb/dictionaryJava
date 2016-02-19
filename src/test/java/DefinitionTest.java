import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("Bird");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getDefinitionOfWord_returnsDefinitionOfWord_true() {
    Definition testDefinition = new Definition("A definition");
    assertEquals("A definition", testDefinition.getDefinitionOfWord());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("A definition");
    Definition secondDefinition = new Definition("Another definition");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

}
