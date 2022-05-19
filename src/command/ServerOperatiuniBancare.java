package command;

import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuniBancare {
    private static ServerOperatiuniBancare instance = null;

    private ServerOperatiuniBancare() {};

    private List<OperatiuneBancara> op = new ArrayList<>();

    public static ServerOperatiuniBancare getInstance() {
        if(instance == null) {
            instance = new ServerOperatiuniBancare();
        }
        return instance;
    }

    public void inregistreazaOperatiune(OperatiuneBancara operatiuneBancara) {
        this.op.add(operatiuneBancara);
    }

    public void prelucrareOperatiuni(){
        for(OperatiuneBancara operatiuneBancara : op) {
            operatiuneBancara.efectuareOperatiune();
        }
    }
}
