// User Class
public class User {
    private String name;
    private String phoneNumber;
    private String password;

    public User(String name, String phoneNumber, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // Getter and setter
    
    public String getphoneNumber(){
    	return phoneNumber;
    }

    public static void setPhoneNumber(){
        this.phoneNumber;
    }

    public String getPassword(){
    	return password;
    }
    
    public static void setPassword(){
        this.password = password;
    }

    public boolean validatePhoneNumber(){
        return phoneNumber.matches("01\\d-\\d{7}");
    }

    public boolean validatePassword(){
        return password.length()>=8 && <15;
    }

    public String toString(){
    	return "Name: " + name + "\nPhone Number: "+ phoneNumber + 
    		"\npassword: "+ password;
    }
    
   public boolean equals(Object obj){
   	if(obj instanceof User){
   		User anotherobj = (User)obj;
   		if(name.equals(anotherObj.name)){
   			System.out.println("This user has the same name.");
   		}else{
   			System.out.println("Different user.");
   		}
   		}
   	}
   }
