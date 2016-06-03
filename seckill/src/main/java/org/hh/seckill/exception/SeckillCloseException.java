package org.hh.seckill.exception;


public class SeckillCloseException extends SeckillException {

	/**
	 * @Author Administrator
	 * @Fields serialVersionUID:
	 */

	private static final long serialVersionUID = 1L;

	public SeckillCloseException(String messgae) {
		super(messgae);
	}

	public SeckillCloseException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
