package nl.danman.su.spring.boot.starter.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StartupServiceImpl implements StartupService {

    @Override
    public void atStartUp() {
        log.info("Welcome to Service Universe!");
    }
}
