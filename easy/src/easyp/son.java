package easyp;

public class son extends father{

	@Override
	void property() {
		// TODO Auto-generated method stub
		System.out.println("Acquring a properties since from: ");
	}
	public static void main(String[] args) {
		father f = new son();
		f.property();
		System.out.println(f.v);
		
	}
}
