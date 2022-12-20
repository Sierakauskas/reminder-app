package lt.reminder.app.controller;

import lt.reminder.app.bl.service.EldershipService;
import lt.reminder.app.model.dto.EldershipDto;
import lt.reminder.app.model.dto.EldershipNameDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/elderships")
public class EldershipController {

    private final EldershipService eldershipService;

    public EldershipController(EldershipService eldershipService) {
        this.eldershipService = eldershipService;
    }

    @GetMapping
    public List<EldershipDto> getElderships() {
        return eldershipService.getElderships();
    }

    @GetMapping("/names")
    public List<EldershipNameDto> getEldershipNames() {
        return eldershipService.getEldershipNames();
    }

    @GetMapping("/{eldershipId}")
    public EldershipDto getEldershipById(@PathVariable("eldershipId") Long eldershipId) {
        return eldershipService.getEldershipById(eldershipId);
    }
}
