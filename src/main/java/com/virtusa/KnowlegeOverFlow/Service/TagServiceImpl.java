package com.virtusa.KnowlegeOverFlow.Service;

import com.virtusa.KnowlegeOverFlow.Entity.Tag;
import com.virtusa.KnowlegeOverFlow.Repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagRepository tagRepository;
    @Override
    public void saveTag(Tag tag) {
        tagRepository.save(tag);
    }
}
