package ru.ivt5.school;

public enum TrainingErrorCode {
    TRAINEE_WRONG_RATING("wrong rating"),
    TRAINEE_WRONG_LASTNAME("wrong lastName"),
    TRAINEE_WRONG_FIRSTNAME("wrong firstName"),
    GROUP_WRONG_NAME("wrong group_name"),
    GROUP_WRONG_ROOM("wrong group_room"),
    TRAINEE_NOT_FOUND("wrong trainee_found"),
    DUPLICATE_GROUP_NAME("wrong dup_group_name"),
    SCHOOL_WRONG_NAME("wrong school_name"),
    GROUP_NOT_FOUND("wrong group_not_found"),
    DUPLICATE_TRAINEE("wrong dup_trainee"),
    EMPTY_TRAINEE_QUEUE("wrong queue");
    String errorString;

    TrainingErrorCode(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {
        return errorString;
    }
}