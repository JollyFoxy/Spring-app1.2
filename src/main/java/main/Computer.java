package main;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Computer {
    private UUID id;
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "Computer id: " + id + "\n" + musicPlayer.playMusic() + "\n" + musicPlayer.getName();
    }

    public Computer(MusicPlayer musicPlayer) {
        this.id = UUID.randomUUID();
        this.musicPlayer = musicPlayer;
    }
}
