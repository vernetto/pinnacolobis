package org.pierre.pinnacolo.service;

import org.pierre.pinnacolo.Player;
import org.pierre.pinnacolo.Players;
import org.springframework.shell.standard.ShellMethod;

public interface GameCommandsInterface {
    @ShellMethod("Display game")
    Players listplayers();

    @ShellMethod("init")
    void init();

    @ShellMethod("displaycurrentplayer")
    Player displaycurrentplayer();
}
