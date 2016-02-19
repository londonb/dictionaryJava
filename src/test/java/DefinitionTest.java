import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

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

  @Test
  public void newId_tasksInstantiateWithAnID_true() {
    Definition testDefinition = new Definition("A definition");
    assertEquals(Definition.all().size(), testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_secondTask() {
    Definition firstDefinition = new Definition("A definition");
    Definition secondDefinition = new Definition("Another definition");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList() {
    Definition myDefinition = new Definition("A definition");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
}
