package com.yongche.etl.entity;

public class TaskConfig {
    protected String id;
    //kafka topic
    protected String kafkaTopic;
    //zookeeper信息
    protected String zkId;
    //kafka信息
    protected String kafkaId;
    //alarm_instance主键
    protected String alarmInstanceId;
    //storage_info表ID，输出表元数据
    protected String storageMetaId;
    //zk写入路径
    protected String zkPath;
    //策略类的行分隔符，针对数据为分隔符模式有效，json模式忽略
    protected String lineSeparator;
    //spark程序跑的分区数量
    protected String partitions;
    //每次读取Kafka最大消息数，单位万
    protected String fetchmessages;
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
    //描述信息
    protected String remark;
 	
    public String getId() {
        return id;
    }

	public void setId(String id) {
        this.id = id;
    }

    public String getKafkaTopic() {
        return kafkaTopic;
    }

	public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public String getZkId() {
        return zkId;
    }

	public void setZkId(String zkId) {
        this.zkId = zkId;
    }

    public String getKafkaId() {
        return kafkaId;
    }

	public void setKafkaId(String kafkaId) {
        this.kafkaId = kafkaId;
    }

    public String getAlarmInstanceId() {
        return alarmInstanceId;
    }

	public void setAlarmInstanceId(String alarmInstanceId) {
        this.alarmInstanceId = alarmInstanceId;
    }

    public String getStorageMetaId() {
        return storageMetaId;
    }

	public void setStorageMetaId(String storageMetaId) {
        this.storageMetaId = storageMetaId;
    }

    public String getZkPath() {
        return zkPath;
    }

	public void setZkPath(String zkPath) {
        this.zkPath = zkPath;
    }

    public String getLineSeparator() {
        return lineSeparator;
    }

	public void setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
    }

    public String getPartitions() {
        return partitions;
    }

	public void setPartitions(String partitions) {
        this.partitions = partitions;
    }

    public String getFetchmessages() {
        return fetchmessages;
    }

	public void setFetchmessages(String fetchmessages) {
        this.fetchmessages = fetchmessages;
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