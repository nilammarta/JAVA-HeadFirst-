package Exercise2;

public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();

        d.canRecord = true;

        if (d.canRecord){
            d.recordDVD();
        }
    }
}
