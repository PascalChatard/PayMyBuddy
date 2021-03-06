package com.paymybuddy.app.exceptions;

public class UnrealizedTransferException extends RuntimeException {

	public UnrealizedTransferException(String description, double amout) {

		super(String.format("The transfer (%s) of amount (%f) could not be realized", description, amout));
	}

}
