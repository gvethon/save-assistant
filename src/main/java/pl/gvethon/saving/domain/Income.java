package pl.gvethon.saving.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by Tomek on 2017-03-31.
 */
class Income {

	@Id
	private String id;
	private boolean isConstant;
	private Double salary;
}
