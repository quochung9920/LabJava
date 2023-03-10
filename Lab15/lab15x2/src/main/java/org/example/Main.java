package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static List<Integer> readDices(String fileName) throws FileNotFoundException , InputMismatchException {
        System.out.println("Read file: " + fileName);
        Scanner scanner = null;
        List<Integer> dices = new ArrayList<>();
        try {
            scanner = new Scanner(new FileReader(fileName));
            while (scanner.hasNextLine()) {
                int dice = scanner.nextInt();
                if (dice <= 0 ) {
                    throw new InvalidDiceException("Dice value must greater than 0 ");
                } else if (dice > 6) {
                    throw new InvalidDiceException("Dice value must less than or equal to 6");
                } else {
                    dices.add(dice);
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return dices;
    }

    public static String getWinner(List<Integer> bobDices, List<Integer> aliceDices){
        if (bobDices.size() != aliceDices.size()){
            throw new NumberRollDiceNotEqualException("Number of dice rolls not equal");
        }
        Integer subBob = sumOfDice(bobDices);
        Integer sumAlice = sumOfDice(aliceDices);
        if (Objects.equals(subBob, sumAlice)) {
            return null;
        } else if (subBob > sumAlice){
            return "bob";
        } else {
            return "alice";
        }
    }


    private static Integer sumOfDice(List<Integer> bobDices) {
        Integer sum = 0;
        for (Integer dice : bobDices) {
            sum += dice;
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            List<Integer> bobDices = readDices("C:\\Users\\quoch\\Desktop\\Workspace\\LabJava\\Lab15\\lab15x2\\src\\main\\resources\\file\\bob.txt");
            System.out.println(bobDices);

            List<Integer> aliceDices = readDices("C:\\Users\\quoch\\Desktop\\Workspace\\LabJava\\Lab15\\lab15x2\\src\\main\\resources\\file\\alice.txt");
            System.out.println(aliceDices);

            String winner = getWinner(bobDices, aliceDices);
            if (winner == null) {
                System.out.println("Two people have equal points");
            } else {
                System.out.println("The winner is " + winner);
            }

        } catch (InvalidDiceException | NumberRollDiceNotEqualException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("The file contains non numeric data");
        }

    }

}