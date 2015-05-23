package br.com.unlock.model;

/**
 *
 * @author Enoque Felipe
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Unlock {

    public void unlock() throws IOException {
        Scanner ler = new Scanner(System.in);
        int i, n;
        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt();
        FileWriter arq = new FileWriter("c:\\tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("+--Resultado--+%n");
        for (i = 1; i <= 10; i++) {
            gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
        }
        gravarArq.printf("+-------------+%n");
        arq.close();
        System.out.printf("\n RAMAL DESBLOQUEADO COM SUCESSO, TXT SALVO EM \"c:\\tabuada.txt\".\n", n);
    }
}
