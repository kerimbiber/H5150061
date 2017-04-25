package Odev;
/**
 * Created by Kerimovic on 25.04.2017.
 */
public class Login {
    String userName = //buraya isim;
    int password = //buraya sayi;

    public boolean UserNamePassword (String userName, int pass)
    {
        if (this.userName.equals(userName) && this.password == pass)
        {
            return true;
        }
        else {
            return false;
        }
}
}
