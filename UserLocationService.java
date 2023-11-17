// UserLocationService.java
package com.example.demo.service;

import com.example.demo.model.UserLocation;

public interface UserLocationService {
    Iterable<UserLocation> getAllUsers();
    UserLocation createUser(UserLocation userLocation);
    UserLocation updateUser(UserLocation userLocation);
    Iterable<UserLocation> getNearestUsers(int n);
}
