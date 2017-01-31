package cloud.zag.gw2helper;

import java.util.List;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;

/**
 * Created by david on 1/30/2017.
 */
public class Gw2Api {

    public static final String GW2_ACHIEVEMENTS_URI = "https://api.guildwars2.com/v2/achievements/daily";

    public List<Achievement> GetDailyAchievements()
    {
        return null;
    }

    String GetApiCallJson(String apiCallUri)
    {
        //Gets Jax RS client
        Client gw2RestClient = ClientBuilder.newClient();
        WebTarget gw2ApiResult = gw2RestClient.target(apiCallUri);
        return gw2ApiResult.request(MediaType.APPLICATION_JSON).get(String.class);
    }

    public Gw2Api() {
    }
}
