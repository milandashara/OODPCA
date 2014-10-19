package sg.edu.nus.iss.vmcs.machinery;

/**
 * 
 * @author Milan
 * Command Interface
 */
public interface Command {

	void execute(boolean doorState);
}
