package model;

import java.util.List;

public abstract class Faculty {
    private List<Group> groups;

    public Faculty(List<Group> groups) {
        this.groups = groups;
    }
}
