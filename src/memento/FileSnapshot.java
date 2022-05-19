package memento;

public class FileSnapshot {
    String content;
    String version;
    String dateTime;
    String message;

    public FileSnapshot(String content, String message) {
        this.content = content;
        this.message = message;
    }

    public FileSnapshot(String content, String version, String dateTime, String message) {
        this.content = content;
        this.version = version;
        this.dateTime = dateTime;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FileSnapshot{" +

                ", version='" + version + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
