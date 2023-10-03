package main;

import lombok.Getter;
import main.music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class MusicPlayer {

    private Music music;

    @Getter
    @Value("${musicPlayer.volume}")
    private int volume;

    @Getter
    @Value("${musicPlayer.name}")
    private String name;

    @Autowired
    public MusicPlayer(@Qualifier("jazzMusic") Music music1) {
        this.music = music1;
    }

    public String playMusic(){
        return ("Playing: " + music.getSong());
    }

}
