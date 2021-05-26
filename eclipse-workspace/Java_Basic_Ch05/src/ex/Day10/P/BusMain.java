package ex.Day10.P;

public class BusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		
		bus1.setBus("마을 버스", 16);
		bus2.setBus("초록 버스", 7011);
		bus3.setBus("파랑 버스", 471);
		
		bus1.getName();
		bus1.getNumber();
		bus2.getName();
		bus2.getNumber();
		bus3.getName();
		bus3.getNumber();

		bus1.print();
		bus2.print();
		bus3.print();
	}

}
