package Chapter5;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("1. What is the primary argument made by scientists who support the theory of human-caused global warming?");
        System.out.println("2. Climate change is a natural cycle unrelated to human activity");
        System.out.println("3. Human activities, especially burning fossil fuels, increase greenhouse gases");
        System.out.println("4. The Earth’s temperature is stable and not changing");
        System.out.println("5. Volcanoes are the main contributors to climate change");
        System.out.print("Enter your answer (1-5): ");
        answer = input.nextInt();
        if (answer == 2) score++;
        System.out.println();

        System.out.println("1. Which of the following is cited by skeptics as a reason to doubt human-caused global warming?");
        System.out.println("2. Rising sea levels");
        System.out.println("3. Melting glaciers");
        System.out.println("4. Natural fluctuations in solar activity and ocean currents");
        System.out.println("5. Increased carbon dioxide from industrial activity");
        System.out.print("Your answer (1-5): ");
        answer = input.nextInt();
        if (answer == 3) score++;
        System.out.println();

        System.out.println("1. What organization shared the 2007 Nobel Peace Prize with Al Gore for work on climate change?");
        System.out.println("2. Greenpeace");
        System.out.println("3. World Meteorological Organization");
        System.out.println("4. Intergovernmental Panel on Climate Change (IPCC)");
        System.out.println("5. United Nations Environment Programme");
        System.out.print("Your answer (1-5): ");
        answer = input.nextInt();
        if (answer == 3) score++;
        System.out.println();

        System.out.println("1. Which of the following is a potential benefit cited by some critics of climate change policy?");
        System.out.println("2. More frequent hurricanes");
        System.out.println("3. Longer growing seasons in colder regions");
        System.out.println("4. Increased droughts");
        System.out.println("5. Rising ocean acidity");
        System.out.print("Your answer (1-5): ");
        answer = input.nextInt();
        if (answer == 2) score++;
        System.out.println();

        System.out.println("1. What is one reason critics argue against climate models used to predict global warming?");
        System.out.println("2. They are based on ancient myths");
        System.out.println("3. They rely on satellite data");
        System.out.println("4. They are too expensive to run");
        System.out.println("5. They may be based on incomplete or uncertain data");
        System.out.println("Your answer (1-5): ");
        answer = input.nextInt();
        if (answer == 4) score++;
        System.out.println();

        System.out.println("Your score is: " + score + "/5");
        switch (score) {
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Very good");
                break;
            default:
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Recommended websites:");
                System.out.println("- https://www.britannica.com/procon/climate-change-debate");
                System.out.println("- https://consensus.app/questions/arguments-for-and-against-global-warming/");
        }
      }
    }
