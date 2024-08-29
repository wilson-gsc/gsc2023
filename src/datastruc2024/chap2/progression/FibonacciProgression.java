package datastruc2024.chap2.progression;

public class FibonacciProgression extends Progression {
	
	protected long prev;
	
	/** Constructs traditional Fibonacci, starting 0, 1, 1, 2, 3, ... */
	public FibonacciProgression() { this(1, 1); }
	
	/** Constructs generalized Fibonacci, with give first and second values. */
	public FibonacciProgression(long first, long second) {
		super(first);
		prev = second - first; // fictitious value preceding the first
	}
	
	/** Replaces (prev,current) with (current, current+prev). */ 
	protected void advance() {
		long temp = prev; 
		prev = current; 
		current += temp;
	}
}
