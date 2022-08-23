package learnenums;

public enum ProjectStatus {

    OPEN,CANCELED,DONE,PROGRESS("IN PROGRESS");

    private String value;

    ProjectStatus(String msg) {
        this.value = msg;
    }

    ProjectStatus() {
    }

    public String getValue() {
        return value;
    }
}
