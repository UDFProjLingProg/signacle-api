package org.UDFProjLingProg.signacle.service.impl;

import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.Topic;
import org.UDFProjLingProg.signacle.mapper.TopicMapper;
import org.UDFProjLingProg.signacle.repository.TopicRepository;
import org.UDFProjLingProg.signacle.service.ITopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public class TopicServiceImpl extends GenericServiceImpl<Topic, TopicDto> implements ITopicService{
	
	private final TopicRepository repository;
	private final TopicMapper mapper;
	
	public TopicServiceImpl(TopicRepository repository, TopicMapper mapper) {
		
		super(repository, mapper);
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Override
	public List<TopicDto> findAll() {
        return this.mapper.toDto(this.repository.findAll());

        
	}
	
	
	public TopicDto findById(UUID id)
    {
        return this.mapper.toDto
                (this.repository.findById(id).orElseThrow(
                        () -> new RuntimeException("Topic not found")
                ));
    }


    public TopicDto findByWord(String word) {
        return this.mapper.toDto
                (this.repository.findByWord(word).orElseThrow(
                        () -> new RuntimeException("Topic not found")
                ));
    }
}
