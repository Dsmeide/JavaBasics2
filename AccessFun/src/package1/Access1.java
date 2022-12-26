package package1;

public class Access1 {

	//default = gives access to everything within the package
	//public = Full access across all packages
	//private = ISOLATES FROM OTHER  FILES
	//protected = ALLOWS SHARING TO ALL CLASSES WITHIN THE PACKAGE BUT NO OTHER PACKAGES can allow access with extends variable
	
	protected int hours = 3;
	protected int minutes = 47;
	
	public int getHours() {
		return hours;
	}
}
