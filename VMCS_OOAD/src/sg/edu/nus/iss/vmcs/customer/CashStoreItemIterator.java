package sg.edu.nus.iss.vmcs.customer;

import java.util.Iterator;

import sg.edu.nus.iss.vmcs.store.Store;
import sg.edu.nus.iss.vmcs.store.StoreItem;

/**
 * 
 * @author Milan
 * Iterator Pattern
 *
 */
public class CashStoreItemIterator implements Iterator<StoreItem>{

	private Store store;
	
	private int index;
	
	public CashStoreItemIterator(Store store) {
		this.store=store;
	}
	
	@Override
	public boolean hasNext() {
		 if(index < store.getItems().length){
	            return true;
	         }
	         return false;
	}

	@Override
	public StoreItem next() {
		if(this.hasNext()){
            return store.getStoreItem(index++);
         }
         return null;
	}

	@Override
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
		
	}


}
