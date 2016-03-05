package gt.org.debian.gorgona.domain;

import java.util.Set;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Person {
    @GraphId private Long id;
    private String nick;
    private String email;    
    @RelatedTo(type="MAINTAINS", direction=Direction.OUTGOING)
    private @Fetch Set<SourcePackage> packages;
    @RelatedTo(type="REPORTS", direction=Direction.OUTGOING)
    private @Fetch Set<Bug> bugsReported;

    public Set<Bug> getBugsSolved() {
        return bugsSolved;
    }

    public void setBugsSolved( Set<Bug> bugsSolved ) {
        this.bugsSolved = bugsSolved;
    }
    @RelatedTo(type="SOLVED", direction=Direction.OUTGOING)
    private @Fetch Set<Bug> bugsSolved;
    

    public Person() {}
    public Person(final String nick, final String email) { 
        this.nick = nick;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick( String nick ) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Set<SourcePackage> getPackages() {
        return packages;
    }

    public void setPackages( Set<SourcePackage> packages ) {
        this.packages = packages;
    }

    public Set<Bug> getBugsReported() {
        return bugsReported;
    }

    public void setBugsReported( Set<Bug> bugsReported ) {
        this.bugsReported = bugsReported;
    }
}