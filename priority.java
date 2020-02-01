/**
 * 
 * @author <Chase Goodband>
 * @version<10/04/2019>
 *
 */
public class priority {
	
	private int maxSize;
	private country[] queArray;
	private int nItems;
	private int bestElementPos = -1;
	
	public priority(int s)                 //constructor 
	{
		maxSize = s;
		queArray = new country[maxSize];
		nItems = 0;
	}
	
	public void insert(country j)               // insert item
	{
		if (nItems == 0) {
			bestElementPos = 0;
		} else {
			if (j.getGDPPerCapita() > queArray[bestElementPos].getGDPPerCapita()) {
				bestElementPos = nItems;
			}
		}
		
		queArray[nItems] = j;              // insert on top of array 
		nItems++;                            //increment nItems
	}
	
	
	private int findBestElement() {
		if (nItems == 0) return -1;
		if (nItems == 1) return 0;
	    int best = 0;
	    
	    for (int ktr = 1; ktr < nItems; ktr++) {
	        if (queArray[ktr].getGDPPerCapita() > queArray[best].getGDPPerCapita()) {
	            best = ktr;
	        }
	    }
	    return best;
	}	
	
	public country remove()
	{


		if (bestElementPos != nItems - 1) {
			queArray[bestElementPos] = queArray[ nItems - 1];
		}

		int res = bestElementPos;
		bestElementPos = findBestElement();
		
		nItems--;
		
		return queArray[bestElementPos];
	}
	
	public void print() {
		for (int i = 0; i < nItems; i++) {
			queArray[i].print();
		}
	}
	
	
	public boolean isEmpty()                //true if queue is empty 
	{
		return (nItems == 0);
	}
	
	public boolean isFull()                 //true is queue is full
	{
		return (nItems == maxSize);
	}
	
	


}
