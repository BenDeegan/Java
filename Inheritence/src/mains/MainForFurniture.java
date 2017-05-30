package mains;

import classes.Bed;
import classes.Chair;
import classes.Furniture;
import classes.Table;

public class MainForFurniture {
	public static void main(String[] args) {
		Furniture f1 = new Furniture();
		Table t1  = new Table(true, Table.Shape.CIRCLE, Table.DARK_OAK, Table.WOOD);
		Bed b1 = new Bed(true, Bed.Size.BUNK, Bed.MAHOGANY, Bed.GLASS);
		Chair c1 = new Chair(true, Chair.Type.STOOL, Chair.LIGHT_OAK, Chair.METAL);
		System.out.println(c1.toString());
		
		
		//System.out.println(c1.toString());
		
		//System.out.println(f1.toString());
		
	}

}
