import java.util.Scanner;

//Desafio: faça um algoritmo que leia o montante de um cheque entre 0,01 e 999,99 e que saída seja o número por extenso.

public class Run {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número entre 0,01 e 999,99 : ");
        float numero = leitor.nextFloat();

        int numeroInteiro = (int) (numero * 100);

        int centena = numeroInteiro / 10000;
        int dezena = (numeroInteiro % 10000) / 1000;
        int unidade = ((numeroInteiro % 10000) % 1000) / 100;
        int dezenaCentavo = (((numeroInteiro % 10000) % 1000) % 100) / 10;
        int unidadeCentavo = (((numeroInteiro % 10000) % 1000) % 100) % 10;

        System.out.println("\nO número lido foi: " + numero);
        /*
        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);
        System.out.println(dezenaCentavo);
        System.out.println(unidadeCentavo);
        */

        if (centena == 1 && dezena == 0 && unidade == 0) {
            System.out.print(" cem ");
        } else {
            switch (centena) {
                case 1:
                    System.out.print("cento ");
                    break;

                case 2:
                    System.out.print("duzentos ");
                    break;

                case 3:
                    System.out.print("trezentos ");
                    break;

                case 4:
                    System.out.print("quatrocentos ");
                    break;

                case 5:
                    System.out.print("quinhentos ");
                    break;

                case 6:
                    System.out.print("seiscentos ");
                    break;

                case 7:
                    System.out.print("setecentos ");
                    break;

                case 8:
                    System.out.print("oitocentos ");
                    break;

                case 9:
                    System.out.print("novencentos ");
                    break;

                default:
                    break;
            }
        }

        if (centena > 0 && (dezena > 0 || unidade > 0)) {
            System.out.print("e ");
        }

        if (dezena == 1) {
            switch (unidade) {
                case 0:
                    System.out.print("dez ");
                    break;

                case 1:
                    System.out.print("onze ");
                    break;

                case 2:
                    System.out.print("doze ");
                    break;

                case 3:
                    System.out.print("treze ");
                    break;

                case 4:
                    System.out.print("quatorze ");
                    break;

                case 5:
                    System.out.print("quinze ");
                    break;

                case 6:
                    System.out.print("dezesseis ");
                    break;

                case 7:
                    System.out.print("dezessete ");
                    break;

                case 8:
                    System.out.print("dezoito ");
                    break;

                case 9:
                    System.out.print("dezenove ");
                    break;

                default:
                    break;
            }

        }

        if (dezena > 1) {
            switch (dezena) {
                case 2:
                    System.out.print("vinte ");
                    break;

                case 3:
                    System.out.print("trinta ");
                    break;

                case 4:
                    System.out.print("quarenta ");
                    break;

                case 5:
                    System.out.print("cinquenta ");
                    break;

                case 6:
                    System.out.print("sessenta ");
                    break;

                case 7:
                    System.out.print("setenta ");
                    break;

                case 8:
                    System.out.print("oitenta ");
                    break;

                case 9:
                    System.out.print("noventa ");
                    break;

                default:
                    break;
            }

            if (unidade > 0) {
                System.out.print("e ");
            }

            switch (unidade) {
                case 1:
                    System.out.print("um ");
                    break;

                case 2:
                    System.out.print("dois ");
                    break;

                case 3:
                    System.out.print("três ");
                    break;

                case 4:
                    System.out.print("quatro ");
                    break;

                case 5:
                    System.out.print("cinco ");
                    break;

                case 6:
                    System.out.print("seis ");
                    break;

                case 7:
                    System.out.print("sete ");
                    break;

                case 8:
                    System.out.print("oito ");
                    break;

                case 9:
                    System.out.print("nove ");
                    break;

                default:
                    break;
            }

        }

        if (dezena == 0) {
            switch (unidade) {
                case 1:
                    System.out.print("um ");
                    break;

                case 2:
                    System.out.print("dois ");
                    break;

                case 3:
                    System.out.print("três ");
                    break;

                case 4:
                    System.out.print("quatro ");
                    break;

                case 5:
                    System.out.print("cinco ");
                    break;

                case 6:
                    System.out.print("seis ");
                    break;

                case 7:
                    System.out.print("sete ");
                    break;

                case 8:
                    System.out.print("oito ");
                    break;

                case 9:
                    System.out.print("nove ");
                    break;

                default:
                    break;
            }

        }

        if (centena == 0 && dezena == 0 && unidade == 1) {
            System.out.print("real ");
        } 
        
        if(centena > 0 || dezena > 0 || unidade > 1){
            System.out.print("reais ");
        }

        if (dezenaCentavo > 0) {
            System.out.print("e ");
        }

        if (dezenaCentavo == 1) {
            switch (unidadeCentavo) {
                case 0:
                    System.out.print("dez ");
                    break;

                case 1:
                    System.out.print("onze ");
                    break;

                case 2:
                    System.out.print("doze ");
                    break;

                case 3:
                    System.out.print("treze ");
                    break;

                case 4:
                    System.out.print("quatorze ");
                    break;

                case 5:
                    System.out.print("quinze ");
                    break;

                case 6:
                    System.out.print("dezesseis ");
                    break;

                case 7:
                    System.out.print("dezessete ");
                    break;

                case 8:
                    System.out.print("dezoito ");
                    break;

                case 9:
                    System.out.print("dezenove ");
                    break;

                default:
                    break;
            }

        }

        if (dezenaCentavo > 1) {
            switch (dezenaCentavo) {
                case 2:
                    System.out.print("vinte ");
                    break;

                case 3:
                    System.out.print("trinta ");
                    break;

                case 4:
                    System.out.print("quarenta ");
                    break;

                case 5:
                    System.out.print("cinquenta ");
                    break;

                case 6:
                    System.out.print("sessenta ");
                    break;

                case 7:
                    System.out.print("setenta ");
                    break;

                case 8:
                    System.out.print("oitenta ");
                    break;

                case 9:
                    System.out.print("noventa ");
                    break;

                default:
                    break;
            }

            if (unidadeCentavo > 0) {
                System.out.print("e ");
            }

            switch (unidadeCentavo) {
                case 1:
                    System.out.print("um ");
                    break;

                case 2:
                    System.out.print("dois ");
                    break;

                case 3:
                    System.out.print("três ");
                    break;

                case 4:
                    System.out.print("quatro ");
                    break;

                case 5:
                    System.out.print("cinco ");
                    break;

                case 6:
                    System.out.print("seis ");
                    break;

                case 7:
                    System.out.print("sete ");
                    break;

                case 8:
                    System.out.print("oito ");
                    break;

                case 9:
                    System.out.print("nove ");
                    break;

                default:
                    break;
            }

        }

        if (dezenaCentavo == 0) {
            switch (unidadeCentavo) {
                case 1:
                    System.out.print("um ");
                    break;

                case 2:
                    System.out.print("dois ");
                    break;

                case 3:
                    System.out.print("três ");
                    break;

                case 4:
                    System.out.print("quatro ");
                    break;

                case 5:
                    System.out.print("cinco ");
                    break;

                case 6:
                    System.out.print("seis ");
                    break;

                case 7:
                    System.out.print("sete ");
                    break;

                case 8:
                    System.out.print("oito ");
                    break;

                case 9:
                    System.out.print("nove ");
                    break;

                default:
                    break;
            }

        }

        if (dezenaCentavo == 0 && unidadeCentavo == 1) {
            System.out.print("centavo ");
        }

        if (dezenaCentavo > 0 || unidadeCentavo > 1) {
            System.out.print("centavos ");
        }

        leitor.close();
    }
}