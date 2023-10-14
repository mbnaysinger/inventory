package com.inventory.service;

import java.io.Serializable;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.inventory.dto.PaginatedFilter;

import com.inventory.exception.AppException;
import com.inventory.exception.MaxResultsExcedeLimiteException;
import com.inventory.exception.MaxResultsNaoInformadoException;

public abstract class AbstractService implements Serializable {

	private static final long serialVersionUID = 1L;

	protected static final Integer MAX_RESULTS_SUPPORTED = 100;

	protected void validatePageSizeInformed(Integer maxResults) throws AppException {
		if (maxResults == null || maxResults == 0)
			throw new MaxResultsNaoInformadoException();

		if (maxResults > MAX_RESULTS_SUPPORTED)
			throw new MaxResultsExcedeLimiteException(MAX_RESULTS_SUPPORTED);
	}
	
	public Pageable getPageable(PaginatedFilter filter, Direction direction, String... fields) {
		Sort sort = null;
		if (fields != null) {
			Order[] sorts = new Order[fields.length];
			for (int i = 0; i < fields.length; i++) {
				sorts[i] = new Sort.Order(direction, fields[i]);
			}
			sort = Sort.by(sorts);
			        //new Sort(sorts);
		}
		return PageRequest.of(filter.getPage(), filter.getPageSize(), sort);
		        //new PageRequest(filter.getPage(), filter.getPageSize(), sort);
	}

}
