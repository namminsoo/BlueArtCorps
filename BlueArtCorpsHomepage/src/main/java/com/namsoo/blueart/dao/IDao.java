package com.namsoo.blueart.dao;

import com.namsoo.blueart.dto.UserDto;

import java.util.ArrayList;

/**
 * Created by Namsoo on 2017. 4. 7..
 */
public interface IDao {
    //기능 함수들
    public ArrayList<UserDto> userList();
}
