package com.yongche.etl.entity;

public class Kafka {
    protected String id;
    //kafka名称
    protected String name;
    //kafka连接信息
    protected String brokers;
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

    public String getName() {
        return name;
    }

	public void setName(String name) {
        this.name = name;
    }

    public String getBrokers() {
        return brokers;
    }

	public void setBrokers(String brokers) {
        this.brokers = brokers;
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