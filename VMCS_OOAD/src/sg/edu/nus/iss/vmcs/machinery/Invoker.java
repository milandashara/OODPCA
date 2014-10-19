package sg.edu.nus.iss.vmcs.machinery;

/**
 * 
 * @author Milan
 * {@link DoorListener} uses invoker to invoke {@link DoorStateChangedCommand}
 */
public class Invoker {

	void dooStateChangedCommand(DoorStateChangedCommand doorStateChangedCommand)
	{
		
		if(doorStateChangedCommand !=null)
		doorStateChangedCommand.execute(doorStateChangedCommand.isDoorState());
	}
}
