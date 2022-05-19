package command;

public class AlimentareCont extends OperatiuneBancara{

    private float suma;

    public AlimentareCont(String contBancar, float suma) {
        super(contBancar);
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Contul " + contBancar + ", " + suma);
    }
}
