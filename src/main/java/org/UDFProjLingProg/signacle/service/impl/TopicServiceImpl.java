package org.UDFProjLingProg.signacle.service.impl;

import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.Topic;
import org.UDFProjLingProg.signacle.mapper.TopicMapper;
import org.UDFProjLingProg.signacle.repository.TopicRepository;
import org.UDFProjLingProg.signacle.service.ITopicService;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
