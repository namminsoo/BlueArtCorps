package com.namsoo.blueart.dto;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Namsoo on 2017. 4. 7..
 */
public class UserDto {

        private Integer userCode;

        private String username;

        private Boolean special;

        private Boolean gender;

        private Date birthday;

        private String email;

        private Timestamp lastUpdate;

        public Integer getUserCode() {
            return userCode;
        }

        public void setUserCode(Integer userCode) {
            this.userCode = userCode;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Boolean getSpecial() {
            return special;
        }

        public void setSpecial(Boolean special) {
            this.special = special;
        }

        public Boolean getGender() {
            return gender;
        }

        public void setGender(Boolean gender) {
            this.gender = gender;
        }

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Timestamp getLastUpdate() {
            return lastUpdate;
        }

        public void setLastUpdate(Timestamp lastUpdate) {
            this.lastUpdate = lastUpdate;
        }

        // AbUserTb 모델 복사
        public void CopyData(UserDto param)
        {
            this.userCode = param.getUserCode();
            this.username = param.getUsername();
            this.special = param.getSpecial();
            this.gender = param.getGender();
            this.birthday = param.getBirthday();
            this.email = param.getEmail();
            this.lastUpdate = param.getLastUpdate();
        }
    }
