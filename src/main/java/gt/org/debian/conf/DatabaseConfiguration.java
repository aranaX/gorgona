/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.conf;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author aranax
 */
@Configuration
@EnableNeo4jRepositories( basePackages = "gt.org.debian.repository" )
@ComponentScan( basePackages = { "gt.org.debian.domain" } )
@EnableTransactionManagement
public class DatabaseConfiguration extends Neo4jConfiguration {

    @Value( "${neo4j.host:http://localhost}" )
    private String neo4jhost;
    @Value( "${neo4j.port:7474}" )
    private String neo4jport;
    @Value( "${neo4j.db:db/data}" )
    private String neo4jdb;
    /*
     @Bean
    public GraphDatabaseService graphDatabaseService( @Value( "${neo4j.host:http://localhost}" ) String neo4jhost,
            @Value( "${neo4j.port:7474}" ) String neo4jport, @Value( "${neo4j.db:db/data}" ) String neo4jdb ) {
        // return new GraphDatabaseFactory().newEmbeddedDatabase("accessingdataneo4j.db");
        return new SpringRestGraphDatabase( neo4jhost + ":" + neo4jport + "/" + neo4jdb );
    }*/

    public DatabaseConfiguration() {
        //  setBasePackage( "gt.org.debian.gorgona.domain" );
    }

    @Bean
    public Neo4jServer neo4jServer( @Value( "${neo4j.host:http://localhost}" ) String neo4jhost,
            @Value( "${neo4j.port:7474}" ) String neo4jport, @Value( "${neo4j.db:db/data}" ) String neo4jdb ) {
        return new RemoteServer( neo4jhost + ":" + neo4jport );
    }

    @Bean
    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory( "gt.org.debian.gorgona.domain" );
    }

    // needed for session in view in web-applications
    @Bean
    @Scope( value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS )
    @Override
    public Session getSession() throws Exception {
        return super.getSession();
    }

    @Override
    public Neo4jServer neo4jServer() {
        return new RemoteServer( neo4jhost + ":" + neo4jport );
    }
}
