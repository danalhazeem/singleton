
import iphone.IPhoneSettings;

public class Main {
    public static void main(String[] args) {


                IPhoneSettings settings = IPhoneSettings.getInstance();

                settings.setBrightness(75);
                System.out.println("Brightness: " + settings.getBrightness());

                settings.disableWiFi();

                settings.enableWiFi();

                settings.setVolumeLevel(80);
                System.out.println("Volume Level: " + settings.getVolumeLevel());


            }
        }

