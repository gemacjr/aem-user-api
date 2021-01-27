package com.cardinalhealth.userapi.service;


import com.cardinalhealth.userapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {



String[] userAdmin = {"cn=G-EXT-GA-PHARMACEUTICAL_DISTRIBUTION__ACUTE_CARE__ACUTE_CARE_ORDERING__ADMIN,ou=groups,ou=External,dc=cardinalhealth,dc=com",
        "cn=G-EXT-GA-PHARMACEUTICAL_DISTRIBUTION__ORDER_EXPRESS_REPORTING__ORDER_EXPRESS_REPORTING__STANDARD,ou=groups,ou=External,dc=cardinalhealth,dc=com",};

    String[] userPharma = {"cn=G-EXT-GA-PHARMACEUTICAL_DISTRIBUTION__ACUTE_CARE__ACUTE_CARE_ORDERING__USER,ou=groups,ou=External,dc=cardinalhealth,dc=com",
            "cn=G-EXT-GA-PHARMACEUTICAL_DISTRIBUTION__ORDER_EXPRESS_REPORTING__ORDER_EXPRESS_REPORTING__STANDARD,ou=groups,ou=External,dc=cardinalhealth,dc=com",};


    private List<User> userList = new ArrayList<>(Arrays.asList(




           new User("greg.hardy@cardinalhealth.com", "Greg", "Hardy", userAdmin, "auto_ws_acute"),
           new User("nancy.drewy@cardinalhealth.com", "Nancy", "Drew", userPharma, "ws_ri_acute"),
           new User("Tom.hardy@cardinalhealth.com", "Tom", "Hardy", userAdmin, "ri_retail")
    ));

    public List<User> getAllUsers(){
        return userList;
    }

    public User getUser(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).findFirst().get();
    }
}
