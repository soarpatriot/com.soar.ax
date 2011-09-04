package com.soar.ax.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.soar.ax.entity.informit.Article;
import com.soar.ax.entity.informit.Category;

@Component("articleClient")
public class ArticleClient {

	@Autowired
	protected RestTemplate restTemplate;

	private final static String articleServiceUrl = "http://localhost:8080/ax-web/spring/";

	@SuppressWarnings("unchecked")
	public List<Category> getCategories() {  
		return restTemplate.getForObject(articleServiceUrl + "article.xml", List.class);
		
	}

	public Article getArticle(String category, int id) {
		return restTemplate.getForObject(articleServiceUrl + "article/{category}/{id}", Article.class, category, id);
	}

	@SuppressWarnings("unchecked")
	public void delCategories() {
		restTemplate.delete(articleServiceUrl + "article");
	}

	@SuppressWarnings("unchecked")
	public List<Category> postCategories() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", "jizhong");
		return restTemplate.postForObject(articleServiceUrl + "addarticle/{name}", null, List.class, params);

	}

}
