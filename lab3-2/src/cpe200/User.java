package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        this.userName = "";
        this.password = "";
    }

    public boolean setUserName(String name)
    {
        String type = "[A-Za-z][A-Za-z0-9]{7,}";
        if(name.matches(type)){
            userName = name;
            return true;
        }else{
            return false;
        }
    }

    public boolean setPassword(String name)
    {
        String type2 = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if(name.matches(type2)){
            password = name;
            return true;
        }else{
            return false;
        }
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
