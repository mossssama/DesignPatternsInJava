package adapterdesignpattern;

public class AudioPlayer implements MediaPlayer{
     MediaAdapter mediaAdapter; 

    @Override
    public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("mp3")){System.out.println("Playing mp3 file. Name: " + fileName);}             //inbuilt support to play mp3 music files
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){mediaAdapter = new MediaAdapter(audioType); mediaAdapter.play(audioType, fileName);}   //mediaAdapter is providing support to play other file formats
      else{ System.out.println("Invalid media. " + audioType + " format not supported");}    
    }
}
