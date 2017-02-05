package cloud.zag.gw2helper;

/**
 * Created by david on 1/31/2017.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 {
 "id": 1969,
 "name": "Daily Maguuma Jungle Miner",
 "description": "Fueling the engines of the economy.",
 "requirement": "Gather raw materials by mining ore in the following Maguuma Jungle maps: Caledon Forest, Metrica Province, Brisban Wildlands, Sparkfly Fen, and Mount Maelstrom.",
 "locked_text": "",
 "type": "Default",
 "flags": [],
 "tiers": [
 {
     "count": 10,
     "points": 0
 }
 ],
 "rewards": [
     {
     "type": "Item",
     "id": 68137,
     "count": 1
     }
 ]
 }
 */
public class AchievementDetail {

    @JsonProperty(value = "id")
    private int _id;
    @JsonProperty(value = "icon")
    private String _icon;
    @JsonProperty(value = "name")
    private String _name;
    @JsonProperty(value = "description")
    private String _description;
    @JsonProperty(value = "requirement")
    private String _requirement;
    @JsonProperty(value = "locked_text")
    private String _lockedText;
    @JsonProperty(value = "type")
    private String _type;
    @JsonProperty(value = "flags")
    private List<String> _flags;
    @JsonProperty(value = "tiers")
    private List<Map<String, Integer>> _tiers;
    @JsonProperty(value = "rewards")
    private List<Map<String, Object>> _rewards;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_icon() {
        return _icon;
    }

    public void set_icon(String _icon) {
        this._icon = _icon;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public String get_requirement() {
        return _requirement;
    }

    public void set_requirement(String _requirement) {
        this._requirement = _requirement;
    }

    public String get_lockedText() {
        return _lockedText;
    }

    public void set_lockedText(String _lockedText) {
        this._lockedText = _lockedText;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public List<String> get_flags() {
        return _flags;
    }

    public void set_flags(List<String> _flags) {
        this._flags = _flags;
    }

    public List<Map<String, Integer>> get_tiers() {
        return _tiers;
    }

    public void set_tiers(List<Map<String, Integer>> _tiers) {
        this._tiers = _tiers;
    }

    public List<Map<String, Object>> get_rewards() {
        return _rewards;
    }

    public void set_rewards(List<Map<String, Object>> _rewards) {
        this._rewards = _rewards;
    }

    public AchievementDetail() {

    }


}
