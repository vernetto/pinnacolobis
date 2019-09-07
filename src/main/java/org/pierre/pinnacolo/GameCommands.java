package org.pierre.pinnacolo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class GameCommands {

    private final Game game;

    @Autowired
    public GameCommands(Game game) {
        this.game = game;
    }

    @ShellMethod("Display game")
    public void listplayers() {
        game.getAllPlayers().forEach(player -> System.out.println(player.toString()));
    }

    @ShellMethod("init")
    public void init() {
         game.init(new String[][] { {"mamma@gmail.com", "gabri@gmail.com"}, {"elena@gmail.com", "carmen@gmail.com"}});
    }

    @ShellMethod("displaycurrentplayer")
    public void displaycurrentplayer() {
        System.out.println(game.getCurrentPlayer());
    }


}
