package it.unibg.sommamvc;

/**
 * the model of the system
 * @author Marco
 *
 */
public class Model {
	private int a;
	private int b;
	private int somma;
	
	public Model(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getSomma() { return somma; }
	
	public void computeSum(int a, int b) {
		this.a = a;
		this.b = b;
		computeSum();
	}
	
	public void computeSum() {
		somma = a + b;
	}
	
	
}
