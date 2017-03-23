package com.yongche.etl.entity;

public class StorageMeta {
    protected String id;
    //kafkatopic
    protected String kafkaTopic;
    //输入数据表
    protected String inputTable;
    //输入数据解析策略类
    protected String inputStrategy;
    //输出hive存储表
    protected String outputTable;
    //输出hive数据解析策略类
    protected String outputStrategy;
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

    public String getKafkaTopic() {
        return kafkaTopic;
    }

	public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public String getInputTable() {
        return inputTable;
    }

	public void setInputTable(String inputTable) {
        this.inputTable = inputTable;
    }

    public String getInputStrategy() {
        return inputStrategy;
    }

	public void setInputStrategy(String inputStrategy) {
        this.inputStrategy = inputStrategy;
    }

    public String getOutputTable() {
        return outputTable;
    }

	public void setOutputTable(String outputTable) {
        this.outputTable = outputTable;
    }

    public String getOutputStrategy() {
        return outputStrategy;
    }

	public void setOutputStrategy(String outputStrategy) {
        this.outputStrategy = outputStrategy;
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