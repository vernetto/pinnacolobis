package org.pierre.pinnacolo.service;

import org.pierre.pinnacolo.Game;
import org.pierre.pinnacolo.Player;
import org.pierre.pinnacolo.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game")
public class GameService implements GameCommandsInterface {

    private final Game game;

    @Autowired
    public GameService(Game game) {
        this.game = game;
    }

    @Override
    @GetMapping("/listplayers")
    public Players listplayers() {
        System.out.println("listplayers");
        return game.getPlayers();
    }

    @Override
    @GetMapping("/init")
    public void init() {
        System.out.println("init");
        game.init(new String[][] { {"mamma@gmail.com", "gabri@gmail.com"}, {"elena@gmail.com", "carmen@gmail.com"}});
    }

    @Override
    @GetMapping("/displaycurrentplayer")
    public Player displaycurrentplayer() {
        System.out.println("displaycurrentplayer");
        System.out.println(game.getCurrentPlayer());
        return game.getCurrentPlayer();
    }
}
