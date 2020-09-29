public class PostfixExpressionCalculator implements Visitor {

    private GenericListBasedStack<Operand> glbs;


    public PostfixExpressionCalculator() {
        glbs = new GenericListBasedStack<>();
    }

    @Override //Integers
    public void visit(Operand e) {
        glbs.push(e);
    }

    @Override //+,*,/,-
    public void visit(Operator e) {
        switch (e.getOp()) {
            case "+":
                glbs.push(new Operand(glbs.pop().getValue()+glbs.pop().getValue()));
                break;
            case "-":
                glbs.push(new Operand((glbs.pop().getValue()-glbs.pop().getValue())*(-1)));
                break;
            case "*":
                glbs.push(new Operand(glbs.pop().getValue()*glbs.pop().getValue()));
                break;
            case "/":
                int a = glbs.pop().getValue();
                glbs.push(new Operand(glbs.pop().getValue()/a));
                break;
            default:
                throw new IllegalArgumentException("Invalid Operator : " + e.getOp());

        }
    }

    public Integer getToken() {
        return glbs.peek().getValue();

    }
}
