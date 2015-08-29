package bmobbeans;

import cn.bmob.v3.BmobObject;

/**
 * Created by supermanmwg on 15-8-28.
 */
public class PersonBean extends BmobObject {
    private String name;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
