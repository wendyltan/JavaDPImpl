package AdapterPattern;

/**
 * The adapter transform one interface into another
 * For example,wrapping up AdvancedMediaPlayer's function into MediaPlayer here.
 * But seeing as a MediaPlayer while you are using this adapter.
 */
public class MediaAdapter implements MediaPlayer {

    //need to contain one of the interface object.
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
