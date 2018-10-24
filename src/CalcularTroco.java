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
    private int nota100 = 0;
    private int nota50 = 0;
    private int nota10 = 0;
    private int nota5 = 0;
    private int nota1 = 0;
    private int moeda50 = 0;
    private int moeda10 = 0;
    private int moeda5 = 0;
    private int moeda1 = 0;

    /**
     * @param valor Valor total a ser recebido
     */
    public static void calcularTroco(int valor)
    {

        //for(int i = 0; i < )
        // if(valor % 100 == 0)
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
        System.out.println("O valor total pago " + valorPago);
    }

}
