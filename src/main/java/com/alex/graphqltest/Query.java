package com.alex.graphqltest;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {


    public Animal animal(){
        return new Animal("bob");
    }

}
