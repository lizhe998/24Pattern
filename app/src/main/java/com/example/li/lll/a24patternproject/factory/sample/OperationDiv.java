package com.example.li.lll.a24patternproject.factory.sample;

/**
 * 除法类
 * 
 * @author liu yuning
 *
 */
public class OperationDiv extends Operation {

    @Override
    public double result() {
	if (numberB == 0) {
	    throw new RuntimeException("divided by 0");
	}
	return numberA / numberB;
    }

}