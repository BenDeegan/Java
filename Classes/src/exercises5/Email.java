package exercises5;

public class Email {
	private String emailAdd;
	private String password;
	private int maxStorage;
	
	
	public Email(){
		
	}
	
	public Email(String emailAdd, String password, int maxStorage){
		setEmailAdd(emailAdd);
		setPassword(password);
		setMaxStorage(maxStorage);
		
	}
	
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		if(emailAdd.contains("@")&& emailAdd.contains(".")){
			this.emailAdd = emailAdd;
		} else {
			System.out.println("Error ---- email must contain @ and .");
		}
		
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() <= 20){
			this.password = password;
		} else {
			System.out.println("Password too long");
		}
		
		
	}
	public int getMaxStorage() {
		return maxStorage;
	}
	public void setMaxStorage(int maxStorage) {
		this.maxStorage = maxStorage;
	}

	@Override
	public String toString() {
		return "Email [emailAdd=" + emailAdd + ", password=" + password + ", maxStorage=" + maxStorage + "]";
	}
	

}
