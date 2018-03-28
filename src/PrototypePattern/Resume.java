package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 李亚卿
 * @Date: Created in 23:38 2018/3/28 0028
 * @Description:
 */
public class Resume implements Cloneable {

    public String language;
    public ArrayList<String> abilities = new ArrayList<>();

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    @Override
    public Resume clone() {
        Resume resumeCloned = null;
        try {
            resumeCloned = (Resume) super.clone();
            //resumeCloned.abilities = (ArrayList<String>) abilities.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return resumeCloned;
    }
}
