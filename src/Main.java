import command.AlimentareCont;
import command.OperatiuneBancara;
import command.ServerOperatiuniBancare;
import memento.File;
import memento.FileSnapshot;
import memento.VersionControl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Memento");
        File firstFile = new File("prim", "Version 1.0.0", "noAddress", "noName");
        firstFile.printFile();

        FileSnapshot fileSnapshot = firstFile.createSnap("number 1");

        VersionControl system = new VersionControl();

        system.addFileSnapshot(fileSnapshot);
        system.listSnapshot();
        firstFile.setContent("teh second one");
        firstFile.printFile();

        system.addFileSnapshot(firstFile.createSnap("second one"));
        firstFile.restoreContent(system.getNextVersion(1));

        firstFile.printFile();

        System.out.println("-------------------------------------------------------------------------------------------------------");


        System.out.println("Command");

        ServerOperatiuniBancare serverOperatiuniBancare = ServerOperatiuniBancare.getInstance();

        OperatiuneBancara operatiuneBancara1 = new AlimentareCont("CONT1", 900);
        OperatiuneBancara operatiuneBancara2 = new AlimentareCont("CONT2", 9000);
        OperatiuneBancara operatiuneBancara3 = new AlimentareCont("CONT3", 90000);
        serverOperatiuniBancare.inregistreazaOperatiune(operatiuneBancara1);
        serverOperatiuniBancare.inregistreazaOperatiune(operatiuneBancara2);
        serverOperatiuniBancare.inregistreazaOperatiune(operatiuneBancara3);
        serverOperatiuniBancare.prelucrareOperatiuni();



    }
}
