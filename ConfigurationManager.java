public class ConfigurationManager {
    private static ConfigurationManager instance;

    private int volume = 50;
    private String resolution = "1920x1080";
    private boolean fullscreen = false;

    private ConfigurationManager() {
        System.out.println("Settings created");
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            volume = newVolume;
        } else {
            System.out.println("Volume has to be from 0 to 100.");
        }
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String newResolution) {
        resolution = newResolution;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean newFullscreen) {
        fullscreen = newFullscreen;
    }
}
