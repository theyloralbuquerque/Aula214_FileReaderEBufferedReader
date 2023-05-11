import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        FileReader fr = null; // Cria��o do objeto fr do tipo FileReader recebendo null.
        BufferedReader br = null; // Cria��o do objeto br BufferedReader recebendo null.

        try {
            fr = new FileReader(path); // O objeto fr � instanciado recebendo o valor da vari�vel path.
            br = new BufferedReader(fr); // O objeto br � instanciado recebendo como argumento o objeto fr.

            String linha = br.readLine(); // .readLine() L� uma linha do arquivo, se o arquivo j� estiver no final o readLine() retorna null.

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch(IOException e) {
                e.printStackTrace(); // .printStackTrace() exibe a pilha de erros que a exce��o deu.
            }
        }
    }
}
