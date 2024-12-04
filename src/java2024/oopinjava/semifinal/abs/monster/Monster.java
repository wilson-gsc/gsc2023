package java2024.oopinjava.semifinal.abs.monster;

/**
 * The abstract superclass Monster defines the expected common behaviors,
 *   via abstract methods.
 */
public abstract class Monster {
	private String name;  // private instance variable

   /** Constructs a Monster instance of the given name */
   public Monster(String name) {
      this.name = name;
   }

   /** Define common behavior for all its subclasses */
   abstract public String attack();
}
