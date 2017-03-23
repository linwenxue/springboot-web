package com.yongche.etl.entity;

public class AlarmInstance {
    protected String id;
    //alarm_server主键
    protected String serverId;
    //订阅者手机号或邮箱
    protected String subscriber;
    //告警阈值
    protected String thresholdValue;
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

    public String getServerId() {
        return serverId;
    }

	public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getSubscriber() {
        return subscriber;
    }

	public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }

    public String getThresholdValue() {
        return thresholdValue;
    }

	public void setThresholdValue(String thresholdValue) {
        this.thresholdValue = thresholdValue;
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