package java8course;

import Stream.Stream;

import java.util.concurrent.Callable;

public class TargetType {
    public interface Email {
        String constractEmail(String name);
    }
    Email email=(String name)->name+"@mad";
    public String getEmail(String name, Email email){
        return null;
    }
    public static void main(String args[]) {
      String s=  new TargetType().getEmail("mkonda",(String name)->name +"@mad");
System.out.println(s);
    }
}
/*public class TargetType {
	private static String domain = "@madhusudhan.com";

	//(String name) -> name + domain;

	public interface Email{
		String constructEmail (String name);
	}

	Email email = (String name) -> name + domain;

	public String getEmail(String name, Email email){
		String emailAddress = email.constructEmail(name);
		System.out.printf("%s's Email is %s\n",name,emailAddress);
		return emailAddress;
	}

	public static void main(String[] args) {
		TargetType tt = new TargetType();
		tt.getEmail("mkonda", (String name) -> name + domain);

	}

}
*/
