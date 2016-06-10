package structure_of_the_code_exceptions;

class LengthException extends Exception {
	public LengthException() {
		System.out.println("LengthException");
	}
}

class TooLongException extends LengthException {
	public TooLongException() {
		System.out.println("TooLongException");
	}
}

class TooShortException extends TooLongException {
	public TooShortException() {
		System.out.println("TooShortException");
	}
}

class SizeOfAnything {
}

class MyParentException {
	int testLength(SizeOfAnything size) throws LengthException {
		return 0;
	}
}

public class MyExceptions extends MyParentException{
	int testLength(SizeOfAnything size){
		return 1;
	}
}
