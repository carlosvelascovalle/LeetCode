package Easy;

public class _1108_DefangingAnIPAddress {
  public static void main(String[] args) {
    defangIPaddr("1.1.1.1");
  }

  public static String defangIPaddr(String address) {
    String tempAddr = "";
    for (int i = 0; i < address.length(); i++) {
      if (address.substring(i, i + 1).equals(".")) {
        tempAddr = tempAddr + "["+address.substring(i, i + 1)+"]";
      } else {
        tempAddr = tempAddr + address.substring(i, i + 1);
      }
    }
    System.out.println(tempAddr);
    return tempAddr;
  }
}
