package projetoPI;

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class projetoPI {

	// String itemName[] = { "", "elvenBread", "healthPotion", "knowlegdeGrimoire",
	// "cannyBoots", "imortalsRosary" "horacleHourglass", "staffOfDestruction",
	// "clairvoyantEye", "familyRing" };

	public static String verifyItem(String itemGained) {

		Random generation = new Random();

		int c = generation.nextInt(10);

		System.out.println(c);

		switch (c) {

		case 1:

			itemGained = "elvenBread";

			break;

		case 2:

			itemGained = "healthPotion";

			break;
		case 3:

			itemGained = "mithrilTunic";

			break;

		case 4:

			itemGained = "knowlegdeGrimoire";

			break;

		case 5:

			itemGained = "cannyBoots";

			break;

		case 6:

			itemGained = "imortalsRosary";

			break;

		case 7:

			itemGained = "horacleHourglass";

			break;

		case 8:

			itemGained = "staffOfDestruction";

			break;

		case 9:

			itemGained = "clairvoyantEye";

			break;

		case 10:

			itemGained = "familyRing";

			break;

		}

		return itemGained;

	}

	public static void verifyStatus(int health, int defense, int attack, int dodge) {

		System.out.println("Vida: " + health);
		System.out.println("Defesa: " + defense);
		System.out.println("Ataque: " + attack);
		System.out.println("Dodge: " + dodge);

	}

	// Itens de status simples (N�o testado ainda).
	public static int verifyItemStatus(String itemGained) {

		int a = 0;

		if (itemGained.equals("elvenBread")) {

			int health = 5;

			return health;

		} else if (itemGained.equals("healthPotion")) {

			int health = 20;

			return health;

		} else if (itemGained.equals("mithrilTunic")) {

			int defense = 10;

			return defense;

		} else if (itemGained.equals("knowlegdeGrimoire")) {

			int defense = 5;

			return defense;

		} else if (itemGained.equals("cannyBoots")) {

			int dodge = 5;

			return dodge;

		} else if (itemGained.equals("staffOfDestruction")) {

			int attack = 50;

			return attack;

		}

		return a;

	}

	// Item que ressuscita o personagem (N�o testado ainda).
	public static int imortalsRosary(String itemGained, int health) {

		if (itemGained.equals("imortalsRosary")) {

			if (health <= 0) {

				health = 30;

			}

		}

		return health;

	}

	// Possibilidade para randomificar as quest�es entre algumas.
	public static int question1(int a, int health) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();

		a = generation.nextInt(3);

		if (a == 1) {

			System.out.println(
					"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

			String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
			int Count[] = { 0, 1, 2, 3, 4 };
			String correct1 = "1 1110 1001", answer1 = "";

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

					health = health - 5;

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

					health = health - 5;

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

					health = health - 5;

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

					health = health - 5;

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

					health = health - 5;

				}

				break;

			}

		} else if (a == 2) {

		}

		return health;

	}

	public static void main(String[] args) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		// itens:

		int c = 0;

		String itemGained = "";

		// jogo:

		int option = 0, repeatLoop = 0;

		// playerstatus:

		int health = 100, defense = 5, attack = 20, dodge = 15;

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
				verifyStatus(health, defense, attack, dodge);

				System.out.println(
						"Aelin: Dado um n�mero hexadecimal (1E9), qual seria o valor do mesmo n�mero para base 2 ?");

				String Quest1[] = { "1 1110 1001", "0 0100 0011", "1 0010 1101", "0 1010 0001", "0 0100 1111" };
				int Count[] = { 0, 1, 2, 3, 4 };
				String correct1 = "1 1110 1001", answer1 = "";

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

						health = health - 5;

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

						health = health - 5;

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

						health = health - 5;

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

						health = health - 5;

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

						health = health - 5;

					}

					break;

				}

				// Fun��o de impress�o dos status do personagem.
				verifyStatus(health, defense, attack, dodge);

				System.out.println(
						"Narrador: Ap�s o lancamento do feiti�o, Aelin olha em sua lista o pr�ximo e inicia a conjura��o: \n");

				System.out.println("Qual dos exemplos a baixo � uma numeral binario ? \n");
				System.out.println("1 - 0101001");
				System.out.println("2 - 1101001");
				System.out.println("3 - 0001101");
				System.out.println("4 - 1010110");
				System.out.println("5 - 1010100\n");

				String Quest2[] = { "245", "101", "111", "267", "312" };
				String correct2 = "245", answer2 = "";

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
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os.\n"
										+ " Ap�s o t�rmino da conjura��o Aelin aponta em dire��o ao alvo que � congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os. � poss�vel ver \n"
										+ "que as onde de frio intenso v�o em dire��o as m�os do Aelin, por�m algo da errado e o frio se expande causando \n"
										+ "uma explos�o pr�xima demais de Aelin causando �X� dano.");

						health = health - 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os.\n"
										+ " Ap�s o t�rmino da conjura��o Aelin aponta em dire��o ao alvo que � congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os. � poss�vel ver \n"
										+ "que as onde de frio intenso v�o em dire��o as m�os do Aelin, por�m algo da errado e o frio se expande causando \n"
										+ "uma explos�o pr�xima demais de Aelin causando �X� dano.");

						health = health - 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os.\n"
										+ " Ap�s o t�rmino da conjura��o Aelin aponta em dire��o ao alvo que � congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os. � poss�vel ver \n"
										+ "que as onde de frio intenso v�o em dire��o as m�os do Aelin, por�m algo da errado e o frio se expande causando \n"
										+ "uma explos�o pr�xima demais de Aelin causando �X� dano.");

						health = health - 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os.\n"
										+ " Ap�s o t�rmino da conjura��o Aelin aponta em dire��o ao alvo que � congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os. � poss�vel ver \n"
										+ "que as onde de frio intenso v�o em dire��o as m�os do Aelin, por�m algo da errado e o frio se expande causando \n"
										+ "uma explos�o pr�xima demais de Aelin causando �X� dano.");

						health = health - 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os.\n"
										+ " Ap�s o t�rmino da conjura��o Aelin aponta em dire��o ao alvo que � congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equa��es m�gicas s�o proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas m�os. � poss�vel ver \n"
										+ "que as onde de frio intenso v�o em dire��o as m�os do Aelin, por�m algo da errado e o frio se expande causando \n"
										+ "uma explos�o pr�xima demais de Aelin causando �X� dano.");

						health = health - 5;

					}

					break;

				}

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

	}

}
