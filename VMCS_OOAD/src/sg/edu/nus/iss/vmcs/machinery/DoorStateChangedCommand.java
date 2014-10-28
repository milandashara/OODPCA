package sg.edu.nus.iss.vmcs.machinery;

/**
 * 
 * @author Milan
 * DoorStateChanged Command excuted by {@link DoorListener}
 */
public class DoorStateChangedCommand implements Command {

	private MachineryController mctrl;
	private boolean doorState;
	
	public boolean isDoorState() {
		return doorState;
	}

	public void setDoorState(boolean doorState) {
		this.doorState = doorState;
	}

	public DoorStateChangedCommand(MachineryController mctrl) {
		this.mctrl=mctrl;
	}
	
	@Override
	public void execute() {
		mctrl.setDoorState(doorState);

	}

}
