public class Operator implements Token {

    private String op;

    public Operator(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

