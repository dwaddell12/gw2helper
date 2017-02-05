package cloud.zag.gw2helper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by david on 1/31/2017.
 */
public class DailyAchievementGroup {

    @JsonProperty
    private Map<String, List<DailyAchievement>> _dailies;

    public Map<String, List<DailyAchievement>> get_dailies() {

        return _dailies;
    }

    public void set_dailies(Map<String, List<DailyAchievement>> _dailies) {
        this._dailies = _dailies;
    }

    public DailyAchievementGroup() {
    }
}
