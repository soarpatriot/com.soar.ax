package com.soar.ax.controller.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soar.ax.entity.informit.Article;
import com.soar.ax.entity.informit.Category;
import com.soar.ax.service.other.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/article/{category}/{id}", method = RequestMethod.GET)
	public ModelAndView loadArticle(@PathVariable String category, @PathVariable int id,
			@RequestParam(value = "mode", required = false) String mode) {
		// Load the article based on the mode
		Article article = null;
		System.out.println("mode:" + mode);
		if (mode != null && mode.equalsIgnoreCase("summary")) {
			article = articleService.getArticleSummary(category, id);
		} else {
			article = articleService.getArticle(category, id);
		}

		// Create and return a ModelAndView that presents the article to the caller
		ModelAndView mav = new ModelAndView("articleXmlView", BindingResult.MODEL_KEY_PREFIX + "article", article);
		return mav;
	}

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	public ModelAndView loadArticleCategories() {
		List<Category> categories = articleService.loadCategories();
		ModelAndView mav = new ModelAndView("articleXmlView", "categories", categories);
		//mav.addObject("categories", categories);
		return mav;
	}

	@RequestMapping(value = "/article", method = RequestMethod.DELETE)
	public ModelAndView delArticleCategories() {
		List<Category> categories = articleService.loadCategories();
		System.out.println("delete oprate");
		ModelAndView mav = new ModelAndView("articleXmlView", BindingResult.MODEL_KEY_PREFIX + "category", categories);
		return mav;
	}

	@RequestMapping(value = "/addarticle", method = RequestMethod.POST)
	public ModelAndView addArticleCategories(Category category) {
		List<Category> categories = new ArrayList<Category>();
		System.out.println(category.getName());
		categories.add(category);
		ModelAndView mav = new ModelAndView("articleXmlView", BindingResult.MODEL_KEY_PREFIX + "category", categories);
		return mav;
	}

	@RequestMapping(value = "/addarticle/{name}", method = RequestMethod.POST)
	public ModelAndView addArticleCategoriesForName(@PathVariable String name) {
		List<Category> categories = new ArrayList<Category>();
		Category category = new Category();
		category.setName(name);
		System.out.println(name);
		categories.add(category);
		ModelAndView mav = new ModelAndView("articleXmlView", BindingResult.MODEL_KEY_PREFIX + "category", categories);
		return mav;
	}

}
