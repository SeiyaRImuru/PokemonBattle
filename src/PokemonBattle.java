
/**
 * The programming project for this segment is to program
 * a “starter” Pokémon battle sequence. This is a somewhat 
 * open-ended assignment, you may submit a basic 
 * program that runs 1 or 2 interactions, or a complete battle sequence. 
 * 
 * @author Mr. Rasmussen
 */

import java.util.*;

public class PokemonBattle {
	/*
	 * EXERCISE 1 Write a method called battleStart() that introduces the battle,
	 * prompts the user to choose their first. Pokemon to battle, and outputs the
	 * pairing. battleStart() should also return the name of the Pokemon chosen.
	 */

	/*
	 * EXERCISE 2 Write a method called damage() that takes a Pokemon’s name as a
	 * parameter and returns the about of HP after damage has been done. damage()
	 * should prompt the user for their base stats in order to calculate damage.
	 */

	/*
	 * EXERCISE 3 Write a method called statsTable() that accepts the user’s Pokemon
	 * name, stats and learned moves as parameters, and outputs the result in a
	 * table.
	 */

	public static void main(String[] args) {
		String name = battleStart();
		List<Double> stats = damage(name);
		statsTable(stats, name);
		/*
		 * Call the methods from the exercises here.
		 */
	}

	public static String battleStart() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"    Another trainer is issuing a challenge!\n\n    Zebstrika appeared.\n\n    Which Pokémon do you choose? ");
		String name = input.nextLine();
		System.out.println(
				"\n    You chose " + name + "!\n\n    It’s a Pokémon battle between " + name + " and Zebstrika! Go!");
		return name;
	}

	public static List<Double> damage(String name) {
		List<Double> stats = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		System.out
				.println("input your pokemon's level, attack, defense, base, STAB (same type attack bonus), and hp: ");
		System.out.println("Level: ");
		double level = input.nextDouble();
		System.out.println("Attack: ");
		double attack = input.nextDouble();
		System.out.println("Defense: ");
		double defense = input.nextDouble();
		System.out.println("Base: ");
		double base = input.nextDouble();
		System.out.println("STAB: ");
		double stab = input.nextDouble();
		System.out.println("HP: ");
		double hp = input.nextDouble();
		double random = 0.85;
		double modifier = stab + random;
		double damage = (((2 * level + 10) / 250) + (attack / defense) * base + 2) * modifier;
		System.out
				.println(name + " sustained " + damage + " points damage. HP, after damage, are now " + (hp - damage));
		stats.add(0, level);
		stats.add(1, attack);
		stats.add(2, defense);
		stats.add(3, base);
		stats.add(4, stab);
		stats.add(5, hp);
		return stats;
	}

	public static void statsTable(List<Double> stats, String name) {
		Scanner input = new Scanner(System.in);
		double level = stats.get(0);
		double atk = stats.get(1);
		double def = stats.get(2);
		double hp = stats.get(5);
		System.out.println("Please input some more information.");
		System.out.println("Special Attack: ");
		double spa = input.nextDouble();
		System.out.println("Special Defense: ");
		double spd = input.nextDouble();
		System.out.println("Speed:");
		double agi = input.nextDouble();
		List<String> moves = new ArrayList<String>();
		int x = 0;
		while (x <= 4) {
			System.out.println("Please input some moves(" + (4 - x) + " slots left): ");
			String move = input.nextLine();
			moves.add(x, move);
			x++;
		}
		System.out.println("Name		" + name);
		System.out.println("Level		" + level);
		System.out.println("-------------------------");
		System.out.println("HP			" + hp);
		System.out.println("ATTACK		" + atk);
		System.out.println("DEFENSE		" + def);
		System.out.println("SP. ATK		" + spa);
		System.out.println("SP. DEF		" + spd);
		System.out.println("SPEED		" + agi);
		System.out.println("-------------------------");
		System.out.println(
				"Moves Learned: " + moves.get(1) + " " + moves.get(2) + " " + moves.get(3) + " " + moves.get(4));

	}
}
