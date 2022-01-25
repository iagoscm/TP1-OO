import java.util.Scanner; // Para a leitura de dados
import java.io.IOException;// Para dar pausa no console

public class jogoDaForca {

public static void main(String[] args) throws IOException {
	char opcao_menu = ' ';
	int c, ct;
	String temas[][] = new String [50][51];
	temas[0][0] = "CIDADE";
	temas[1][0] = "ESTADO";
	temas[2][0] = "PAÍS";
	temas[3][0] = "PCH";
	temas[4][0] = "MARCA";
	temas[5][0] = "COR";
	temas[6][0] = "JOGO DE PLAYSTATION";
	temas[7][0] = "NOME";
	temas[8][0] = "ATO HISTÓRICO";
	temas[9][0] = "LINGUAGEM DE PROGRAMAÇÃO";
	Scanner input = new Scanner (System.in);
	System.out.println("Bem vindo(a) ao Jogo da Forca 2022!\n\nPressione enter para continuar...");
	System.in.read();
	do {
		for(int i = 0; i < 10; i++) {
			System.out.println(temas[i][0]);
		}
			c = menu(opcao_menu, input);// Abrir o menu
			switch(c) {
			case '1':
				ct = menuTemas(opcao_menu, input);
				switch(ct) {
				case 'a':
					cadastrarTema(temas, input);
				break;
				case 'b':
					excluirTema(temas, input);
				break;
				case 'c':
					
				break;
				case 'd':
					
				default:
					System.out.println("Opção inválida!");
				System.in.read();
				}
			break;
			case '2':
				System.out.println("--------------------Gerenciar Palavras--------------------");
				
				System.out.println("\n\nPressione enter para continuar...");
				System.in.read();
			break;
			case '3':
				System.out.println("--------------------Jogar--------------------");
				
				System.out.println("\n\nPressione enter para continuar...");
				System.in.read();
			break;
			case '4':
				System.out.println("\nAté a próxima!\n");
				System.in.read();
			break;
			default:
				System.out.println("\nOpção inválida! Escreva um número de 1 a 4.\n");
			}
			} while (c != '4'); // Roda o menu até o 4 ser digitado
		}
			
public static int menu(char opcao_menu, Scanner input) throws IOException {
	System.out.println("--------------------Jogo da Forca--------------------");
	System.out.println("1. Gerenciar Temas");
	System.out.println("2. Gerenciar Palavras");
	System.out.println("3. Jogar");
	System.out.println("4. Sair");
	System.out.print("\nDigite a opção desejada:");
	opcao_menu = input.next().charAt(0); //Leitura da opção desejada
	return opcao_menu;
}

public static int menuTemas(char opcao_menu, Scanner input) throws IOException {
	System.out.println("--------------------Gerenciar Temas--------------------");
	System.out.println("a. Cadastro");
	System.out.println("b. Exclusão");
	System.out.println("c. Busca");
	System.out.println("d. Sair");
	System.out.print("\nDigite a opção desejada:");
	opcao_menu = input.next().charAt(0); //Leitura da opção desejada
	return opcao_menu;
}

public static String[][] cadastrarTema(String temas[][], Scanner input) throws IOException{
	int contadorTema = 0, k = 1;
	
	for(int i = 0; i < 50; i++) {
		if(temas[i][0] == null && contadorTema == 0) {
			System.out.print("\nDigite o tema que deseja cadastrar:");
			input.nextLine();
			temas[i][0] = input.nextLine().toUpperCase();
			k = i;
			contadorTema++;//Para controlar o cadastro de tema
		} 
	}
	
	if(contadorTema == 0){
		System.out.println("O número máximo de temas já foi alcançado.\n");
	}
	
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


public static String[][] excluirTema(String temas[][], Scanner input) throws IOException{
	String busca;
	
	System.out.print("\nDigite o tema que deseja excluir:");
	input.nextLine();
	busca = input.nextLine().toUpperCase();
	
	for(int i = 0; i < 50; i++) {
		if(temas[i][0] != null) {
			if(temas[i][0].equals(busca)) {
				temas[i][0] = null;
			}
		} 
	}
	
	return temas;
}
}
