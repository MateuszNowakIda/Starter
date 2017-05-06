package pl.mationcode.catbase.model;

public class Test {

	public static void main(String[] args) {
		Cat ct= new Cat();
		System.out.print("Podaj imiê kota: ");
		String catname = Cat.getUserInput();
		ct.setName(catname);
		System.out.print("Podaj imiê Wlasciciela: ");
		String ownerName = Cat.getUserInput();
		ct.setOwnerName(ownerName);
		System.out.println(ct.getName());
		System.out.println(ct.getOwnerName());
	}
	

}
