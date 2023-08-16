package demo;

public class PngReader implements AdvancedImageReader{
    @Override
    public void readPngFile(String name) {
        System.out.println("I open image with png format --> " + name);
    }

    @Override
    public void readJpgFile(String name) {
    }
}
