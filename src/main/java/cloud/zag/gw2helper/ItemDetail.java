package cloud.zag.gw2helper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.mail.imap.protocol.Item;

/**
 * Created by david on 2/1/2017.
 */
public class ItemDetail {

    @JsonProperty(value = "id")
    private int _id;

    @JsonProperty(value = "name")
    private String _name;

    @JsonProperty(value = "icon")
    private String _icon;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_icon() {
        return _icon;
    }

    public void set_icon(String _icon) {
        this._icon = _icon;
    }

    public ItemDetail() {

    }
}
