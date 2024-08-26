package bin.Customer;

public class ClientTempData {

  private static String name;
  private static String number;
  private static String DOB;
  private static String NID;
  private static String vType;
  private static String username;
  private static String pass;

  public ClientTempData(
    String name2,
    String number2,
    String nID2,
    String dOB2,
    String vType2,
    String username2,
    String password
  ) {}

  public ClientTempData() {}

  public static String getName() {
    return name;
  }

  public static String getNumber() {
    return number;
  }

  public static String getDOB() {
    return DOB;
  }

  public static String getNID() {
    return NID;
  }

  public static String getVType() {
    return vType;
  }

  public static String getUsername() {
    return username;
  }

  public static String getPass() {
    return pass;
  }

  public static void setTemporaryData(
    String name,
    String number,
    String NID,
    String DOB,
    String vType,
    String username,
    String pass
  ) {
    ClientTempData.name = name;
    ClientTempData.number = number;
    ClientTempData.NID = NID;
    ClientTempData.DOB = DOB;
    ClientTempData.vType = vType;
    ClientTempData.username = username;
    ClientTempData.pass = pass;
  }
}
