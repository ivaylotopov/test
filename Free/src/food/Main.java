package food;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        ArrayList<Citizen> citizens = new ArrayList<>();
        ArrayList<Rebel> rebels = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < number; i++) {
            String [] tokens = input.nextLine().split(" ");
            if (tokens.length == 4){
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                String birthDate = tokens[3];
                Citizen citizen = new Citizen(name,age,id,birthDate);
                citizens.add(citizen);
            } else if (tokens.length == 3){
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String group = tokens[2];
                Rebel rebel = new Rebel(name,age,group);
                rebels.add(rebel);
            }
        }
        while (true) {
            String txt = input.nextLine();
            if (txt.equals("End")) {
                break;
            }
            for (Rebel rebel : rebels) {
                if (rebel.getName().equals(txt)) {
                    rebel.buyFood();
                }
            }
            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(txt)) {
                    citizen.buyFood();
                }
            }
        }
            for (Rebel rebel : rebels) {
                if (rebel.getFood()!=0){
                     total += rebel.getFood();
                }
            }
            for (Citizen citizen : citizens) {
                if (citizen.getFood()!=0){
                    total += citizen.getFood();
                }
            }
        System.out.println(total);
        }

    }

