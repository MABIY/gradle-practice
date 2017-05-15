package hello;

/**
 * Created by lh on 17-5-15.
 */
import java.security.SecureRandom;
class JRand {
    public static void main(String args[]) throws Exception {
        System.out.println("Ok: " +
                SecureRandom.getInstance("SHA1PRNG").nextLong());
    }
}
