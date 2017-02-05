package cloud.zag.gw2helper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by david on 2/5/2017.
 */
public class TestApiAchievementDetailResponse {

    @Test
    public void TestApiAchievementDetailResponse() {
        Gw2Api api = new Gw2Api();
        ObjectMapper om = new ObjectMapper();
        String json = api.GetApiCallJson(Gw2Api.GW2_ACHIEVEMENTS_DAILY_URI);

        try {
            Map<String, List<DailyAchievement>> dailyAchievementGroupResponse = om.readValue(json, new TypeReference<Map<String, List<DailyAchievement>>>() { } );
            for (String key : dailyAchievementGroupResponse.keySet())
            {
                /*
                System.out.println("--------");
                System.out.println(key.toUpperCase());
                System.out.println("--------");
                */
                for (DailyAchievement value : dailyAchievementGroupResponse.get(key))
                {
                    String apiResponse = api.GetApiCallJson(Gw2Api.GW2_ACHIEVEMENTS_BASE + value.get_id());
                    AchievementDetail testResponse = om.readValue(apiResponse, AchievementDetail.class);
                    /*
                    System.out.print("ID: " + testResponse.get_id());
                    System.out.print(", Name: " + testResponse.get_name());
                    System.out.println(", Level: " + value.get_level());
                    System.out.println("Description: " + testResponse.get_description());
                    System.out.println("Requirement: " + testResponse.get_requirement());
                    System.out.println("Access: " + value.get_requiredAccess());
                    System.out.println();
                    */
                }
            }
            /*
            System.out.println(testResponse.get_id());
            System.out.println(testResponse.get_name());
            */
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
