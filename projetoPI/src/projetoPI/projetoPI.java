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

	public static int question1(int health) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println(
					"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

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
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

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
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
					+ "resultado de x� . x�:\n");

			String Quest3[] = { "x^5", "x^4", "5x", "x�+x�", "Nenhuma das alternativas" };
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
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
									+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

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
					"Aelin: Vamos ver se você domina algumas habilidades para os proximos passos qual o resultado da seguinte soma envolvendo numeros ? \n"
							+ "negativos : (-4) + 9 = \n");
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

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
									+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explos�o e causando �X� dano em si mesmo. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");
					;

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");
					;

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Quais expressões a baixo são equivalentes a 5^2/5^8:\n");

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

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");
				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");
					;

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");
				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

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

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");
				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");
				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
									+ " a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
									+ "em direcão ao alvo que é congelado instantaneamente \n");
				} else {

					System.out.println(
							"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
									+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
									+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
									+ "causando uma explosão próxima demais causando 10 de dano. \n");

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

			System.out.println("Aelin:Escolha a equação que resultará em uma reta crescente");

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

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			}

		} else if (a == 1) {

			System.out.println(
					"Os computadores utilizam o sistema binário ou de base 2 que é um sistema de numeração em que todas\n"
							+ "as quantidades se representam com base em dois números, ou seja, (0 e 1). Em um computador o número 2012, em base decimal, \n"
							+ "será representado, em base binária, por:\n");

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

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			}

		} else if (a == 2) {

			System.out.println(
					"- Aelin: abe-se que o preço a ser pago por uma corrida de táxi inclui uma parcela fixa,\n"
							+ " que é denominada bandeirada, e uma parcela variável, que é função da distância percorrida. Se o preço da bandeirada é R$4,60\n"
							+ "e o quilômetro rodado é R$0,96, qual a distância percorrida por um passageiro que pagou R$19,00?\n");

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

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
									+ "e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+ "para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			}

		}

		return health;

	}

	public static int question4(int health, int maxDodge, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, hit, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		// Rolagem de acerto.
		hit = generation.nextInt(25);

		// Estrutura de decisão para validar o possível ataque.
		if (maxDodge >= hit) {

			System.out.println(
					"Narrador: Aelin é um elfo, eles são conhecidos por sua agilidade e precisão, o Ghoul não tem "
							+ "chances contra uma movimentação tão precisa, e Aelin tomando distância inicia a conjuração de um feitiço"
							+ " de ataque para acabar com a batalha.\n");

			if (a == 0) {

				System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

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

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

				String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "x³-4x²-11x-6", answer2 = "";

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
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}
					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				}

			} else if (a == 2) {

				System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

				String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "2x²+10x+24", answer3 = "";

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
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							correct = false;

						}

					}

					break;

				}

			}

			// Personagem foi atingindo pelo inimigo.

		} else {

			health = 5;

			System.out.println(
					"Narrador: A criatura foi mais rápida e dispara em direção de Aelin com suas mãos pútridas, o inimigo foi rápido demais, "
							+ "o Ghoul se aproxima dele e finca os dentes no ombro de Aelin que toma " + health
							+ " de dano do seu oponente.\n");

			if (a == 0) {

				System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B ?\n");

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

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ 5 + " de dano do seu próprio feitiço.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						}

						health += +5;

					}

					break;

				case "b":
				case "B":

					if (correct1.equals(Quest1[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest1[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest1[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest1[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ 5 + " de dano do seu próprio feitiço.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				}

			} else if (a == 1) {

				System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

				String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct2 = "x³-4x²-11x-6", answer2 = "";

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
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "c":
				case "C":

					if (correct2.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "d":
				case "D":

					if (correct2.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "e":
				case "E":

					if (correct2.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				}

			} else if (a == 2) {

				System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

				String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "-2x²+10x+24²",
						"Nenhuma das alternativas" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct3 = "2x²+10x+24", answer3 = "";

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
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "b":
				case "B":

					if (correct3.equals(Quest3[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "c":
				case "C":

					if (correct3.equals(Quest3[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "d":
				case "D":

					if (correct3.equals(Quest3[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				case "e":
				case "E":

					if (correct3.equals(Quest3[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
										+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							clock = 0;
							clock++;

						} else if (clock == 2) {

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

							health += +5;

							correct = false;

						}

					}

					break;

				}

			}

		}

		return health;

	}

	public static int question5(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

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

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

			String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "x³-4x²-11x-6", answer2 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					health = 5;

					System.out.println(
							"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
									+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
									+ health + " de dano do seu próprio feitiço.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}
				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

			String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "2x²+10x+24", answer3 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		}

		return health;

	}

	public static int question6(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

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

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

			String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "x³-4x²-11x-6", answer2 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					health = 5;

					System.out.println(
							"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
									+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
									+ health + " de dano do seu próprio feitiço.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}
				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

			String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "2x²+10x+24", answer3 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		}

		return health;

	}

	public static int question7(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

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

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

			String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "x³-4x²-11x-6", answer2 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					health = 5;

					System.out.println(
							"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
									+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
									+ health + " de dano do seu próprio feitiço.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}
				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

			String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "2x²+10x+24", answer3 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		}

		return health;

	}

	public static int question8(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

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

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

			String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "x³-4x²-11x-6", answer2 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					health = 5;

					System.out.println(
							"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
									+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
									+ health + " de dano do seu próprio feitiço.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}
				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

			String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "2x²+10x+24", answer3 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		}

		return health;

	}

	public static int question9(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

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

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

			String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "x³-4x²-11x-6", answer2 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					health = 5;

					System.out.println(
							"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
									+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
									+ health + " de dano do seu próprio feitiço.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}
				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

			String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "2x²+10x+24", answer3 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		}

		return health;

	}

	public static int question10(int health, String itemGained) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a, clock = 2;
		boolean correct = true;

		a = generation.nextInt(2);
		if (a == 0) {

			System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

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

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

			String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct2 = "x³-4x²-11x-6", answer2 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					health = 5;

					System.out.println(
							"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
									+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
									+ health + " de dano do seu próprio feitiço.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}
				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

			String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²",
					"Nenhuma das alternativas" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct3 = "2x²+10x+24", answer3 = "";

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
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
							"Narrador: Aelin completa o encantamento e tudo oque se vê são chamas e uma enorme bola "
									+ "de fogo vai em direção ao Ghoul que é completamente derretido por tamanho calor.\n");

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						correct = false;

					}

				} else {

					// Item de segunda tentativa.

					if (itemGained.equals("horacleHourglass")) {

						clock = 0;
						clock++;

					} else if (clock == 2) {

						health = 5;

						System.out.println(
								"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
										+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
										+ health + " de dano do seu próprio feitiço.\n");

						correct = false;

					}

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

		String[] itemName = { "um p�o �lfico", "uma po��o de vida", "uma tunica de mithril",
				"um grim�rio do conhecimento", "a bota do sagaz", "o ros�rio do imortal",
				"o cajado da destrui��o", "o anel de fam�lia" };

		String[] itemStatus = { "Recupera 5 pontos de vida", "Recupera 20 pontos de vida",
				"Diminui em 10 o dano de inimigos", "iminui em 5 o dano de habilidades mal sucedidas",
				"Aumenta a chance de se esquivar de um ataque",
				"Permite que o jogador se levante com 30 de hp caso receba uma ferida mortal",
				"Aumenta o dano em 50 de suas m�gias de ataque",
				"Uma heran�a de nossa fam�lia, apesar de n�o dar "
						+ "fazer nada, deixa viva a mem�ria dentro dos nossos cora��es" };

		int c = 0, num, timer = 10;

		String itemGained = " ";

		// jogo:

		int option = 0, repeatLoop = 0;

		// player status:

		int maxHealth = 100, maxDefense = 5, maxAttack = 20, maxDodge = 15;

		// poss�vel altera��o nos status:

		int health = 0, defense = 0, attack = 0, dodge = 0, addHealth = 0;

		do {

			write("Selecione a op��o desejada:\n", TimeUnit.MILLISECONDS, timer);
			write("\n[1] Instru��ess", TimeUnit.MILLISECONDS, timer);
			write("\n[2] Jogar", TimeUnit.MILLISECONDS, timer);
			write("\n[3] Cr�ditos", TimeUnit.MILLISECONDS, timer);
			write("\n[4] Sair", TimeUnit.MILLISECONDS, timer);

			System.out.println("");
			option = input.nextInt();
			System.out.println("");

			switch (option) {

			case 1:

				write("\nO jogo � baseado em RPG de mesa, o mestre da mesa que chamamos de narrador \n"
						+ "ir� guiar a gameplay e de certa maneira controlar o mundo ao redor de Aelin, voc� deve \n"
						+ "acertar as perguntas para ser bem sucedido nas magias que ir� lan�ar ou pode tomar dano\n"
						+ " de inimigos e dos seus pr�prios feiti��s!\n", TimeUnit.MILLISECONDS, timer);

				break;

			case 2:

				write("Em um tempo antigo, cheio de viol�ncia e misticismo, os grandes magos de Winterhold \n"
						+ "ap�s dezenas de milhares de anos descobriram uma forma n�o convencional de magia que \n"
						+ "ultrapassava o poder destrutivo conhecido at� o momento. Descobriram que os c�lculos \n"
						+ "matem�ticos escondiam os feiti�os mais poderosos. Nossa hist�ria se passa 15 anos ap�s \n"
						+ "essa descoberta hist�rica quando nosso personagem \"Aelin\" filho \"Galandriel\" \n"
						+ "(Um dos magos que participou da descoberta do novo tipo de magia e um dos respons�veis pela \n"
						+ "pesquisa realizadas com a mesma), ingressa no col�gio para estudar com o objetivo de se \n"
						+ "tornar o \"Guardi�o\" do Reino.\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Narrador: O dia est� amanhecendo, uma pequena n�voa surge por entre as �rvores cobrindo a �rea \n"
						+ "de floresta em volta da casa de Galandriel, em seu quarto, Aelin ronca como nunca por conta do cansa�o \n"
						+ "causado pelos extensos treinos que vem tendo para garantir que consiga uma vaga entre os grandes magos \n"
						+ "de Winterhold e poss�velmente, ser guardi�o do reino. O Silencio que era rompido apenas pelos altos \n"
						+ "roncos do nosso her�i, foi quebrado quando Galandriel chegava na entrada do quarto e em alta voz bradou: \n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Narrador: Ao abrir os olhos, Aelin se depara com Galandriel olhando ele da entrada de seu quarto, \n"
						+ "um lugar com uma luminosidade relativa proveniente de velas, com pisos de madeira e paredes de pedra. \n "
						+ "Ele tamb�m v� uma enorme cole��o de livros, dos quais ele subtraiu muito tempo de sua vida folheando. \n"
						+ "O local est� um pouco bagun�ado com pratos, canecas sujas e folhas de pergaminhos espalhadas sendo que \n"
						+ "algumas est�o amassadas, provavelmente por ele n�o ter tempo h�bil para deixar os estudos e fazer algum \n"
						+ "tipo de limpeza ou organiza��o.\n", TimeUnit.MILLISECONDS, timer);

				write("Aelin:  Ahhhhhh, n�o acredito que j� amanheceu ! Parece que acabei de me deitar ! Vou levantar Pai, \n"
						+ "agrade�o pelo aviso !\n", TimeUnit.MILLISECONDS, timer);

				System.out.println("");

				write("Galandriel: � o m�ximo que posso fazer por voc�, sabe bem que eu n�o posso interferir em mais nada \n"
						+ "em rela��o ao seu treino, ou voc� pode acabar sendo punido com o cancelamento dos seus testes... \n",
						TimeUnit.MILLISECONDS, timer);

				System.out.println(" ");

				write("Narrador: Enquanto Galandriel se retira, Aelin se levanta e segue para fazer suas necessidades \n"
						+ "matinais. Ap�s termina-l�s, pega o seu cajado (Item importante para conjurar magias, a madeira m�gica canaliza \n"
						+ "a mana utilizada intensificando seus efeitos) e segue para o local de treino para continuar sua prepara��o. \n"
						+ "Chegando no lugar ele organiza as magias que ele selecionou e come�a a proferir palavas em �lfico antigo: \n"
						+ "(Lembre-se que enquando o Aelin estiver conjurando, ser� necess�rio que as quest�es matem�ticas sejam \n"
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

				write("Narrador: Ap�s o lancamento do feiti�o, Aelin olha em sua lista o pr�ximo e "
						+ "inicia a conjura��o: \n", TimeUnit.MILLISECONDS, timer);

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

				write("\nL�der da Guarda Real: Aelin !!! Pe�o que voc� nos acompanhe imediatamente !!! "
						+ "N�s n�o queremos machuca-lo, mas vamos utilizar os meios necess�rios para te apreender. "
						+ "Venha sem resistir !", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nAelin: Dragomir ? Oque significa isso tudo ? Me apreender ? Resisitir ? "
						+ "Voc� n�o est� fazendo sentido !\r\n" + "Oque est� acontecendo ?\n",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nL�der da Guarda Real: Bem... Provavelmente voc� deve saber oque houve, mas a "
						+ "princesa foi raptada e encontramos uma t�nica e um dos cajados que pertecem a voc� ! "
						+ "Agora pare com esse teatro e nos acompanhe agora mesmo, de qualquer maneira vamos "
						+ "conseguir tirar de voc� onde a princesa est�, n�o importam os meios.\n",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Aelin estava completamente confuso e sem saber como agir, ele "
						+ "pensava em como os pertences dele tinham aparecido dentro do quarto da princesa e "
						+ "ao mesmo tempo pensava que se fosse pego, seria torturado porque n�o tinha provas "
						+ "de sua ino�ncia (A guarda real, era uma conhecida e temida institui��o que tinha a"
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

				write("\nNarrador: Ap�s alguns meses de fuga e esconderijos, Aelin finalmente chega na "
						+ "cidade, ele procura entrar sem chamar aten��o para si, aonde onde ele olha, consegue ver "
						+ "cartazes que falam sobre a princesa desaparecida e sobre recompensas para quem ajudar no "
						+ "resgate ou encontrando o �culpado�, de qualquer maneira ele vai se esgueirando para dentro "
						+ "da cidade e chega em frente a uma pequena casa, claramente n�o � utilizada por nobres e "
						+ "est� relativamente abandonada, ele bate tr�s vezes na porta e ap�s alguns segundos ela "
						+ "se abre, quem aparece � um elfo alto de cabelos loiros e com uma certa idade e ap�s "
						+ "identificar Aelin ele diz:", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nMaedhros: Entre, entre rapidamente...", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Ap�s eles entrarem e fecharem a porta Aelin diz:", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nAelin: Tio.... Como � bom ver algum rosto familiar ! Estou a meses assim, me "
						+ "escondendo e procurando pistas sobre o desaparecimento da princesa, por enquanto ouvi "
						+ "rumores que ela foi levada para o norte do pa�s, gostaria muito de encontra-l� logo e "
						+ "limpar o meu nome.... Sei que voc� est� aposentado, mas n�o poderia me ajudar ? ",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Aelin sabia que seu tio fazia parte de um grupo anti-governo na regi�o e"
						+ " que tinham uma certa influ�ncia e facilidade para encontrar informa��es",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nMaedhros: Aelin... Que bom te ver ! Eu nunca acreditei que isso havia sido obra "
						+ "sua ! Um jovem mago brilhante como voc� e com ambi��o de se tornar o �Guardi�o� nunca iria"
						+ " jogar tudo pro ar para raptar princesa nenhuma... Fique aqui dentro, tem comida e �gua "
						+ "para voc�, se abaste�a, coma e descanse, vou ver oque consigo fazer para ajuda-lo, "
						+ "gostaria de poder aproveitar a sua presen�a se n�o estivessemos com t�o pouco tempo... "
						+ "mas enfim.... fique aqui e tente n�o chamar aten��o !", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Enquanto Aelin tirava seu tempo de descanso dessa longa viagem, "
						+ "Maedhros foi at� a cidade e conversou com quem podia para conseguir informa��es e tamb�m "
						+ "foi at� seu amigo mercador para comprar um item para ajudar Aelin em sua jornada ! ",
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

				write("\nNarrador: Aelin est� deitado e escuta a porta se abrindo e seu Tio entrando, Maedhros "
						+ "chama Aelin e diz:", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				// Verifica��o do n�mero do item, utilizado para ajustar o di�logo
				// abaixo para o
				// item sorteado.
				num = verifyItemNum(itemGained);

				write("\nMaedhros: Aelin, Aelin ! Consegui informa��es �teis para voc� e tamb�m te trouxe "
						+ itemName[num] + " , espero que voc� fa�a um bom uso dele, este item " + itemStatus[num]
						+ ". Sobre as inform��es, "
						+ " descobri que os rumores realmente estavam corretos, voc� deve seguir para o norte at� Kiev, "
						+ "ap�s o desaparecimento da princesa, habitantes locais avistaram uma pessoa vestida com trajes reais, "
						+ "cercada por homens suspeitos, aparetemente mantida a for�a com eles. Voc� deve partir logo, n�o "
						+ "sabemos qual ser� a inten��o dos sequestradores com essa ousada atitude.",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nAelin: Tio..... Não sei como te agradeçer, não imaginei que estaria aqui neste momento...."
						+ "Eu estava me preparando para o teste... só queria poder cuidar do Reino e deixar minha família orgulhosa de mim.... "
						+ "Devo ir Tio, mas espero tudo de melhor a você, espero poder retribuir sua gentileza... Adeus....",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nMaedhros: Aelin... Apenas mee prometa que vai salvar a princesa e limpar o nome de nossa família.... Adeus....",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Aelin segue em direção a Kiev, a noite cai na floresta e Aelin para com a intenção de descansar"
						+ "mas é surpreendido por um Ghoul que estava perambulando na região.", TimeUnit.MILLISECONDS,
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Ap�s perceber que eliminou o a amea�a, Aelin descansa o resto da noite e parte "
						+ "para Kiev de manh�.\n", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Aelin finalmente chega em seu destino, ap�s semanas de viagem e passando por diversos desafios "
						+ "no caminho ele concluir sua viagem e come�a a investigar a informa��o que seu Tio passou, sobre a menina que "
						+ "parecia estar sendo mantida a for�a como ref�m. Os habitantes dizem que a tal mulher estava na Catetral de Santa "
						+ "Sofia, uma igreja famosa da cidade e Aelin segue at� o local.\n", TimeUnit.MILLISECONDS,
						timer);
				
				System.out.println("");

				write("\nNarrador: Ele chega no local, � um pr�dio enorme de paredes brancas e telhas verdes, no alto das torres "
						+ "� poss�vel ver c�pulas douradas com cruzes em cima, ele percebe movimenta��o de pessoas que parecem guardar o "
						+ "local e entra no local sem chamar aten��o.\n", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Ele vai se esgueirando pelos c�modos da catedral e ap�s andar consideravelmente, encontra uma "
						+ "porta sendo guardada por tr�s guardas. Aelin decide conjurar um feiti�o para deixar os guardas em uma ilus�o, "
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Entrando no quarto, Aelin v� Lyuba deitada e amarrada na cama com cordas e rapidamente vai em sua dire��o para solta-l�, "
						+ "com sua magia de fogo de maneira reduzida ele pretende queimar as amarras, ele come�a a conjurar:",
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Aelin corre para Lyuba e e fala com ela:", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nAelin: Magestade ! Voc� est� bem ? Consegue me dizer oque houve ? Est�o me acusando de ter raptado voc� e "
						+ "tive que fugir para n�o ser torturado pelo seu sequestro !", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nLyuba: Aelin, j� estava perdendo as esperan�as de voltar com vida... Que pena que estamos nos reencontrando dessa "
						+ "maneira, ainda mais sabendo que as pessoas do castelo est�o procurando voc� por algo que n�o fez.... Vou ajustar "
						+ "isso assim que voltar, te dou a minha palavra !", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nAelin: Princesa, voc� conseguiu identificar quem foi o autor desse absurdo ?",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nLyuba: Infelizmente sim... A pessoa estava bem em baixo dos nossos narizes.... A mente por traz desse crime "
						+ "�....", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador: Enquanto Lyuba falava, uma alta voz bradou da entrada do quarto dizendo:",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nTakeo: Eu mesmo... Jovem Aelin... Fiz um sorteio para ver qual dos jovens haveriam de carregar a culpa por mim, mal pude me "
						+ "conter quando vi que era o filho do arrogante Galandriel, realmente me enchi de alegria ! Mas infelizmente vou ter que "
						+ "acabar com voc� eu mesmo e... Salvar a Princesa !!! Vou usar um feiti�o para alterar a mem�ria dela e reescrever a hist�ria "
						+ "em que por meus atos her�icos, vou ganhar a m�o da princesa ap�s salva-la de um delinquente como voc� !",
						TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nAelin: Takeo ! Como voc� p�de ? Traiu Winterhold e o Reino e seus colegas Magos, voc� � uma vergonha.... Chega de fugir, � meu dever "
						+ "cessar esse absurdo e salvar a Princesa !", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("Narrador: Como dito anteriormente, Aelin � r�pido e preciso. N�o passa nem 3 segundos e j� est� conjurando uma bola de fogo em dire��o de "
						+ "Takeo enquanto se posiciona estrat�gicamente:", TimeUnit.MILLISECONDS, timer);
				
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: Ap�s a troca de ataques, Aelin inicia um feiti�o el�trico que envolve seu corpo com eletricidade e vai crescendo enquanto "
						+ "ele profere as palavras:", TimeUnit.MILLISECONDS, timer);
				
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}

				write("\nNarrador: A batalha continua e Aelin n�o ve outra op��o se n�o conjurar o seu feiti�o mais poderoso, a ��ltima Luz�, ele sabe que se "
						+ "falhar e n�o controlar corretamente, pode acabar morrendo por conta da enorme for�a e energia que o feiti�o pode emitir, al�m de "
						+ "que pode acabar matando a todos ao seu redor.", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");

				write("\nNarrador:  Por estar se esgotando e n�o ter op��es, ele inicia o feiti�o e enquanto ele vai seguindo uma luz muito forte se forma em "
						+ "suas m�os, � poss�vel ver que aquela luz � como se fosse feita de algo f�sico, era algo assutador e realmente poderoso, ele segue "
						+ "proferindo as palavras:", TimeUnit.MILLISECONDS, timer);
				
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

					write("\nNarrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se"
							+ " esvai e nada mais importa....\n", TimeUnit.MILLISECONDS, timer);
					write("\nGame Over !\n", TimeUnit.MILLISECONDS, timer);

					break;

				}
				
				write("\nNarrador: Ap�s a luta, Aelin pega a princesa e segue viagem para o Reino. Quando chega, � recebido de maneira Brutal pelos "
						+ "guardas da entrada que o abordam e o prendem mas s�o interrompidos pela princesa que diz:", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("Lyuba: Parem Imediatamente ! � assim que voc�s v�o tratar a pessoa que me salvou ? Vou pedir pela cabe�a "
						+ "e voc�s !", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("\nGuarda: Me perdoe Magestade ! Pertences deste elfo foram encontrados em seus aposentos, ele era o principal "
						+ "suspeito !", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("\nLyuba: Foi o mago Takeo quem me raptou, esse jovem foi quem me libertou e derrotou ele. Eu preciso de cuidados, me levem para o "
						+ "castelo, enquanto ao jovem, avisem a todos do ocorrido.", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("\nNarrador: Alguns dias depois Aelin foi chamado pela realeza para participar do banquete de comemora��o ao retorno da princesa. "
						+ "Ao chegar no local o Rei ao notar a sua presen�a bradou:", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("\nRei Amis IV: Aelin !!! Somos gratos a voc� pelo seu servi�o, j� solicitei aos magos que garantam sua vaga no col�gio de Winterhold ! "
						+ "Tamb�m estou indicando voc� para ser um dos candidatos de �Guardi�o do Reino�, erramos em duvidar de voc� e gostariamos de compensa-lo."
						, TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("\nAelin: Magestade.... Muito obrigado pela sua generosidade. Sempre foi meu dever defender o Reino, "
						+ "n�o poderia ter feito diferente.", TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("\nLyuba: Tamb�m sou grata a voc� por sua lealdade ! Desfizemos o erro e n�o mas ir�o ver a sua familia com desprezo e sim com honra !"
						, TimeUnit.MILLISECONDS, timer);
				
				System.out.println("");
				
				write("\nNarrador: Assim foi o incidente com a Princesa que virou conto dentre os habitantes de Odessa, da coragem e determina��o de um simples "
						+ "jovem mago que queria seguir os passos do pai e se tornar o �Guardi�o� do Reino.", TimeUnit.MILLISECONDS, timer);
				
				repeatLoop = 1;
				
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

				write("\nObrigado por jogar !", TimeUnit.MILLISECONDS, timer);
				System.exit(0);

				break;

			default:

				write("\nValor inv�lido !", TimeUnit.MILLISECONDS, timer);

				break;

			}

		} while (repeatLoop == 0);

		input.close();
		// teste

	}

}
