package org.hh.seckill.exception;

public class RepeatSeckillException extends SeckillException {

	/**
	 * @Author Administrator
	 * @Fields serialVersionUID:
	 */

	private static final long serialVersionUID = 1L;

	public RepeatSeckillException(String messgae) {
		super(messgae);
	}

	public RepeatSeckillException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
