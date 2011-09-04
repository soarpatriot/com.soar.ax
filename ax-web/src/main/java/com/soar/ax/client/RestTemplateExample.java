package com.soar.ax.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soar.ax.entity.informit.Category;

public class RestTemplateExample {
	public static void main(String[] args) {
		
		String[] configFiles = {"spring-config/spring-context-test.xml","spring-config/spring-context.xml"};
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configFiles);
		ArticleClient articleClient = applicationContext.getBean("articleClient", ArticleClient.class);

		//get operate
		//		Article article = articleClient.getArticle("fun", 1);
		//		System.out.println("Article: " + article.getBody());
		//
		//		List<Category> categories = articleClient.getCategories();
		//		for (Category category : categories) {
		//			System.out.println("Category: " + category);
		//		}

		//delete operate
		//articleClient.delCategories();

		//post operate
		List<Category> categories = articleClient.getCategories();
		for(Category category : categories)
		{
			System.out.println("category :   "+category.getName());
		}

	}
}
