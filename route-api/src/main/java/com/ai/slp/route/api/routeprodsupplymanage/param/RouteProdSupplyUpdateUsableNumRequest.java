package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

public class RouteProdSupplyUpdateUsableNumRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String supplyId;
	private String supplyName;
	public String getSupplyName() {
		return supplyName;
	}
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	private Long usableNum;
	public String getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}
	public Long getUsableNum() {
		return usableNum;
	}
	public void setUsableNum(Long usableNum) {
		this.usableNum = usableNum;
	}

}