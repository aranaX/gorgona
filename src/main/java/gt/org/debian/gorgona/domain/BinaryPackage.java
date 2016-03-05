/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 *
 * @author aranax
 */
@NodeEntity
public class BinaryPackage {

    @GraphId
    private Long id;
    private String name;
    private String version;
    private String arch;

    public BinaryPackage() {
    }

    public BinaryPackage( final Long id, final String name, final String version, final String arch ) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.arch = arch;
    }

    public String getArch() {
        return arch;
    }

    public void setArch( String arch ) {
        this.arch = arch;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion( String version ) {
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }


}
