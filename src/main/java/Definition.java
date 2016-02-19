import java.util.ArrayList;

public class Definition {

  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private String mWordDefinition;
  private int mId;

  public Definition(String wordDefinition) {
    mWordDefinition = wordDefinition;
    instances.add(this);
    mId = instances.size();
  }

  public String getDefinitionOfWord() {
    return mWordDefinition;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

  public int getId() {
  return mId;
  }

  public static Definition find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}
