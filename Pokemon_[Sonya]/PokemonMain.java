package class0216practice;

import java.util.Arrays;

//This is a Driver Class
public class PokemonMain {
	public static void main(String[] args) {
//		Pokemon pickachu = new Pokemon("Pikachu", "Yellow", true);
//		Pokemon charmander = new Pokemon("Charmander", "Red");
		//Pokemon defaultPokemon = new Pokemon();
		// Will print "I am a Pokemon: Pikachu : Yellow : true"
//		System.out.println(pickachu.toString());
		// Will print "I am a Pokemon: Charmander : Red : false"
//		System.out.println(charmander.toString());
		//System.out.println(defaultPokemon.toString());
//		pickachu.setColor("Orange");    
//		System.out.println(pickachu.getColor());    
//		System.out.println(pickachu.toString());

		//Instantiate 2 child classes
		WaterPokemon wp = new WaterPokemon("Agua", "Blue", "110lb", "5ft");
		System.out.println(wp.toString());
		ThunderPokemon tp = new ThunderPokemon("Pikachu", "Yellow", "128lb", "5ft 9in");
		System.out.println(tp.toString());
		//Run the child specific methods
		wp.ShootWater();
		tp.ShootThunder();
		//Try running the private method of parent class
		tp.setName("Pikachu");
		System.out.println(tp.getName());
		//Instead instantiate 2 child classes and give the type of the parent
		Pokemon pokemon = new WaterPokemon("Agua", "Blue", "110lb", "5ft");
		System.out.println(pokemon.toString());
		Pokemon pokemon2= new ThunderPokemon("Pikachu", "Yellow", "128lb", "5ft 9in");
		System.out.println(pokemon2.toString());
//		//Now try running the private method of the parent class
		tp.setName("Pikachu");
		System.out.println(tp.getName());
		
		//in-class0218
		Pokemon pk1 = new WaterPokemon("Agua", "Blue", "110lb", "5ft"); pk1.move("move");
		Pokemon p1 = new WaterPokemon("Agua", "Blue", "110lb", "5ft");
		WaterPokemon p2 = new WaterPokemon("Agua", "Blue", "110lb", "5ft");
//		System.out.println("p1.equals(p2) = " + p1.equals(p2));
//		System.out.println("p2.equals(p1) = " + p2.equals(p1));
		
		// running the implemented methods for abstract in-class exercise
		//
//		p1.move();
//		p2.speak();
		
		//Implement Driver that instantiates 4 Pokemon objects , sorts them using Arrays.sort(), and prints them.
		Pokemon[] pokemons = new Pokemon [4];
		pokemons[0] = new Pokemon("Pikachu", "Yellow", true, 100);
		pokemons[1] = new Pokemon("Charmander", "Red", true, 98);
		pokemons[2] = new Pokemon("Bulbasaur", "Green", true, 152);
		pokemons[3] = new Pokemon("Squirtle", "Blue", true, 200);
		Arrays.sort(pokemons);
		for (int i = 0; i<pokemons.length; i++) {
			System.out.println(pokemons[i].getName());
			System.out.println(pokemons[i].getWeight());
			
		}
		
		
		
		
		
		
		
	}
	

}
