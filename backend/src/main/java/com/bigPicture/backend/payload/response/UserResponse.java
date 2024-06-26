package com.bigPicture.backend.payload.response;

import com.bigPicture.backend.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor @NoArgsConstructor
public class UserResponse {
    private Long userId;
    private String userName;
    private String userEmail;

    public static UserResponse of(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
//    {
//        "id": 1,
//            "name": "송성현",
//            "email": "kkinaro99@naver.com",
//            "provider": "kakao",
//            "providerId": "3489264273",
//            "books": [],
//        "reviews": []
//    }
}
