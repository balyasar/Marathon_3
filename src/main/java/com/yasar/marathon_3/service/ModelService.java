package com.yasar.marathon_3.service;

import com.yasar.marathon_3.dto.request.ModelSaveRequestDto;
import com.yasar.marathon_3.entity.Model;
import com.yasar.marathon_3.mapper.ModelMapper;
import com.yasar.marathon_3.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;

    public Model save(ModelSaveRequestDto dto) {
        return repository.save(ModelMapper.INSTANCE.fromModelSaveDto(dto));
    }

    public List<Model> getAll() {
        return repository.findAll();
    }
}
