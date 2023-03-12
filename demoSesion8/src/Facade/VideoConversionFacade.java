package Facade;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversionFacade : conversion started");

        VideoFile file = new VideoFile(fileName);

        Codec sourceCode = CodecFactory.extract(file);
        Codec destinationCodec;

        if(format.equals("mp4")){
            destinationCodec = new OggCompressionCode();
        } else {
            destinationCodec = new MPEG4CompresnssionCode();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCode);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer().fix(intermediateResult));
        System.out.println("VideoConvesionFacade: conversionc completed");

        return result;
    }
}
