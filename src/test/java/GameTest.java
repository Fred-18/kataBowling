import org.example.Game;
import org.example.State;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    Game game;

    @BeforeEach
    public void setup(){
        game=new Game();
    }

    @Test
    public void leScoreEstSuperieurA10AlorsIlYAUneErreur(){
        assertThrows(Exception.class,()->game.roll(11));
    }

    @Test
    public void leScoreEstInferieurA0AlorsIlYAUneErreur(){
        assertThrows(Exception.class,()->game.roll(-1));
    }

    @Test
    public void unScoreComprisEntre0et10DoitEtreStocker() throws Exception {
        //given
        //When
        game.roll(7);
        //Then
        assertEquals(7, game.score());
    }

    @Test
    public void leScoreDuDeuxiemeLancerDoitEtreStocker() throws Exception {

        game.roll(7);
        game.roll(2);

        assertEquals(9, game.score());
    }
@Test
    public void leSpareEstQuandUnJoueurFaitTomberLesDixQuillesEnDeuxCoups()throws Exception{
        //WHEN
    game.roll(6);
    game.roll(4);
        assertEquals(game.getFrames().getState(), State.SPARE);
}
}
