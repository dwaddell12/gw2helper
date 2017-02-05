package cloud.zag.gw2helper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;


/**
 * Created by david on 1/30/2017.
 */
public class Gw2Api {

    public static final String GW2_ACHIEVEMENTS_BASE = "https://api.guildwars2.com/v2/achievements/";
    public static final String GW2_ACHIEVEMENTS_DAILY_URI = GW2_ACHIEVEMENTS_BASE + "daily";

    public List<DailyAchievement> GetDailyAchievements() {
        List<DailyAchievement> dailyAchievements = new ArrayList<DailyAchievement>();
        String json = GetApiCallJson(Gw2Api.GW2_ACHIEVEMENTS_DAILY_URI);
        ObjectMapper om = new ObjectMapper();
        try {
            Map<String, List<DailyAchievement>> dailyAchievementGroupResponse = om.readValue(json, new TypeReference<Map<String, List<DailyAchievement>>>() { } );
            for (String key : dailyAchievementGroupResponse.keySet())
            {
                for (DailyAchievement value : dailyAchievementGroupResponse.get(key))
                {
                    dailyAchievements.add(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return dailyAchievements;
    }

    String GetApiCallJson(String apiCallUri) {
        //Gets Jax RS client
        Client gw2RestClient = ClientBuilder.newClient();
        WebTarget gw2ApiResult = gw2RestClient.target(apiCallUri);
        return gw2ApiResult.request(MediaType.APPLICATION_JSON).get(String.class);
    }

    AchievementDetail GetDailyAchievementDetail(DailyAchievement achievement) {
        AchievementDetail achievementDetailResponse = null;
        String json = GetApiCallJson(Gw2Api.GW2_ACHIEVEMENTS_BASE + achievement.get_id());
        ObjectMapper om = new ObjectMapper();
        try {
            achievementDetailResponse = om.readValue(json, AchievementDetail.class);
        } catch (IOException e){
            e.printStackTrace();
        }
        return achievementDetailResponse;
    }

    public Gw2Api() {
    }
}
