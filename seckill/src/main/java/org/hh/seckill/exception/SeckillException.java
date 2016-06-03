package org.hh.seckill.exception;

public class SeckillException extends RuntimeException {

	/**
	 * @Author huangh
	 * @Fields serialVersionUID:
	 */

	private static final long serialVersionUID = 1L;

	public SeckillException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public SeckillException(String messgae) {
		super(messgae);
	}
}
