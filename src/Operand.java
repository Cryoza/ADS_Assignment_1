public class Operand implements Token {

    private int value;


    public Operand(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
