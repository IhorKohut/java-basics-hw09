import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysTest {

  /**
   * Test data for common array elements.
   *
   * @return test data array
   */
  @DataProvider(name = "ArrayUtil")
  public static Object[][] arrays() {
    return new Object[][]{
        {
            new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
            new String[]{"JAVA", "SQL"}
        },
        {
            new String[]{"Coca-Cola", "Pepsi", "Sprite", "Fanta", "7up", "Schweppes"},
            new String[]{"Coca-Cola", "Pepsi", "Zhivchik", "Tarhun", "Obolon", "Schweppes", "Fanta", "Sprite"},
            new String[]{"Coca-Cola", "Pepsi", "Sprite", "Fanta", "Schweppes"},
        },
        {
            new String[]{"New-Orlean", "Buffalo", "Abu-Dabi", "Los-Angeles", "Austin", "Indiannapolis", "Kiev", "London", "Rome", "Warshawa", "Praha"},
            new String[]{"Milan", "Berlin", "Turin", "Oslo", "Paris", "New-Orlean", "Buffalo", "Los-Angeles", "Austin", "Indiannapolis"},
            new String[]{"New-Orlean", "Buffalo", "Los-Angeles", "Austin", "Indiannapolis"}
        },
        {
            new String[]{"11", "3", "15", "9"},
            new String[]{"2", "10", "20", "14", "12", "200", "500"},
            new String[]{}
        },
        {
             new String[]{"here", "is", "some", "text", ".", "text"},
             new String[]{"some", "text", "above", "."},
             new String[]{"some", "text", "."}
        }
    };
  }

  @Test(dataProvider = "ArrayUtil")
  public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

    assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
        "Common elements are not correct");
  }
}