package ca.mths.Unit1.Unit1_01.java.Hello_World;
/**
* The Hello World! program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Cameron Teed
* @version 1.0
* @since   2020-04-21
*/
final class HelloWorld {
  private HelloWorld() {
      // Prevent instantiation
      // Optional: throw an exception e.g. AssertionError
      // if this ever *is* called
  }
  /**
  * This method prints out "Hello, World!".
  * @param args
  */
  public static void main(final String[] args) {
        System.out.println("Hello World");
  }
}
