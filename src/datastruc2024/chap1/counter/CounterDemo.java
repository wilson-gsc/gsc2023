package datastruc2024.chap1.counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c;                         // declares a variable; no counter yet constructed
        c = new Counter();                 // constructs a counter; assigns its reference to c
        System.out.println("Counter c "+c);
        c.increment();                     // increases its value by one
        c.increment(3);                    // increases its value by three more
        System.out.println("Counter c incremented twice");
        System.out.println("Counter c "+c);
        int temp = c.getCount();           // will be 4
        System.out.println("Created variable temp from counter c : "+temp);
        c.reset();                         // value becomes 0
        System.out.println("Counter c has been reset");
        System.out.println("Counter c "+c);
        Counter d = new Counter(5);        // declares and constructs a counter having value 5
        System.out.println("Counter d "+d);
        d.increment();                     // value becomes 6
        System.out.println("Counter d incremented");
        System.out.println("Counter d "+d);
        Counter e = d;                     // assigns e to reference the same object as d
        System.out.println("Counter e "+e);
        temp = e.getCount();               // will be 6 (as e and d reference the same counter)
        System.out.println("Assigned variable temp from counter e : "+temp);
        e.increment(2);                    // value of e (also known as d) becomes 8
        System.out.println("Counter e incremented");
        System.out.println("Counter e "+d);
    }
}

