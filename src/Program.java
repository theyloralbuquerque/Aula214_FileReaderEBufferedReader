import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        FileReader fr = null; // Criação do objeto fr do tipo FileReader recebendo null.
        BufferedReader br = null; // Criação do objeto br BufferedReader recebendo null.

        try {
            fr = new FileReader(path); // O objeto fr é instanciado recebendo o valor da variável path.
            br = new BufferedReader(fr); // O objeto br é instanciado recebendo como argumento o objeto fr.

            String linha = br.readLine(); // .readLine() Lê uma linha do arquivo, se o arquivo já estiver no final o readLine() retorna null.

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
                e.printStackTrace(); // .printStackTrace() exibe a pilha de erros que a exceção deu.
            }
        }
    }
}
