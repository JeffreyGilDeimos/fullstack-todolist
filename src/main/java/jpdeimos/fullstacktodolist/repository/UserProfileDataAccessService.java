package jpdeimos.fullstacktodolist.repository;


import jpdeimos.fullstacktodolist.datastore.FakeUserProfileDataStore;
import jpdeimos.fullstacktodolist.model.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStore fakeUserProfileDataStore;

    public List<UserProfile> getUserProfiles() {
        return fakeUserProfileDataStore.getUserProfiles();
    }
}
