package pl.lodz.uni.math;

import pl.lodz.uni.math.Package.typeOfPackage;

public class MainStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int x,y,z;
		//System.out.print("Podaj x: ");
		x=3;
		y=3;
		z=4;
		Qube kostka= Qube.getInstance(x,y,z);
		Package p1=new Package("1",1,"TOYS");
		Package p2=new Package("2",2,"TOYS");
		Package p3=new Package("3",1,"FOOD");
		
		kostka.createSlots();
		kostka.addPackages(p1,x,y);
		kostka.addPackages(p2,x,y);
		kostka.addPackages(p3,x,y);
		
		kostka.showPackages();
		
		kostka.getPackageByType(typeOfPackage.TOYS);
		kostka.getPackageByNumber("1");
		
		
		kostka.showPackages();
		kostka.showHistoryOfMoves();
	}

}
