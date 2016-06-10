package arrays;

class Point{
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class CloneablePrimitiveAndReferenceArray implements Cloneable {
	Point p;
	int height;

	public CloneablePrimitiveAndReferenceArray(int x, int y, int z) {
		p = new Point(x, y);
		height = z;
	}

	/*public Object clone() {
		CloneablePrimitiveArray cloneObject = null;
		try {
			cloneObject = (CloneablePrimitiveArray) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.getMessage());
		}
		cloneObject.p = (Point) this.p.clone();
		return cloneObject;
	}*/

	public static void main(String s[]) {
		CloneablePrimitiveAndReferenceArray t1 = new CloneablePrimitiveAndReferenceArray(1, 2, 3), t2 = null;
		try {
			t2 = (CloneablePrimitiveAndReferenceArray) t1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		t1.p.x = -1;// for this need realization clone() method
		t1.height = -1;
		System.out.println("t2.p.x=" + t2.p.x + ", t2.height=" + t2.height);
		//new Object().clone();
	}
}
