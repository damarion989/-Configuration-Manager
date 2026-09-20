public class GraphicsRenderer {
    public void render() {
        ConfigurationManager settings =
                ConfigurationManager.getInstance();

        System.out.println("Rendering at " + settings.getResolution());

        if (settings.isFullscreen()) {
            System.out.println("Fullscreen is on");
        } else {
            System.out.println("Fullscreen is off");
        }

        System.out.println("Volume shown on screen: "
                + settings.getVolume());
    }
}
