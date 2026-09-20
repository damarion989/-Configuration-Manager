import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Getting settings for the first time");
        ConfigurationManager settings =
                ConfigurationManager.getInstance();

        System.out.println("Getting settings again");
        ConfigurationManager otherSettings =
                ConfigurationManager.getInstance();

        System.out.println("Same object: " + (settings == otherSettings));

        settings.setVolume(75);
        System.out.println("Volume from other reference: "
                + otherSettings.getVolume());

        AudioSystem audio = new AudioSystem();
        GraphicsRenderer graphics = new GraphicsRenderer();

        audio.playSound();
        graphics.render();

        audio.changeVolume(30);
        System.out.println("After changing the volume:");
        audio.playSound();
        graphics.render();

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. View status");
            System.out.println("2. Change volume");
            System.out.println("3. Change resolution");
            System.out.println("4. Toggle fullscreen");
            System.out.println("5. Run audio and graphics");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            if (!input.hasNextLine()) {
                break;
            }

            String choice = input.nextLine().trim();

            if (choice.equals("1")) {
                System.out.println("Volume: " + settings.getVolume());
                System.out.println("Resolution: "
                        + settings.getResolution());
                System.out.println("Fullscreen: "
                        + settings.isFullscreen());
                System.out.println("Audio and graphics use these settings.");

            } else if (choice.equals("2")) {
                System.out.print("Enter volume from 0 to 100: ");

                if (!input.hasNextLine()) {
                    break;
                }

                try {
                    int volume = Integer.parseInt(input.nextLine().trim());
                    audio.changeVolume(volume);
                } catch (NumberFormatException e) {
                    System.out.println("Enter a whole number.");
                }

            } else if (choice.equals("3")) {
                System.out.println("1. 1280x720");
                System.out.println("2. 1920x1080");
                System.out.println("3. 2560x1440");
                System.out.print("Choose a resolution: ");

                if (!input.hasNextLine()) {
                    break;
                }

                String resolutionChoice = input.nextLine().trim();

                if (resolutionChoice.equals("1")) {
                    settings.setResolution("1280x720");
                } else if (resolutionChoice.equals("2")) {
                    settings.setResolution("1920x1080");
                } else if (resolutionChoice.equals("3")) {
                    settings.setResolution("2560x1440");
                } else {
                    System.out.println("Invalid choice.");
                }

            } else if (choice.equals("4")) {
                settings.setFullscreen(!settings.isFullscreen());
                System.out.println("Fullscreen: "
                        + settings.isFullscreen());

            } else if (choice.equals("5")) {
                audio.playSound();
                graphics.render();

            } else if (choice.equals("6")) {
                running = false;

            } else {
                System.out.println("Choose a number from 1 to 6.");
            }
        }

        input.close();
        System.out.println("Goodbye");
    }
}
