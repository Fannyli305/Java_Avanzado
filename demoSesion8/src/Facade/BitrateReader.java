package Facade;

public class BitrateReader {

    public static  VideoFile read(VideoFile file, Codec codec ){
        System.out.println("BitrateReader: Reading file ...");
        return  file;
    }
    public static  VideoFile convert(VideoFile buffer, Codec codec){
        System.out.println("BitrateReader: vriting file ...");
        return  buffer;
    }
}
