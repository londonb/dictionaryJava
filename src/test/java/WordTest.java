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

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Bird");
    Word secondWord = new Word("Dog");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void find_returnsWordWithSameId() {
    Word testWord = new Word("Bird");
    assertEquals(Word.find(testWord.getId()), testWord);
  }
}
