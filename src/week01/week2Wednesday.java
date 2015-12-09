package week01;

public class week2Wednesday {

	26. Stack 'em

	Create and implement a class StackImpl, representing a... well, stack.

	Think about all the required (public) operations needed, so that one can use a stack class. You know, stuff like actually pushing an element, popping an element, length, clear, isEmpty, stuff like that. Think about the return types of those operations (see task 5, you may get a hint about one). Extract them all to an interface Stack, which your class should implement.
	27. No clones allowed.

	Create an implementation of your Stack interface, which has the added invariant: -It does not allow an element to be duplicated. If there is an element 'a' in the stack, and some smart guy pushes 'a' again, his operation should fail, and the smart guy should have a way to know this.
	28. On two fronts

	Implement a (doubly-linked) list (using ints only). Just as before, extract all of its required public operations in an interface. Some of those operations are add, remove, size, get(int elementIndex), getHead (getFirst), getTail(getLast), etc. Think good and hard about your implementation, and whether you will need another class for a List Node.
	29. Mr. ListStack

	Implement your own Stack with your own (doubly) LinkedList class : )

	Bonus implement a unique stack just as before, but using your LinkedList and an anonymous implementation, combined with a factory method. See http://www.programmerinterview.com/index.php/java-questions/java-anonymous-class-example/

	Return your anonymous implementation from a factory method!
	30. The One

	Make a mutable class 'Matrix' represeting a NxM (Pixel[][]) matrix. Pixel is a POJO (Google it!) containing three float values - R, G, B. Think good about your constructors, your data. Your goal is to make this class as convenient as possible for the person using it.

	Your class Matrix should have another cool thing about it => it would allow operations with every pixel. In order for this to work, your class should declare a public method operate(MatrixOperation op)

	Where MatrixOperation is an interface, containing a method 'Pixel withPixel(int x, int y, Pixel[][] matrix)'. Think - why are we getting x, y, and the matrix instead of just passing the pixel value?

	Implement the toString(), converting the whole matrix into a String in a way that it would be visible on the console.

	The method should operate(MatrixOperation op) should call the withPixel method for every x and y in the matrix and assign the result of withPixel to the matrix.

	Now that you have this, implement:

	    brightness reduce
	    grayscale
	    gaussian blur (optional)

}
