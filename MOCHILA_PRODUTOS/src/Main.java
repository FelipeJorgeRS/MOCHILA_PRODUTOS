		import java.io.BufferedReader;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.File;
		import java.io.FileWriter;
		import java.io.IOException;

		public class Main {

			public static void main(String[] args) throws IOException {
				
				String caminhoArquivo = "C:\\Users\\Felipe Jorge\\Documents\\UNA\\IA INTELIGENCIA ARTIFICIAL\\Instâncias-20220928T233124Z-001\\instancias-mochila\\";
				String nomeArquivo = "KNAPDATA40.txt";
				String linhaDividida[] = new String[3];
				String linha = "";
				String solucao[];
				
				HeuristicaGulosa heuristica = new HeuristicaGulosa();
				
				BufferedReader bufferRead = new BufferedReader(new FileReader(caminhoArquivo+nomeArquivo));
		
				int quantidade=0;
				int capacidade=0;
				int idObjeto=0;
				int custo=0;
				int beneficio=0;
				
				quantidade =Integer.parseInt(bufferRead.readLine());
				
				 while ( ( linha = bufferRead.readLine() ) != null) {
				        //Aqui imprimimos a linha
				        System.out.println(linha); 
				        
				        linhaDividida= linha.split(",");		
				      }
				
				 	idObjeto =Integer.parseInt(linhaDividida[0]);
					custo = Integer.parseInt(linhaDividida[1]);
					beneficio = Integer.parseInt(linhaDividida[2]);
					bufferRead.close();
					
					System.out.println("Instancia(idObjeto): " + nomeArquivo);
					System.out.println("custo: " + custo);
					System.out.println("Benefício: " + beneficio);
					
					System.out.println("\nSolução: " ); 
					
				
			} // fim do método main

		}// fim da classe Main
	
		
		
