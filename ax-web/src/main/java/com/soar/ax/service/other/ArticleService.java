package com.soar.ax.service.other;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.soar.ax.entity.informit.Article;
import com.soar.ax.entity.informit.Category;

@Service("articleService")
public class ArticleService{

	
	public Article getArticle(String category, int id) {
		return new Article(1, "My Article", "Steven Haines", new Date(), "A facinating article",
				"Wow, aren't you enjoying this article?");

	}

	
	public Article getArticleSummary(String category, int id) {
		return new Article(1, "My Article", "Steven Haines", new Date(), "A facinating article");
	}

	public List<Category> loadCategories() {
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category("fun"));
		categories.add(new Category("work"));
		categories.add(new Category("baozhong"));
		return categories;
	}

}
