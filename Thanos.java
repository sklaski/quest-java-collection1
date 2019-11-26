import java.util.*;

public class Thanos {

	public static void main(String[] args) {

		// TODO 1 : Create an empty heroes list

		ArrayList<Hero> heroes = new ArrayList<Hero>(); //define List

		//TODO 2 : Add those heroes to the list
		// name: Black Widow, age: 34
		// name: Captain America, age: 100
		// name: Vision, age: 3
		// name: Iron Man, age: 48
		// name: Scarlet Witch, age: 29
		// name: Thor, age: 1500
		// name: Spider-Man, age: 18
		// name: Hulk, age: 49
		// name: Doctor Strange, age: 42
		heroes.add(new Hero("Black Widows", 34));
		heroes.add(new Hero("Captain America", 100));
		heroes.add(new Hero("Vision", 3));
		heroes.add(new Hero("Iron Man", 48));
		heroes.add(new Hero("Scarlet Witch", 29));
		heroes.add(new Hero("Thor", 1500));
		heroes.add(new Hero("Spider-Man", 18));
		heroes.add(new Hero("Hulk", 49));
		heroes.add(new Hero("Doctor Strange", 42));
				
		// TODO 3 : It's Thor birthday, now he's 1501

//		for (Hero t : heroes) {
//			if (t.getName().contentEquals("Thor")) {
//				t.setAge(t.getAge() + 1); //birthday, age +1 
//				System.out.println(t.getName() + ": " + t.getAge());	
//				break;
//			}
//		}
		heroes.get(heroes.indexOf(new Hero("Thor"))).setAge(heroes.get(heroes.indexOf(new Hero("Thor"))).getAge() + 1 );
		System.out.println(heroes.get(heroes.indexOf(new Hero("Thor"))).getName() + ": " + heroes.get(heroes.indexOf(new Hero("Thor"))).getAge());
		

		// TODO 4 : Shuffle the heroes list
		Collections.shuffle(heroes);
		System.out.println("Shuffled: " + heroes.size() + " elements");
		System.out.println(heroes);

		// TODO 5 : Keep only the half of the list
		List<Hero> reducedHeroes = heroes.subList(0, heroes.size() / 2);
		System.out.println("Reduced: " + reducedHeroes.size() + " elements");
		System.out.println(reducedHeroes);
		

		// TODO 6 : Loop throught the list and display the name of the remaining heroes
		for (Hero h : reducedHeroes) {
			System.out.println(h.getName() + ": " + h.getAge());
		}
	}
}
