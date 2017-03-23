package com.yongche.etl.entity;

public class AlarmServer {
    protected String id;
    //邮件或手机,E:邮箱，P:手机
    protected String type;
    //信息或邮箱服务器地址
    protected String server;
    //验证用户
    protected String username;
    //用户密码
    protected String password;
    //创建时间
    protected String createTime;
    //更新时间
    protected String updateTime;
    //状态,A:正常，P:删除
    protected String status;
    //创建人
    protected String creater;
    //更新人
    protected String updater;
    protected String remark;
 	
    public String getId() {
        return id;
    }

	public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

	public void setType(String type) {
        this.type = type;
    }

    public String getServer() {
        return server;
    }

	public void setServer(String server) {
        this.server = server;
    }

    public String getUsername() {
        return username;
    }

	public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

	public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

	public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

	public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

	public void setStatus(String status) {
        this.status = status;
    }

    public String getCreater() {
        return creater;
    }

	public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getUpdater() {
        return updater;
    }

	public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getRemark() {
        return remark;
    }

	public void setRemark(String remark) {
        this.remark = remark;
    }
}