package cloud.zag.gw2helper;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by david on 1/30/2017.
 */
public class Achievement {

    /**
     *
     {
     "id": 1969,
     "level": {
     "min": 1,
     "max": 79
     },
     "required_access": [
     "GuildWars2",
     "HeartOfThorns"
     ]
     }

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

    @JsonProperty(value = "id")
    private int _id;
    @JsonProperty(value = "level")
    private Map<String, Integer> _level;
    @JsonProperty(value = "required_access")
    private List<String>_requiredAccess;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Map<String, Integer> get_level() {
        return _level;
    }

    public void set_level(Map<String, Integer> _level) {
        this._level = _level;
    }

    public List<String> get_requiredAccess() {
        return _requiredAccess;
    }

    public void set_requiredAccess(List<String> _requiredAccess) {
        this._requiredAccess = _requiredAccess;
    }
}
