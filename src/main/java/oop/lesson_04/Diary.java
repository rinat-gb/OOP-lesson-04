package oop.lesson_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

public class Diary implements Iterable<Task> {
    private List<Task> tasks = new ArrayList<>();

    public Task getTask(int i) {
        return tasks.get(i);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int i) {
        tasks.remove(getTask(i));
    }

    public int getQuontity() {
        return tasks.size();
    }

    public List<Task> getSortedByStartTime() {
        List<Task> retList = new ArrayList<>(tasks);

        Collections.sort(retList, new Comparator<Task>() {
            @Override
            public int compare(Task t0, Task t1) {
                return t0.getStartTime().compareTo(t1.getStartTime());
            }
        });
        return retList;
    }

    public List<Task> getSortedByDeadlineTime() {
        List<Task> retList = new ArrayList<>(tasks);

        Collections.sort(retList, new Comparator<Task>() {
            @Override
            public int compare(Task t0, Task t1) {
                return t0.getDeadlineTime().compareTo(t1.getDeadlineTime());
            }
        });
        return retList;
    }

    public List<Task> getSortedByPriority() {
        List<Task> retList = new ArrayList<>(tasks);

        Collections.sort(retList, new Comparator<Task>() {
            @Override
            public int compare(Task t0, Task t1) {
                if (t0.getPriority().ordinal() < t1.getPriority().ordinal())
                    return -1;
                else if (t0.getPriority().ordinal() == t1.getPriority().ordinal())
                    return 0;
                else
                    return 1;
            }
        });
        return retList;
    }

    @Override
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }
}
