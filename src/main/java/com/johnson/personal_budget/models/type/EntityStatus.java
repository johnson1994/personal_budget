package com.johnson.personal_budget.models.type;


/**
 * 实体状态
 */
public enum EntityStatus {
    ON(1, "启用"),          // 启用
    OFF(0, "停用"),         // 停用
    DELETED(-1, "删除")     // 删除
    ;
    private final int code;
    private final String display;

    private EntityStatus(int code, String display) {
        this.code = code;
        this.display = display;
    }

    /**
     * 获得本枚举的code
     *
     * @return code值
     */
    public int getCode() {
        return code;
    }

    /**
     * 获得枚举的display展示值
     *
     * @return 展示值
     */
    public String getDisplay() {
        return display;
    }

    /**
     * 从code值反推枚举
     * (如果对应不上， 直接返回DELETED枚举)
     *
     * @param code code值
     * @return 枚举值
     */
    public static EntityStatus parseFrom(Integer code) {
        if (code == null)
            return EntityStatus.DELETED;
        for (EntityStatus s : EntityStatus.values()) {
            if (s.getCode() == code) {
                return s;
            }
        }
        return EntityStatus.DELETED;
    }
}
