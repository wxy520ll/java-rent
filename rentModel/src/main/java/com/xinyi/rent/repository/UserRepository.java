package com.xinyi.rent.repository;

import com.xinyi.rent.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by wxy on 2017/9/27.
 */
@Component
public interface UserRepository extends JpaRepository<UserModel, Long> {


}
