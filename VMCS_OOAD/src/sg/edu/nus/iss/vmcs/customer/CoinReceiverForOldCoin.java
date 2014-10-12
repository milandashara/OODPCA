package sg.edu.nus.iss.vmcs.customer;

public class CoinReceiverForOldCoin implements Receiver {

	@Override
	public void startReceiver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveItem(double ItemValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void continueReceive() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean storeCash() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stopReceive() {
		// TODO Auto-generated method stub

	}

	@Override
	public void refundCash() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resetReceived() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setActive(boolean active) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTotalInserted(int totalInserted) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalInserted() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TransactionController getTxCtrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTxCtrl(TransactionController txCtrl) {
		// TODO Auto-generated method stub
		
	}

}
