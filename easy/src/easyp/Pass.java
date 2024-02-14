package easyp;

public class Pass {
		 String name="Mrinal";
		 int number=8983;
		
		private static Pass Obj;
		
		private Pass() {
			System.out.println("Passport Generated");
		}
		 
		public static Pass getInstanceof() {
			if(Obj == null) {
				Obj = new Pass();
			}
			return Obj;
		}
	
		public static void main(String[] args) {
			
			Pass p =  Pass.getInstanceof();
			System.out.println("Name:"+p.name+"\n Passport Number:"+p.number);
		}
	}


