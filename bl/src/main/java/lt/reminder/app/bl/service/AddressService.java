package lt.reminder.app.bl.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import lt.reminder.app.bl.repo.AddressRepository;
import lt.reminder.app.model.dto.AddressDto;

@Service
@CommonsLog
@Transactional
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public List<AddressDto> getAddresses() {
        return addressRepository.findAll().stream()
                .map(address -> AddressDto.builder()
                        .id(address.getId())
                        .name(address.getName())
                        .build())
                .collect(Collectors.toList());
    }
}