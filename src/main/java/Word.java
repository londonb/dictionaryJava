import java.util.ArrayList;

public class Word {

  private static ArrayList<Word> instances = new ArrayList<Word>();
  private String mNameOfWord;

  public Word(String nameOfWord) {
    mNameOfWord = nameOfWord;
    instances.add(this);
  }

  public String getNameOfWord() {
    return mNameOfWord;
  }

  public static ArrayList<Word> all() {
    return instances;
  }
}
