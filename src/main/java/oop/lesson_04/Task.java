package oop.lesson_04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task {
    private String description;
    private Priority priority;
    private Calendar startTime;
    private Calendar deadlineTime;

    public Task(String description, Priority priority, Calendar startTime, Calendar deadlineTime) {
        this.description = description;
        this.priority = priority;
        this.startTime = startTime;
        this.deadlineTime = deadlineTime;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public Calendar getDeadlineTime() {
        return deadlineTime;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("d MMM yyyy");
        StringBuilder sb = new StringBuilder();

        sb.append("\"");
        sb.append(description);
        sb.append("\", ");
        sb.append("начало: ");
        sb.append(df.format(startTime.getTime()));
        sb.append(", дедлайн: ");
        sb.append(df.format(deadlineTime.getTime()));
        sb.append(", ");

        switch (priority) {
            case LOW:
                sb.append("может и подождать");
                break;
            case NORMAL:
                sb.append("обычное время выполнения");
                break;
            case HIGH:
                sb.append("ВЫПОЛНИТЬ СРОЧНО");
                break;
        }

        return sb.toString();
    }
}
