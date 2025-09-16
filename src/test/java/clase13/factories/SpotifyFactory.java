package clase13.factories;

import clase13.dependencies.DependenciesTest;
import clase13.refactoring.SpotifyRegistrationTest;
import org.testng.annotations.Factory;

public class SpotifyFactory {

    @Factory
    public Object[] spotifyFactory(){
        return new Object[] {
                new SpotifyTest("testing@test.com"),
                new SpotifyTest("qqqqqq@aaaa.com"),
                new SpotifyTest("selenium2021@2021.com")
                // se pueden agregar mas test
                //new SpotifyRegistrationTest()

        };
    }

}
