import Odev.Login;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class LoginTest {
    @Test
    public void GirilenDeger(){

        final Login login = new Login();
        boolean response = new Login().UserNamePassword("Kerim",123);
        assertTrue( response == true);
        System.out.println("Login Successful");

        assertFalse( response == false);
        System.out.println("Login Unsuccessful");
}
