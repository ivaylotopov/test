package telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] phoneNumbers = reader.readLine().split(" ");
        String [] sites = reader.readLine().split(" ");

        Smartphone smartphone = new Smartphone(List.of(phoneNumbers),List.of(sites));
        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());
    }
}
