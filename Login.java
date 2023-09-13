public class Login{
	private String userID;
	private String password;
	private int failedloginAttempts;
}

public Login(String userID, String password){
	this.userID = userID;
	this.password = password;
	this.failedloginAttempts = 0;
}

 public boolean existUserID(String enteredUserId) {
        return this.userID.equals(enteredUserId);
    }

    public boolean verifyPassword(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void getFailedLoginAttempts() {
        failedLoginAttempts++;
    }
}
