package chw._04_01_prototype;

import java.util.ArrayList;
import java.util.List;

public class Thing implements Cloneable {
    private List<String> list = new ArrayList<>();

    @Override
    protected Thing clone()  {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value){
        this.list.add(value);
    }

    public List<String> getList() {
        return list;
    }
}
