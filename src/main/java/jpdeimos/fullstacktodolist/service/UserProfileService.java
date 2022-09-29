package jpdeimos.fullstacktodolist.service;

import jpdeimos.fullstacktodolist.model.UserProfile;
import jpdeimos.fullstacktodolist.repository.UserProfileDataAccessService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

    public List<UserProfile> getUserProfiles() {
        return userProfileDataAccessService.getUserProfiles();
    }
}
