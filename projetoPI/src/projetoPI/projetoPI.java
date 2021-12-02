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

	// Verificador do item que ser� recebido.
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
		int a, timer = 10;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println(
					"Aelin: Dado um numero hexadecimal (1E9), qual seria o valor do mesmo numero para base 2 ?");

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

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feitiso termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��ess magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feitiso termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��ess magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {
				
					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feitiso termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��ess magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {
					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feitiso termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��ess magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}
				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feitiso termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��ess magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
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

					write("Narrador: Enquanto as equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que est�o em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��es a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {


					write("Narrador: Enquanto as equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que est�o em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��es a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}
				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {


					write("Narrador: Enquanto as equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que est�o em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��es a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}
				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("Narrador: Enquanto as equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que est�o em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��es a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("Narrador: Enquanto as equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele lansando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que est�o em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��es a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}
				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
					+ "resultado de x� . x� \n");

			String Quest3[] = { "x^5", "x^4", "5x", "x^3", "Nenhuma das alternativas" };
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

					write("Narrador: Enquanto a equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feiti�o termina com ele lan�ando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("Narrador: Enquanto a equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feiti�o termina com ele lan�ando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("Narrador: Enquanto a equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feiti�o termina com ele lan�ando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}
				
				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("Narrador: Enquanto a equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feiti�o termina com ele lan�ando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
							TimeUnit.MILLISECONDS, timer);

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("Narrador: Enquanto a equa�oes magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas\n"
							+ " que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, o feiti�o termina com ele lan�ando\n"
							+ " uma enorme bola de fogo em dires�o ao alvo que esta em sua frente. \n",
							TimeUnit.MILLISECONDS, timer);
				} else {

					write("Narrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando em chamas que \n"
							+ "rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolus�o a tona, algo de errado faz com que Aelin perca \n"
							+ "o controle das chamas, causando uma explos�o e causando dano em si mesmo.\n",
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
		int a, timer = 10;

		// , TimeUnit.MILLISECONDS, timer

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: : vamos ver se voc� domina algumas as habilidades para os proximos passos\r\n"
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

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que s�o congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os. � possivel ver que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que s�o congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os. � possivel ver que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que s�o congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os. � possivel ver que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que s�o congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os. � possivel ver que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {
					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que s�o congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os. � possivel ver que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Quais das expressões a baixo s�o equivalentes a 5²/5^8: \n");

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

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que  congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�oo proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os.� possivel que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {
					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que  congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�oo proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os.� possivel que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que  congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�oo proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os.� possivel que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que  congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�oo proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os.� possivel que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o terrmino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que  congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�oo proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao \n"
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�os.� possivel que as onde de frio intenso v�o em dire��o \n"
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando\n"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: (6^-4.8^-7)^-9 qual express�o a baixo � equivalente? \n");

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

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o termino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que � congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao "
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�oos. � possivel ver que as onde de frio intenso v�o em dire��o "
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o termino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que � congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao "
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�oos. � possivel ver que as onde de frio intenso v�o em dire��o "
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o termino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que � congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao "
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�oos. � possivel ver que as onde de frio intenso v�o em dire��o "
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o termino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que � congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao "
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�oos. � possivel ver que as onde de frio intenso v�o em dire��o "
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando"
							+ health + "dano. \n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma \n"
							+ "ao seu redor, centralizando a baixa temperatura no centro de suas m�os. Ap�s o termino da conjura��o Aelin aponta em \n"
							+ "dire��o ao alvo que � congelado instantaneamente.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Enquanto a equa��es magicas s�o proferidas, um vento forte se forma ao redor de Aelin, uma aura gelada se forma ao "
							+ "seu redor, centralizando a baixa temperatura no centro de suas m�oos. � possivel ver que as onde de frio intenso v�o em dire��o "
							+ "as m�os do Aelin, porem algo da errado e o frio se expande causando uma explos�o proxima demais de Aelin causando"
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
		int a, timer = 10;

		a = generation.nextInt(3);

		if (a == 0) {

			System.out.println("\nAelin: Escolha a equa��o que resultara em uma reta crescente\n");

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

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o,� possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � posssivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcistentes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o,� possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � posssivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcistentes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o,� possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � posssivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcistentes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o,� possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � posssivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcistentes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o,� possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � posssivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcistentes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 1) {

			System.out.println(
					"\nAelin:  Os computadores utilizam o sistema binário ou de base 2 que � um sistema de numera��o em que todas as quantidades se "
							+ "representam com base em dois numeros, ou seja, (0 e 1). Em um computador o numero 2012, em base decimal, sera representado, "
							+ "em base binaria, por:\n");

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

					write("\nNarrador: Enquanto Aelin come a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto Aelin come a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto Aelin come a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {
					write("\nNarrador: Enquanto Aelin come a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}
				
				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto Aelin come a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println(
					"\nAelin:  abe-se que o pres�oo a ser pago por uma corrida de taxi inclui uma parcela fixa, que � denominada bandeirada, "
							+ "e uma parcela variavel, que � fun��o da distancia percorrida. Se o pre�o da bandeirada � R$4,60 e o quilometro � rodado "
							+ "e R$0,96, qual a distancia percorrida por um passageiro que pagou R$19,00?\n");

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

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possível ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possível ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}
				
				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possível ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possível ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
							TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possível ver aos poucos ele ficando transparente, ap�s a finaliza��o Aelin ficou invisivel e consegue escapar \n"
							+ "enquanto os inimigos n�o conseguem identificar a sua presen�a.\n", TimeUnit.MILLISECONDS,
							timer);

				} else {

					health = 10;

					write("\nNarrador: Enquanto Aelin come�a a reproduzir as palavras do feiti�o, � possivel vizualizar uma aura de mana envolvendo-o \n"
							+ "e � possivel ver aos poucos ele ficando transparente, mas Aelin pula uma palavra do feiti�o e causa uma enorme explos�o, \n"
							+ "jogando todos para longe e deixando todos inconcientes. Apesar do dano que recebeu, acordou em um local longe dos seus \n"
							+ "perseguidores e come�ou a seguir para um Reino distante onde mora um tio seu para pedir ajuda.\n",
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
		int a, hit, timer =10;
		boolean correct = true;

		a = generation.nextInt(2);

		// Rolagem de acerto.
		hit = generation.nextInt(25);

		// Estrutura de decisÃ£o para validar o ataque.
		if (maxDodge >= hit) {

			write("\nNarrador: Aelin � um elfo, eles s�o conhecidos por sua agilidade e precis�o, o Ghoul n�o tem chances contra uma \n"
					+ "movimenta��o t�o precisa, e Aelin tomando distância inicia a conjura��o de um feiti�o de ataque para acabar \n"
					+ "com a batalha.\n", TimeUnit.MILLISECONDS, timer);

			if (a == 0) {

				System.out.println("\nAelin: Qual express�o exponencial � equivalente a rais 7º de B\n");

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se v�o s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se v�o s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se v�o s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se v�o s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se v�o s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("\nAelin: Qual o resultado da seguinte multiplica��o (1+x).(x^2 - 5x -6)\n");

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}
					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {
						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {
						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}
					break;

				}

			} else if (a == 2) {

				System.out.println("\nAelin: Qual o resultado da divis�o de:  2x^3 + 4x^2 - 6x+4 por x - 3\n");

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						health = 5;

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

					}
					
					break;

				}

			}

			if (a == 0) {

				System.out.println("\nAelin: Qual express�o exponencial � equivalente a rais 7º de B ?\n");

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}
					break;

				}

			} else if (a == 1) {

				System.out.println("\nAelin: Qual o resultado da seguinte multiplica��o(1+x).(x^2 - 5x -6)\n");

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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que e completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que e completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que e completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}
					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {
						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que e completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que e completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
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

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}
					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
								+ "inimigo e elimina-lo, mas perde o controle das chamas e toma /n" + health
								+ " de dano\n", TimeUnit.MILLISECONDS, timer);

						health += +5;

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						write("\nNarrador: Aelin completa o encantamento e tudo oque se ve s�o chamas e uma enorme bola de fogo vai em dire��o \n"
								+ "ao Ghoul que � completamente derretido por tamanho calor.\n", TimeUnit.MILLISECONDS,
								timer);

					} else {

						write("Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele at� consegue lan�ar fogo no \n"
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
		int timer = 10;
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
		int a, timer = 10;
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

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			}

		} else if (a == 1) {

			System.out.println(
					"\nAelin: Um adulto humano saudavel abriga cerca de 100 bilhoes de bacterias, somente em seu trato "
							+ "digestivo. Esse numero de bacterias pode ser escrito como :\n");

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

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println(
					"\nAelin: Carlos e Pedro s�o alunos muito aplicados em matematica. Certo dia, Carlos perguntou "
							+ "a Pedro se ele sabia resolver a seguinte quest�o: Determine o algarismo das unidades do numero (8325474)^(642). "
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

					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {


					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {


					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {


					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
							+ "fogo como deveria e toma " + health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {


					write("\nAelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Aelin cobre suas m�os de fogo e toca nas cordas que se desfazem facilmente, porem acaba queimado por n�o conseguir controlar o \n"
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

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de \n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de \n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de \n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de \n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}


				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de \n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
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

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��p a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��p a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��p a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��p a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��p a Aelin que toma : " + health
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

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
							+ " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("Narrador: Aelin termina a conjura��o e lan�a a bola de fogo que acerta em cheio Takeo que n�o"
							+ "teve tempo de rea��o, dando de dano.\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 20;

					write("Narrador: Apesar da velocidade de Aelin, Takeo � mais velho e mais experiente mago, e consegue se esquivar do ataque."
							+ "Imediatamente cria uma lan�a de gelo e manda em dire��o a Aelin que toma : " + health
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
		int a, timer = 10;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("\nAelin:  Reduza para uma potencia s� 9^3 x 9:\n");

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

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				
				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
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

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando  de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando  de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando  de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando  de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando  de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas mãos de Aelin que lan�a tudo em dire��o de Takeo, oque ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
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

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lança tudo em dire��po de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, o que ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lança tudo em dire��po de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, o que ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lança tudo em dire��po de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, o que ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lança tudo em dire��po de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, o que ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
							+ "a magia recebida e envia-la devolta, na mesma impressionante velocidade volta e atinge Aelin em cheio tomando \n"
							+ health + " de dano.\n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lança tudo em dire��po de Takeo, a eletricidade \n"
							+ "n�o da chance de rea��o a ele e o atinge em grande velocidade dando de dano.\n",
							TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("\nNarrador: Uma imensa quantidade de energia se acumula nas m�os de Aelin que lan�a tudo em dire��o de Takeo, o que ele \n"
							+ "n�o sabia � que Takeo tambem tinha conjurado uma magia, neste caso utilizou uma magia que tem a capacidade de refletir \n"
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
		int a, timer = 10;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("\nAelin: Reduza para uma potencia s� 3^0 x 3^0 :\n");

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

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder � indescritível e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

				
				
				write("\nNarrador: Aelin conhece bem o feiti�o, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
						+ "essa grande energia, ao finalizar, lança em dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
						+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

			} else {

				health = 5;

				write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder � indescritível e muito dificil de controlar, \n"
						+ "ele perde o controle da luz que se expande para todos os lados e da " + health
						+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
						+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

			}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder � indescritível e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);
				}
				          break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder � indescritível e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);
				}
				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lança em dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder � indescritível e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
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

					write("\nNarrador: Aelin conhece bem o feiti�O, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder wesley indescritivel muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					write("\nNarrador: Aelin conhece bem o feiti�O, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder wesley indescritivel muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					write("\nNarrador: Aelin conhece bem o feiti�O, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder wesley indescritivel muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}
				
				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					write("\nNarrador: Aelin conhece bem o feiti�O, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder wesley indescritivel muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					write("\nNarrador: Aelin conhece bem o feiti�O, afinal � o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a dire��o ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder wesley indescritivel muito difícil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("\nAelin: Reduza para uma potencia s� 7^4 x 7^5:\n");

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

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal e o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a em dire��oo ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder  indescritivel e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal e o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a em dire��oo ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder  indescritivel e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}
				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal e o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a em dire��oo ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder  indescritivel e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					write("\nNarrador: Aelin conhece bem o feiti�o, afinal e o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
							+ "essa grande energia, ao finalizar, lan�a em dire��oo ao Takeo que simplesmente desaparece diante do imenso poder, \n"
							+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

				} else {

					health = 5;

					write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder  indescritivel e muito dificil de controlar, \n"
							+ "ele perde o controle da luz que se expande para todos os lados e da " + health
							+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
							+ "sobrando apenas suas cinzas.... \n", TimeUnit.MILLISECONDS, timer);

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

							write("\nNarrador: Aelin conhece bem o feiti�o, afinal e o seu trunfo. Apesar da dificuldade ele consegue controlar a luz que tem \n"
									+ "essa grande energia, ao finalizar, lan�a em dire��oo ao Takeo que simplesmente desaparece diante do imenso poder, \n"
									+ "sobrando apenas suas cinzas....\n", TimeUnit.MILLISECONDS, timer);

						} else {

							health = 5;

							write("Narrador: Aelin treinou muito esse feiti�o, mas a quantidade de poder  indescritivel e muito dificil de controlar, \n"
									+ "ele perde o controle da luz que se expande para todos os lados e da " + health
									+ "\n de dano nele e tambem acerta Takeo que simplesmente desaparece diante do imenso poder \n"
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

		String[] itemName = { "um p�o elfico", "uma poss�o de vida", "uma tunica de mithril",
				"um grim�rio do conhecimento", "a bota do sagaz", "o ros�rio do imortal", "o cajado da destrui��o",
				"o anel de familia" };

		String[] itemStatus = { "Recupera 5 pontos de vida", "Recupera 20 pontos de vida",
				"Diminui em 10 o dano de inimigos", "iminui em 5 o dano de habilidades mal sucedidas",
				"Aumenta a chance de se esquivar de um ataque",
				"Permite que o jogador se levante com 30 de hp caso receba uma ferida mortal",
				"Aumenta o dano em 50 de suas magias de ataque", "Uma heran�a de nossa familia, apesar de n�o dar "
						+ "fazer nada, deixa viva a mem�ria dentro dos nossos cora��es" };

		int c = 0, num, timer = 10;

		String itemGained = " ";

		// jogo:

		int option = 0, repeatLoop = 0;

		// player status:

		int maxHealth = 100, maxDefense = 5, maxAttack = 20, maxDodge = 15;

		// variavelde altera��o nos status:

		int health = 0, defense = 0, attack = 0, dodge = 0, addHealth = 0;

		do {

			write("Selecione a op��o desejada:\n", TimeUnit.MILLISECONDS, timer);
			write("\n[1] Instru��es", TimeUnit.MILLISECONDS, timer);
			write("\n[2] Jogar", TimeUnit.MILLISECONDS, timer);
			write("\n[3] Cr�ditos", TimeUnit.MILLISECONDS, timer);
			write("\n[4] Sair", TimeUnit.MILLISECONDS, timer);

			System.out.println("");
			option = input.nextInt();
			System.out.println("");

			switch (option) {

			case 1:

				write("\n O jogo � baseado em RPG de mesa, o mestre da mesa que chamamos de narrador \n"
						+ "ir� guiar a gameplay e de certa maneira controlar o mundo ao redor de Aelin, voc� deve \n"
						+ "acertar as perguntas para ser bem sucedido nas magias que ir� o lan�ar ou pode tomar dano\n"
						+ " de inimigos e dos seus pr�prios feiti�os!\n", TimeUnit.MILLISECONDS, timer);

				break;

			case 2:

				write("\nem um tempo antigo, cheio de violencia e misticismo, os grandes magos de Winterhold ap�s dezenas de milhares de anos \n"
						+ "descobriram uma forma n�o convencional de magia que ultrapassava o poder destrutivo conhecido at� o momento. \n"
						+ "Descobriram que os c�lculos matem�ticos escondiam os feiti�os mais poderosos. Nossa hist�ria se passa 15 anos \n"
						+ "ap�s essa descoberta hist�rica quando nosso personagem \"Aelin\" filho \"Galandriel\" (Um dos magos que participou \n"
						+ "da descoberta do novo tipo de magia e um dos respons�veis pela pesquisa realizadas com a mesma), ingressa no col�gio \n"
						+ "para estudar com o objetivo de se tornar o \"Guardi�o\" do Reino.\n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println("");

				write("\nNarrador: O dia est� amanhecendo, uma pequena n�voa surge por entre as �rvores cobrindo a �rea de floresta em volta da casa \n"
						+ "de Galandriel, em seu quarto, Aelin ronca como nunca por conta do cansa�o causado pelos extensos treinos que vem tendo \n"
						+ "para garantir que consiga uma vaga entre os grandes magos de Winterhold e possivelmente, ser guardi�o do reino. O Silencio \n"
						+ "que era rompido apenas pelos altos roncos do nosso her�i, foi quebrado quando Galandriel chegava na entrada do quarto e em \n"
						+ "alta voz bradou: \n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Narrador: Ao abrir os olhos, Aelin se depara com Galandriel olhando ele da entrada de seu quarto, um lugar com uma luminosidade \n"
						+ "relativa proveniente de velas, com pisos de madeira e paredes de pedra. Ele tamb�m v� uma enorme cole��o de livros, dos quais \n"
						+ "ele subtraiu muito tempo de sua vida folheando. O local está um pouco bagun�ado com pratos, canecas sujas e folhas de pergaminhos \n"
						+ "espalhadas sendo que algumas est�o amassadas, provavelmente por ele n�o ter tempo h�bil para deixar os estudos e fazer algum tipo \n"
						+ "de limpeza ou organiza��o.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Aelin:  Ahhhhhh, n�o acredito que j� amanheceu ! Parece que acabei de me deitar ! Vou levantar meu Pai, \n"
						+ "agrade�o pelo aviso !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Galandriel: o m�ximo que posso fazer por voc�, sabe bem que eu n�o posso interferir em mais nada em relac�o ao seu treino, ou voc� \n"
						+ "pode acabar sendo punido com o cancelamento dos seus testes... \n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println(" ");

				write("Narrador: Enquanto Galandriel se retira, Aelin se levanta e segue para fazer suas necessidades matinais. Ap�s termina-l�s, pega o seu \n"
						+ "cajado (Item importante para conjurar magias, a madeira m�gica canaliza a mana utilizada intensificando seus efeitos) e segue para \n"
						+ "o local de treino para continuar sua prepara��o. Chegando no lugar ele organiza as magias que ele selecionou e come�a a proferir \n"
						+ "palavas em �lfico antigo: (Lembre-se que enquando o Aelin estiver conjurando, ser�a necess�rio que as quest�es matem�ticas sejam \n"
						+ "respondidas corretamente ou ele n�o vai obter sucesso na conjura��o e poss�velmente sofrer� penalidade).\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println("");

				addHealth = question1(health);

				maxHealth = maxHealth - addHealth;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("Narrador: A vis�o de Aelin fica escurecida e n�o consegue mais se mexer, aos poucos a vida se esvai"
							+ "e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("Game Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("Narrador: Apos o lancamento do feiti�o, Aelin olha em sua lista o pr�ximo e "
						+ "inicia a conjurac�o: \n", TimeUnit.MILLISECONDS, timer);

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question2(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A vis�o de Aelin fica escurecida e n�o consegue mais se mexer, aos poucos a vida se esvai"
							+ "e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: As horas foram passando e o momento da prova ia se aproximando, por�m "
						+ "enquanto Aelin estava praticando, ele observou que um barulho como de muitos passos se "
						+ "aproximavam dele, ele vai em dire��o ao som para checar oque estava acontecendo, e ao se "
						+ "aproximar, viu cerca de 15 guardas reais que iam em sua dire��o. Quando chegaram perto o "
						+ "suficiente, o homem que parecia ser o l�der se dirige a ele dizendo:\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\n L�der da Guarda Real: Aelin !!! Pe�o que voc� nos acompanhe imediatamente !!! "
						+ "N�s n�o queremos machuca-lo, mas vamos utilizar os meios necess�rios para te apreender. "
						+ "Venha sem resistir !", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Dragomir ? Oque significa isso tudo ? Me apreender ? Resisitir ? "
						+ "Voc� n�o est� fazendo sentido !\r\n" + "Oque est� acontecendo ?\n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println("");

				write("\n L�der da Guarda Real: Bem... Provavelmente voc� deve saber oque houve, mas a "
						+ "princesa foi raptada e encontramos uma t�nica e um dos cajados que pertecem a voc� ! "
						+ "Agora pare com esse teatro e nos acompanhe agora mesmo, de qualquer maneira vamos "
						+ "conseguir tirar de voc� onde a princesa est�o, n�o importam os meios.\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin estava completamente confuso e sem saber como agir, ele "
						+ "pensava em como os pertences dele tinham aparecido dentro do quarto da princesa e "
						+ "ao mesmo tempo pensava que se fosse pego, seria torturado porque n�o tinha provas "
						+ "de sua inoc�ncia (A guarda real, era uma conhecida e temida institui��o que tinha a"
						+ " reputa��o de torturar pessoas mesmo sem saber se tinham envolvimento ou n�o com as "
						+ "situa��es), diante dessa decis�o, Aelin se lembra de um feiti�o de fuga que ele "
						+ "conhece e decide se evadir para conseguir provar sua inoc�ncia, rapidamente ele "
						+ "come�a a dizer as palavras m�gicas:\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question3(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					write("\nNarrador: A vis�o de Aelin fica escurecida e n�o consegue mais se mexer, aos poucos a vida se esvai"
							+ "e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Ap�s alguns meses de fuga e esconderijos, Aelin finalmente chega na \n "
						+ "cidade, ele procura entrar sem chamar aten��o para si, aonde onde ele olha, consegue ver \n "
						+ "cartazes que falam sobre a princesa desaparecida e sobre recompensas para quem ajudar no \n "
						+ "resgate ou encontrando o culpado, de qualquer maneira ele vai se esgueirando para dentro \n "
						+ "da cidade e chega em frente a uma pequena casa, claramente n�o s�o utilizada por nobres e \n "
						+ "est�o relativamente abandonada, ele bate tr�s vezes na porta e ap�s alguns segundos ela \n "
						+ "se abre, quem aparece � um elfo alto de cabelos loiros e com uma certa idade e ap�s \n "
						+ "identificar Aelin ele diz:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nMaedhros: Entre, entre rapidamente...", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Ap�s eles entrarem e fecharem a porta Aelin diz:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Tio.... Como � bom ver algum rosto familiar ! Estou a meses assim, me \n"
						+ "escondendo e procurando pistas sobre o desaparecimento da princesa, por enquanto ouvi \n "
						+ "rumores que ela foi levada para o norte do pa�s, gostaria muito de encontra-los logo e \n "
						+ "limpar o meu nome.... Sei que voc� est�o aposentado, mas n�o poderia me ajudar \n ? ",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin sabia que seu tio fazia parte de um grupo anti-governo na regi�o e \n "
						+ " que tinham uma certa influ�ncia e facilidade para encontrar informa��es \n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nMaedhros: Aelin... Que bom te ver ! Eu nunca acreditei que isso havia sido obra \n"
						+ "sua ! Um jovem mago brilhante como você e com ambi��o de se tornar o Guardi�o nunca ir�a \n"
						+ " jogar tudo pro ar para raptar princesa nenhuma... Fique aqui dentro, tem comida e �gua \n "
						+ "para voc�, se abaste�a, coma e descanse, vou ver oque consigo fazer para ajuda-lo, \n "
						+ "gostaria de poder aproveitar a sua presen�a se n�o estivessemos com t�o pouco tempo... \n "
						+ "mas enfim.... fique aqui e tente n�o chamar aten��o !", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Enquanto Aelin tirava seu tempo de descanso dessa longa viagem, \n "
						+ "Maedhros foi at� a cidade e conversou com quem podia para conseguir informa��es e tamb�m \n "
						+ "foi at� seu amigo mercador para comprar um item para ajudar Aelin em sua jornada ! \n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Fun��o de Sorteio do item
				itemGained = verifyItem(itemGained);

				// Fun��es de verifi��o dos status dos itens simples
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

				write("\nNarrador: Aelin est� deitado e escuta a porta se abrindo e seu Tio entrando, Maedhros \n "
						+ "chama Aelin e diz:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				// Verifica��o do numero do item, utilizado para ajustar o di�logo
				// abaixo para o
				// item sorteado.
				num = verifyItemNum(itemGained);

				write("\nMaedhros: Aelin, Aelin ! Consegui informa��es �teis para voc� e tamb�m te trouxe \n"
						+ itemName[num] + " , espero que voc� fa�a um bom uso dele, este item \n" + itemStatus[num]
						+ ". Sobre as informa��es, "
						+ " descobri que os rumores realmente estavam corretos, voc� deve seguir para o norte at� Kiev,\n "
						+ "ap�s o desaparecimento da princesa, habitantes locais avistaram uma pessoa vestida com trajes reais,\n "
						+ "cercada por homens suspeitos, aparetemente mantida a for�a com eles. Voc� deve partir logo, n�o \n"
						+ "sabemos qual ser� a inten��o dos sequestradores com essa ousada atitude.",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Tio..... N�o sei como te agradecer, n�o imaginei que estaria aqui neste momento....\n"
						+ "Eu estava me preparando para o teste... s�o queria poder cuidar do Reino e deixar minha familia orgulhosa de mim.... \n"
						+ "Devo ir Tio, mas espero tudo de melhor a você, espero poder retribuir sua gentileza... Adeus....\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nMaedhros: Aelin... Apenas mee prometa que vai salvar a princesa e limpar o nome de nossa fam�lia.... Adeus....\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin segue em dire�ao a Kiev, a noite cai na floresta e Aelin para com a inten��o de descansar\n"
						+ "mas � surpreendido por um Ghoul que estava perambulando na regi�o.\n", TimeUnit.MILLISECONDS,
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Ap�s perceber que eliminou o a amea�a, Aelin descansa o resto da noite e parte \n"
						+ "para Kiev de manh�.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Aelin finalmente chega em seu destino, ap�s semanas de viagem e passando por diversos desafios\n "
						+ "no caminho ele concluir sua viagem e come�a a investigar a informa��o que seu Tio passou, sobre a menina que\n "
						+ "parecia estar sendo mantida a for�a como ref�m. Os habitantes dizem que a tal mulher estava na Catetral de Santa \n"
						+ "Sofia, uma igreja famosa da cidade e Aelin segue at� o local.\n", TimeUnit.MILLISECONDS,
						timer);

				System.out.println("");

				write("\nNarrador: Ele chega no local, � um pr�dio enorme de paredes brancas e telhas verdes, no alto das torres\n "
						+ "� poss�vel ver c�pulas douradas com cruzes em cima, ele percebe movimenta��o de pessoas que parecem guardar o\n "
						+ "local e entra no local sem chamar aten��o.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Ele vai se esgueirando pelos c�modos da catedral e ap�s andar consideravelmente, encontra uma \n "
						+ "porta sendo guardada por tr�s guardas. Aelin decide conjurar um feiti�o para deixar os guardas em uma ilus�o,\n "
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Entrando no quarto, Aelin v� Lyuba deitada e amarrada na cama com cordas e rapidamente vai em sua dire��o para solta-l�,\n "
						+ "com sua magia de fogo de maneira reduzida ele pretende queimar as amarras, ele come�a a conjurar:\n",
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Aelin corre para Lyuba e e fala com ela:", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Magestade ! Voc� est� bem ? Consegue me dizer oque houve ? Est�o me acusando de ter raptado voc� e\n "
						+ "tive que fugir para n�o ser torturado pelo seu sequestro !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nLyuba: Aelin, j� estava perdendo as esperan�as de voltar com vida... Que pena que estamos nos reencontrando dessa \n"
						+ "maneira, ainda mais sabendo que as pessoas do castelo est�o procurando voc� por algo que n�o fez.... Vou ajustar\n "
						+ "isso assim que voltar, te dou a minha palavra !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Princesa, voc� conseguiu identificar quem foi o autor desse absurdo ?\n",
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
						+ "acabar com voc� eu mesmo e... Salvar a Princesa !!! Vou usar um feiti�o para alterar a mem�ria dela e reescrever a hist�ria \n"
						+ "em que por meus atos her�icos, vou ganhar a m�o da princesa ap�s salv�-la de um delinquente como voc� !",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Takeo ! Como voc� p�de ? Traiu Winterhold e o Reino e seus colegas Magos, voc� � uma vergonha.... Chega de fugir, � meu dever \n "
						+ "cessar esse absurdo e salvar a Princesa !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Narrador: Como dito anteriormente, Aelin � r�pido e preciso. N�o passa nem 3 segundos e j� est� conjurando uma bola de fogo em dire��o de \n"
						+ "Takeo enquanto se posiciona estrat�gicamente:\n", TimeUnit.MILLISECONDS, timer);

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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: A batalha continua e Aelin n�o ve outra op��o se n�o conjurar o seu feiti�o mais poderoso, a �ltima v�z, ele sabe que se \n "
						+ "falhar e n�o controlar corretamente, pode acabar morrendo por conta da enorme força e energia que o feiti�o pode emitir, al�m de \n "
						+ "que pode acabar matando a todos ao seu redor.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador:  Por estar se esgotando e n�o ter op��es, ele inicia o feiti�o e enquanto ele vai seguindo uma luz muito forte se forma em  \n"
						+ "suas m�os, � poss�vel ver que aquela luz � como se fosse feita de algo f�sico, era algo assutador e realmente poderoso, ele segue \n "
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se\n"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Ap�s a luta, Aelin pega a princesa e segue viagem para o Reino. Quando chega, � recebido de maneira Brutal pelos \n "
						+ "guardas da entrada que o abordam e o prendem mas s�o interrompidos pela princesa que diz:\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Lyuba: Parem Imediatamente ! � assim que voc�s v�o tratar a pessoa que me salvou ? Vou pedir pela cabe�sa \n"
						+ "\n " + "de voc�s !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nGuarda: Me perdoe Magestade ! Pertences deste elfo foram encontrados em seus aposentos, ele era o principal\n "
						+ "suspeito !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nLyuba: Foi o mago Takeo quem me raptou, esse jovem foi quem me libertou e derrotou ele. Eu preciso de cuidados, me levem para o \n"
						+ "castelo, enquanto ao jovem, avisem a todos do ocorrido.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\n Narrador:Alguns dias depois Aelin foi chamado pela realeza para participar do banquete de comemora��o ao retorno da princesa. \n "
						+ "Ao chegar no local o Rei ao notar a sua presen�a bradou: \n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nRei Amis IV: Aelin !!! Somos gratos a voc� pelo seu servi�o, j� solicitei aos magos que garantam sua vaga no col�gio de Winterhold ! /n "
						+ "Tamb�m estou indicando voc� para ser um dos candidatos de � Guardi�o do Reino, erramos em duvidar de voc� e gostariamos de compensa-lo./n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nAelin: Magestade.... Muito obrigado pela sua generosidade. Sempre foi meu dever defender o Reino, \n "
						+ ", não poderia ter feito diferente.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nLyuba: Tamb�m sou grata a voc� por sua lealdade ! Desfizemos o erro e n�o mas ir�o ver a sua familia com desprezo e sim honra !\n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("\nNarrador: Assim foi o incidente com a Princesa que virou conto dentre os habitantes de Odessa, da coragem e determina��o de um simples  \n"
						+ "simples jovem mago que queria seguir os passos do pai e se tornar o guardi�o? do Reino.\n",
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
				write("\nVin�cius Monteiro Lopes\n", TimeUnit.MILLISECONDS, timer);

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
