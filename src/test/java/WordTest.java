import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word testWord = new Word("Bird");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void getName_returnsNameOfWord_true() {
    Word testWord = new Word("Bird");
    assertEquals("Bird", testWord.getNameOfWord());
  }

}
