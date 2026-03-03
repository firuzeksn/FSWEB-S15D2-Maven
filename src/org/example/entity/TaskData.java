package org.example.entity;

import java.util.*;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann": return annsTasks;
            case "bob": return bobsTasks;
            case "carol": return carolsTasks;
            case "all": return getUnion(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
            default: return new HashSet<>();
        }
    }

    public Set<Task> getUnion(Set<Task>... sets) {
        Set<Task> total = new HashSet<>();
        for (Set<Task> set : sets) {
            total.addAll(set);
        }
        return total;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        return diff;
    }
}