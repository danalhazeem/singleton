package iphone;

public class IPhoneSettings {
    private static IPhoneSettings instance;
    private int volumeLevel;
    private boolean wifiEnabled;
    private int brightness;

    private IPhoneSettings() {
        setBrightness(brightness);


    }

    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 100) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("Volume level must be between 0 and 100.");
        }
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void enableWiFi() {
        wifiEnabled = true;
        System.out.println("wifi enable");
    }

    public void disableWiFi() {
        wifiEnabled = false;
        System.out.println("wifi disable");
    }


    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Brightness must be between 0 and 100.");
        }
    }
    public int getBrightness() {
        return brightness;
    }

    public static void setInstance(IPhoneSettings instance) {
        IPhoneSettings.instance = instance;
    }


    public void connect() {
        System.out.println("Database connected."+this.hashCode());
    }

}