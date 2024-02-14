package easyp;

class Netflix {
	synchronized void watchingmovie(String name) {
		System.out.println(name+"Watching movie");
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"Done Watching movie\n------");
	}
}
