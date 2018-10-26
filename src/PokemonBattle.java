import java.util.*;

public class PokemonBattle {

	public static void main(String[] args) {
		String name = battleStart();
		List<Double> stats = damage(name);
		statsTable(stats, name);
	}

	// input name, print dialogue, return name
	public static String battleStart() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"    Another trainer is issuing a challenge!\n\n    Zebstrika appeared.\n\n    Which Pokémon do you choose? ");
		String name = input.nextLine();
		System.out.println(
				"\n    You chose " + name + "!\n\n    It’s a Pokémon battle between " + name + " and Zebstrika! Go!");
		return name;
	}

	// take in name, create lists, calculate and print damage dialogue, return stats
	// list
	public static List<Double> damage(String name) {
		List<String> statlist = Arrays.asList("Level", "Attack", "Defense", "Base", "STAB", "HP");
		List<Double> stats = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		System.out.println("input your pokemon's stats: ");
		for (int x = 1; x <= statlist.size(); x++) {
			System.out.println(statlist.get(x - 1) + ": ");
			double value = input.nextDouble();
			stats.add(x - 1, value);
		}
		/*
		 * 0: level, 1: attack, 2: defense, 3: base, 4: stab, 5: HP.
		 */
		Random randommodifier = new Random();
		double random = (85 + randommodifier.nextInt(15)) / 100.0;
		double modifier = stats.get(4) + random;
		// modifier = stab + random value
		double damage = (((2 * stats.get(0) + 10) / 250) + (stats.get(1) / stats.get(2)) * stats.get(3) + 2) * modifier;
		// damage = (((level + 10) / 250) + (attack / defense) * base + 2) * modifier
		System.out.println(
				name + " sustained " + damage + " points damage. HP, after damage, is now " + (stats.get(5) - damage));
		// hp - damage = remaining health
		return stats;
	}

	// take in some missing input and print a stats table
	public static void statsTable(List<Double> stats, String name) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input some more information.");
		List<String> statlist = Arrays.asList("Special Attack", "Special Defense", "Speed");
		System.out.println("input your pokemon's stats: ");
		for (int x = 6; x <= statlist.size() + 5; x++) {
			System.out.println(statlist.get(x - 6) + ": ");
			double value = input.nextDouble();
			stats.add(x, value);
		}
		@SuppressWarnings("unused")
		String throwaway = input.nextLine();
		List<String> moves = new ArrayList<String>();
		for (int x = 0; x < 4; x++) {
			System.out.println("Please input some moves(" + (4 - x) + " slots left): ");
			String move = input.nextLine();
			moves.add(x, move);
		}
		System.out.println("Name		" + name);
		System.out.println("Level		" + stats.get(0));
		// Level
		System.out.println("-------------------------");
		System.out.println("HP		" + stats.get(5));
		// HP
		System.out.println("ATTACK		" + stats.get(1));
		// Attack
		System.out.println("DEFENSE		" + stats.get(2));
		// Defense
		System.out.println("SP. ATK		" + stats.get(6));
		System.out.println("SP. DEF		" + stats.get(7));
		System.out.println("SPEED		" + stats.get(8));
		System.out.println("-------------------------");
		System.out.println("Moves Learned: " + moves);

	}
}