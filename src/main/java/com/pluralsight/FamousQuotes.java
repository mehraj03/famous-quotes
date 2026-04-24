package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = {
                "The only thing we have to fear is fear itself. – Franklin D. Roosevelt",
                "I think, therefore I am. – René Descartes",
                "That's one small step for man, one giant leap for mankind. – Neil Armstrong",
                "In the middle of difficulty lies opportunity. – Albert Einstein",
                "To be, or not to be, that is the question. – William Shakespeare",
                "The unexamined life is not worth living. – Socrates",
                "Stay hungry, stay foolish. – Steve Jobs",
                "The journey of a thousand miles begins with a single step. – Lao Tzu",
                "That which does not kill us makes us stronger. – Friedrich Nietzsche",
                "Life is what happens when you're busy making other plans. – John Lennon"
        };
        Scanner.scanner = new scanner(System.in);
        boolen seeSaying = true;

        do {
            System.out.print("Pick a quote (select #1 - #10):");
            int userChoice;

            try {
                yesChoice = scanner.nextInt();
                System.out. (quotes[userChoice - 1]);
            } catch (IndexOutOfBoundsException e) {
                System.out.print("thy again how you done know between 1 and 10");
                continue;
            }
            System.out.print("Do you want to see another quote? (true/false");
            boolean userSaying = scanner.nextBoolean();


            if (!userSaying) {
                seeSaying = false;
            }
        }
    } while(seeSaying);
}