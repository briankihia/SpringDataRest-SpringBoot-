package com.example.SpringDataRest;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringDataRest.model.Alien;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//collectionResourceRel is used to define the url we are going to be using and also we define the path
@RepositoryRestResource(collectionResourceRel="aliens", path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>
{
//    in a controller we have how we do mapping
//    {aid} also like this for passing values
//    to do all this , above we need to add annotation @RepositoryRestResource()

}