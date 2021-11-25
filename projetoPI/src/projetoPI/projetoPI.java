package projetoPI;

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class projetoPI {

	// String itemName[] = { "", "elvenBread", "healthPotion", "knowlegdeGrimoire",
	// "cannyBoots", "imortalsRosary" "horacleHourglass", "staffOfDestruction",
	// "clairvoyantEye", "familyRing" };

	// Verificador do item que ser� recebido.
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

	// Itens de status simples (N�o testado ainda).
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

	// Item que ressuscita o personagem (N�o testado ainda).
	public static int imortalsRosary(String itemGained, int maxHealth) {

		int health = 0;

		if (itemGained.equals("imortalsRosary")) {

			if (maxHealth <= 0) {

				health = 30;

			}

		}

		return health;

	}

	// Possibilidade para randomificar as quest�es entre algumas.
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
	// completa
	public static int question2(int health) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int a;

		a = generation.nextInt(2);

		if (a == 0) {

			System.out.println(
					"Aelin: Vamos ver se você domina algumas habilidades para os proximos passos qual o resultado da seguinte soma envolvendo numeros ? \n"
					+"negativos : (-4) + 9 = \n");
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
							+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
						+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
						"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
								+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
								+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
								+ "causando uma explosão próxima demais causando 10 de dano. \n");;

					health = 5;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
						"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
						+ "em direcão ao alvo que é congelado instantaneamente \n");

				} else {

					System.out.println(
						"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
								+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
								+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
								+ "causando uma explosão próxima demais causando 10 de dano. \n");;

					health = 5;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
						"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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

			String Quest2[] = { "(5^2)^-3" , "1^-6", "(5^2)^-8" , "(-5)^-9",};
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
						+ "em direcão ao alvo que é congelado instantaneamente \n");
				} else {

					System.out.println(
						"Narrador: Enquanto a equaçãoes mágicas são proferidas, um vento forte se forma ao redor de Aelin \n"
								+ "Aelin, uma aura gelada se forma ao seu redor,centralizando a baixa temperatura no centro de suas mãos \n"
								+ "Épossivel ver que as ondas de frio intenso vão em direcão as mãos de aelin,Porém algo da errado e o frio se exande\n"
								+ "causando uma explosão próxima demais causando 10 de dano. \n");;

					health = 5;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
						"Enquanto a equações magicas são profeeridas, um vento gelado forte se forma ao redor de Aelin,uma aura gelada se forma ao seu redor,centralizando \n"
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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

			String Quest3[] = { "6^36 . 8^63", "1/6^13.8^63" , "1/6^13.8^18" , "6^5.8^2" , "Nenhuma das alternativas" };
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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
						+" a baixar temperautra no centro de suas mãos.Após o término da conjuração Aelin aponta\n"
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

			System.out.println(
					"Aelin:Escolha a equação que resultará em uma reta crescente");

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
									+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
									+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
							"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
									+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
									+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
									+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
									+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct1.equals(Quest1[urn.get(Count[1])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct1.equals(Quest1[urn.get(Count[2])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct1.equals(Quest1[urn.get(Count[3])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct1.equals(Quest1[urn.get(Count[4])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			}

		} else if (a == 1) {

			System.out.println("Os computadores utilizam o sistema binário ou de base 2 que é um sistema de numeração em que todas\n"
			+"as quantidades se representam com base em dois números, ou seja, (0 e 1). Em um computador o número 2012, em base decimal, \n"
			+"será representado, em base binária, por:\n");

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
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct2.equals(Quest2[urn.get(Count[1])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct2.equals(Quest2[urn.get(Count[2])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct2.equals(Quest2[urn.get(Count[3])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct2.equals(Quest2[urn.get(Count[4])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			}

		} else if (a == 2) {

			System.out.println("- Aelin: abe-se que o preço a ser pago por uma corrida de táxi inclui uma parcela fixa,\n"
			  +" que é denominada bandeirada, e uma parcela variável, que é função da distância percorrida. Se o preço da bandeirada é R$4,60\n"
			 +"e o quilômetro rodado é R$0,96, qual a distância percorrida por um passageiro que pagou R$19,00?\n");

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
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "b":
			case "B":

				if (correct3.equals(Quest3[urn.get(Count[1])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "c":
			case "C":

				if (correct3.equals(Quest3[urn.get(Count[2])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "d":
			case "D":

				if (correct3.equals(Quest3[urn.get(Count[3])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

					health = 10;

				}

				break;

			case "e":
			case "E":

				if (correct3.equals(Quest3[urn.get(Count[4])])) {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visualizar uma aura da mana,envolvendo-o \n"
								+"e é possível ver aos poucos ele ficando transparente,após a finalização Aelin ficou invísivel e consegue\n"
								+ "e consegue escapar enquanto os inimigos não conseguem identificar a sua presença\n");

				} else {

					System.out.println(
						"Narrador: Enquanto Aelin começa a reproduzir as palavras do feitiço,é possível visulizar uma aura\n"
								+ "de mana envolvendo-o e é possível ver aos poucos ele ficando transparente, mas Aelin pula\n"
								+ "uma palavra do feitiço e causa uma enorme explsão,jogando todos para longe e deixando todos inconciêntes.\n"
								+ "Apesar do dano que recebeu,acordou em um local longe dosseus perseguidores e começou a seguir. \n"
								+"para um Reino distante onde mora um tio seu para pedir ajuda");

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

			do {

				if (a == 0) {

					System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B");

					String Quest1[] = { "b^1/7", "b^7", "1/b^7", "7^b/", "Nenhuma da alternativas" };
					int Count[] = { 0, 1, 2, 3, 4 };
					String correct1 = "b^1/7", answer1 = "";

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

							}

						}

						break;

					}

				} else if (a == 1) {

					System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

					String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11"};
					int Count[] = { 0, 1, 2, 3, 4 };
					String correct2 = "x³-4x²-11x-6", answer2 = "";

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

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

							}

						}

						break;

					}

				} else if (a == 2) {

					System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

					String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "5x²+10x-24²", "Nenhuma das alternativas" };
					int Count[] = { 0, 1, 2, 3, 4 };
					String correct3 = "2x²+10x+24", answer3 = "";

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

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

							health = 5;

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ health + " de dano do seu próprio feitiço.\n");

							// Item de segunda tentativa.

							if (itemGained.equals("horacleHourglass")) {

								clock = 0;
								clock++;

							}

						}

						break;

					}

				}

			} while (correct == true && !(clock == 2));

			// Personagem foi atingindo pelo inimigo.

		} else {

			health = 5;

			System.out.println(
					"Narrador: A criatura foi mais rápida e dispara em direção de Aelin com suas mãos pútridas, o inimigo foi rápido demais, "
							+ "o Ghoul se aproxima dele e finca os dentes no ombro de Aelin que toma " + health
							+ " de dano do seu oponente.\n");

			do {

				if (a == 0) {

					System.out.println("Aelin: Qual expressão exponencial é equivalente a rais 7º de B ?\n");

					String Quest1[] = { "b^1/7", "b^7", "1/b^7", "7^b/", "Nenhuma da alternativas" };
					int Count[] = { 0, 1, 2, 3, 4 };
					String correct1 = "b^1/7", answer1 = "";

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

							}

							health += +5;

						}

						break;

					}

				} else if (a == 1) {

					System.out.println("Aelin: Qual o resultado da seguinte multiplicação (1+x).(x² - 5x -6)\n");

					String Quest2[] = { "x³-4x²-11x-6", "x²-5x-6+x³-5x²-6x", "x³+4x²-6", "x²+4x-11", "Nenhuma das alternativas" };
					int Count[] = { 0, 1, 2, 3, 4 };
					String correct2 = "x³-4x²-11x-6", answer2 = "";

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

						if (correct2.equals(Quest2[urn.get(Count[1])])) {

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

							System.out.println(
									"Narrador: Aelin pensa ter completado o encatamento, mas algo deu errado e ele até "
											+ "consegue lançar fogo no inimigo e elimina-lo, mas perde o controle das chamas e toma "
											+ 5 + " de dano do seu próprio feitiço.\n");

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

					}

				} else if (a == 2) {

					System.out.println("Aelin: Qual o resultado da divisão de:  2x³+4x²-6x+4 por x-3\n");

					String Quest3[] = { "2x²+10x+24", "x²+10x+24", "5x²+10x-24", "-2x²+10x+24²", "Nenhuma das alternativas" };
					int Count[] = { 0, 1, 2, 3, 4 };
					String correct3 = "2x²+10x+24", answer3 = "";

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

						if (correct3.equals(Quest3[urn.get(Count[1])])) {

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

					}

				}

			} while (correct == true && !(clock == 2));

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

		do {

			if (a == 0) {

				System.out.println(
						"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x� . x�:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x�+x�", "Nenhuma das alternativas" };
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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x� . x�:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x�+x�", "Nenhuma das alternativas" };
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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x� . x�:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x�+x�", "Nenhuma das alternativas" };
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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x� . x�:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x�+x�", "Nenhuma das alternativas" };
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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x� . x�:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x�+x�", "Nenhuma das alternativas" };
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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
						.println("- Aelin: Vamos testar se voc� domina uma habilidade util nas porximas etapas qual o "
								+ "resultado de x� . x�:\n");

				String Quest3[] = { "x^5", "x^4", "5x", "x�+x�", "Nenhuma das alternativas" };
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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a resolu��o a tona, o feiti�o termina com ele \n"
										+ "lan�ando uma enorme bola de fogo em dire��o ao alvo que est� em sua frente. \n");

						// Item de segunda tentativa.

						if (itemGained.equals("horacleHourglass")) {

							correct = false;

						}

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas m�os e quando ele traz a \n"
										+ "resolu��o a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explos�o e causando �X� dano em si mesmo. \n");

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

		String[] itemName = { "um p�o �lfico", "uma po��o de vida", "uma tunica de mithril",
				"um grim�rio do conhecimento", "a bota do sagaz", "o ros�rio do imortal", "a apulheta do hor�culo",
				"o cajado da destrui��o", "o olho da clarivid�ncia", "o anel de fam�lia" };

		String[] itemStatus = { "Recupera 5 pontos de vida", "Recupera 20 pontos de vida",
				"Diminui em 10 o dano de inimigos", "iminui em 5 o dano de habilidades mal sucedidas",
				"Aumenta a chance de se esquivar de um ataque",
				"Permite que o jogador se levante com 30 de hp caso receba uma ferida mortal",
				"Permite que o jogador tenha uma 2� tentativa de responder uma quest�o que errou",
				"Aumenta o dano em 50 de suas m�gias de ataque", "Retira duas alternativas da multipla escolha",
				"Uma heran�a de nossa fam�lia, apesar de n�o dar fazer nada, deixa viva a mem�ria dentro dos nossos cora��es" };

		int c = 0, num;

		String itemGained = "";

		// jogo:

		int option = 0, repeatLoop = 0;

		// player status:

		int maxHealth = 100, maxDefense = 5, maxAttack = 20, maxDodge = 15;

		// poss�vel altera��o nos status:

		int health = 0, defense = 0, attack = 0, dodge = 0, addHealth = 0;

		do {

			System.out.println("Selecione a op��o desejada:\n");
			System.out.println("[1] Instru��es");
			System.out.println("[2] Jogar");
			System.out.println("[3] Cr�ditos");
			System.out.println("[4] Sair\n");

			option = input.nextInt();
			System.out.println("");

			switch (option) {

			case 1:

				System.out.println("O jogo � baseado em RPG de mesa, o mestre da mesa que chamamos de narrador \n"
						+ "ir� guiar a gameplay e de certa maneira controlar o mundo ao redor de Aelin, voc� deve \n"
						+ "acertar as perguntas para ser bem sucedido nas magias que ir� lan�ar ou pode tomar dano\n"
						+ " de inimigos e dos seus pr�prios feiti��s!\n");

				break;

			case 2:

				System.out.println(
						"Em um tempo antigo, cheio de viol�ncia e misticismo, os grandes magos de Winterhold \n"
								+ "ap�s dezenas de milhares de anos descobriram uma forma n�o convencional de magia que \n"
								+ "ultrapassava o poder destrutivo conhecido at� o momento. Descobriram que os c�lculos \n"
								+ "matem�ticos escondiam os feiti�os mais poderosos. Nossa hist�ria se passa 15 anos ap�s \n"
								+ "essa descoberta hist�rica quando nosso personagem \"Aelin\" filho \"Galandriel\" \n"
								+ "(Um dos magos que participou da descoberta do novo tipo de magia e um dos respons�veis pela \n"
								+ "pesquisa realizadas com a mesma), ingressa no col�gio para estudar com o objetivo de se \n"
								+ "tornar o \"Guardi�o\" do Reino.\n");

				System.out.println(
						"Narrador: O dia est� amanhecendo, uma pequena n�voa surge por entre as �rvores cobrindo a �rea \n"
								+ "de floresta em volta da casa de Galandriel, em seu quarto, Aelin ronca como nunca por conta do cansa�o \n"
								+ "causado pelos extensos treinos que vem tendo para garantir que consiga uma vaga entre os grandes magos \n"
								+ "de Winterhold e poss�velmente, ser guardi�o do reino. O Silencio que era rompido apenas pelos altos \n"
								+ "roncos do nosso her�i, foi quebrado quando Galandriel chegava na entrada do quarto e em alta voz bradou: \n");

				System.out.println(
						"Narrador: Ao abrir os olhos, Aelin se depara com Galandriel olhando ele da entrada de seu quarto, \n"
								+ "um lugar com uma luminosidade relativa proveniente de velas, com pisos de madeira e paredes de pedra. \n "
								+ "Ele tamb�m v� uma enorme cole��o de livros, dos quais ele subtraiu muito tempo de sua vida folheando. \n"
								+ "O local est� um pouco bagun�ado com pratos, canecas sujas e folhas de pergaminhos espalhadas sendo que \n"
								+ "algumas est�o amassadas, provavelmente por ele n�o ter tempo h�bil para deixar os estudos e fazer algum \n"
								+ "tipo de limpeza ou organiza��o.\n");

				System.out.println(
						"Aelin:  Ahhhhhh, n�o acredito que j� amanheceu ! Parece que acabei de me deitar ! Vou levantar Pai, \n"
								+ "agrade�o pelo aviso !\n");

				System.out.println(
						"Galandriel: � o m�ximo que posso fazer por voc�, sabe bem que eu n�o posso interferir em mais nada \n"
								+ "em rela��o ao seu treino, ou voc� pode acabar sendo punido com o cancelamento dos seus testes... \n");

				System.out.println(
						"Narrador: Enquanto Galandriel se retira, Aelin se levanta e segue para fazer suas necessidades \n"
								+ "matinais. Ap�s termina-l�s, pega o seu cajado (Item importante para conjurar magias, a madeira m�gica canaliza \n"
								+ "a mana utilizada intensificando seus efeitos) e segue para o local de treino para continuar sua prepara��o. \n"
								+ "Chegando no lugar ele organiza as magias que ele selecionou e come�a a proferir palavas em �lfico antigo: \n"
								+ "(Lembre-se que enquando o Aelin estiver conjurando, ser� necess�rio que as quest�es matem�ticas sejam \n"
								+ "respondidas corretamente ou ele n�o vai obter sucesso na conjura��o e poss�velmente sofrer� penalidade).\n");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question1(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A vis�o de Aelin fica escurecida e n�o consegue mais se mexer, aos poucos a vida se esvai"
									+ "e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				System.out.println("Narrador: Ap�s o lancamento do feiti�o, Aelin olha em sua lista o pr�ximo e "
						+ "inicia a conjura��o: \n");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question2(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A vis�o de Aelin fica escurecida e n�o consegue mais se mexer, aos poucos a vida se esvai"
									+ "e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				System.out.println("\nNarrador: As horas foram passando e o momento da prova ia se aproximando, por�m "
						+ "enquanto Aelin estava praticando, ele observou que um barulho como de muitos passos se "
						+ "aproximavam dele, ele vai em dire��o ao som para checar oque estava acontecendo, e ao se "
						+ "aproximar, viu cerca de 15 guardas reais que iam em sua dire��o. Quando chegaram perto o "
						+ "suficiente, o homem que parecia ser o l�der se dirige a ele dizendo:\n");

				System.out.println("L�der da Guarda Real: Aelin !!! Pe�o que voc� nos acompanhe imediatamente !!! "
						+ "N�s n�o queremos machuca-lo, mas vamos utilizar os meios necess�rios para te apreender. "
						+ "Venha sem resistir !");

				System.out.println("Aelin: Dragomir ? Oque significa isso tudo ? Me apreender ? Resisitir ? "
						+ "Voc� n�o est� fazendo sentido !\r\n" + "Oque est� acontecendo ?\n");

				System.out.println("L�der da Guarda Real: Bem... Provavelmente voc� deve saber oque houve, mas a "
						+ "princesa foi raptada e encontramos uma t�nica e um dos cajados que pertecem a voc� ! "
						+ "Agora pare com esse teatro e nos acompanhe agora mesmo, de qualquer maneira vamos "
						+ "conseguir tirar de voc� onde a princesa est�, n�o importam os meios.\n");

				System.out.println("Narrador: Aelin estava completamente confuso e sem saber como agir, ele "
						+ "pensava em como os pertences dele tinham aparecido dentro do quarto da princesa e "
						+ "ao mesmo tempo pensava que se fosse pego, seria torturado porque n�o tinha provas "
						+ "de sua ino�ncia (A guarda real, era uma conhecida e temida institui��o que tinha a"
						+ " reputa��o de torturar pessoas mesmo sem saber se tinham envolvimento ou n�o com as "
						+ "situa��es), diante dessa decis�o, Aelin se lembra de um feiti�o de fuga que ele "
						+ "conhece e decide se evadir para conseguir provar sua inoc�ncia, rapidamente ele "
						+ "come�a a dizer as palavras m�gicas:\n");

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				addHealth = question3(health);

				maxHealth = maxHealth - addHealth;

				System.out.println(maxHealth + "\n");

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A vis�o de Aelin fica escurecida e n�o consegue mais se mexer, aos poucos a vida se esvai"
									+ "e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				System.out.println("Narrador: Ap�s alguns meses de fuga e esconderijos, Aelin finalmente chega na "
						+ "cidade, ele procura entrar sem chamar aten��o para si, aonde onde ele olha, consegue ver "
						+ "cartazes que falam sobre a princesa desaparecida e sobre recompensas para quem ajudar no "
						+ "resgate ou encontrando o �culpado�, de qualquer maneira ele vai se esgueirando para dentro "
						+ "da cidade e chega em frente a uma pequena casa, claramente n�o � utilizada por nobres e "
						+ "est� relativamente abandonada, ele bate tr�s vezes na porta e ap�s alguns segundos ela "
						+ "se abre, quem aparece � um elfo alto de cabelos loiros e com uma certa idade e ap�s "
						+ "identificar Aelin ele diz:");

				System.out.println("Maedhros: Entre, entre rapidamente...");

				System.out.println("Narrador: Ap�s eles entrarem e fecharem a porta Aelin diz:");

				System.out.println("Aelin: Tio.... Como � bom ver algum rosto familiar ! Estou a meses assim, me "
						+ "escondendo e procurando pistas sobre o desaparecimento da princesa, por enquanto ouvi "
						+ "rumores que ela foi levada para o norte do pa�s, gostaria muito de encontra-l� logo e "
						+ "limpar o meu nome.... Sei que voc� est� aposentado, mas n�o poderia me ajudar ? ");

				System.out.println("Narrador: Aelin sabia que seu tio fazia parte de um grupo anti-governo na regi�o e"
						+ " que tinham uma certa influ�ncia e facilidade para encontrar informa��es");

				System.out.println("Maedhros: Aelin... Que bom te ver ! Eu nunca acreditei que isso havia sido obra "
						+ "sua ! Um jovem mago brilhante como voc� e com ambi��o de se tornar o �Guardi�o� nunca iria"
						+ " jogar tudo pro ar para raptar princesa nenhuma... Fique aqui dentro, tem comida e �gua "
						+ "para voc�, se abaste�a, coma e descanse, vou ver oque consigo fazer para ajuda-lo, "
						+ "gostaria de poder aproveitar a sua presen�a se n�o estivessemos com t�o pouco tempo... "
						+ "mas enfim.... fique aqui e tente n�o chamar aten��o !");

				System.out.println("Narrador: Enquanto Aelin tirava seu tempo de descanso dessa longa viagem, "
						+ "Maedhros foi at� a cidade e conversou com quem podia para conseguir informa��es e tamb�m "
						+ "foi at� seu amigo mercador para comprar um item para ajudar Aelin em sua jornada ! ");

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

				// Item que traz personagem de volta a vida caso maxHealth chegue a 0.
				health = imortalsRosary(itemGained, maxHealth);
				maxHealth = maxHealth + health;

				// Condi��o de morte do personagem.
				if (maxHealth == 0) {

					System.out.println(
							"Narrador: A vis�o de Aelin fica escurecida e ele n�o consegue mais se mexer, aos poucos a vida se"
									+ " esvai e nada mais importa....\n");
					System.out.println("Game Over !\n");

					break;

				}

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(maxHealth, maxDefense, maxAttack, maxDodge);

				System.out.println(
						"Narrador: Aelin est� deitado e escuta a porta se abrindo e seu Tio entrando, Maedhros "
								+ "chama Aelin e diz:");

				// Verifica��o do n�mero do item, utilizado para ajustar o di�logo abaixo para o
				// item sorteado.
				num = verifyItemNum(itemGained);

				System.out.println("Maedhros: Aelin, Aelin ! Consegui informa��es �teis para voc� e tamb�m te trouxe "
						+ itemName[num] + " , espero que voc� fa�a um bom uso dele, este item " + itemStatus[num]
						+ ". Sobre as inform��es, "
						+ " descobri que os rumores realmente estavam corretos, voc� deve seguir para o norte at� Kiev, "
						+ "ap�s o desaparecimento da princesa, habitantes locais avistaram uma pessoa vestida com trajes reais, "
						+ "cercada por homens suspeitos, aparetemente mantida a for�a com eles. Voc� deve partir logo, n�o "
						+ "sabemos qual ser� a inten��o dos sequestradores com essa ousada atitude.");

						
					System.out.println("Aelin: Tio..... Não sei como te agradeçer, não imaginei que estaria aqui neste momento...."
					+"Eu estava me preparando para o teste... só queria poder cuidar do Reino e deixar minha família orgulhosa de mim.... "
					+"Devo ir Tio, mas espero tudo de melhor a você, espero poder retribuir sua gentileza... Adeus....");

					System.out.println("Maedhros: Aelin... Apenas mee prometa que vai salvar a princesa e limpar o nome de nossa família.... Adeus....");

					System.out.println("Narrador: Aelin segue em direção a Kiev, a noite cai na floresta e Aelin para com a intenção de descansar"
					+"mas é surpreendido por um Ghoul que estava perambulando na região.");


					addHealth = question4(health,maxDodge,itemGained);
				break; // Menu

			case 3:

				System.out.println("Turma A - Noite - Grupo 5\n");
				System.out.println("Desenvolvedores: \n");
				System.out.println("Filipe Santana Cordeiro");
				System.out.println("Henry Felipe Callera");
				System.out.println("Luciano Freire Lopes");
				System.out.println("Rubens Anjos dos Santos Silva");
				System.out.println("Vin�cius Monteiro Lopes\n");

				break;

			case 4:

				System.out.println("Obrigado por jogar!");
				System.exit(0);

				break;

			default:

				System.out.println("Valor inv�lido !");

				break;

			}

		} while (repeatLoop == 0);

		input.close();
		// teste

	}

}

