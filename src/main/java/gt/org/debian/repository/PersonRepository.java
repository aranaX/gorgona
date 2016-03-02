
package gt.org.debian.repository;

import gt.org.debian.gorgona.domain.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 *
 * @author aranax
 */
public interface PersonRepository extends GraphRepository<Person> {

    Person findByName(String name);

    Iterable<Person> findByTeammatesName(String name);

}