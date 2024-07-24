package dev.cordeiro.poinst_of_interest.repositories;

import dev.cordeiro.poinst_of_interest.entites.POIs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface POIsRespository extends JpaRepository<POIs, UUID> {
}
