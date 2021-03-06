package week7.day2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
  /**
   * Creates a <code>FilterInputStream</code>
   * by assigning the  argument <code>in</code>
   * to the field <code>this.in</code> so as
   * to remember it for later use.
   *
   * @param in the underlying input stream, or <code>null</code> if
   *           this instance is to be created without an underlying stream.
   */
  protected LowerCaseInputStream(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    int result = super.read();

    return result == -1 ? -1 : Character.toLowerCase((char) result);
  }
}
