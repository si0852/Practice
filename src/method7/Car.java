package method7;

public class Car {
	
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=0; i<=50; i++) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " +this.speed + "km/h");
		}
	}

}
