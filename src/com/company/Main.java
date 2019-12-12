package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        int y=0;
        int z;
        System.out.println("Digite un numero");
        boolean done=false;
        while(!done) {
            try {
                x = Integer.parseInt(br.readLine());
                done = true;
            } catch (Exception e) {
                System.out.printf("Digite un numero valido");
            }
        }
        done=false;
        System.out.println("Digite un numero");
        while(!done) {
            try {
                y = Integer.parseInt(br.readLine());
                done = true;
            } catch (Exception e) {
                System.out.printf("Digite un numero valido");
            }
        }
        z=x+y;
        System.out.println("La suma de los dos numeros es: "+z);
    }
}
