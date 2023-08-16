package demo;

public class Adapter implements  ImageReader{
    AdvancedImageReader advancedImageReader;

    public Adapter(String type){
        if(type.equalsIgnoreCase("png")){
            advancedImageReader = new PngReader();
        } else if(type.equalsIgnoreCase("jpg")){
            advancedImageReader = new JpgReader();
        }
    }
    @Override
    public void openFile(String type, String name) {
        if(type.equalsIgnoreCase("png")){
            advancedImageReader.readPngFile(name);
        } else if(type.equalsIgnoreCase("jpg")){
            advancedImageReader.readJpgFile(name);
        }
    }
}
