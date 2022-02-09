public class Klammern {
	public static boolean klammernPrüfen(String k) {

	}
	public static void main(String[] args) {
		String k;

		k = "()()()";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "()()(";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = ")(";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "()(())()";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "())(()";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "(";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = ")";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
	}
}
/*
Erwartete Ausgabe:

'()()()': true
'()()(': false
')(': false
'()(())()': true
'())(()': false
'(': false
')': false
'': true
*/

public class Baum {
	public static void baumZeichnen(int höhe, char krone, char stamm) {
	
	}
	public static void main(String[] args) {
		baumZeichnen(4, '*', '#');
	}
}

/*
Erwartete Ausgabe:

   *
  ***
 *****
*******
   #
   #
   #
   #
*/
