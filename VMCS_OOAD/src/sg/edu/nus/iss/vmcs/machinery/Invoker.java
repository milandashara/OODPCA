package sg.edu.nus.iss.vmcs.machinery;

/**
 * 
 * @author Milan
 * {@link DoorListener} uses invoker to invoke {@link DoorStateChangedCommand}
 */
public class Invoker {

	void doorStateChangedCommand(DoorStateChangedCommand doorStateChangedCommand)
	{
		System.out.println("Invoker.doorStateChangedCommand(doorStateChangedCommand)");
		
		if(doorStateChangedCommand !=null)
		doorStateChangedCommand.execute();
	}
}
