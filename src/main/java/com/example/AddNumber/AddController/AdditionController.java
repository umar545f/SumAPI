package com.example.AddNumber.AddController;

import com.example.AddNumber.domain.Addition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdditionController {

	@GetMapping("/index")
	public String viewForm(Model model)
	{
		model.addAttribute("Addition",new Addition() );
				return "index";
	}
	@PostMapping("/addtion")
	public String addForm(@ModelAttribute Addition addition, BindingResult result,Model model)
	{
		model.addAttribute("addition",addition);
		return "calculate";
	}

}
