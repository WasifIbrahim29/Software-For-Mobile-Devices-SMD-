import java.util.Scanner;

public class cars extends BasicCarFunctions implements Specifications,Transactions {
	
	static String carName;
	static String carModel;
	static final String audiSignature="rings";
	static final String porcheSignature="peace symbol";
	static final String ferrariSignature="Prancing horse";
	String carPrice="";
	String insuranceMoney="";
	String taxMoney="";
	String totalSeats="";
	static String showSignature() {
		if(carName.equals("Audi")) {
			return "Audi car's signature is " + audiSignature + ".";
		}
		else if(carName.equals("Porche")) {
			return "Porche car's signature is " + porcheSignature + ".";
		}
		else {
			return "Ferrari car's signature is " + ferrariSignature + ".";
		}
	}
	
	public cars(String carName,String carModel) {
		cars.carModel=carModel;
		cars.carName=carName;
	}
	
	public String carPrice() {
		if(carName.equals("Audi")) {
			if(carModel.equals("A4")) {
				this.carPrice="Audi A4 has price of 100000 euros.";
			}
			else if(carModel.equals("A3")) {
				this.carPrice="Audi A3 has price of  80000 euros.";
			}
		}
		else if(carName.equals("Porche")) {
			if(carModel.equals("P7")) {
				this.carPrice="Porche P7 has price of 90000 euros.";
			}
			else if(carModel.equals("P5")) {
				this.carPrice="Porce P5 has price of 70000 euros.";
			}
		}
		else if(carName.equals("Ferrari")) {
			if(carModel.equals("F6")) {
				this.carPrice="Ferrari F6 has price of 85000 euros.";
			}
			else if(carModel.equals("F9")) {
				this.carPrice="Ferrari F9 has price of 65000 euros.";
			}
		}
		return this.carPrice;
	}
	public String insuranceMoney() {
		if(carName.equals("Audi")) {
			if(carModel.equals("A4")) {
				this.insuranceMoney="Audi A4 has insurance price of 10000 euros.";
			}
			else if(carModel.equals("A3")) {
				this.insuranceMoney="Audi A3 has insurance price of 8000 euros.";
			}
		}
		else if(carName.equals("Porche")) {
			if(carModel.equals("P7")) {
				this.insuranceMoney="Porche P7 has insurance price of 9000 euros.";
			}
			else if(carModel.equals("P5")) {
				this.insuranceMoney="Porche P5 has insurance price of 7000 euros.";
			}
		}
		else if(carName.equals("Ferrari")) {
			if(carModel.equals("F6")) {
				this.insuranceMoney="Ferrari F6 has insurance price of 8500 euros.";
			}
			else if(carModel.equals("F9")) {
				this.insuranceMoney="Ferrari F9 has insurance price of 6500 euros.";
			}
		}
		return this.insuranceMoney;
	}
	public String discountPrice() {
		return ("20% discount on all these Luxury cars.");
	}
	public String taxMoney() {
		if(carName.equals("Audi")) {
			if(carModel.equals("A4")) {
				this.taxMoney="Audi A4 has tax price of 100 euros.";
			}
			else if(carModel.equals("A3")) {
				this.taxMoney="Audi A3 has tax price of 80 euros.";
			}
		}
		else if(carName.equals("Porche")) {
			if(carModel.equals("P7")) {
				this.taxMoney="Porche P7 has tax price of 90 euros.";
			}
			else if(carModel.equals("P5")) {
				this.taxMoney="Porche P5 has tax price of 70 euros.";
			}
		}
		else if(carName.equals("Ferrari")) {
			if(carModel.equals("F6")) {
				this.taxMoney="Ferrari F6 has tax price of 85 euros.";
			}
			else if(carModel.equals("F9")) {
				this.taxMoney="Ferrari F9 has tax price of 65 euros.";
			}
		}
		return this.taxMoney;
	}
	
	public String totalSeats() {
		if(carName.equals("Audi")) {
			if(carModel.equals("A4")) {
				this.totalSeats="Audi A4 has 5 seats.";
			}
			else if(carModel.equals("A3")) {
				this.totalSeats="Audi A3 has 4 seats.";
			}
		}
		else if(carName.equals("Porche")) {
			if(carModel.equals("P7")) {
				this.totalSeats="Porche P7 has 4 seats.";
			}
			else if(carModel.equals("P5")) {
				this.totalSeats="Porche P5 has 4 seats.";
			}
		}
		else if(carName.equals("Ferrari")) {
			if(carModel.equals("F6")) {
				this.totalSeats="Ferrari F6 has 2 seats.";
			}
			else if(carModel.equals("F9")) {
				this.totalSeats="Ferrari F9 has 4 seats";
			}
		}
		return this.totalSeats;
	}
	public String SpareWheel() {
		

		if(carName.equals("Audi")) {
			if(carModel.equals("A4")) {
				return "Yes, Spare Wheel is available";
			}
			else if(carModel.equals("A3")) {
				return "No, Spare Wheel is not available";
			}
		}
		else if(carName.equals("Porche")) {
			if(carModel.equals("P7")) {
				return "Yes, Spare Wheel is available";
			}
			else if(carModel.equals("P5")) {
				return "No, Spare Wheel is not available";
			}
		}
		else if(carName.equals("Ferrari")) {
			if(carModel.equals("F6")) {
				return "Yes, Spare Wheel is available";
			}
			else if(carModel.equals("F9")) {
				return "No, Spare Wheel is not available";
			}
		}
		return "";
	}
	
	public String CarMode() {

		if(carName.equals("Audi")) {
			if(carModel.equals("A4")) {
				return "Audi A4 is automatic.";
			}
			else if(carModel.equals("A3")) {
				return "Audi A3 is manual.";
			}
		}
		else if(carName.equals("Porche")) {
			if(carModel.equals("P7")) {
				return "Porche P7 is automatic.";
			}
			else if(carModel.equals("P5")) {
				return "Porche P5 is manual.";
			}
		}
		else if(carName.equals("Ferrari")) {
			if(carModel.equals("F6")) {
				return "Ferrari F6 is automatic.";
			}
			else if(carModel.equals("F9")) {
				return "Ferrari F9 is manual.";
			}
		}
		return "";
	}
	public String gearCount() {

		if(carName.equals("Audi")) {
			if(carModel.equals("A4")) {
				return "Audi A4 has 7 gears.";
			}
			else if(carModel.equals("A3")) {
				return "Audi A3 has 6 gears.";
			}
		}
		else if(carName.equals("Porche")) {
			if(carModel.equals("P7")) {
				return "Porche P7 has 7 gears.";
			}
			else if(carModel.equals("P5")) {
				return "Porche P5 has 6 gears.";
			}
		}
		else if(carName.equals("Ferrari")) {
			if(carModel.equals("F6")) {
				return "Ferrari F6 has 7 gears.";
			}
			else if(carModel.equals("F9")) {
				return "Ferrari F9 has 6 gears.";
			}
		}
		return "";
	}
	
	public class Engine{
		int TopSpeed=0;
		int HorsePower=0;
		String EngineType;
		Engine(){
			
		}
		void displayEngine() {
			System.out.println(cars.carName + " " + cars.carModel + " " + "has following Engine Specifications: " );
			System.out.println("Horsepower= " + this.HorsePower);
			System.out.println("Top Speed= " + this.TopSpeed);
			System.out.println("Engine Type= " + this.EngineType);
		}
		void setEngine() {
			if(cars.carName.equals("Audi")) {
				if(cars.carModel.equals("A4")) {
					this.HorsePower=250;
					this.TopSpeed=300;
					this.EngineType="Bigger";
				}
				else {
					this.HorsePower=150;
					this.TopSpeed=170;
					this.EngineType="Smaller";
				}
			}
			else if (cars.carName.equals("Porche")) {
				if(cars.carModel.equals("P7")) {
					this.HorsePower=260;
					this.TopSpeed=220;
					this.EngineType="Bigger";
				}
				else{
					this.HorsePower=180;
					this.TopSpeed=160;
					this.EngineType="Smaller";
				}
			}
			else {
				if(cars.carModel.equals("F6")) {
					this.HorsePower=280;
					this.TopSpeed=230;
					this.EngineType="Bigger";
				}
				else{
					this.HorsePower=150;
					this.TopSpeed=140;
					this.EngineType="Smaller";
				}
			}	
		}
		double getPrice() {
			return 100000.00;
		}
		int getTopSpeed() {
			return TopSpeed;
		}
		int getHorsePower() {
			return HorsePower;
		}
		String getCarModel() {
			return carModel;
		}
		String getEngineType() {
			return EngineType;
		}
	}

	static public class colors{
		String color;
		void displayColors() {
			System.out.println(color);
		}
		void setColorsOfCar() {
			if(carName.equals("Audi")) {
				if(carModel.equals("A4")) {
					this.color="Audi A4 has red,black and white colors.";
				}
				else{
					this.color="Audi A3 has red,black and yellow colors.";
				}
			}
			else if(carName.equals("Porche")) {
				if(carModel.equals("P7")) {
					this.color="Porche P7 has blue,black and white colors.";
				}
				else{
					this.color="Porche P5 has red,grey and white colors.";
				}
			}
			else {
				if(carModel.equals("F6")) {
					this.color="Ferrari F6 has red,yellow and white colors.";
				}
				else{
					this.color="Ferrari F9 has red,black and brown colors.";
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int choose=0;
		String checkCar="";
		String checkModel="";
		Scanner reader=new Scanner(System.in);
		System.out.println("Welcome to Wasif's Luxury Car Dealership");
		System.out.println("We have these three cars available. You can pick any.");
		System.out.println("1. Audi");
		System.out.println("2. Porche");
		System.out.println("3. Ferrari");
		try {
		checkCar= reader.next();
		choose=Integer.parseInt(checkCar);
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException: You have to specify the option with a given number.");
			System.exit(0);
		}
		if(checkCar.equals("1")) {
			carName="Audi";
		}
		else if(checkCar.equals("2")) {
			carName="Porche";
		}
		else if(checkCar.equals("3")){
			carName="Ferrari";
		}
		else {
			System.out.println("Invalid option. Try again!!!");
			System.exit(0);
		}
		if(carName.equals("Audi")) {
			System.out.println("Choose the model now.");
			System.out.println("1.Audi A4");
			System.out.println("2.Audi A3");
		}
		else if(carName.equals("Porche")) {
			System.out.println("Choose the model now.");
			System.out.println("1.Porche P7");
			System.out.println("2.Porche P5");
		}
		else{
			System.out.println("Choose the model now.");
			System.out.println("1.Ferrari F6");
			System.out.println("2.Ferrari F9");
		}
		try {
			checkModel= reader.next();
			choose=Integer.parseInt(checkModel);
			}catch(NumberFormatException e) {
				System.out.println("NumberFormatException: You have to specify the option with a given number.");
				System.exit(0);
			}
			if(!(checkModel.equals("1") || checkModel.equals("2"))) {
				System.out.println("Invalid option.Try again!!!");
				System.exit(0);
			}
			
			if(carName.equals("Audi")) {
				if(checkModel.equals("1")) {
					carModel="A4";
				}
				else {
					carModel="A3";
				}
			}
			else if(carName.equals("Porche")) {
				if(checkModel.equals("1")) {
					carModel="P7";
				}
				else {
					carModel="P5";
				}
			}
			else {
				if(checkModel.equals("1")) {
					carModel="F6";
				}
				else {
					carModel="F9";
				}
			}
		
		cars car=new cars(carName,carModel);
		System.out.println("-------Common property defined commonly in All these three Cars----------");
		System.out.println("-------Non-abstract methods of Abstract class-------");
		System.out.println(car.CheckAC());
		System.out.println(car.wheel());
		System.out.println(car.RadioFacility());
		System.out.println(car.Insurance());
		System.out.println("-------Own property defined in this Cars class------------");
		System.out.println(car.discountPrice());
		System.out.println(cars.showSignature());
		System.out.println("");
		
		
		System.out.println("-------Abstract Methods of Abstract Class-------");
		System.out.println(car.SpareWheel());
		System.out.println(car.CarMode());
		System.out.println("");
		
		System.out.println("-------Methods of Specifications Interface-------");
		System.out.println(car.totalSeats());
		System.out.println(car.gearCount());
		System.out.println("");
		
		System.out.println("-------Methods of Transactions Interface-------");
		System.out.println(car.carPrice());
		System.out.println(car.insuranceMoney());
		System.out.println(car.taxMoney());
		System.out.println("");
		
		System.out.println("-------Methods of Non-Static Inner Class-------");
		cars.Engine carEngine=car.new Engine();
		carEngine.setEngine();
		carEngine.displayEngine();
		System.out.println("");
		
		System.out.println("-------Methods of Static Nested Class-------");
		cars.colors carColors= new cars.colors();
		carColors.setColorsOfCar();
		carColors.displayColors();
		System.out.println("");
		
		reader.close();
	}
}
