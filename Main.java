public class Main {
    public static void main(String[] args) {
        ConfigurationManager first =
                ConfigurationManager.getInstance();

        ConfigurationManager second =
                ConfigurationManager.getInstance();

        System.out.println("Same object: " + (first == second));

        System.out.println("Original volume: " + second.getVolume());

        first.setVolume(80);
        System.out.println("Volume through second: " + second.getVolume());

        first.setResolution("2560x1440");
        System.out.println("Resolution through second: "
                + second.getResolution());

        first.setFullscreen(true);
        System.out.println("Fullscreen through second: "
                + second.isFullscreen());
    }
}
