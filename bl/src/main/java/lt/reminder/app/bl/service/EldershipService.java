package lt.reminder.app.bl.service;

import lt.reminder.app.bl.repo.EldershipRepository;
import lt.reminder.app.model.domain.EldershipMapper;
import lt.reminder.app.model.dto.EldershipDto;
import lt.reminder.app.model.dto.EldershipNameDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EldershipService {

    private final EldershipRepository eldershipRepository;

    public EldershipService(EldershipRepository eldershipRepository) {
        this.eldershipRepository = eldershipRepository;
    }

    public List<EldershipDto> getElderships() {
        return eldershipRepository.findAll().stream()
                .map(EldershipMapper::fromEldership)
                .toList();
    }

    public List<EldershipNameDto> getEldershipNames() {
        return eldershipRepository.findAll().stream().map(EldershipMapper::fromEldershipToEldershipNameDto).toList();
    }

    public EldershipDto getEldershipById(Long id) {
        return eldershipRepository.findById(id)
                .map(EldershipMapper::fromEldership)
                .orElseThrow(() -> new IllegalArgumentException("Not found by id:" + id));
    }
}
