package sgreben.regex_builder.expression;

import sgreben.regex_builder.tokens.*;
import sgreben.regex_builder.Expression;

public class RepeatGreedy extends Repeat {
	public RepeatGreedy(Expression child, Integer lowerBound, Integer upperBound) { 
		super(child, lowerBound, upperBound); 
	}
	
	public RepeatGreedy(Expression child, Integer bound) { 
		this(child, bound, bound); 
	}
	
	public void compile(sgreben.regex_builder.CaptureGroupIndex index, java.util.List<TOKEN> output) {
		super.compile(index, output);
		output.add(new PLUS());
	}
}