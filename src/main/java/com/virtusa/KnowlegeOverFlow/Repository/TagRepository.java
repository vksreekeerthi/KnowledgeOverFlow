package com.virtusa.KnowlegeOverFlow.Repository;


import com.virtusa.KnowlegeOverFlow.Entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TagRepository extends JpaRepository<Tag,Integer>  {


}
