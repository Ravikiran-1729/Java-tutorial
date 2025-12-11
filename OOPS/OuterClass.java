import java.util.*;
import java.util.ArrayList;

public class OuterClass implements Cloneable {
	private int outerVariable = 10;

	public class InnerClass {
		private int innerVariable = 5;
	}

	public void accessInnerVariable() {
		InnerClass innerClass = new InnerClass();
		System.out.println(innerClass.innerVariable);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public static void main(String[] args) {

		try {
			OuterClass o = new OuterClass();
			Object a = o.clone();
			System.out.println(a);
			o.accessInnerVariable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}