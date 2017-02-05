package cloud.zag.gw2helper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by david on 1/31/2017.
 */
public class TestJacksonDailies {

    @Test
    public void TestApiGetDailies() {
        Gw2Api api = new Gw2Api();
        String json = api.GetApiCallJson(Gw2Api.GW2_ACHIEVEMENTS_DAILY_URI);
        ObjectMapper om = new ObjectMapper();
        try {
        /*
            DailyAchievementGroup dailyAchievementGroupResponse = om.readValue(json, DailyAchievementGroup.class);
        */
            Map<String, List<DailyAchievement>> dailyAchievementGroupResponse = om.readValue(json, new TypeReference<Map<String, List<DailyAchievement>>>() { } );
            /*
            for (String key : dailyAchievementGroupResponse.keySet())
            {
                System.out.println(key);
                for (DailyAchievement value : dailyAchievementGroupResponse.get(key))
                {
                    System.out.print("ID: " + value.get_id());
                    System.out.print(" Level: " + value.get_level());
                    System.out.println(" Access: " + value.get_requiredAccess());
                }
            }
            */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
