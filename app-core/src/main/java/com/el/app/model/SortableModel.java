package com.el.app.model;

public class SortableModel extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	public static final String SORT_PROPERTY_NAME = "order";
	
	protected Integer order;

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}
}
