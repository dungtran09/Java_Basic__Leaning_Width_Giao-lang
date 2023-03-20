public class SringDemo {
  public static void main(String[] args) {
    String str = "Hello Word!";

    System.out.println("Length: " + str.length());
    System.out.println("Index at 0: " + str.charAt(0));
    
    str = str.concat(" My name is Dung");
    System.out.println(str);
  }
}
