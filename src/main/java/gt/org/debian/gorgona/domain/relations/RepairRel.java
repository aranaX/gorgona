package gt.org.debian.gorgona.domain.relations;

import gt.org.debian.gorgona.domain.Bug;
import gt.org.debian.gorgona.domain.Developer;
import gt.org.debian.types.DeveloperRelation;
import java.util.Date;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author aranax
 */
@RelationshipEntity( type = DeveloperRelation.REPAIR )
public class RepairRel {

    @GraphId
    private Long id;    
    @StartNode
    private Developer developer;    
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
