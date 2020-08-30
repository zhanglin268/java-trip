package com.lin.model;

import java.util.Objects;

/**
 * @author: 张林
 * @Date :Created in 11:40 pm 22/08/2020
 */
public class Section {
    public int sid;
    public String name;
    public String uuid;//如果关联声音，UUID就是保存声音的uuid 否则为null；
    public Section() {

    }
    public Section(int sid,String uuid,String name) {
        this.sid = sid;
        this.uuid = uuid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Section{" +
                "uuid='" + uuid + '\'' +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Section)) return false;
        Section section = (Section) o;
        return Objects.equals(name, section.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
