package demo;

public class MediaReader implements ImageReader{
    Adapter adapter;

    @Override
    public void openFile(String type, String name) {
        if(type.equalsIgnoreCase("png")){
            adapter = new Adapter(type);
            adapter.openFile(type,name);
        } else if(type.equalsIgnoreCase("jpg")){
            adapter = new Adapter(type);
            adapter.openFile(type,name);
        } else {
            System.out.println("Sorry, unknown format, please try again later");
        }
    }
}
