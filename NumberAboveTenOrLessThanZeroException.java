package calculator;

class NumberAboveTenOrLessThanZeroException extends RuntimeException {
    public NumberAboveTenOrLessThanZeroException(String message) {
        super(message);
    }
}
