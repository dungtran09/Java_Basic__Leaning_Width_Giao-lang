public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    builder.append("Hello ");
    builder.append("Word");
    builder.append("!");
    builder.append("!");
    builder.append("!");

    System.out.println(builder.toString());
  }
}
