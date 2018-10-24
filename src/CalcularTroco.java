import java.util.Scanner;

//**********************************************************************
// Copyright (c) 2018 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************

public class CalcularTroco
{
    private static int nota100;
    private static int nota50;
    private static int nota10;
    private static int nota5;
    private static int nota1;
    private static int moeda50;
    private static int moeda10;
    private static int moeda5;
    private static int moeda1;

    /**
     * @param valorConta Valor total da conta
     * @param valorPago Valor pago pelo cliente
     */
    public static String calcularTroco(double valorConta, double valorPago)
    {
        if (valorPago < valorConta)
        {
            return "Valor Insuficiente";
        }
        else
        {
            int listaNota[] =
            { 100, 50, 10, 5, 1 };
            int listaCentavos[] =
            { 50, 10, 5, 1 };

            String resultado;
            double troco = valorPago - valorConta;
            int i = 0, valor, centavos, numeroNotas;

            // calculando quantidade de notas
            valor = (int) troco;
            while (valor != 0)
            {
                numeroNotas = valor / listaNota[i];
                if (numeroNotas != 0)
                {
                    valor = valor % listaNota[i];

                    if (listaNota[i] == 100) nota100 = numeroNotas;
                    if (listaNota[i] == 50) nota50 = numeroNotas;
                    if (listaNota[i] == 10) nota10 = numeroNotas;
                    if (listaNota[i] == 5) nota5 = numeroNotas;
                    if (listaNota[i] == 1) nota1 = numeroNotas;
                }
                else
                {
                    i++;
                }
            }

            // definindo os centavos do troco (parte fracionária)
            valor = (int) Math.round((troco - (int) troco) * 100);
            i = 0;
            while (valor != 0)
            {
                centavos = valor / listaCentavos[i]; // calculando a qtde de moedas
                if (centavos != 0)
                {
                    valor = valor % listaCentavos[i]; // sobra

                    if (listaCentavos[i] == 50) moeda50 = centavos;
                    if (listaCentavos[i] == 10) moeda10 = centavos;
                    if (listaCentavos[i] == 5) moeda5 = centavos;
                    if (listaCentavos[i] == 1) moeda1 = centavos;
                }
                else
                {
                    i = i + 1; // próximo centavo
                }
            }
        }
        return "";
    }

    public static void exibirResultados()
    {
        if (nota100 > 0) System.out.println("Notas de 100: " + nota100);
        if (nota50 > 0) System.out.println("Notas de 50: " + nota50);
        if (nota10 > 0) System.out.println("Notas de 10: " + nota10);
        if (nota5 > 0) System.out.println("Notas de 5: " + nota5);
        if (nota1 > 0) System.out.println("Notas de 1: " + nota1);

        if (moeda50 > 0) System.out.println("Moedas de 50: " + moeda50);
        if (moeda10 > 0) System.out.println("Moedas de 10: " + moeda10);
        if (moeda5 > 0) System.out.println("Moedas de 5: " + moeda5);
        if (moeda1 > 0) System.out.println("Moedas de 1: " + moeda1);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o total da conta: ");
        double valorConta = scanner.nextDouble();
        System.out.println("O valor total da conta " + valorConta);

        System.out.println("Informe o valor total pago: ");
        double valorPago = scanner.nextDouble();
        System.out.println("O valor total pago " + valorPago);

        scanner.close();

        calcularTroco(valorConta, valorPago);

        System.out.println("\n\nTROCO\n");
        exibirResultados();
    }

}
