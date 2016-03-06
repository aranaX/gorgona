package gt.org.debian.gorgona.domain;

import java.util.Date;
import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

/**
 *
 * @author aranax
 */
@RelationshipEntity( type = "REPAIR" )
public class RepairRel {

    @GraphId
    private Long id;
    @Fetch
    @StartNode
    private Developer developer;
    @Fetch
    @EndNode
    private Bug bug;
    private Date date;
    private String message;

    public RepairRel() {
    }

    public RepairRel( final Long id, final Developer developer, final Bug bug, final Date date, final String message ) {
        this.id = id;
        this.developer = developer;
        this.bug = bug;
        this.date = date;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper( Developer developer ) {
        this.developer = developer;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug( Bug bug ) {
        this.bug = bug;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }
}
