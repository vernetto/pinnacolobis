package org.pierre.pinnacolo;

import org.pierre.pinnacolo.service.GameCommandsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.client.RestTemplate;

@ShellComponent
public class GameCommands implements GameCommandsInterface {

    private final Game game;
    RestTemplate restTemplate = new RestTemplate();


    @Autowired
    public GameCommands(Game game) {
        this.game = game;
        restTemplate.getInterceptors().add(  new BasicAuthenticationInterceptor("admin", "admin"));
    }

    @Override
    @ShellMethod("Display game")
    public Players listplayers() {
        game.getAllPlayers().forEach(player -> System.out.println(player.toString()));
        return game.getPlayers();
    }

    @Override
    @ShellMethod("init")
    public void init() {
        // game.init(new String[][] { {"mamma@gmail.com", "gabri@gmail.com"}, {"elena@gmail.com", "carmen@gmail.com"}});
        String myout = restTemplate.getForObject("http://localhost:8081/game/init", String.class);
        System.out.println(myout);

    }

    @Override
    @ShellMethod("displaycurrentplayer")
    public Player displaycurrentplayer() {
        //System.out.println(game.getCurrentPlayer());
        Player myout = restTemplate.getForObject("http://localhost:8081/game/displaycurrentplayer", Player.class);
        return myout;
    }


}
