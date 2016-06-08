package org.hh.seckill.enums;


public enum SeckillState {
	Success(1, "秒杀成功"), END(0, "秒杀结束"), REPEAT_SECKILL(-1, "重复秒杀"), DATA_REWRITE(
			-2, "数据篡改"), INNER_ERROR(-3, "系统异常");
	private int state;
	private String stateInfo;

	private SeckillState(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
}
