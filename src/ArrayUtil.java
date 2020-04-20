import java.util.ArrayList;
import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

  /**
   * Finds the common elements between two arrays (String values).
   *
   * @param array1 first array
   * @param array2 second array
   * @return String array with common elements
   */
  public static String[] findCommon(String[] array1, String[] array2) {
    ArrayList<String> arrayresult_int = new ArrayList<>();
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i].equals(array2[j]) == true) {
          arrayresult_int.add(array1[i]);
        }
      }
    }
    String[] arrayresult = arrayresult_int.toArray(new String[arrayresult_int.size()]);
    return arrayresult;
  }
}