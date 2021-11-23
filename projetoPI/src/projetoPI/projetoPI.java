package projetoPI;

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class projetoPI {

	// String itemName[] = { "", "elvenBread", "healthPotion", "knowlegdeGrimoire",
	// "cannyBoots", "imortalsRosary" "horacleHourglass", "staffOfDestruction",
	// "clairvoyantEye", "familyRing" };

	// Verificador do item que será recebido.
	public static String verifyItem(String itemGained) {

		Random generation = new Random();

		int c = generation.nextInt(9);

		System.out.println(c);

		switch (c) {

		case 0:

			itemGained = "elvenBread";

			break;

		case 1:

			itemGained = "healthPotion";

			break;
		case 2:

			itemGained = "mithrilTunic";

			break;

		case 3:

			itemGained = "knowlegdeGrimoire";

			break;

		case 4:

			itemGained = "cannyBoots";

			break;

		case 5:

			itemGained = "imortalsRosary";

			break;

		case 6:

			itemGained = "horacleHourglass";

			break;

		case 7:

			itemGained = "staffOfDestruction";

			break;

		case 8:

			itemGained = "clairvoyantEye";

			break;

		case 9:

			itemGained = "familyRing";

			break;

		}

		return itemGained;

	}

	// Verificador de status do personagem.
	public static void verifyStatus(int maxHealth, int maxDefense, int maxAttack, int maxDodge) {

		System.out.println("Vida: " + maxHealth);
		System.out.println("Defesa: " + maxDefense);
		System.out.println("Ataque: " + maxAttack);
		System.out.println("Esquiva: " + maxDodge);

	}

	// Itens de status simples (Não testado ainda).
	public static int verifyItemStatus(String itemGained) {

		int health = 0;

		System.out.println(itemGained);

		switch (itemGained) {

		case "elvenBread":

			health = 5;

			break;
		default:

			health = 0;

			break;

		}

		System.out.println(health);

		return health;

	}

	public static int verifyItem2Status(String itemGained) {

		int health = 0;

		switch (itemGained) {

		case "healthPotion":

			health = 20;

			break;
		default:

			health = 0;

			break;

		}

		return health;

	}

	public static int verifyItem3Status(String itemGained) {

		int defense = 0;

		switch (itemGained) {

		case "mithrilTunic":

			defense = 10;

			break;
		default:

			defense = 0;

			break;
		}

		return defense;

	}

	public static int verifyItem4Status(String itemGained) {

		int defense = 0;

		switch (itemGained) {

		case "knowlegdeGrimoire":

			defense = 5;

			break;
		default:

			defense = 0;

			break;
		}

		return defense;

	}

	public static int verifyItem5Status(String itemGained) {

		int dodge = 0;

		switch (itemGained) {

		case "cannyBoots":

			dodge = 5;

			break;
		default:

			dodge = 0;

			break;
		}

		return dodge;

	}

	public static int verifyItem6Status(String itemGained) {

		int attack = 0;

		switch (itemGained) {

		case "staffOfDestruction":

			attack = 50;

			break;
		default:

			attack = 0;

			break;
		}

		return attack;

	}

	// Item que ressuscita o personagem (Não testado ainda).
	public static int imortalsRosary(String itemGained, int maxHealth) {

		int health = 0;

		if (itemGained.equals("imortalsRosary")) {

			if (maxHealth <= 0) {

				health = 30;

			}

		}

		return health;

	}

	// Possibilidade para randomificar as questões entre algumas.
	public static int question1(int health) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println(
					"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

			String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "1 1110 1001", answer1;

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest1[urn.get(Count[0])]);
			System.out.println("b) " + Quest1[urn.get(Count[1])]);
			System.out.println("c) " + Quest1[urn.get(Count[2])]);
			System.out.println("d) " + Quest1[urn.get(Count[3])]);
			System.out.println("e) " + Quest1[urn.get(Count[4])]);

			answer1 = input.next();

			switch (answer1) {

			case "a":
			case "A":

				if (correct1.equals(Quest1[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

			String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "110111", answer2;

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest2[urn.get(Count[0])]);
			System.out.println("b) " + Quest2[urn.get(Count[1])]);
			System.out.println("c) " + Quest2[urn.get(Count[2])]);
			System.out.println("d) " + Quest2[urn.get(Count[3])]);
			System.out.println("e) " + Quest2[urn.get(Count[4])]);

			answer2 = input.next();

			switch (answer2) {

			case "a":
			case "A":

				if (correct2.equals(Quest2[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
					+ "resultado de x² . x³:\n");

			String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "x^5", answer3;

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest3[urn.get(Count[0])]);
			System.out.println("b) " + Quest3[urn.get(Count[1])]);
			System.out.println("c) " + Quest3[urn.get(Count[2])]);
			System.out.println("d) " + Quest3[urn.get(Count[3])]);
			System.out.println("e) " + Quest3[urn.get(Count[4])]);

			answer3 = input.next();

			switch (answer3) {

			case "a":
			case "A":

				if (correct3.equals(Quest3[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			}

		}

		return health;

	}

	public static int question2(int health) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println(
					"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

			String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "1 1110 1001", answer4;

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest1[urn.get(Count[0])]);
			System.out.println("b) " + Quest1[urn.get(Count[1])]);
			System.out.println("c) " + Quest1[urn.get(Count[2])]);
			System.out.println("d) " + Quest1[urn.get(Count[3])]);
			System.out.println("e) " + Quest1[urn.get(Count[4])]);

			answer4 = input.next();

			switch (answer4) {

			case "a":
			case "A":

				if (correct1.equals(Quest1[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Escolha o sucessor do numero binario 110110(54):\n");

			String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "110111", answer5 = "";

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest2[urn.get(Count[0])]);
			System.out.println("b) " + Quest2[urn.get(Count[1])]);
			System.out.println("c) " + Quest2[urn.get(Count[2])]);
			System.out.println("d) " + Quest2[urn.get(Count[3])]);
			System.out.println("e) " + Quest2[urn.get(Count[4])]);

			answer5 = input.next();

			switch (answer5) {

			case "a":
			case "A":

				if (correct2.equals(Quest2[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
					+ "resultado de x² . x³:\n");

			String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "x^5", answer6 = "";

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest3[urn.get(Count[0])]);
			System.out.println("b) " + Quest3[urn.get(Count[1])]);
			System.out.println("c) " + Quest3[urn.get(Count[2])]);
			System.out.println("d) " + Quest3[urn.get(Count[3])]);
			System.out.println("e) " + Quest3[urn.get(Count[4])]);

			answer6 = input.next();

			switch (answer6) {

			case "a":
			case "A":

				if (correct3.equals(Quest3[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 5;

				}

				break;

			}

		}

		return health;

	}

	public static int question3(int health) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a;

		a = generation.nextInt(3);

		if (a == 0) {

			System.out.println(
					"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

			String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "1 1110 1001", answer7 = "";

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest1[urn.get(Count[0])]);
			System.out.println("b) " + Quest1[urn.get(Count[1])]);
			System.out.println("c) " + Quest1[urn.get(Count[2])]);
			System.out.println("d) " + Quest1[urn.get(Count[3])]);
			System.out.println("e) " + Quest1[urn.get(Count[4])]);

			answer7 = input.nextLine();

			switch (answer7) {

			case "a":
			case "A":

				if (correct1.equals(Quest1[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

			String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "110111", answer8 = "";

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest2[urn.get(Count[0])]);
			System.out.println("b) " + Quest2[urn.get(Count[1])]);
			System.out.println("c) " + Quest2[urn.get(Count[2])]);
			System.out.println("d) " + Quest2[urn.get(Count[3])]);
			System.out.println("e) " + Quest2[urn.get(Count[4])]);

			answer8 = input.nextLine();

			switch (answer8) {

			case "a":
			case "A":

				if (correct2.equals(Quest2[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
					+ "resultado de x² . x³:\n");

			String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "x^5", answer9 = "";

			// Estrutura de mistura de alternativas.

			urn.add(Count[0]);
			urn.add(Count[1]);
			urn.add(Count[2]);
			urn.add(Count[3]);
			urn.add(Count[4]);

			Collections.shuffle(urn);

			System.out.println("a) " + Quest3[urn.get(Count[0])]);
			System.out.println("b) " + Quest3[urn.get(Count[1])]);
			System.out.println("c) " + Quest3[urn.get(Count[2])]);
			System.out.println("d) " + Quest3[urn.get(Count[3])]);
			System.out.println("e) " + Quest3[urn.get(Count[4])]);

			answer9 = input.nextLine();

			switch (answer9) {

			case "a":
			case "A":

				if (correct3.equals(Quest3[urn.get(Count[0])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = 10;

				}

				break;

			}

		}

		return health;

	}

	public static int question4(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);
					System.out.println("d) " + Quest1[urn.get(Count[3])]);
					System.out.println("e) " + Quest1[urn.get(Count[4])]);

				}

				answer1 = input.next();

				switch (answer1) {

				case "a":
				case "A":

					if (correct1.equals(Quest1[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

				String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "110111", answer2 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com o item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);
					System.out.println("d) " + Quest2[urn.get(Count[3])]);
					System.out.println("e) " + Quest2[urn.get(Count[4])]);

				}

				answer2 = input.next();

				switch (answer2) {

				case "a":
				case "A":

					if (correct2.equals(Quest2[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 2) {

				System.out
						.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x² . x³:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "x^5", answer3 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);
					System.out.println("d) " + Quest3[urn.get(Count[3])]);
					System.out.println("e) " + Quest3[urn.get(Count[4])]);

				}

				answer3 = input.next();

				switch (answer3) {

				case "a":
				case "A":

					if (correct3.equals(Quest3[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			}

		} while (correct == true && !(clock == 2));

		return health;

	}

	public static int question5(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);
					System.out.println("d) " + Quest1[urn.get(Count[3])]);
					System.out.println("e) " + Quest1[urn.get(Count[4])]);

				}

				answer1 = input.next();

				switch (answer1) {

				case "a":
				case "A":

					if (correct1.equals(Quest1[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

				String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "110111", answer2 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com o item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);
					System.out.println("d) " + Quest2[urn.get(Count[3])]);
					System.out.println("e) " + Quest2[urn.get(Count[4])]);

				}

				answer2 = input.next();

				switch (answer2) {

				case "a":
				case "A":

					if (correct2.equals(Quest2[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 2) {

				System.out
						.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x² . x³:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "x^5", answer3 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);
					System.out.println("d) " + Quest3[urn.get(Count[3])]);
					System.out.println("e) " + Quest3[urn.get(Count[4])]);

				}

				answer3 = input.next();

				switch (answer3) {

				case "a":
				case "A":

					if (correct3.equals(Quest3[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			}

		} while (correct == true && !(clock == 2));

		return health;

	}

	public static int question6(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);
					System.out.println("d) " + Quest1[urn.get(Count[3])]);
					System.out.println("e) " + Quest1[urn.get(Count[4])]);

				}

				answer1 = input.next();

				switch (answer1) {

				case "a":
				case "A":

					if (correct1.equals(Quest1[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

				String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "110111", answer2 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com o item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);
					System.out.println("d) " + Quest2[urn.get(Count[3])]);
					System.out.println("e) " + Quest2[urn.get(Count[4])]);

				}

				answer2 = input.next();

				switch (answer2) {

				case "a":
				case "A":

					if (correct2.equals(Quest2[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 2) {

				System.out
						.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x² . x³:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "x^5", answer3 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);
					System.out.println("d) " + Quest3[urn.get(Count[3])]);
					System.out.println("e) " + Quest3[urn.get(Count[4])]);

				}

				answer3 = input.next();

				switch (answer3) {

				case "a":
				case "A":

					if (correct3.equals(Quest3[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			}

		} while (correct == true && !(clock == 2));

		return health;

	}

	public static int question7(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);
					System.out.println("d) " + Quest1[urn.get(Count[3])]);
					System.out.println("e) " + Quest1[urn.get(Count[4])]);

				}

				answer1 = input.next();

				switch (answer1) {

				case "a":
				case "A":

					if (correct1.equals(Quest1[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

				String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "110111", answer2 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com o item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);
					System.out.println("d) " + Quest2[urn.get(Count[3])]);
					System.out.println("e) " + Quest2[urn.get(Count[4])]);

				}

				answer2 = input.next();

				switch (answer2) {

				case "a":
				case "A":

					if (correct2.equals(Quest2[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 2) {

				System.out
						.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x² . x³:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "x^5", answer3 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);
					System.out.println("d) " + Quest3[urn.get(Count[3])]);
					System.out.println("e) " + Quest3[urn.get(Count[4])]);

				}

				answer3 = input.next();

				switch (answer3) {

				case "a":
				case "A":

					if (correct3.equals(Quest3[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			}

		} while (correct == true && !(clock == 2));

		return health;

	}

	public static int question8(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);
					System.out.println("d) " + Quest1[urn.get(Count[3])]);
					System.out.println("e) " + Quest1[urn.get(Count[4])]);

				}

				answer1 = input.next();

				switch (answer1) {

				case "a":
				case "A":

					if (correct1.equals(Quest1[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

				String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "110111", answer2 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com o item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);
					System.out.println("d) " + Quest2[urn.get(Count[3])]);
					System.out.println("e) " + Quest2[urn.get(Count[4])]);

				}

				answer2 = input.next();

				switch (answer2) {

				case "a":
				case "A":

					if (correct2.equals(Quest2[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 2) {

				System.out
						.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x² . x³:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "x^5", answer3 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);
					System.out.println("d) " + Quest3[urn.get(Count[3])]);
					System.out.println("e) " + Quest3[urn.get(Count[4])]);

				}

				answer3 = input.next();

				switch (answer3) {

				case "a":
				case "A":

					if (correct3.equals(Quest3[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			}

		} while (correct == true && !(clock == 2));

		return health;

	}

	public static int question9(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);
					System.out.println("d) " + Quest1[urn.get(Count[3])]);
					System.out.println("e) " + Quest1[urn.get(Count[4])]);

				}

				answer1 = input.next();

				switch (answer1) {

				case "a":
				case "A":

					if (correct1.equals(Quest1[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

				String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "110111", answer2 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com o item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);
					System.out.println("d) " + Quest2[urn.get(Count[3])]);
					System.out.println("e) " + Quest2[urn.get(Count[4])]);

				}

				answer2 = input.next();

				switch (answer2) {

				case "a":
				case "A":

					if (correct2.equals(Quest2[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 2) {

				System.out
						.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x² . x³:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "x^5", answer3 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);
					System.out.println("d) " + Quest3[urn.get(Count[3])]);
					System.out.println("e) " + Quest3[urn.get(Count[4])]);

				}

				answer3 = input.next();

				switch (answer3) {

				case "a":
				case "A":

					if (correct3.equals(Quest3[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			}

		} while (correct == true && !(clock == 2));

		return health;

	}

	public static int question10(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest1[urn.get(Count[0])]);
					System.out.println("b) " + Quest1[urn.get(Count[1])]);
					System.out.println("c) " + Quest1[urn.get(Count[2])]);
					System.out.println("d) " + Quest1[urn.get(Count[3])]);
					System.out.println("e) " + Quest1[urn.get(Count[4])]);

				}

				answer1 = input.next();

				switch (answer1) {

				case "a":
				case "A":

					if (correct1.equals(Quest1[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Escolha o sucessor do numero binarioa 110110(54):\n");

				String Quest2[] = { "110111", "111110", "110100", "111111", "nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "110111", answer2 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com o item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest2[urn.get(Count[0])]);
					System.out.println("b) " + Quest2[urn.get(Count[1])]);
					System.out.println("c) " + Quest2[urn.get(Count[2])]);
					System.out.println("d) " + Quest2[urn.get(Count[3])]);
					System.out.println("e) " + Quest2[urn.get(Count[4])]);

				}

				answer2 = input.next();

				switch (answer2) {

				case "a":
				case "A":

					if (correct2.equals(Quest2[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			} else if (a == 2) {

				System.out
						.println("- Aelin: Vamos testar se você domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x² . x³:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x²+x²", "Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "x^5", answer3 = "";

				if (itemGained.equals("clairvoyantEye")) {

					// Estrutura de mistura de alternativas com item ativo.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);

				} else {

					// Estrutura de mistura de alternativas.

					urn.add(Count[0]);
					urn.add(Count[1]);
					urn.add(Count[2]);
					urn.add(Count[3]);
					urn.add(Count[4]);

					Collections.shuffle(urn);

					System.out.println("a) " + Quest3[urn.get(Count[0])]);
					System.out.println("b) " + Quest3[urn.get(Count[1])]);
					System.out.println("c) " + Quest3[urn.get(Count[2])]);
					System.out.println("d) " + Quest3[urn.get(Count[3])]);
					System.out.println("e) " + Quest3[urn.get(Count[4])]);

				}

				answer3 = input.next();

				switch (answer3) {

				case "a":
				case "A":

					if (correct3.equals(Quest3[urn.get(Count[0])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health = 5;

					}

					break;

				}

			}

		} while (correct == true && !(clock == 2));

		return health;

	}

	public static int verifyItemNum(String itemGained) {

		int num = 0;

		switch (itemGained) {

		case "elvenBread":

			num = 0;

			break;

		case "healthPotion":

			num = 1;

			break;
		case "mithrilTunic":

			num = 2;

			break;

		case "knowlegdeGrimoire":

			num = 3;

			break;

		case "cannyBoots":

			num = 4;

			break;

		case "imortalsRosary":

			num = 5;

			break;

		case "horacleHourglass":

			num = 6;

			break;

		case "staffOfDestruction":

			num = 7;

			break;

		case "clairvoyantEye":

			num = 8;

			break;

		case "familyRing":

			num = 9;

			break;

		}

		return num;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// itens:

		String[] itemName = { "um pão élfico", "uma poção de vida", "uma tunica de mithril",
				"um grimório do conhecimento", "a bota do sagaz", "o rosário do imortal", "a apulheta do horáculo",
				"o cajado da destruição", "o olho da clarividência", "o anel de família" };

		String[] itemStatus = { "Recupera 5 pontos de vida", "Recupera 20 pontos de vida",
				"Diminui em 10 o dano de inimigos", "iminui em 5 o dano de habilidades mal sucedidas",
				"Aumenta a chance de se esquivar de um ataque",
				"Permite que o jogador se levante com 30 de hp caso receba uma ferida mortal",
				"Permite que o jogador tenha uma 2ª tentativa de responder uma questão que errou",
				"Aumenta o dano em 50 de suas mágias de ataque", "Retira duas alternativas da multipla escolha",
				"Uma herança de nossa família, apesar de não dar fazer nada, deixa viva a memória dentro dos nossos corações" };

		int c = 0, num;

		String itemGained = "";

		// jogo:

		int option = 0, repeatLoop = 0;

		// player status:

		int maxHealth = 100, maxDefense = 5, maxAttack = 20, maxDodge = 15;

		// possível alteração nos status:

		int health = 0, defense = 0, attack = 0, dodge = 0, addHealth = 0;

		do {

			System.out.println("Selecione a opção desejada:\n");
			System.out.println("[1] Instruções");
			System.out.println("[2] Jogar");
			System.out.println("[3] Créditos");
			System.out.println("[4] Sair\n");

			option = input.nextInt();
			System.out.println("");

			switch (option) {

			case 1:

				System.out.println("O jogo é baseado em RPG de mesa, o mestre da mesa que chamamos de narrador \n"
						+ "irá guiar a gameplay e de certa maneira controlar o mundo ao redor de Aelin, você deve \n"
						+ "acertar as perguntas para ser bem sucedido nas magias que irá lançar ou pode tomar dano\n"
						+ " de inimigos e dos seus próprios feitiçõs!\n");

				break;

			case 2:

				System.out.println(
						"Em um tempo antigo, cheio de violência e misticismo, os grandes magos de Winterhold \n"
								+ "após dezenas de milhares de anos descobriram uma forma não convencional de magia que \n"
								+ "ultrapassava o poder destrutivo conhecido até o momento. Descobriram que os cálculos \n"
								+ "matemáticos escondiam os feitiços mais poderosos. Nossa história se passa 15 anos após \n"
								+ "essa descoberta histórica quando nosso personagem \"Aelin\" filho \"Galandriel\" \n"
								+ "(Um dos magos que participou da descoberta do novo tipo de magia e um dos responsáveis pela \n"
								+ "pesquisa realizadas com a mesma), ingressa no colégio para estudar com o objetivo de se \n"
								+ "tornar o \"Guardião\" do Reino.\n");

				System.out.println(
						"Narrador: O dia está amanhecendo, uma pequena névoa surge por entre as árvores cobrindo a área \n"
								+ "de floresta em volta da casa de Galandriel, em seu quarto, Aelin ronca como nunca por conta do cansaço \n"
								+ "causado pelos extensos treinos que vem tendo para garantir que consiga uma vaga entre os grandes magos \n"
								+ "de Winterhold e possívelmente, ser guardião do reino. O Silencio que era rompido apenas pelos altos \n"
								+ "roncos do nosso herói, foi quebrado quando Galandriel chegava na entrada do quarto e em alta voz bradou: \n");

				System.out.println(
						"Narrador: Ao abrir os olhos, Aelin se depara com Galandriel olhando ele da entrada de seu quarto, \n"
								+ "um lugar com uma luminosidade relativa proveniente de velas, com pisos de madeira e paredes de pedra. \n "
								+ "Ele também vê uma enorme coleção de livros, dos quais ele subtraiu muito tempo de sua vida folheando. \n"
								+ "O local está um pouco bagunçado com pratos, canecas sujas e folhas de pergaminhos espalhadas sendo que \n"
								+ "algumas estão amassadas, provavelmente por ele não ter tempo hábil para deixar os estudos e fazer algum \n"
								+ "tipo de limpeza ou organização.\n");

				System.out.println(
						"Aelin:  Ahhhhhh, não acredito que já amanheceu ! Parece que acabei de me deitar ! Vou levantar Pai, \n"
								+ "agradeço pelo aviso !\n");

				System.out.println(
						"Galandriel: É o máximo que posso fazer por você, sabe bem que eu não posso interferir em mais nada \n"
								+ "em relação ao seu treino, ou você pode acabar sendo punido com o cancelamento dos seus testes... \n");

				System.out.println(
						"Narrador: Enquanto Galandriel se retira, Aelin se levanta e segue para fazer suas necessidades \n"
								+ "matinais. Após termina-lás, pega o seu cajado (Item importante para conjurar magias, a madeira mágica canaliza \n"
								+ "a mana utilizada intensificando seus efeitos) e segue para o local de treino para continuar sua preparação. \n"
								+ "Chegando no lugar ele organiza as magias que ele selecionou e começa a proferir palavas em élfico antigo: \n"
								+ "(Lembre-se que enquando o Aelin estiver conjurando, será necessário que as questões matemáticas sejam \n"
								+ "respondidas corretamente ou ele não vai obter sucesso na conjuração e possívelmente sofrerá penalidade).\n");

				// Função de impressão dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question1(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condição de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A visão de Aelin fica escurecida e não consegue mais se mexer, aos poucos a vida se esvai"
									+ "e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				System.out.println("Narrador: Após o lancamento do feitiço, Aelin olha em sua lista o próximo e "
						+ "inicia a conjuração: \n");

				// Função de impressão dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question2(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condição de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A visão de Aelin fica escurecida e não consegue mais se mexer, aos poucos a vida se esvai"
									+ "e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				System.out.println("\nNarrador: As horas foram passando e o momento da prova ia se aproximando, porém "
						+ "enquanto Aelin estava praticando, ele observou que um barulho como de muitos passos se "
						+ "aproximavam dele, ele vai em direção ao som para checar oque estava acontecendo, e ao se "
						+ "aproximar, viu cerca de 15 guardas reais que iam em sua direção. Quando chegaram perto o "
						+ "suficiente, o homem que parecia ser o líder se dirige a ele dizendo:\n");

				System.out.println("Líder da Guarda Real: Aelin !!! Peço que você nos acompanhe imediatamente !!! "
						+ "Nós não queremos machuca-lo, mas vamos utilizar os meios necessários para te apreender. "
						+ "Venha sem resistir !");

				System.out.println("Aelin: Dragomir ? Oque significa isso tudo ? Me apreender ? Resisitir ? "
						+ "Você não está fazendo sentido !\r\n" + "Oque está acontecendo ?\n");

				System.out.println("Líder da Guarda Real: Bem... Provavelmente você deve saber oque houve, mas a "
						+ "princesa foi raptada e encontramos uma túnica e um dos cajados que pertecem a você ! "
						+ "Agora pare com esse teatro e nos acompanhe agora mesmo, de qualquer maneira vamos "
						+ "conseguir tirar de você onde a princesa está, não importam os meios.\n");

				System.out.println("Narrador: Aelin estava completamente confuso e sem saber como agir, ele "
						+ "pensava em como os pertences dele tinham aparecido dentro do quarto da princesa e "
						+ "ao mesmo tempo pensava que se fosse pego, seria torturado porque não tinha provas "
						+ "de sua inoência (A guarda real, era uma conhecida e temida instituição que tinha a"
						+ " reputação de torturar pessoas mesmo sem saber se tinham envolvimento ou não com as "
						+ "situações), diante dessa decisão, Aelin se lembra de um feitiço de fuga que ele "
						+ "conhece e decide se evadir para conseguir provar sua inocência, rapidamente ele "
						+ "começa a dizer as palavras mágicas:\n");

				// Função de impressão dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question3(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condição de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A visão de Aelin fica escurecida e não consegue mais se mexer, aos poucos a vida se esvai"
									+ "e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				System.out.println("Narrador: Após alguns meses de fuga e esconderijos, Aelin finalmente chega na "
						+ "cidade, ele procura entrar sem chamar atenção para si, aonde onde ele olha, consegue ver "
						+ "cartazes que falam sobre a princesa desaparecida e sobre recompensas para quem ajudar no "
						+ "resgate ou encontrando o “culpado”, de qualquer maneira ele vai se esgueirando para dentro "
						+ "da cidade e chega em frente a uma pequena casa, claramente não é utilizada por nobres e "
						+ "está relativamente abandonada, ele bate três vezes na porta e após alguns segundos ela "
						+ "se abre, quem aparece é um elfo alto de cabelos loiros e com uma certa idade e após "
						+ "identificar Aelin ele diz:");

				System.out.println("Maedhros: Entre, entre rapidamente...");

				System.out.println("Narrador: Após eles entrarem e fecharem a porta Aelin diz:");

				System.out.println("Aelin: Tio.... Como é bom ver algum rosto familiar ! Estou a meses assim, me "
						+ "escondendo e procurando pistas sobre o desaparecimento da princesa, por enquanto ouvi "
						+ "rumores que ela foi levada para o norte do país, gostaria muito de encontra-lá logo e "
						+ "limpar o meu nome.... Sei que você está aposentado, mas não poderia me ajudar ? ");

				System.out.println("Narrador: Aelin sabia que seu tio fazia parte de um grupo anti-governo na região e"
						+ " que tinham uma certa influência e facilidade para encontrar informações");

				System.out.println("Maedhros: Aelin... Que bom te ver ! Eu nunca acreditei que isso havia sido obra "
						+ "sua ! Um jovem mago brilhante como você e com ambição de se tornar o “Guardião” nunca iria"
						+ " jogar tudo pro ar para raptar princesa nenhuma... Fique aqui dentro, tem comida e água "
						+ "para você, se abasteça, coma e descanse, vou ver oque consigo fazer para ajuda-lo, "
						+ "gostaria de poder aproveitar a sua presença se não estivessemos com tão pouco tempo... "
						+ "mas enfim.... fique aqui e tente não chamar atenção !");

				System.out.println("Narrador: Enquanto Aelin tirava seu tempo de descanso dessa longa viagem, "
						+ "Maedhros foi até a cidade e conversou com quem podia para conseguir informações e também "
						+ "foi até seu amigo mercador para comprar um item para ajudar Aelin em sua jornada ! ");

				// Função de Sorteio do item
				itemGained = verifyItem(itemGained);

				// Funções de verificação dos status dos itens simples
				health = health + verifyItemStatus(itemGained);
				health = health + verifyItem2Status(itemGained);
				defense = defense + verifyItem3Status(itemGained);
				defense = defense + verifyItem4Status(itemGained);
				dodge = dodge + verifyItem5Status(itemGained);
				attack = attack + verifyItem6Status(itemGained);

				// Cálculos dos status dos itens simples
				maxHealth = maxHealth + health;
				maxDefense = maxDefense + defense;
				maxAttack = maxAttack + attack;
				maxDodge = maxDodge + dodge;

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condição de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A visão de Aelin fica escurecida e ele não consegue mais se mexer, aos poucos a vida se"
									+ " esvai e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				// Função de impressão dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println(
						"Narrador: Aelin está deitado e escuta a porta se abrindo e seu Tio entrando, Maedhros "
								+ "chama Aelin e diz:");

				// Verificação do número do item, utilizado para ajustar o diálogo abaixo para o
				// item sorteado.
				num = verifyItemNum(itemGained);

				System.out.println("Maedhros: Aelin, Aelin ! Consegui informações úteis para você e também te trouxe "
						+ itemName[num] + " , espero que você faça um bom uso dele, este item " + itemStatus[num]
						+ ". Sobre as informções, "
						+ " descobri que os rumores realmente estavam corretos, você deve seguir para o norte até Kiev, "
						+ "após o desaparecimento da princesa, habitantes locais avistaram uma pessoa vestida com trajes reais, "
						+ "cercada por homens suspeitos, aparetemente mantida a força com eles. Você deve partir logo, não "
						+ "sabemos qual será a intenção dos sequestradores com essa ousada atitude.");

				break; // Menu

			case 3:

				System.out.println("Turma A - Noite - Grupo 5\n");
				System.out.println("Desenvolvedores: \n");
				System.out.println("Filipe Santana Cordeiro");
				System.out.println("Henry Felipe Callera");
				System.out.println("Luciano Freire Lopes");
				System.out.println("Rubens Anjos dos Santos Silva");
				System.out.println("Vinícius Monteiro Lopes\n");

				break;

			case 4:

				System.out.println("Obrigado por jogar!");
				System.exit(0);

				break;

			default:

				System.out.println("Valor inválido !");

				break;

			}

		} while (repeatLoop == 0);

		input.close();

	}

}
