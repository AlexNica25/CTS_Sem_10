package memento;

public class File {
    String content;
    String id;
    String adresa;
    String name;

    public File(String content, String id) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File(String content, String id, String adresa, String name) {
        this.content = content;
        this.id = id;
        this.adresa = adresa;
        this.name = name;
    }

    public FileSnapshot createSnap(String message) {
        return new FileSnapshot(this.content, message);
    }

    public void restoreContent(FileSnapshot fileSnapshot) {
        if(fileSnapshot != null) {
            this.content = fileSnapshot.getContent();
        }
    }

    public String printFile() {
        return "File{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", adresa='" + adresa + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
