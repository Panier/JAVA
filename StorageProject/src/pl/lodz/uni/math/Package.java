package pl.lodz.uni.math;

import java.util.Date;

public class Package {
	public
	int priority,  movesCount;
	String number;
	typeOfPackage opis;
	Date data;
	public enum typeOfPackage{
		TOYS,CARPARTS,GUNS,FOOD
	}

	Package (String _number,int _priority, String _opis)
	{

		this.opis=typeOfPackage.valueOf(_opis);
		this.priority=_priority;
		this.number=_number;
		movesCount=0;
		data = new Date();
	}
	
	public void setMovesCount(){
		movesCount++;
	}
	
}
