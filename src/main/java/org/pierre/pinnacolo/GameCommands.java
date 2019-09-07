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
        game.init(new String[][] { {"mamma@gmail.com", "gabri@gmail.com"}, {"elena@gmail.com", "carmen@gmail.com"}});
    }

    @ShellMethod("Display game")
    public void listplayers(
            @ShellOption() String text
    ) {
        game.getAllPlayers().forEach(player -> System.out.println(player.toString()));
        System.out.println(text);

    }
}
