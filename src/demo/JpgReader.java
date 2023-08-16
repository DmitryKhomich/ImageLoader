package demo;

public class JpgReader implements AdvancedImageReader{
    @Override
    public void readPngFile(String name) {

    }
    @Override
    public void readJpgFile(String name) {
        System.out.println("I open image with jpg format --> " + name);
    }
}
