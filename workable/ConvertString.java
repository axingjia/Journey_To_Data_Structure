import java.io.*;

class ConvertString {
  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }

  public static int getDouble() throws IOException {
    String s = getString();
    Double aDub = Double.valueOf(s);
    return (int)aDub.doubleValue();
  }
  public static void main(String[] args){

    // getDouble();
    try {
      // System.out.println(getString());
      System.out.println(getDouble());

    }
    catch(IOException e) {
      e.printStackTrace();
    }

  }
}
