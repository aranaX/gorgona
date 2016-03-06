package gt.org.debian.gorgona.domain.relations;

import gt.org.debian.gorgona.domain.Developer;
import gt.org.debian.gorgona.domain.SourcePackage;
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
@RelationshipEntity( type = DeveloperRelation.UPLOAD )
public class UploadRel {
    @GraphId
    private Long id;    
    @StartNode
    private Developer developer;    
    @EndNode
    private SourcePackage sourcePackage;
    private Date date;

    public UploadRel() {
    }

    public UploadRel( final Long id, final Developer developer, final SourcePackage sourcePackage, final Date date ) {
        this.id = id;
        this.developer = developer;
        this.sourcePackage = sourcePackage;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
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

    public SourcePackage getSourcePackage() {
        return sourcePackage;
    }

    public void setSourcePackage( SourcePackage sourcePackage ) {
        this.sourcePackage = sourcePackage;
    }
}
