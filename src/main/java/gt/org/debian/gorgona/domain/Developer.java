package gt.org.debian.gorgona.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 *
 * @author aranax
 */
@NodeEntity
public class Developer {
    @GraphId
    private long id;
    private String nickname;
    private String email;
    private String tipo; //individual, team
    private String member; //internal, external

    @RelatedTo(type="MAINTAIN", direction=Direction.OUTGOING)
    private @Fetch Set<SourcePackage> packagesMantained;
    @RelatedTo(type="REPORT", direction=Direction.OUTGOING)
    private @Fetch Set<Bug> bugsReported;
    @RelatedTo(type="UPLOAD", direction=Direction.OUTGOING)
    private @Fetch Set<SourcePackage> packagesUploaded;
    
    public Developer() {
    }

    public Developer( final long id, final String nickname, final String email,
            final String tipo, final String member ) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.tipo = tipo;
        this.member = member;
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getMember() {
        return member;
    }

    public void setMember( String member ) {
        this.member = member;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname( String nickname ) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo( String tipo ) {
        this.tipo = tipo;
    }


}
