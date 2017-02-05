package cloud.zag.gw2helper;

import cloud.zag.gw2helper.Gw2Api;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by david on 1/30/2017.
 */
public class TestApiGetsResponse {

    @Test
    public void TestApiGetDailies() {
        Gw2Api api = new Gw2Api();
        assertNotNull(api.GetApiCallJson(Gw2Api.GW2_ACHIEVEMENTS_DAILY_URI));
    }
}
