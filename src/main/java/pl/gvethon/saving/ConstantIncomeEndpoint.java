package pl.gvethon.saving;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.gvethon.saving.domain.Income;

/**
 * Created by Tomek on 2017-03-31.
 */
@Controller
@RequestMapping("/income/constant")
class ConstantIncomeEndpoint {

	@RequestMapping(method = RequestMethod.POST)
	public void add(Income income) {

	}
}
