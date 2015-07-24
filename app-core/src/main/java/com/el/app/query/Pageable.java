package com.el.app.query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.el.app.query.Sort.Direction;

public class Pageable implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final int DEFAULT_PAGE_NUMBER = 1;

	private static final int DEFAULT_PAGE_SIZE = 20;

	private static final int MAX_PAGE_SIZE = 1000;

	private int pageNumber = DEFAULT_PAGE_NUMBER;

	private int pageSize = DEFAULT_PAGE_SIZE;

	private String searchProperty;

	private String searchValue;

	private String sortProperty;

	private Direction sortDirection;

	private List<Filter> filters = new ArrayList<Filter>();

	private List<Sort> sorts = new ArrayList<Sort>();

	public Pageable() {
	}

	public Pageable(Integer pageNumber, Integer pageSize) {
		if (pageNumber != null && pageNumber >= 1) {
			this.pageNumber = pageNumber;
		}
		if (pageSize != null && pageSize >= 1 && pageSize <= MAX_PAGE_SIZE) {
			this.pageSize = pageSize;
		}
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			pageNumber = DEFAULT_PAGE_NUMBER;
		}
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize < 1 || pageSize > MAX_PAGE_SIZE) {
			pageSize = DEFAULT_PAGE_SIZE;
		}
		this.pageSize = pageSize;
	}

	public String getSearchProperty() {
		return searchProperty;
	}

	public void setSearchProperty(String searchProperty) {
		this.searchProperty = searchProperty;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public String getSortProperty() {
		return sortProperty;
	}

	public void setSortProperty(String sortProperty) {
		this.sortProperty = sortProperty;
	}

	public Direction getSortDirection() {
		return sortDirection;
	}

	public void setSortDirection(Direction sortDirection) {
		this.sortDirection = sortDirection;
	}

	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public List<Sort> getSorts() {
		return sorts;
	}

	public void setSorts(List<Sort> sorts) {
		this.sorts = sorts;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Pageable other = (Pageable) obj;
		return new EqualsBuilder().append(getPageNumber(), other.getPageNumber()).append(getPageSize(), other.getPageSize()).append(getSearchProperty(), other.getSearchProperty())
				.append(getSearchValue(), other.getSearchValue()).append(getSortProperty(), other.getSortProperty()).append(getSortDirection(), other.getSortDirection())
				.append(getFilters(), other.getFilters()).append(getSorts(), other.getSorts()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(getPageNumber()).append(getPageSize()).append(getSearchProperty()).append(getSearchValue()).append(getSortProperty()).append(getSortDirection())
				.append(getFilters()).append(getSorts()).toHashCode();
	}
}
