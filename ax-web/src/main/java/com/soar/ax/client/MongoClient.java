/**
 * 
 */
package com.soar.ax.client;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;

/**
 * @author liuhb7
 *
 */
public class MongoClient {

	/**
	 * @param args
	 */
	private static final Log log = LogFactory.getLog(MongoClient.class);
	public static void main(String[] args) throws Exception {
		MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new Mongo(), "database"));
		Person p = new Person("Joe", 34);
		// Insert is used to initially store the object into the database.
		mongoOps.insert(p);
		log.info("Insert: " + p);
		System.out.print(p);
		// Find
		p = mongoOps.findById(p.getId(), Person.class);
		log.info("Found: " + p);
		
		System.out.print(p);
		// Update
		//mongoOps.updateFirst(query(where("name").is("Joe")), update("age", 35), Person.class);
		//p = mongoOps.findOne(query(where("name").is("Joe")), Person.class);
		log.info("Updated: " + p);
		System.out.print(p);
		// Delete
		mongoOps.remove(p);
		System.out.print(p);
		// Check that deletion worked
		List<Person> people = mongoOps.findAll(Person.class);
		log.info("Number of people = : " + people.size());
		
		System.out.print("Number of people = : " + people.size());
		mongoOps.dropCollection(Person.class);
	}

}
