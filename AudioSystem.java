public class AudioSystem {
    public void playSound() {
        ConfigurationManager settings =
                ConfigurationManager.getInstance();

        System.out.println("Playing sound at volume "
                + settings.getVolume());
    }

    public void changeVolume(int volume) {
        ConfigurationManager.getInstance().setVolume(volume);
    }
}
