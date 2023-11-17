// UserLocationRepository.java
package com.example.demo.repository;

import com.example.demo.model.UserLocation;
import org.springframework.data.repository.CrudRepository;

public interface UserLocationRepository extends CrudRepository<UserLocation, Long> {
}
