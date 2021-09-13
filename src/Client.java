
public class Client {
	public static void main (String[]args) {
		Vehicle v = new Boat();
		//v = new Car(); //กำหนดให้ drive แบบ Car
		Person p = new Person(v); // v ของ Boat
		
		v = new Rocket(); //ปรับเปลี่ยนพฤติกรรม
		p.setDrive(v); //ส่ง v ลงไปใหม่
		
		p.drive();
	}
}
