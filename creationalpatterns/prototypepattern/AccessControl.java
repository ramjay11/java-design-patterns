package prototypepattern;

/* The AccessControl class implements the Prototype interface and overrides the clone method. The method calls the
clone method of the super class and returns the object after down-casting it to the AccessControl type. The clone method
throws CloneNotSupportedException which is caught within the method itself.
The class also contains two properties; the controlLevel is used to specific the level of control this object contains. 
The level depends upon the type of user going to use it, for example, USER, ADMIN, MANAGER etc. */
/* The other property is the access; it contains the access right for the user. Please note that, for simplicity, we
 * have used access as a String type attribute. This could be of type Map which can contain key value pairs of long 
 * access rights assigned to the user.*/
public class AccessControl implements Prototype {

	private final String controlLevel;
	private String access;
	
	public AccessControl(String controlLevel, String access) {
		super();
		this.controlLevel = controlLevel;
		this.access = access;
	}
	
	@Override
	public AccessControl clone() {
		try {
			return (AccessControl) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;	
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getControlLevel() {
		return controlLevel;
	}
	
	
	
	
}
