public class LoggingCalculator implements Calculator{

    private final Calculator calculator;
    private final Logger logger;

    public LoggingCalculator(Calculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a,b);
        logger.log("Result of adding number a: " + a + " and number b: " + b + " is " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a,b);
        logger.log("Result of multiplying of number a: " + a + " and number b: " + b + " is " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a,b);
        logger.log("Result of dividing number a: " + a + " by number b: " + b + " is " + result);
        return result;
    }
}
