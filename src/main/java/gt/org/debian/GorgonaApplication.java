package gt.org.debian;

import gt.org.debian.repository.PersonRepository;
import gt.org.debian.conf.DatabaseConfiguration;
import gt.org.debian.gorgona.domain.Person;
import java.io.File;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.io.fs.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.core.GraphDatabase;

@ComponentScan
@Import( DatabaseConfiguration.class )
@SpringBootApplication
public class GorgonaApplication implements CommandLineRunner {


	@Autowired PersonRepository personRepository;

	@Autowired GraphDatabase graphDatabase;

        @Override
	public void run(String... args) throws Exception {

//		Person greg = new Person("Greg");
//		Person roy = new Person("Roy");
//		Person craig = new Person("Craig");
//
//		System.out.println("Before linking up with Neo4j...");
//		for (Person person : new Person[] { greg, roy, craig }) {
//			System.out.println(person);
//		}
//
//		Transaction tx = graphDatabase.beginTx();
//		try {
//			personRepository.save(greg);
//			personRepository.save(roy);
//			personRepository.save(craig);
//
//			greg = personRepository.findByName(greg.name);
//			greg.worksWith(roy);
//			greg.worksWith(craig);
//			personRepository.save(greg);
//
//			roy = personRepository.findByName(roy.name);
//			roy.worksWith(craig);
//			// We already know that roy works with greg
//			personRepository.save(roy);
//
//			// We already know craig works with roy and greg
//
//			System.out.println("Lookup each person by name...");
//			for (String name : new String[] { greg.name, roy.name, craig.name }) {
//				System.out.println(personRepository.findByName(name));
//			}
//
//			System.out.println("Looking up who works with Greg...");
//			for (gt.org.debian.gorgona.domain.Person person : personRepository.findByTeammatesName("Greg")) {
//				System.out.println(person.name + " works with Greg.");
//			}
//
//			tx.success();
//		} finally {
//			tx.close();
//		}
	}

	public static void main(String[] args) throws Exception {
		FileUtils.deleteRecursively(new File("accessingdataneo4j.db"));

		SpringApplication.run(GorgonaApplication.class, args);
	}
}