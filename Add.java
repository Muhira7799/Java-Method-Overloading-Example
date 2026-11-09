
public class Add {

	    
	    void add() {
	        System.out.println("Nothing to add");
	    }

	    void add(int a) {
	        System.out.println("Single parameter: " + a);
	    }

	    void add(int a, int b) {
	        int c = a + b;
	        System.out.println("C = " + c);
	    }

	    public static void main(String[] args) {
	        Add t = new Add();
	        t.add();
	        t.add(5);
	        t.add(5, 4);
	    }
	}