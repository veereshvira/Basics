package sample;

class Tom {
	String name;
	Tom(String name){
		this.name=name;
	}
	static class Jerry{
		 String name="Shreyas";
		 int id =789;
		public static void main(String[] args) {
			Jerry j = new Jerry();
			System.out.println(j.name);
			System.out.println(j.id);
		}
	}
	public static void main(String[] args) {
		Tom t = new Tom("Shreyu");
		
		System.out.println(t.name);
	}
}
