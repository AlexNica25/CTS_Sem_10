package memento;

import java.util.HashMap;
import java.util.Map;

public class VersionControl {
    public static int IDsnapshot = 1;
    private Map<Integer, FileSnapshot> versions = new HashMap<>();


    public void addFileSnapshot(FileSnapshot file) {
        this.versions.put(IDsnapshot++, file);
    }

    public void listSnapshot() {
        for(Map.Entry<Integer, FileSnapshot> entry : versions.entrySet()) {
            System.out.println("Id:" + entry.getKey() + ", " + entry.getValue());
        }
    }

    public FileSnapshot getNextVersion(int id) {
        if(versions.containsKey(id)) {
            return versions.get(id);
        } else {
            return null;
        }
    }
}
