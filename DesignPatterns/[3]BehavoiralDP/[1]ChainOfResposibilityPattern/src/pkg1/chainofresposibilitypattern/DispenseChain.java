package pkg1.chainofresposibilitypattern;

public interface DispenseChain {
    
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
