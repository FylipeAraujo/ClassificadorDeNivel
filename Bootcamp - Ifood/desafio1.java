import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicitar o nome do herói
        System.out.print ("Digite seu nome: ");
        String nome = scan.nextLine();

        // Solicitar a quantidad de XP do usuário
        System.out.print("Digite a quantidade de XP: ");
        float qtdDeXp = scan.nextFloat();

        // Variável para verificar a quantidade de XP e definir o nível
        String nivelDoHeroi;

        if (qtdDeXp <= 1000) {
            nivelDoHeroi = "Ferro";
        } else if (qtdDeXp <= 2000) {
            nivelDoHeroi = "Bronze";
        } else if (qtdDeXp <= 5000) {
            nivelDoHeroi = "Prata";
        } else if (qtdDeXp <= 7000) {
            nivelDoHeroi = "Ouro";
        } else if (qtdDeXp <= 8000) {
            nivelDoHeroi = "Platina";
        } else if (qtdDeXp <= 9000) {
            nivelDoHeroi = "Ascendente";
        } else if (qtdDeXp <= 10000) {
            nivelDoHeroi = "Imortal";
        } else {
            nivelDoHeroi = "Radiante";
        }

        // Saída da mensagem com o nome e o nível do herói
        System.out.println(nome + ", seu nível de XP é " + nivelDoHeroi);

        scan.close();
    }
}
