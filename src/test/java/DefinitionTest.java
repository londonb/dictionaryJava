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


}
