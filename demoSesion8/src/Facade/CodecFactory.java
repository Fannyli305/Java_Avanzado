package Facade;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")){
            System.out.println("CodecFactory : extracting mpeg audio ...");
            return new MPEG4CompresnssionCode();
        }
        else {
            System.out.println("CodecGactory : extracting ogg audio ...");
            return new OggCompressionCode();
        }
    }
}
