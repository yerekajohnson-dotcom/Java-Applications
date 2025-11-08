import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        // Questions and answers
        System.out.println("1. What is the main greenhouse gas produced by human activities?");
        System.out.println("1. Nitrogen\n2. Carbon dioxide\n3. Oxygen\n4. Argon");
        System.out.print("Your answer: ");
        int answer = input.nextInt();
        if (answer == 2) score++;

        System.out.println("\n2. What do global warming skeptics often argue about climate models?");
        System.out.println("1. They are too accurate to be doubted\n2. They rely on too few data sources\n3. They make uncertain predictions based on assumptions\n4. They ignore ocean temperature data");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 3) score++;

        System.out.println("\n3. Which organization shared the 2007 Nobel Peace Prize with Al Gore?");
        System.out.println("1. WHO\n2. UNEP\n3. IPCC\n4. Greenpeace");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 3) score++;

        System.out.println("\n4. What evidence do scientists often cite to support global warming?");
        System.out.println("1. Increased volcanic activity\n2. Rising global average temperatures and melting ice caps\n3. Growth in the ozone layer\n4. Decrease in CO₂ emissions");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 2) score++;

        System.out.println("\n5. Which of the following is a common skeptical claim?");
        System.out.println("1. Climate has always changed naturally over Earth’s history\n2. Humans are entirely responsible for all temperature changes\n3. Global warming stopped completely in 2000\n4. There is no such thing as climate change");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 1) score++;

        // Evaluation
        System.out.println("\nYou got " + score + " out of 5 correct.");
        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming!");
            System.out.println("Here are some sites to learn more:");
            System.out.println(" - https://climate.nasa.gov");
            System.out.println(" - https://www.ipcc.ch");
            System.out.println(" - https://www.heartland.org");
            System.out.println(" - https://www.nationalgeographic.com/environment");
        }

        input.close();
    }
}
