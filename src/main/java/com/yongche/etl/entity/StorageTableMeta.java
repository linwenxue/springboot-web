package com.yongche.etl.entity;

public class StorageTableMeta {
    protected String id;
    //外键约束，对应的t_storage_meta主键
    protected String storageMetaId;
    //列名
    protected String columnName;
    //对应json字段的获取值得来源
    protected String columnSource;
    //列类型
    protected String columnType;
    //true:空，false:非空
    protected String nullable;
    //列排序值
    protected String columnIndex;
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
    //备注信息
    protected String remark;
 	
    public String getId() {
        return id;
    }

	public void setId(String id) {
        this.id = id;
    }

    public String getStorageMetaId() {
        return storageMetaId;
    }

	public void setStorageMetaId(String storageMetaId) {
        this.storageMetaId = storageMetaId;
    }

    public String getColumnName() {
        return columnName;
    }

	public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnSource() {
        return columnSource;
    }

	public void setColumnSource(String columnSource) {
        this.columnSource = columnSource;
    }

    public String getColumnType() {
        return columnType;
    }

	public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getNullable() {
        return nullable;
    }

	public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public String getColumnIndex() {
        return columnIndex;
    }

	public void setColumnIndex(String columnIndex) {
        this.columnIndex = columnIndex;
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