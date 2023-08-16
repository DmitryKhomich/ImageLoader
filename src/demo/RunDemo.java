package demo;

public class RunDemo {

    public static void main(String[] args) {

        MediaReader reader = new MediaReader();

        reader.openFile("png", "MySelfie.png");
        reader.openFile("jpg", "Vocation.jpg");
        reader.openFile("mp3", "GangstaParadise.mp3");
    }
}
