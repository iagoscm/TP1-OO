import java.util.Random;
import java.util.Scanner; // Para a leitura de dados
import java.io.IOException;// Para dar pausa no console
import java.util.random.*;


// Ajustar excluirTema para não excluir tema com palavras

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
		temas[1][5] = "SAO PAULO";
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
						System.out.println("Opção inválida!");
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
						System.out.println("Opção inválida!");
					}
				break;
				case '3':
					menuJogar(input, temas);
				break;
				case '4':
					System.out.println("\nAté a próxima!\n");
				break;
				default:
					System.out.println("\nOpção inválida! Escreva um número de 1 a 4.\n");
				}
				} while (c != '4'); // Roda o menu até o 4 ser digitado
			}
				
	public static int menu(char opcao_menu, Scanner input) throws IOException {
		System.out.println("\nPressione Enter para continuar...");
		System.in.read();
		input.nextLine();
		System.out.println("              Jogo da Forca");
		System.out.println("\n----------------------------------------");
		System.out.println("1. Gerenciar Temas");
		System.out.println("2. Gerenciar Palavras");
		System.out.println("3. Jogar");
		System.out.println("4. Sair");
		System.out.print("\nDigite a opção desejada:");
		opcao_menu = input.next().charAt(0); //Leitura da opção desejada
		return opcao_menu;
	}
	
	public static int menuTemas(char opcao_menu, Scanner input){
		System.out.println("\n\n--------------------Gerenciar Temas--------------------");
		System.out.println("a. Cadastro");
		System.out.println("b. Exclusão");
		System.out.println("c. Busca");
		System.out.print("\nDigite a opção desejada:");
		opcao_menu = input.next().charAt(0); //Leitura da opção desejada
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
			System.out.println("O número máximo de temas já foi alcançado.\n");
		
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null && i != k){
				if(temas[k][0].equals(temas[i][0])){
					System.out.println("Esse tema já existe.");
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
					System.out.println("Tema excluído com sucesso!\n");
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
			System.out.println("Esse tema não foi cadastrado.");
	
		
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
		System.out.println("b. Exclusão");
		System.out.println("c. Busca");
		System.out.println("d. Listagem");
		System.out.print("\nDigite a opção desejada:");
		opcao_menu = input.next().charAt(0); //Leitura da opção desejada
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
						System.out.print("\nDeseja cadastrar uma palavra neste tema?\n1. Sim\n2. Não\n\nDigite a opção desejada:");
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
							System.out.println("Essa palavra já está cadastrada nesse tema.");
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
						System.out.print("\nDeseja excluir uma palavra neste tema?\n1. Sim\n2. Não\n\nDigite a opção desejada:");
						opcao = input.next().charAt(0);
					}while(opcao != '1' && opcao != '2');
					if(opcao == '1') {
						System.out.print("Digite a palavra que deseja excluir:");
						input.nextLine();
						busca = input.nextLine().toUpperCase().trim();
						for(int k = 1; k < 51; k++) {
							if(temas[i][k] != null) {
								if(temas[i][k].equals(busca)) {
									System.out.println("Palavra excluída com sucesso do tema " + temas[i][0] + "!");
									contaExclusao++;
									contaPalavra++;
								}else{
									temas[i][j] = temas[i][k];
									contaPalavra++;
									j++;
								}
							}
						}
						for(j = contaPalavra; j < 51; j++){
							temas[i][j] = null;
						}
						if(contaExclusao == 0)
							System.out.println("Palavra não encontrada.");
					}else
						System.out.println("Nenhuma palavra foi excluída.");
					contaTema++;
				}
			}
		}
		
		if(contaTema == 0)
			System.out.println("Nenhum tema foi encontrado.");
		if(contaTema >= 1 && contaPalavra == 0) {
			System.out.println("O tema não possui palavras cadastradas.");
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
			System.out.println("Palavra não encontrada.");
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
					System.out.println("As palavras cadastradas nesse tema são:");
					for(int k = 1; k < 51; k++) {
						if(temas[i][k] != null)
							System.out.println(temas[i][k]);
					}
					contadorTema++;
				}
			}
		}
		
		if(contadorTema == 0) {
			System.out.println("Tema não encontrada.");
		}
		
		return temas;
	}
	
	public static void menuJogar(Scanner input, String temas[][]) throws IOException {
		int k = 1, contaPalavra = 0;
		int opcao_menu;
		String palavra;
		Random rnd = new Random();
		System.out.println("\n--------------------Jogar--------------------");
		System.out.println("Os seguintes temas estão disponíveis:\n");
		for(int i = 0; i < 50; i++) {
			if(temas[i][0] != null) {
				System.out.println(k + ". " + temas[i][0]);
				k++;
			}
		}
		System.out.print("\nDigite o numero do tema que deseja jogar:");
		opcao_menu = input.nextInt(); //Leitura da opção desejada
		if(opcao_menu >= 1 && opcao_menu <= k-1) {
			k = 0;
				for(int i = 0; i < 50; i++) {
					if(temas[i][0] != null) {
						k++;
						if(k == opcao_menu) {
							System.out.println("\nO tema escolhido foi: " + temas[i][0] + "!\n");
							System.out.println("Você provavelmente sabe como funciona o jogo da forca: te é apresentado um tema\n"
									+ "e você tenta descobrir a palavra daquele tema dando letras. A cada letra que não existe \n"
									+ "na palavra, se é contabilizado um erro, e você pode errar no máximo cinco vezes! Preparado?\n");
							System.out.println("Pressione Enter para começar a jogar.");
							System.in.read();
							for(int j = 1; j < 51; j++) {
								if(temas[i][j] != null)
									contaPalavra++;
							}
						
							palavra = temas[i][rnd.nextInt(contaPalavra)+1];
							jogo(input, palavra, temas);
						}
					}
				}
		}else{
			System.out.println("Opção inválida.");
		}
	}
	
	public static void jogo(Scanner input, String palavra, String temas[][]) throws IOException {
			int tamanho = palavra.length(), erros = 0, j = 0, acerto = 0;
			char r, p;
			char letras[] = new char[50];
			char chutes[] = new char[26];
			char resposta[] = new char[tamanho+1];
			boolean vitoria = false;
			
			for(int i = 0; i < tamanho; i++) {
				p = palavra.charAt(i);
				letras[i] = p;
			}
			
			for(int k = 0; k < 26; k++) {
				chutes[k] = ' ';
				if(k <= tamanho)
					resposta[k] = ' ';
			}
			
			do{
				System.out.print("\nEscolha uma letra:");
				r = input.next().charAt(0);
				r = Character.toUpperCase(r);
				System.out.println("");
				for(int k = 0; k < 26; k++) {
					if(chutes[k] == r){
						System.out.println("Essa letra já foi chutada.");
						break;
					}else if(chutes[k] == ' ') {
						chutes[j] = r;
						j++;
						acerto = printaPalavra(palavra, tamanho, letras, resposta, r, acerto);
						if(acerto == 0) {
							erros++;
							System.out.println("Letra errada! Voce ainda possui " + (5-erros) + " tentativa(s).");
						}
						break;
					}
				}
				vitoria = verificaVitoria(resposta, letras, vitoria, tamanho);
			}while(erros < 5 && !vitoria);
			
			if(erros == 5) {
				System.out.print("\n\nVoce perdeu! Deseja jogar novamente?\n1.Sim\n2.Nao\n\n");
				verificaRetry(input, temas);
			}
			
			if(vitoria){
				System.out.println("\n\nParabens! Voce acertou a palavra, deseja jogar novamente?\n1.Sim\n2.Nao\n\n");
				verificaRetry(input, temas);
			}
	}	
	
	public static int printaPalavra(String palavra, int tamanho, char letras[], char resposta[],char r, int acerto) {
		acerto = 0;
		
		
		
		for(int i = 0; i < tamanho; i++) {
			if(palavra.charAt(i) != ' ') {
				if(resposta[i] == ' '){
					if(palavra.charAt(i) == r) {
						resposta[i] = r;
						System.out.print(resposta[i]);
						acerto++;
					}else{
						System.out.print("_ ");// Printa as linhas restantes nao adivinhadas
					}
				}else{
					System.out.print(resposta[i]);// Se já tiver sido chutada a letra, printa ela
				}
			}else
				System.out.print(" ");// Se for um espaço em branco na palavra, printa o espaco
		}
		System.out.println("");
		
		return acerto;
	}
	
	public static boolean verificaVitoria(char resposta[], char letras [], boolean vitoria, int tamanho) {
		int acerto = 0;
		
		for(int i = 0; i < tamanho; i++) {
			if(resposta[i] == letras[i]) {
				acerto++;
			}
		}
		
		if(acerto == tamanho) {
			vitoria = true;
		}
		
		return vitoria;
	}
	
	public static void verificaRetry (Scanner input, String temas[][]) throws IOException {
		char r;
		
		do {
			System.out.print("Digite a opção desejada:");
			r = input.next().charAt(0);
			r = Character.toUpperCase(r);
		}while(r != '1' && r != '2');
		if(r == '1') {
			menuJogar(input, temas);
		}
		
	}
}