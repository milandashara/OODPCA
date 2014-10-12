package sg.edu.nus.iss.vmcs.customer;


public interface Receiver {


	
	public TransactionController getTxCtrl();
	public void setTxCtrl(TransactionController txCtrl);
	/**
	 * Commence receiving a series of Coins&#46;  To do this the Coin Receiver
	 * instructs the Coin Input Box to become activated&#46;  It also updates the Total
	 * Money Inserted Display on the Customer Panel.
	 */
	public void startReceiver();
	

	public void receiveItem(double ItemValue);

	/**
	 * This method will activate the Coin Input Box so that further coins
	 * can be received.
	 */
	public void continueReceive();
	
	/**
	 * Instruct the Cash Store to update its totals and then re-set the Total
	 * Money Inserted Display to zero.
	 * @return return TRUE if cash has been stored, else return FALSE.
	 */
	public boolean storeCash();
	
	/**
	 * This method will deactivate the Coin Input Box in order to stop 
	 * receiving coins.
	 */
	public void stopReceive();
	
	/**
	 * This method handles the refunding of Coins entered so far to 
	 * the Customer.
	 */
	public void refundCash();
	
	/**
	 * This method reset the coin received input.
	 */
	public void resetReceived();
	
	/**
	 * This method activates or deactivates the Coin Input Box.
	 * @param active TRUE to activate, FALSE to deactivate the Coin Input Box.
	 */
	public void setActive(boolean active);

	/**
	 * This method sets the total money inserted.
	 * @param totalInserted the total money inserted.
	 */
	public void setTotalInserted(int totalInserted);

	/**
	 * This method returns the total money inserted.
	 * @return the total money inserted.
	 */
	public int getTotalInserted();
}
