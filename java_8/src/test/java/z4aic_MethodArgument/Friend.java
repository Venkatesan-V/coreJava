package z4aic_MethodArgument;

public class Friend {

	public void canManage (IManageable manageable) {
		manageable.manage();
	}
}
// Interface is passed as method argument here and able to call the interface method (manage)