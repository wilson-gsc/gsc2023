package datastruc2024.chap2.interfaces;

/** Interface for objects that can be transported. */
public interface Transportable {
	/** Returns the weight in grams. */
	public int weight();
	/** Returns whether the object is hazardous. */ 
	public boolean isHazardous();
}