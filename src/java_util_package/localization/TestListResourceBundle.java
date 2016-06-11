package java_util_package.localization;
import java.util.*;

class MyResourceList extends ListResourceBundle {
	Vector v = new Vector();
	Object[][] resources = {
		{"StringKey","String"},
		{"DoubleKey",new Double(0.0)},
		{"VectorKey",v},
	};
	public MyResourceList() {
		super();
		v.add("Element 1");
		v.add("Element 2");
		v.add("Element 3");
	}
	protected Object[][] getContents() {
		return resources;
	}
}
public class TestListResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("java_util_package.localization.MyResourceList",Locale.getDefault());
		Vector v = (Vector)rb.getObject("VectorKey");
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
