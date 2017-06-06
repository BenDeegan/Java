package testing;

public class Testing2 {
	public static void main(String[] args) {
		String todaysMenu = "Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
		String regex = "Wednesday";
		String str = "Jelly and ice cream for dessert";
//		todaysMenu.replaceFirst(regex, "Thursday");
//		System.out.println(todaysMenu.replaceFirst(regex, "Thursday").replace("turkey", "beef").concat(str));
		//Using Stringbuilder
		
		StringBuilder menu = new StringBuilder(todaysMenu);
		//System.out.println(menu.replace(0, 9, "Thursday").replace(23, 29, "Beef"));
		String s = menu.toString();
		s = s.replaceFirst(regex, "Thursday").replace("turkey", "beef").concat(str);
		menu.append(s);
		menu.delete(0, 87);
		//System.out.println(menu);
		
		char [] arr = todaysMenu.toCharArray();
		int size = arr.length;
		for (int i = size -1; i >= 0; i--) {
			char c = arr[i];
			System.out.print(c);
		}
	}

}
