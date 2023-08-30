package Lab_4;

class Counter {
	static int count = 0;
	
	Counter(){
		count++;
	}
	
	void show_count() {
		System.out.println("Number of Counters - "+count);
	}

	public static void main(String[] args) {
		Counter obj1 = new Counter();

		@SuppressWarnings("unused")
		Counter obj2 = new Counter();
		obj1.show_count();

		@SuppressWarnings("unused")
		Counter obj3 = new Counter();

		@SuppressWarnings("unused")
		Counter obj4 = new Counter();
		obj1.show_count();
	}
}
