// bump!! unable to use Utils function, using alternate method using BigInteger and hexString

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.lang.Object;
import javax.print.DocFlavor.BYTE_ARRAY;
import org.jcp.xml.dsig.internal.dom.Utils;

public class main {

    public void hashText(String s) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    byte[] input = s.getBytes();
    byte[] digest = md.digest(input);

    System.out.println("Input: " + s);
    Utils.printByteArray("Digest", digest);
    }
public void demo() throws NoSuchAlgorithmException {
    hashText("hello");
}
}