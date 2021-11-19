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

	// Itens de status simples (Não testado ainda).
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

	// Item que ressuscita o personagem (Não testado ainda).
	public static int imortalsRosary(String itemGained, int health) {

		if (itemGained.equals("imortalsRosary")) {

			if (health <= 0) {

				health = 30;

			}

		}

		return health;

	}

	// Possibilidade para randomificar as questões entre algumas.
	public static int question1(int a, int health) {

		ArrayList<Integer> urn = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Random generation = new Random();

		a = generation.nextInt(3);

		if (a == 1) {

			System.out.println(
					"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

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
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
									+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
									+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

				} else {

					System.out.println(
							"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
									+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
									+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
									+ "explosão e causando “X” dano em si mesmo. \n");

					health = health - 5;

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

					health = health - 5;

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

					health = health - 5;

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

					health = health - 5;

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
				verifyStatus(health, defense, attack, dodge);

				System.out.println(
						"Aelin: Dado um número hexadecimal (1E9), qual seria o valor do mesmo número para base 2 ?");

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
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, se tornando \n"
										+ "em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a resolução a tona, o feitiço termina com ele \n"
										+ "lançando uma enorme bola de fogo em direção ao alvo que está em sua frente. \n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, se tornando em chamas que rodeiam-o sendo canalizadas para suas mãos e quando ele traz a \n"
										+ "resolução a tona, algo de errado faz com que Aelin perca o controle das chamas, causando uma \n"
										+ "explosão e causando “X” dano em si mesmo. \n");

						health = health - 5;

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

						health = health - 5;

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

						health = health - 5;

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

						health = health - 5;

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

						health = health - 5;

					}

					break;

				}

				// Função de impressão dos status do personagem.
				verifyStatus(health, defense, attack, dodge);

				System.out.println(
						"Narrador: Após o lancamento do feitiço, Aelin olha em sua lista o próximo e inicia a conjuração: \n");

				System.out.println("Qual dos exemplos a baixo é uma numeral binario ? \n");
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
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos.\n"
										+ " Após o término da conjuração Aelin aponta em direção ao alvo que é congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver \n"
										+ "que as onde de frio intenso vão em direção as mãos do Aelin, porém algo da errado e o frio se expande causando \n"
										+ "uma explosão próxima demais de Aelin causando “X” dano.");

						health = health - 5;

					}

					break;

				case "b":
				case "B":

					if (correct2.equals(Quest2[urn.get(Count[1])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos.\n"
										+ " Após o término da conjuração Aelin aponta em direção ao alvo que é congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver \n"
										+ "que as onde de frio intenso vão em direção as mãos do Aelin, porém algo da errado e o frio se expande causando \n"
										+ "uma explosão próxima demais de Aelin causando “X” dano.");

						health = health - 5;

					}

					break;

				case "c":
				case "C":

					if (correct1.equals(Quest2[urn.get(Count[2])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos.\n"
										+ " Após o término da conjuração Aelin aponta em direção ao alvo que é congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver \n"
										+ "que as onde de frio intenso vão em direção as mãos do Aelin, porém algo da errado e o frio se expande causando \n"
										+ "uma explosão próxima demais de Aelin causando “X” dano.");

						health = health - 5;

					}

					break;

				case "d":
				case "D":

					if (correct1.equals(Quest2[urn.get(Count[3])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos.\n"
										+ " Após o término da conjuração Aelin aponta em direção ao alvo que é congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver \n"
										+ "que as onde de frio intenso vão em direção as mãos do Aelin, porém algo da errado e o frio se expande causando \n"
										+ "uma explosão próxima demais de Aelin causando “X” dano.");

						health = health - 5;

					}

					break;

				case "e":
				case "E":

					if (correct1.equals(Quest2[urn.get(Count[4])])) {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de \n"
										+ "Aelin, uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos.\n"
										+ " Após o término da conjuração Aelin aponta em direção ao alvo que é congelado instantaneamente.\n");

					} else {

						System.out.println(
								"Narrador: Enquanto a equações mágicas são proferidas, um vento forte se forma ao redor de Aelin, \n"
										+ "uma aura gelada se forma ao seu redor, centralizando a baixa temperatura no centro de suas mãos. É possível ver \n"
										+ "que as onde de frio intenso vão em direção as mãos do Aelin, porém algo da errado e o frio se expande causando \n"
										+ "uma explosão próxima demais de Aelin causando “X” dano.");

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

	}

}
