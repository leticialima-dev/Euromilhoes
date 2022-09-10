import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        ArrayList<String> resultados = new ArrayList<>();



        ResponsavelAposta respAposta = new ResponsavelAposta();
        ResponsavelAposta  apostaAleatoria = new ResponsavelAposta();

        // método
        SimularSorteio sorteio = new SimularSorteio();
        SimularSorteio sorteioAleatorio = new SimularSorteio();


        //método
        CompararSorteioComAposta compAposta = new CompararSorteioComAposta();


        // menu

        System.out.println("Bem vindo a loteria, aqui voce faz suas apostas!");
        System.out.println("Carregando...");
        Thread.sleep(2000);
        System.out.println("INFORME O Nº DE APOSTAS QUE DESEJA REALIZAR " +
                "\n1 - 1 APOSTA" +
                "\n2 - 2 APOSTAS" +
                "\n3 - 3 APOSTAS" +
                "\n4 - 4 APOSTAS" +
                "\n5 - 5 APOSTAS" +
                "\n6 - Simular um sorteio" +
                "\n7 - Gerar chaves aleatorias para o seu sorteio"+
                "\n8 - Gerar um sorteio chaves e estrelas (acertos)");

        int opcaoDeAposta = in.nextInt();

        if (opcaoDeAposta == 8){
            ContadorDeXSorteioIgual.gerarValorAleatorio();
        }



        if (opcaoDeAposta == 7) {
            System.out.println("Quantas boletins deseja?");
            int numApostasAleatorias = in.nextInt();

            for (int i = 0; i < numApostasAleatorias; i++) {
                System.out.println("Aposta: " + (i + 1));
                int[] minhaAposta = new int[7];

                for (int j = 0; j < 7; j++) {
                    if (j < 5) {
                        minhaAposta[j] = new Random().nextInt(50) + 1;
                        ;
                    }
                    if (j >= 5) {
                        minhaAposta[j] = new Random().nextInt(11) + 1;
                        ;
                    }
                }

                Aposta jogo = new Aposta(minhaAposta);
                respAposta.adicionarAposta(jogo);
            }
            compAposta.calcularAcertos(respAposta.getAposta(), sorteio.getApostaSorteada());

        }
            else if (opcaoDeAposta == 6) {

                Aposta jogadaAleatoria = new Aposta(new SimularSorteio().getApostaSorteada());

                respAposta.adicionarAposta(jogadaAleatoria);

                compAposta.calcularAcertos(respAposta.getAposta(), sorteioAleatorio.getApostaSorteada());
        } else if (opcaoDeAposta != 6 && opcaoDeAposta != 7) {

            for (int i = 0; i < opcaoDeAposta ; i++) {
                System.out.println("Aposta: " + (i + 1));

                int[] minhaAposta = new int[7];
                for (int j = 0; j < 7 ; j++) {
                    if (j < 5) {
                        System.out.println("Informe o número da " + (j + 1) + " ª CHAVE");
                        int vNum = in.nextInt();

                        while (vNum <1 || vNum > 50){
                            System.out.println("Valor Inválido! Informe uma chave entre 1 a 50");
                            System.out.println("Informe o número da " + (j + 1) + "ª CHAVE");
                            vNum = in.nextInt();
                        }
                        minhaAposta[j] = vNum;
                    }
                    if (j >= 5) {
                        System.out.println("Informe o valor da " + (i +1) + " ª ESTRELA");
                        int vNum = in.nextInt();

                        while (vNum <= 0 || vNum > 11) {
                            System.out.println("INVALIDO: Informe um valor entre 1 a 11 - " + (i + 1) + " ESTRELA");
                            System.out.println("Informe o número da " + (i + 1) + "ª ESTRELA");
                            vNum = in.nextInt();

                        }
                        minhaAposta[j] = vNum;
                    }
                }
                Aposta jogo = new Aposta(minhaAposta);
                respAposta.adicionarAposta(jogo);
            }
            compAposta.calcularAcertos(respAposta.getAposta(), sorteio.getApostaSorteada());

            }
        }

    }





