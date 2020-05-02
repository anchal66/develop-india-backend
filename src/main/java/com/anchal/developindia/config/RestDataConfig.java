package com.anchal.developindia.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class RestDataConfig implements RepositoryRestConfigurer {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        exposeIds(config);
    }


    public  void exposeIds(RepositoryRestConfiguration config){
        // get list of aall entity classes from enitiy manager
        Set<EntityType<?>> entities =  entityManager.getMetamodel().getEntities();

        //create an array of entity type
        List<Class> entityClasses = new ArrayList<>();

        //get entity types
        for(EntityType entityType : entities){
            entityClasses.add(entityType.getJavaType());
        }
        //Expose entity IDS:
        Class[] domainTypes = entityClasses.toArray(new Class[0]);
        config.exposeIdsFor(domainTypes);
    }
}
