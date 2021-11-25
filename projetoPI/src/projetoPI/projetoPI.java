package projetoPI;

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class projetoPI {

	// String itemName[] = { "", "elvenBread", "healthPotion", "knowlegdeGrimoire",
	// "cannyBoots", "imortalsRosary" "horacleHourglass", "staffOfDestruction",
	// "familyRing" };

	// Verificador do item que serï¿½ recebido.
	public static String verifyItem(String itemGained) {

		Random generation = new Random();

		int c = generation.nextInt(7);

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

			itemGained = "staffOfDestruction";

			break;

		case 7:

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

	// Itens de status simples.
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

	// Item que ressuscita o personagem.
	public static int imortalsRosary(String itemGained, int maxHealth) {

		int health = 0;

		if (itemGained.equals("imortalsRosary")) {

			if (maxHealth <= 0) {

				health = 30;

			}

		}

		return health;

	}

	public static String imortalsRosary2(String itemGained, int maxHealth) {

		int health = 0;

		if (itemGained.equals("imortalsRosary")) {

			if (maxHealth <= 0) {

				itemGained = "";

			}

		}

		return itemGained;
	}

	public static int question1(int health) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, timer = 7;

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

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

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

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: Vamos testar se vocï¿½ domina uma habilidade util nas porximas etapas qual o "
					+ "resultado de xï¿½ . xï¿½:\n");

			String Quest3[] = { "x^5", "x^4", "5x", "xï¿½+xï¿½", "Nenhuma das alternativas" };
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

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele lançando\n"
							+ " uma enorme bola de fogo em direção ao alvo que está em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explosão e causando “X” dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			}

		}

		return health;

	}

	public static int question2(int health) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, timer = 7;

		// , TimeUnit.MILLISECONDS, timer

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: : vamos ver se você domina algumas as habilidades para os proximos passos\r\n"
					+ "qual o resultado da seguinte soma envolvendo numeros negativos \n");

			String Quest1[] = { "-5", "5", "-13", "-6", "Nenhuma das anteriores" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "5", answer4;

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

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Quais das expressões a baixo são equivalentes a 5²/5^8: \n");

			String Quest2[] = { "(5^2)^-3", "1^-6", "(5^2)^-8", "(-5)^-9", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "(5^2)^-3", answer5 = "";

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

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: (6^-4.8^-7)^-9 qual expressão a baixo é equivalente? \n");

			String Quest3[] = { "6^36 . 8^63", "1/6^13.8^63", "1/6^13.8^18", "6^5.8^2", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "6^36 . 8^63", answer6 = "";

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

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao "
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção "
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas mãos. Após o término da conjuração Aelin aponta em \n"
							+ "direção ao alvo que é congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver que as onde de frio intenso vão em direção \n"
							+ "as mãos do Aelin, porém algo da errado e o frio se expande causando uma explosão próxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		}

		return health;

	}

	public static int question3(int health) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, timer = 7;

		a = generation.nextInt(3);

		if (a == 0) {

			System.out.println("\nAelin: Escolha a equalção que resultara em uma reta crescente\n");

			String Quest1[] = { "x2-9", "-6x+6", "-1x+8", "-10x+6", "Nenhuma das anteriores" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "x2-9", answer7 = "";

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

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);
				}

				break;

			}

		} else if (a == 1) {

			System.out.println(
					"\nAelin:  Os computadores utilizam o sistema binário ou de base 2 que é um sistema de numeração em que todas as quantidades se "
							+ "representam com base em dois números, ou seja, (0 e 1). Em um computador o número 2012, em base decimal, será representado, "
							+ "em base binária, por:\n");

			String Quest2[] = { "110111.", "11111011100", "111110111000", "111110111", "1111010101" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "11111011100", answer8 = "";

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

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println(
					"\nAelin:  abe-se que o preço a ser pago por uma corrida de táxi inclui uma parcela fixa, que é denominada bandeirada, "
							+ "e uma parcela variável, que é função da distância percorrida. Se o preço da bandeirada é R$4,60 e o quilômetro rodado "
							+ "é R$0,96, qual a distância percorrida por um passageiro que pagou R$19,00?\n");

			String Quest3[] = { "15km", "16m", "17km", "18km", "19km" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "15km", answer9 = "";

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

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, após a finalização Aelin ficou invisível e consegue escapar \n"
							+ "enquanto os inimigos não conseguem identificar a sua presença.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin começa a reproduzir as palavras do feitiço, é possível vizualizar uma aura de mana envolvendo-o \n"
							+ "e é possível ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feitiço e causa uma enorme explosão, \n"
							+ "jogando todos para longe e deixando todos inconciêntes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e começou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		}

		return health;

	}

	public static int question4(int health, int maxDodge, String itemGained) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, hit, timer = 7;
		boolean correct = true;

		a = generation.nextInt(2);

		// Rolagem de acerto.
		hit = generation.nextInt(25);

		// Estrutura de decisÃ£o para validar o ataque.
		if (maxDodge >= hit) {

			write("\nNarrador: Aelin é um elfo, eles são conhecidos por sua agilidade e precisão, o Ghoul não tem chances contra uma \n"
					+ "movimentação tão precisa, e Aelin tomando distância inicia a conjuração de um feitiço de ataque para acabar \n"
					+ "com a batalha.\n", TimeUnit.MILLISECONDS, timer);

			if (a == 0) {

				System.out.println("\nAelin: Qual expressão exponencial é equivalente a rais 7º de B\n");

				String Quest1[] = { "b^1/7", "b^7", "1/b^7", "7^b/", "Nenhuma da alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "b^1/7", answer1 = "";

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);
					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("\nAelin: Qual o resultado da seguinte multiplicação (1+x).(x^2 - 5x -6)\n");

				String Quest2[] = { "x^3-4x^3-11x-6", "x^2-5x-6+x^3-5x^2-6x", "x^3+4x^2-6", "x^2+4x-11",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "x^3-4x^3-11x-6", answer2 = "";

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção "
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				}

			} else if (a == 2) {

				System.out.println("\nAelin: Qual o resultado da divisão de:  2x^3 + 4x^2 - 6x+4 por x - 3\n");

				String Quest3[] = { "2x^2+10x+24 ", "x^2+10x+24", "5^2+10x-24", "-2x^2+10x+24",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "2x^2+10x+24 ", answer3 = "";

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				}

			}

			if (a == 0) {

				System.out.println("\nAelin: Qual expressão exponencial é equivalente a rais 7º de B ?\n");

				String Quest1[] = { "b^1/7", "b^7", "1/b^7", "7^b/", "Nenhuma da alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "b^1/7", answer1 = "";

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("\nAelin: Qual o resultado da seguinte multiplicação (1+x).(x^2 - 5x -6)\n");

				String Quest2[] = { "x^3-4x^3-11x-6", "x^2-5x-6+x^3-5x^2-6x", "x^3+4x^2-6", "x^2+4x-11",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "x^3-4x^3-11x-6", answer2 = "";

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;
					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				}

			} else if (a == 2) {

				System.out.println("\nAelin: Qual o resultado da divisão de:  2x^3 + 4x^2 - 6x+4 por x - 3\n");

				String Quest3[] = { "2x^2+10x+24 ", "x^2+10x+24", "5^2+10x-24", "-2x^2+10x+24",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "2x^2+10x+24 ", answer3 = "";

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;
					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola de fogo vai em direção \n"
								+ "ao Ghoul que é completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até consegue lançar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				}

			}

		}

		return health;

	}

	public static int question5(int health, String itemGained) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;
		int timer = 7;
		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: Qual dos resultados a seguir é solução da potência 10^6");

			String Quest1[] = { "0,000001", "0,00001", "0,0001", "0,001", "0,01" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "0,000001", answer1 = "";

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

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direÃ§Ã£o ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direÃ§Ã£o ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direÃ§Ã£o ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direÃ§Ã£o ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direÃ§Ã£o ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println(
					"- Aelin: A respeito das propriedades de potências, qual das seguintes alternativas está correta?");

			String Quest2[] = {
					"No produto entre duas potências de mesmo expoente, conserva-se a base e somam-se os expoentes.",
					" Na divisão entre duas potências de mesmo expoente, conserva-se a base e subtraem-se os expoentes",
					"Em uma potência de expoente negativo, inverte-se a base e troca-se o sinal do expoente.",
					"Em uma potência de potência, conserva-se a base e somam-se os expoentes.",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "Em uma potência de expoente negativo, inverte-se a base e troca-se o sinal do expoente.",
					answer2 = "";

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

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direÃ§Ã£o ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Sabendo que o valor de 5^7 é 78,125 , qual o resultado de 5^8?");

			String Quest3[] = { "156 250", "390 625", "234 375", "312 500", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "390 625", answer3 = "";

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

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que Ã© completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que vão completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que vão completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que vão completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("Aelin sopra uma espécie de fumaça, quase invisível e "
							+ "consegue enganhar os guardas, depois passa facilmente por eles. "
							+ "de fogo vai em direção ao Ghoul que vão completamente derretido por tamanho calor.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin sopra uma espécie de fumaça, quase invisível mas nada acontece e não resta nada Além de esperar uma brecha"
							+ " dos seguranças para entrar. Após aguardar cerca de 1 hora, Aelin"
							+ " aproveita a troca de turnos para entrar no quarto.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		}

		return health;

	}

	public static int question6(int health, String itemGained) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, timer = 7;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println(
					"\nAelin: Em uma luta na floresta perdida, percebemeos que temos arvores amaldicoadas com frutos que te atacam, precisamos "
							+ "saber quantos frutos tem! na floresta tem 12 arvores, cada arvore possui 12 galhos e cada galho possui 12 frutos, quantos frutos "
							+ "temos na floresta perdida ?\n");

			String Quest1[] = { "1728", "144", "1224", "1564", "1720" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "1728", answer1 = "";

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

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println(
					"\nAelin: Um adulto humano saudável abriga cerca de 100 bilhões de bactérias, somente em seu trato "
							+ "digestivo. Esse número de bactérias pode ser escrito como :\n");

			String Quest2[] = { "10^11", "10^9", "10^10", "10^12", "10^13" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "10^11", answer2 = "";

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

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println(
					"\nAelin: Carlos e Pedro são alunos muito aplicados em matemática. Certo dia, Carlos perguntou "
							+ "a Pedro se ele sabia resolver a seguinte questão: Determine o algarismo das unidades do número (8325474)^(642). "
							+ "Pedro resolveu o problema, chegando ao resultado correto. Qual foi o resultado a que Pedro chegou?\n");

			String Quest3[] = { "4", "2", "5", "1", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "6", answer3 = "";

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

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					health = 5;

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nAelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas mãos de fogo e toca nas cordas que se desfazem facilmente, porém acaba queimado por não conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		}

		return health;
	}

	public static int question7(int health, String itemGained) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int timer = 10;
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: Qual resultado da potencia 30^3 :");

			String Quest1[] = { "30000", "333333", "230000", "27000", "32000" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "27000", answer1 = "";

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

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);
				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("- Aelin: Qual resultado da potencia 470^1 : \n");

			String Quest2[] = { "470", "Não existe resposta", "4700", "490", "Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "470", answer2 = "";

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

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);
				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);
				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);
				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: Qual resultado da potencia 11^2 :");

			String Quest3[] = { "121", "11", "132", "320", "112" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "121", answer3 = "";

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

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("Narrador: Aelin termina a conjuração e lança a bola de fogo que acerta em cheio Takeo que não"
							+ "teve tempo de reação, dando “x” de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo é mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lança de gelo e manda em direção a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		}

		return health;
	}

	public static int question8(int health, String itemGained) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, timer = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("\nAelin:  Reduza para uma potencia só 9^3 x 9:\n");

			String Quest1[] = { "9^4", "9^3", "9^4", "9^2", "9" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "9^4", answer1 = "";

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

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("\nAelin: Qual resultado da potencia 1^5:\n");

			String Quest2[] = { "5", "1", "10", "15", "0" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "1", answer2 = "";

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

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Aelin: Reduza para uma potencia só 3^0 x 3^0 :\n");

			String Quest3[] = { "3^0", "3", "3^2", "3^-2", "3^4" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "3^0", answer3 = "";

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

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, a eletricidade \n"
							+ "não da chance de reação a ele e o atinge em grande velocidade dando “x” de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lança tudo em direção de Takeo, oque ele \n"
							+ "não sabia é que Takeo também tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		}

		return health;

	}

	public static int question9(int health, String itemGained) throws InterruptedException {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, timer = 7;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("\nAelin: Reduza para uma potencia só 3^0 x 3^0 :\n");

			String Quest1[] = { "3^0", "3", "3^2", "3^-2", "3^4" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "3^0", answer1 = "";

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

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("\nAelin: Reduza para uma potencia só 4 x 4 x 4: \n");

			String Quest2[] = { "4^3", "4", "4^4", "4^6", "4^2" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "4^3", answer2 = "";

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

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, ele perde o "
							+ "controle da luz que se expande para todos os lados e da " + health
							+ " de dano nele e também acerta Takeo que simplesmente "
							+ "desaparece diante do imenso poder sobrando apenas suas cinzas.... \n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("\nAelin: Reduza para uma potencia só 7^4 x 7^5:\n");

			String Quest3[] = { "7^9", "7", "7^4", "7^6", "7^8" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "7^9", answer3 = "";

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

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nNarrador: Aelin conhece bem o feitiço, afinal é o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em direção ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feitiço, mas a quantidade de poder é indescritível e muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e também acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		}

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

		case "staffOfDestruction":

			num = 6;

			break;

		case "familyRing":

			num = 7;

			break;

		}

		return num;
	}

	public static void write(String texto, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : texto.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		// itens:

		String[] itemName = { "um pão élfico", "uma poção de vida", "uma tunica de mithril",
				"um grimário do conhecimento", "a bota do sagaz", "o rosário do imortal", "o cajado da destruição",
				"o anel de familia" };

		String[] itemStatus = { "Recupera 5 pontos de vida", "Recupera 20 pontos de vida",
				"Diminui em 10 o dano de inimigos", "iminui em 5 o dano de habilidades mal sucedidas",
				"Aumenta a chance de se esquivar de um ataque",
				"Permite que o jogador se levante com 30 de hp caso receba uma ferida mortal",
				"Aumenta o dano em 50 de suas magias de ataque", "Uma herança de nossa familia, apesar de não dar "
						+ "fazer nada, deixa viva a memória dentro dos nossos corações" };

		int c = 0, num, timer = 0;

		String itemGained = " ";

		// jogo:

		int option = 0, repeatLoop = 0;

		// player status:

		int maxHealth = 100, maxDefense = 5, maxAttack = 20, maxDodge = 15;

		// poss�vel altera��o nos status:

		int health = 0, defense = 0, attack = 0, dodge = 0, addHealth = 0;

		do {

			write("Selecione a opção desejada:\n", TimeUnit.MILLISECONDS, timer);
			write("\n[1] Instruções", TimeUnit.MILLISECONDS, timer);
			write("\n[2] Jogar", TimeUnit.MILLISECONDS, timer);
			write("\n[3] Créditos", TimeUnit.MILLISECONDS, timer);
			write("\n[4] Sair", TimeUnit.MILLISECONDS, timer);

			System.out.println("");
			option = input.nextInt();
			System.out.println("");

			switch (option) {

			case 1:

				write("\n O jogo é baseado em RPG de mesa, o mestre da mesa que chamamos de narrador \n"
						+ "irá guiar a gameplay e de certa maneira controlar o mundo ao redor de Aelin, você deve \n"
						+ "acertar as perguntas para ser bem sucedido nas magias que irão lançar ou pode tomar dano\n"
						+ " de inimigos e dos seus próprios feitiços!\n", TimeUnit.MILLISECONDS, timer);

				break;

			case 2:

				write("\nem um tempo antigo, cheio de violência e misticismo, os grandes magos de Winterhold ap�s dezenas de milhares de anos \n"
						+ "descobriram uma forma não convencional de magia que ultrapassava o poder destrutivo conhecido até o momento. \n"
						+ "Descobriram que os cálculos matemáticos escondiam os feitiços mais poderosos. Nossa história se passa 15 anos \n"
						+ "após essa descoberta histórica quando nosso personagem \"Aelin\" filho \"Galandriel\" (Um dos magos que participou \n"
						+ "da descoberta do novo tipo de magia e um dos responsáveis pela pesquisa realizadas com a mesma), ingressa no colégio \n"
						+ "para estudar com o objetivo de se tornar o \"Guardião\" do Reino.\n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println("");

				write("\nNarrador: O dia está amanhecendo, uma pequena n�voa surge por entre as árvores cobrindo a �rea de floresta em volta da casa \n"
						+ "de Galandriel, em seu quarto, Aelin ronca como nunca por conta do cansa�o causado pelos extensos treinos que vem tendo \n"
						+ "para garantir que consiga uma vaga entre os grandes magos de Winterhold e possívelmente, ser guardião do reino. O Silencio \n"
						+ "que era rompido apenas pelos altos roncos do nosso her�i, foi quebrado quando Galandriel chegava na entrada do quarto e em \n"
						+ "alta voz bradou: \n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Narrador: Ao abrir os olhos, Aelin se depara com Galandriel olhando ele da entrada de seu quarto, um lugar com uma luminosidade \n"
						+ "relativa proveniente de velas, com pisos de madeira e paredes de pedra. Ele também vê uma enorme coleção de livros, dos quais \n"
						+ "ele subtraiu muito tempo de sua vida folheando. O local está um pouco bagunçado com pratos, canecas sujas e folhas de pergaminhos \n"
						+ "espalhadas sendo que algumas estão amassadas, provavelmente por ele não ter tempo hábil para deixar os estudos e fazer algum tipo \n"
						+ "de limpeza ou organização.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Aelin:  Ahhhhhh, não acredito que já amanheceu ! Parece que acabei de me deitar ! Vou levantar meu Pai, \n"
						+ "agradeço pelo aviso !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Galandriel: É o máximo que posso fazer por você, sabe bem que eu não posso interferir em mais nada em relação ao seu treino, ou você \n"
						+ "pode acabar sendo punido com o cancelamento dos seus testes... \n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println(" ");

				write("Narrador: Enquanto Galandriel se retira, Aelin se levanta e segue para fazer suas necessidades matinais. Após termina-lôs, pega o seu \n"
						+ "cajado (Item importante para conjurar magias, a madeira mágica canaliza a mana utilizada intensificando seus efeitos) e segue para \n"
						+ "o local de treino para continuar sua preparação. Chegando no lugar ele organiza as magias que ele selecionou e come�a a proferir \n"
						+ "palavas em élfico antigo: (Lembre-se que enquando o Aelin estiver conjurando, ser� necess�rio que as quest�es matem�ticas sejam \n"
						+ "respondidas corretamente ou ele não vai obter sucesso na conjuração e possívelmente sofrerá penalidade).\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println("");

				addHealth = question1(health);

				maxHealth = maxHealth - addHealth;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("Narrador: A visão de Aelin fica escurecida e n�o consegue mais se mexer, aos poucos a vida se esvai"
							+ "e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("Game Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("Narrador: Após o lancamento do feitiço, Aelin olha em sua lista o próximo e "
						+ "inicia a conjuração: \n", TimeUnit.MILLISECONDS, timer);

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question2(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e não consegue mais se mexer, aos poucos a vida se esvai"
							+ "e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: As horas foram passando e o momento da prova ia se aproximando, porém "
						+ "enquanto Aelin estava praticando, ele observou que um barulho como de muitos passos se "
						+ "aproximavam dele, ele vai em direção ao som para checar oque estava acontecendo, e ao se "
						+ "aproximar, viu cerca de 15 guardas reais que iam em sua direção. Quando chegaram perto o "
						+ "suficiente, o homem que parecia ser o líder se dirige a ele dizendo:\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\n Líder da Guarda Real: Aelin !!! Peço que você nos acompanhe imediatamente !!! "
						+ "Nós não queremos machuca-lo, mas vamos utilizar os meios necessários para te apreender. "
						+ "Venha sem resistir !", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Dragomir ? Oque significa isso tudo ? Me apreender ? Resisitir ? "
						+ "Você não está fazendo sentido !\r\n" + "Oque está acontecendo ?\n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println("");

				write("\n Líder da Guarda Real: Bem... Provavelmente você deve saber oque houve, mas a "
						+ "princesa foi raptada e encontramos uma tônica e um dos cajados que pertecem a você ! "
						+ "Agora pare com esse teatro e nos acompanhe agora mesmo, de qualquer maneira vamos "
						+ "conseguir tirar de você onde a princesa está, não importam os meios.\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin estava completamente confuso e sem saber como agir, ele "
						+ "pensava em como os pertences dele tinham aparecido dentro do quarto da princesa e "
						+ "ao mesmo tempo pensava que se fosse pego, seria torturado porque não tinha provas "
						+ "de sua inocência (A guarda real, era uma conhecida e temida instituição que tinha a"
						+ " reputação de torturar pessoas mesmo sem saber se tinham envolvimento ou não com as "
						+ "situações), diante dessa decisão, Aelin se lembra de um feitiço de fuga que ele "
						+ "conhece e decide se evadir para conseguir provar sua inocência, rapidamente ele "
						+ "começa a dizer as palavras mágicas:\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question3(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e não consegue mais se mexer, aos poucos a vida se esvai"
							+ "e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Após alguns meses de fuga e esconderijos, Aelin finalmente chega na \n "
						+ "cidade, ele procura entrar sem chamar atenção para si, aonde onde ele olha, consegue ver \n "
						+ "cartazes que falam sobre a princesa desaparecida e sobre recompensas para quem ajudar no \n "
						+ "resgate ou encontrando o culpado, de qualquer maneira ele vai se esgueirando para dentro \n "
						+ "da cidade e chega em frente a uma pequena casa, claramente não é utilizada por nobres e \n "
						+ "está relativamente abandonada, ele bate três vezes na porta e após alguns segundos ela \n "
						+ "se abre, quem aparece é um elfo alto de cabelos loiros e com uma certa idade e após \n "
						+ "identificar Aelin ele diz:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nMaedhros: Entre, entre rapidamente...", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Após eles entrarem e fecharem a porta Aelin diz:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Tio.... Como é bom ver algum rosto familiar ! Estou a meses assim, me \n"
						+ "escondendo e procurando pistas sobre o desaparecimento da princesa, por enquanto ouvi \n "
						+ "rumores que ela foi levada para o norte do país, gostaria muito de encontra-lô logo e \n "
						+ "limpar o meu nome.... Sei que você está aposentado, mas não poderia me ajudar \n ? ",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin sabia que seu tio fazia parte de um grupo anti-governo na região e \n "
						+ " que tinham uma certa influência e facilidade para encontrar informações \n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nMaedhros: Aelin... Que bom te ver ! Eu nunca acreditei que isso havia sido obra \n"
						+ "sua ! Um jovem mago brilhante como você e com ambição de se tornar o Guardião nunca iría \n"
						+ " jogar tudo pro ar para raptar princesa nenhuma... Fique aqui dentro, tem comida e água \n "
						+ "para você, se abasteça, coma e descanse, vou ver oque consigo fazer para ajuda-lo, \n "
						+ "gostaria de poder aproveitar a sua presença se não estivessemos com tão pouco tempo... \n "
						+ "mas enfim.... fique aqui e tente não chamar atenção !", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Enquanto Aelin tirava seu tempo de descanso dessa longa viagem, \n "
						+ "Maedhros foi até a cidade e conversou com quem podia para conseguir informações e tamb�m \n "
						+ "foi até seu amigo mercador para comprar um item para ajudar Aelin em sua jornada ! \n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de Sorteio do item
				itemGained = verifyItem(itemGained);

				// Fun��es de verifica��o dos status dos itens simples
				health = health + verifyItemStatus(itemGained);
				health = health + verifyItem2Status(itemGained);
				defense = defense + verifyItem3Status(itemGained);
				defense = defense + verifyItem4Status(itemGained);
				dodge = dodge + verifyItem5Status(itemGained);
				attack = attack + verifyItem6Status(itemGained);

				// C�lculos dos status dos itens simples
				maxHealth = maxHealth + health;
				maxDefense = maxDefense + defense;
				maxAttack = maxAttack + attack;
				maxDodge = maxDodge + dodge;

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				write("\nNarrador: Aelin está deitado e escuta a porta se abrindo e seu Tio entrando, Maedhros \n "
						+ "chama Aelin e diz:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Verifica��o do n�mero do item, utilizado para ajustar o di�logo
				// abaixo para o
				// item sorteado.
				num = verifyItemNum(itemGained);

				write("\nMaedhros: Aelin, Aelin ! Consegui informações úteis para você e tamb�m te trouxe \n"
						+ itemName[num] + " , espero que você faça um bom uso dele, este item \n" + itemStatus[num]
						+ ". Sobre as informções, "
						+ " descobri que os rumores realmente estavam corretos, você deve seguir para o norte até Kiev,\n "
						+ "após o desaparecimento da princesa, habitantes locais avistaram uma pessoa vestida com trajes reais,\n "
						+ "cercada por homens suspeitos, aparetemente mantida a força com eles. Você deve partir logo, não \n"
						+ "sabemos qual será a intenção dos sequestradores com essa ousada atitude.",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Tio..... Não sei como te agradeçer, não imaginei que estaria aqui neste momento....\n"
						+ "Eu estava me preparando para o teste... só queria poder cuidar do Reino e deixar minha família orgulhosa de mim.... \n"
						+ "Devo ir Tio, mas espero tudo de melhor a você, espero poder retribuir sua gentileza... Adeus....\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nMaedhros: Aelin... Apenas mee prometa que vai salvar a princesa e limpar o nome de nossa família.... Adeus....\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin segue em direção a Kiev, a noite cai na floresta e Aelin para com a intenção de descansar\n"
						+ "mas é surpreendido por um Ghoul que estava perambulando na região.\n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question4(health, maxDodge, itemGained);

				maxHealth = maxHealth - addHealth;

				// maxHealth = 0;

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				itemGained = imortalsRosary2(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e ele não consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Após perceber que eliminou o a ameaça, Aelin descansa o resto da noite e parte \n"
						+ "para Kiev de manhã.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin finalmente chega em seu destino, após semanas de viagem e passando por diversos desafios\n "
						+ "no caminho ele concluir sua viagem e começa a investigar a informação que seu Tio passou, sobre a menina que\n "
						+ "parecia estar sendo mantida a força como refém. Os habitantes dizem que a tal mulher estava na Catetral de Santa \n"
						+ "Sofia, uma igreja famosa da cidade e Aelin segue até o local.\n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println("");

				write("\nNarrador: Ele chega no local, é um prédio enorme de paredes brancas e telhas verdes, no alto das torres\n "
						+ "É possível ver cúpulas douradas com cruzes em cima, ele percebe movimentação de pessoas que parecem guardar o\n "
						+ "local e entra no local sem chamar atenção.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Ele vai se esgueirando pelos cômodos da catedral e após andar consideravelmente, encontra uma \n "
						+ "porta sendo guardada por trás guardas. Aelin decide conjurar um feitiço para deixar os guardas em uma ilusão,\n "
						+ "ele come�a a proferir o feiti�o:\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println("");

				addHealth = question5(health, itemGained);

				maxHealth = maxHealth - addHealth;

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				itemGained = imortalsRosary2(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e ele não consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Entrando no quarto, Aelin vê Lyuba deitada e amarrada na cama com cordas e rapidamente vai em sua direção para solta-lô,\n "
						+ "com sua magia de fogo de maneira reduzida ele pretende queimar as amarras, ele começa a conjurar:\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println("");

				addHealth = question6(health, itemGained);

				maxHealth = maxHealth - addHealth;

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				itemGained = imortalsRosary2(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e ele não consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Aelin corre para Lyuba e e fala com ela:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Magestade ! Você está bem ? Consegue me dizer oque houve ? Estão me acusando de ter raptado você e\n "
						+ "tive que fugir para não ser torturado pelo seu sequestro !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nLyuba: Aelin, já estava perdendo as esperanças de voltar com vida... Que pena que estamos nos reencontrando dessa \n"
						+ "maneira, ainda mais sabendo que as pessoas do castelo estão procurando voc� por algo que não fez.... Vou ajustar\n "
						+ "isso assim que voltar, te dou a minha palavra !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Princesa, você conseguiu identificar quem foi o autor desse absurdo ?\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nLyuba: Infelizmente sim... A pessoa estava bem em baixo dos nossos narizes.... A mente por traz desse crime \n "
						+ "�....", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Enquanto Lyuba falava, uma alta voz bradou da entrada do quarto dizendo: \n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nTakeo: Eu mesmo... Jovem Aelin... Fiz um sorteio para ver qual dos jovens haveriam de carregar a culpa por mim, mal pude me \n"
						+ "conter quando vi que era o filho do arrogante Galandriel, realmente me enchi de alegria ! Mas infelizmente vou ter que \n"
						+ "acabar com você eu mesmo e... Salvar a Princesa !!! Vou usar um feitiço para alterar a mem�ria dela e reescrever a história \n"
						+ "em que por meus atos heróicos, vou ganhar a mão da princesa após salvá-la de um delinquente como você !",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Takeo ! Como você pôde ? Traiu Winterhold e o Reino e seus colegas Magos, voc� � uma vergonha.... Chega de fugir, é meu dever \n "
						+ "cessar esse absurdo e salvar a Princesa !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Narrador: Como dito anteriormente, Aelin é rápido e preciso. Não passa nem 3 segundos e já está conjurando uma bola de fogo em direção de \n"
						+ "Takeo enquanto se posiciona estratégicamente:\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println(" ");

				addHealth = question7(health, itemGained);

				maxHealth = maxHealth - addHealth;

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				itemGained = imortalsRosary2(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e ele não consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Após a troca de ataques, Aelin inicia um feitiço el�trico que envolve seu corpo com eletricidade e vai crescendo enquanto \n"
						+ "ele profere as palavras:\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println(" ");

				addHealth = question8(health, itemGained);

				maxHealth = maxHealth - addHealth;

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				itemGained = imortalsRosary2(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e ele não consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: A batalha continua e Aelin não ve outra opção se não conjurar o seu feitiço mais poderoso, a “Última Luz”, ele sabe que se \n "
						+ "falhar e não controlar corretamente, pode acabar morrendo por conta da enorme força e energia que o feitiço pode emitir, além de \n "
						+ "que pode acabar matando a todos ao seu redor.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador:  Por estar se esgotando e não ter opções, ele inicia o feitiço e enquanto ele vai seguindo uma luz muito forte se forma em  \n"
						+ "suas mãos, é possível ver que aquela luz é como se fosse feita de algo físico, era algo assutador e realmente poderoso, ele segue \n "
						+ "proferindo as palavras:\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println(" ");

				addHealth = question9(health, itemGained);

				maxHealth = maxHealth - addHealth;

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				itemGained = imortalsRosary2(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A visão de Aelin fica escurecida e ele não consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Após a luta, Aelin pega a princesa e segue viagem para o Reino. Quando chega, é recebido de maneira Brutal pelos \n "
						+ "guardas da entrada que o abordam e o prendem mas são interrompidos pela princesa que diz:\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Lyuba: Parem Imediatamente ! É assim que vocês vão tratar a pessoa que me salvou ? Vou pedir pela cabeça \n"
						+ "\n " + "de vocês !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nGuarda: Me perdoe Magestade ! Pertences deste elfo foram encontrados em seus aposentos, ele era o principal\n "
						+ "suspeito !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nLyuba: Foi o mago Takeo quem me raptou, esse jovem foi quem me libertou e derrotou ele. Eu preciso de cuidados, me levem para o \n"
						+ "castelo, enquanto ao jovem, avisem a todos do ocorrido.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\n Narrador:Alguns dias depois Aelin foi chamado pela realeza para participar do banquete de comemoração ao retorno da princesa. \n "
						+ "Ao chegar no local o Rei ao notar a sua presença bradou: \n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nRei Amis IV: Aelin !!! Somos gratos a você pelo seu serviço, já solicitei aos magos que garantam sua vaga no colégio de Winterhold ! /n "
						+ "Também estou indicando você para ser um dos candidatos de “Guardião do Reino”, erramos em duvidar de você e gostariamos de compensa-lo./n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Magestade.... Muito obrigado pela sua generosidade. Sempre foi meu dever defender o Reino, \n "
						+ ", não poderia ter feito diferente.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nLyuba: Também sou grata a você por sua lealdade ! Desfizemos o erro e não mas irão ver a sua familia com desprezo e sim honra !\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Assim foi o incidente com a Princesa que virou conto dentre os habitantes de Odessa, da coragem e determinação de um simples  \n"
						+ "simples jovem mago que queria seguir os passos do pai e se tornar o “Guardião” do Reino.\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("\nMuito Obrigado Por Jogar !!!\n");

				break; // Menu

			case 3:

				write("\nTurma A - Noite - Grupo 5\n", TimeUnit.MILLISECONDS, timer);
				write("\nDesenvolvedores: \n", TimeUnit.MILLISECONDS, timer);
				write("\nFilipe Santana Cordeiro", TimeUnit.MILLISECONDS, timer);
				write("\nHenry Felipe Callera", TimeUnit.MILLISECONDS, timer);
				write("\nLuciano Freire Lopes", TimeUnit.MILLISECONDS, timer);
				write("\nRubens Anjos dos Santos Silva", TimeUnit.MILLISECONDS, timer);
				write("\nVinícius Monteiro Lopes\n", TimeUnit.MILLISECONDS, timer);

				break;

			case 4:

				write("\nObrigado por jogar !\n", TimeUnit.MILLISECONDS, timer);
				System.exit(0);

				break;

			default:

				write("\nValor invalido !\n", TimeUnit.MILLISECONDS, timer);

				break;

			}

		} while (repeatLoop == 0);

		input.close();
		// teste

	}

}
