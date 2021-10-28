package userauth;

public class Login {

    String uname;
    String pass;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Login [uname=" + uname + ", pass=" + pass + "]";
    }

    public Login(String uname, String pass) {
        super();
        this.uname = uname;
        this.pass = pass;
    }


}
