package org.UDFProjLingProg.signacle.service.impl;

import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.Topic;
import org.UDFProjLingProg.signacle.mapper.TopicMapper;
import org.UDFProjLingProg.signacle.repository.TopicRepository;
import org.UDFProjLingProg.signacle.service.ITopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
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

	public TopicDto create(TopicDto dto) {
		return  this.mapper.toDto(
				this.repository.save(this.mapper.toEntity(dto))
		);
	}

	public TopicDto update(UUID id, TopicDto dto) {
		Optional<Topic> topic = this.repository.findById(id);
		if(topic.isPresent()) {
			Topic topicEntity = topic.get();

			topicEntity.setWord(dto.getWord());
			topicEntity.setDescription(dto.getDescription());
			topicEntity.setImage(dto.getImage());
			topicEntity.setVideo(dto.getVideo());
			topicEntity.setComment(dto.getComment());

			return this.mapper.toDto(
					this.repository.save(topicEntity)
			);

		}
		return null;
	}

	public void delete(UUID id) {
		this.repository.deleteById(id);
	}
}