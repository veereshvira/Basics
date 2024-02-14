package easyp;

class Movies extends Thread
{
	String name;
	Netflix netflix;
	
	
	Movies(String name, Netflix netflix) {
			this.name = name;
		this.netflix = netflix;
	}


	public void run() {
		netflix.watchingmovie(name);
	}
}