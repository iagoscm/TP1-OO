import java.util.Random;
import java.util.Scanner; // Para a leitura de dados
import java.io.IOException;// Para dar pausa no console
import java.util.random.*;


// Ajustar excluirTema para n�o excluir tema com palavras

public class jogoDaForca {

	public static void main(String[] args) throws IOException {
		char opcao_menu = ' ';
		int c;
		String temas[][] = new String [50][51];
		temas[0][0] = "CIDADE";
		temas[0][1] = "CEILANDIA";
		temas[0][2] = "TAGUATINGA";
		temas[0][3] = "CIDADE OCIDENTAL";
		temas[0][4] = "VALPARAISO";
		temas[0][5] = "VICENTE PIRES";
		temas[0][6] = "SAMAMBAIA";
		temas[0][7] = "ASA SUL";
		temas[0][8] = "ASA NORTE";
		temas[0][9] = "INCRA";
		temas[0][10] = "AGUAS CLARAS";
		temas[1][0] = "ESTADO";
		temas[1][1] = "DISTRITO FEDERAL";
		temas[1][2] = "AMAPA";
		temas[1][3] = "RORAIMA";
		temas[1][4] = "GOIAS";
		temas[1][5] = "S�O PAULO";
		temas[1][6] = "RIO DE JANEIRO";
		temas[1][7] = "ESPIRITO SANTO";
		temas[1][8] = "SANTA CATARINA";
		temas[1][9] = "CEARA";
		temas[1][10] = "PIAUI";
		temas[2][0] = "PAIS";
		temas[2][1] = "BRASIL";
		temas[2][2] = "ROMENIA";
		temas[2][3] = "PAIS DE GALES";
		temas[2][4] = "PAISES BAIXOS";
		temas[2][5] = "ALEMANHA";
		temas[2][6] = "FRANCA";
		temas[2][7] = "AUSTRALIA";
		temas[2][8] = "INGLATERRA";
		temas[2][9] = "BELGICA";
		temas[2][10] = "ITALIA";
		temas[3][0] = "PCH";
		temas[3][1] = "BRACO";
		temas[3][2] = "PERNA";
		temas[3][3] = "CORACAO";
		temas[3][4] = "BOCA";
		temas[3][5] = "OLHO";
		temas[3][6] = "PANTURRILHA";
		temas[3][7] = "DENTE";
		temas[3][8] = "ESTOMAGO";
		temas[3][9] = "CALCANHAR";
		temas[3][10] = "INTESTINO";
		temas[4][0] = "MARCA";
		temas[4][1] = "GUCCI";
		temas[4][2] = "PRADA";
		temas[4][3] = "JIMMY CHOO";
		temas[4][4] = "MARIA GUEIXA";
		temas[4][5] = "DOLCE GABANNA";
		temas[4][6] = "HERMES";
		temas[4][7] = "MAISON VALENTINO";
		temas[4][8] = "BAPE";
		temas[4][9] = "VLONE";
		temas[4][10] = "DIOR";
		temas[5][0] = "COR";
		temas[6][0] = "JOGO DE PLAYSTATION";
		temas[7][0] = "NOME";
		temas[8][0] = "ATO HISTORICO";
		temas[9][0] = "LINGUAGEM DE PROGRAMACAO";
		Scanner input = new Scanner (System.in);
		System.out.println("Bem vindo(a) ao Jogo da Forca 2022!\n\n");
		do {
			for(int i = 0; i < 10; i++) {
				for(int k = 0; k < 51; k++)
				System.out.print(temas[i][k] + " ");
				System.out.println(";");
			}
				c = menu(opcao_menu, input);// Abrir o menu
				switch(c) {
				case '1':
					c = menuTemas(opcao_menu, input);
					switch(c) {
					case 'a':
						cadastrarTema(temas, input);
					break;
					case 'b':
						excluirTema(temas, input);
					break;
					case 'c':
						buscarTema(temas, input);
					break;
					default:
						System.out.println("Op��o inv�lida!");
					}
				break;
				case '2':
					c = menuPalavras(opcao_menu, input);
					switch(c) {
					case 'a':
						cadastrarPalavra(temas, input);
					break;
					case 'b':
						excluirPalavra(temas, input);
					break;
					case 'c':
						buscarPalavra(temas, input);
					break;
					case 'd':
						listarPalavras(temas, input);
					break;
					default:
						System.out.println("Op��o inv�lida!");
					}
				break;
				case '3':
					menuJogar(input, temas);
				break;
				case '4':
					System.out.println("\nAt� a pr�xima!\n");
				break;
				default:
					System.out.println("\nOp��o inv�lida! Escreva um n�mero de 1 a 4.\n");
				}
				} while (c != '4'); // Roda o menu at� o 4 ser digitado
			}
				
	public static int menu(char opcao_menu, Scanner input) throws IOException {
		System.out.println("\nPressione Enter para continuar...");
		System.in.read();
		input.nextLine();
		System.out.println("\n--------------------Jogo da Forca--------------------");
		System.out.println("1. Gerenciar Temas");
		System.out.println("2. Gerenciar Palavras");
		System.out.println("3. Jogar");
		System.out.println("4. Sair");
		System.out.print("\nDigite a op��o desejada:");
		opcao_menu = input.next().charAt(0); //Leitura da op��o desejada
		return opcao_menu;
	}
	
	public static int menuTemas(char opcao_menu, Scanner input){
		System.out.println("\n\n--------------------Gerenciar Temas--------------------");
		System.out.println("a. Cadastro");
		System.out.println("b. Exclus�o");
		System.out.println("c. Busca");
		System.out.print("\nDigite a op��o desejada:");
		opcao_menu = input.next().charAt(0); //Leitura da op��o desejada
		return opcao_menu;
	}
	
	public static String[][] cadastrarTema(String temas[][], Scanner input){
		int contadorTema = 0, k = 1;
		
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] == null && contadorTema == 0) {
				System.out.print("\nDigite o tema que deseja cadastrar:");
				input.nextLine();
				temas[i][0] = input.nextLine().toUpperCase().trim();
				k = i;
				contadorTema++;//Para controlar o cadastro de tema
				System.out.println("\nTema cadastrado com sucesso!!");
			} 
		}
		
		if(contadorTema == 0)
			System.out.println("O n�mero m�ximo de temas j� foi alcan�ado.\n");
		
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null && i != k){
				if(temas[k][0].equals(temas[i][0])){
					System.out.println("Esse tema j� existe.");
					temas[k][0] = null;
					i = 50;
				}
			}
		}
		return temas;
	}
	
	public static String[][] excluirTema(String temas[][], Scanner input){
		String busca;
		int contadorTema = 0, j = 0;
		
		System.out.print("\nDigite o tema que deseja excluir:");
		input.nextLine();
		busca = input.nextLine().toUpperCase().trim();
		System.out.println(busca);
		
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null) {
				if(temas[i][0].equals(busca)) {
					System.out.println("Tema exclu�do com sucesso!\n");
					contadorTema++;
				}else{
					temas[j][0] = temas[i][0];
					for(int k = 1; k < 51; k++) {
						temas[j][k] = temas [i][k];
					}
					j++;
				}
			} 
		}
		
		if (contadorTema == 0)
			System.out.println("Esse tema n�o foi cadastrado.");
	
		
		return temas;
	}
	
	public static String[][] buscarTema(String temas[][], Scanner input){
		String busca, resultado;
		
		System.out.print("\nDigite o tema que deseja buscar:");
		input.nextLine();
		busca = input.nextLine().toUpperCase().trim().replaceAll("( )+", " ");
		
		System.out.println("\n\nOs seguintes temas foram encontrados:\n");
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null) {
				resultado = temas[i][0].replaceAll("( )+", " ");
				if(resultado.contains(busca)) 
					System.out.println(resultado);
			}
		}
		
		
		return temas;
	}
	
	public static int menuPalavras(char opcao_menu, Scanner input){
		System.out.println("\n\n--------------------Gerenciar Palavras--------------------");
		System.out.println("a. Cadastro");
		System.out.println("b. Exclus�o");
		System.out.println("c. Busca");
		System.out.println("d. Listagem");
		System.out.print("\nDigite a op��o desejada:");
		opcao_menu = input.next().charAt(0); //Leitura da op��o desejada
		return opcao_menu;
	}

	public static String[][] cadastrarPalavra(String temas[][], Scanner input){
		String busca;
		char opcao;
		int contaPalavra = 0, contaTema = 0;
		
		System.out.print("\nDigite o tema em que deseja cadastrar a palavra:");
		input.nextLine();
		busca = input.nextLine().toUpperCase().trim();
		System.out.println(busca);

		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null) {
				if(temas[i][0].equals(busca)){
					System.out.print("O tema encontrado foi o seguinte: " + temas[i][0] + ";");
					do {
						System.out.print("\nDeseja cadastrar uma palavra neste tema?\n1. Sim\n2. N�o\n\nDigite a op��o desejada:");
						opcao = input.next().charAt(0);
					}while(opcao != '1' && opcao != '2');
					if(opcao == '1') {
						System.out.print("Digite a palavra que deseja cadastrar:");
						input.nextLine();
						busca = input.nextLine().toUpperCase().trim();
						for(int k = 1; k < 51; k++) 
							if(temas[i][k] != null) 
								if(temas[i][k].equals(busca)) 
									contaPalavra++;
						if(contaPalavra == 0) {
							for(int k = 1; k < 51; k++)
								if(temas[i][k] == null && contaPalavra == 0) {
									temas[i][k] = busca;
									contaPalavra++;
								}
							if(contaPalavra == 1) {
								System.out.println("Palavra cadastrada com sucesso no tema " + temas[i][0] + "!");
							}else
								System.out.println("ERRO DESCONHECIDO");
						}else
							System.out.println("Essa palavra j� est� cadastrada nesse tema.");
					}else
						System.out.println("Nenhuma palavra foi cadastrada.");
					
					contaTema++;
				}
			}
		}
		
		if(contaTema == 0)
			System.out.println("Nenhum tema foi encontrado.");

		return temas;
	}

	public static String[][] excluirPalavra(String temas[][], Scanner input){
		String busca;
		char opcao;
		int contaPalavra = 0, contaTema = 0, contaExclusao = 0, j = 1;
		
		System.out.print("\nDigite o tema em que deseja excluir uma palavra:");
		input.nextLine();
		busca = input.nextLine().toUpperCase().trim();
		System.out.println(busca);

		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null) {
				if(temas[i][0].equals(busca)){
					System.out.print("O tema encontrado foi o seguinte: " + temas[i][0] + ";");
					do {
						System.out.print("\nDeseja excluir uma palavra neste tema?\n1. Sim\n2. N�o\n\nDigite a op��o desejada:");
						opcao = input.next().charAt(0);
					}while(opcao != '1' && opcao != '2');
					if(opcao == '1') {
						System.out.print("Digite a palavra que deseja excluir:");
						input.nextLine();
						busca = input.nextLine().toUpperCase().trim();
						for(int k = 1; k < 51; k++) 
							if(temas[i][k] != null) {
								if(temas[i][k].equals(busca)) {
									System.out.println("Palavra exclu�da com sucesso do tema " + temas[i][0] + "!");
								}else{
									if(temas[i][j] != temas[i][k]) {
										System.out.println("a" + temas[i][j]);
										System.out.println("b" + temas[i][k]);
										temas[i][j] = temas[i][k];
									}else{
										System.out.println("=" + temas[i][j]);
										System.out.println("-" + temas[i][k]);
										temas[i][j] = null;
									}
									j++;
								}
								contaPalavra++;
							}
						if(contaPalavra >= 1 && contaExclusao == 0)
							System.out.println("Palavra n�o encontrada.");
						if(contaExclusao == 1)
							System.out.println("Palavra exclu�da com sucesso do tema " + temas[i][0] + "!");
					}else
						System.out.println("Nenhuma palavra foi exclu�da.");
					contaTema++;
				}
			}
		}
		
		if(contaTema == 0)
			System.out.println("Nenhum tema foi encontrado.");
		if(contaTema >= 1 && contaPalavra == 0) {
			System.out.println("O tema n�o possui palavras cadastradas.");
		}

		return temas;
	}

	public static String[][] buscarPalavra(String temas[][], Scanner input){
		String busca, resultado;
		int contadorPalavra = 0;
		
		System.out.print("\nDigite a palavra que deseja buscar:");
		input.nextLine();
		busca = input.nextLine().toUpperCase().trim().replaceAll("( )+", " ");
		
		for(int i = 0; i < 50; i++) {
			for(int k = 1; k < 51; k++){
				if(temas[i][k] != null) {
					resultado = temas[i][k].replaceAll("( )+", " ");
					if(resultado.equals(busca)) {
						System.out.println("Palavra encontrada no tema " + temas[i][0] + ".");
						contadorPalavra++;
					}	
				}
			}
		}
		
		if(contadorPalavra == 0) {
			System.out.println("Palavra n�o encontrada.");
		}
		
		return temas;
	}
	
	public static String[][] listarPalavras(String temas[][], Scanner input){
		String busca, resultado;
		int contadorTema = 0;
		
		System.out.print("\nDigite o tema que deseja listar as palavras:");
		input.nextLine();
		busca = input.nextLine().toUpperCase().trim().replaceAll("( )+", " ");
		
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null) {
				resultado = temas[i][0].replaceAll("( )+", " ");
				if(busca.equals(resultado)) {
					System.out.println("As palavras cadastradas nesse tema s�o:");
					for(int k = 1; k < 51; k++) {
						if(temas[i][k] != null)
							System.out.println(temas[i][k]);
					}
					contadorTema++;
				}
			}
		}
		
		if(contadorTema == 0) {
			System.out.println("Tema n�o encontrada.");
		}
		
		return temas;
	}
	
	public static void menuJogar(Scanner input, String temas[][]) throws IOException {
		int k = 1, contaPalavra = 0;
		int opcao_menu;
		String palavra;
		Random rnd = new Random();
		System.out.println("\n\n--------------------Jogar--------------------");
		System.out.println("Os seguintes temas est�o dispon�veis:");
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null) {
				System.out.println(k + ". " + temas[i][0]);
				k++;
			}
		}
		System.out.print("Digite o numero do tema que deseja jogar:");
		opcao_menu = input.nextInt(); //Leitura da op��o desejada
		if(opcao_menu >= 1 && opcao_menu <= k-1) {
			k = 0;
				for(int i = 0; i < 50; i++) {
					if(temas[i][0] != null) {
						k++;
						if(k == opcao_menu) {
							System.out.println("\nO tema escolhido foi: " + temas[i][0] + "!\n");
							System.out.println("Voc� provavelmente sabe como funciona o jogo da forca: te � apresentado um tema\n"
									+ "e voc� tenta descobrir a palavra daquele tema dando letras. A cada letra que n�o existe \n"
									+ "na palavra, se � contabilizado um erro, e voc� pode errar no m�ximo cinco vezes! Preparado?\n");
							System.out.println("Pressione Enter para come�ar a jogar.");
							System.in.read();
							for(int j = 1; j < 51; j++) {
								if(temas[i][j] != null)
									contaPalavra++;
							}
							palavra = temas[i][rnd.nextInt(contaPalavra)];
							jogo(input, temas, palavra);
						}
					}
				}
		}else{
			System.out.println("Op��o inv�lida.");
		}
	}
	
	public static void jogo(Scanner input, String temas[][], String palavra) throws IOException {
		int tamanho = palavra.length(), erros = 0;
		
		do{
			for(int i = 0; i <= tamanho; i++) {
				System.out.print("_ ");
			}
			System.out.print("Escolha uma letra:");
			
		}while(erros < 5);
	}	
}