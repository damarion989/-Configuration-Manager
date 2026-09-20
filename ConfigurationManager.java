public class ConfigurationManager {

  private static final ConfigurationManager instance = 
        new ConfigurationManager(); 

  private int volume = 50; 
  private String resolution = "1920x1080";
  private boolen fullscreen = false;

  private ConfigurationManager() {
  }

  public static ConfigurationManager getInstance() {
    return instance;
  }


  public intVolume() {
    return Volume;
  }

  public void setVolume(int volume) {
    if (volume < 0 | | volume > 100) {
      throw new IllegalArgumentException(
        " Volume must be between 0 and 100.");
  }
    this.volume = volume;
  }

   public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }
}
