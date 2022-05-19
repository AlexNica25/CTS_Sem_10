package command;

public abstract class OperatiuneBancara {
    protected String contBancar;

    public OperatiuneBancara(String contBancar) {
        this.contBancar = contBancar;
    }

    public abstract void efectuareOperatiune();
}
