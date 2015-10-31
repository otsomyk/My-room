package myRoom;

public class RoomInstance {

	public static void main(String[] args) {
			Room r1 = new Room();
			r1.shape = "square";
			r1.color = "white";
			r1.function = "dinning";
			r1.use = false;
			r1.name = "table";
			r1.price = 1500.0;
			
			Room r2 = new Room();
			r2.shape = "high";
			r2.color = "white";
			r2.function = "soft";
			r2.use = false;
			r2.name = "chair";
			r2.price = 400.0;
			
			Room r3 = new Room();
			r3.shape = "rectangular";
			r3.color = "braun";
			r3.function = "soft";
			r3.use = true;
			r3.name = "sofa";
			r3.price = 5400.0;
			
			printRoomInfo(r1);
			printRoomInfo(r2);
			printRoomInfo(r3);
			
			addInstance();
					
		}
		
		private static void printRoomInfo(Room r)
		{
			System.out.println("thing color: " + r.color + ", shape: " + r.shape + ", function: " + r.function + 
					", using: " + r.use + ", name: " + r.name + ", price: " + r.price + " grn.");
		}
		
		private static void addInstance(){
			System.out.println("Cupboard");
			System.out.println("TV");
			System.out.println("Stairs");
			System.out.println("Chair");
			System.out.println("Table");
			System.out.println("Vase");
			System.out.println("Clock");
		}
		

	}


