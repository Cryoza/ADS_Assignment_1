public class TokenFactory {
    public Token parseAndBuildToken(String string) {
        try  {
            return new Operand(Integer.parseInt(string));
        } catch (NumberFormatException e) {
            return new Operator(string);
        }

    }
}
