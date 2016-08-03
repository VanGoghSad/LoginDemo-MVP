package com.bzt.logindemo.bean;

import java.io.Serializable;

/**
 * Created by Lw on 2016/8/3.
 */

public class LoginUserMsgEntity implements Serializable {
    private String bizCode,bizMsg,page;
    public Data data;
    private boolean success;

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizMsg() {
        return bizMsg;
    }

    public void setBizMsg(String bizMsg) {
        this.bizMsg = bizMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Data getData() {
        return data;
    }

    public class Data implements Serializable{
        private String orgCode, orgName, userName,
                userCode,userRole,avatarsImg,loginAccount;

        public String getOrgCode() {
            return orgCode;
        }

        public void setOrgCode(String orgCode) {
            this.orgCode = orgCode;
        }

        public String getOrgName() {
            return orgName;
        }

        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }

        public String getUserRole() {
            return userRole;
        }

        public void setUserRole(String userRole) {
            this.userRole = userRole;
        }

        public String getAvatarsImg() {
            return avatarsImg;
        }

        public void setAvatarsImg(String avatarsImg) {
            this.avatarsImg = avatarsImg;
        }

        public String getLoginAccount() {
            return loginAccount;
        }

        public void setLoginAccount(String loginAccount) {
            this.loginAccount = loginAccount;
        }




    }
}
