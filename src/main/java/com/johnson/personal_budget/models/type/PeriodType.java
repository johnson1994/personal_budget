package com.johnson.personal_budget.models.type;

/**
 * 周期类型
 */
public enum PeriodType {
    WEEK(7, "周"),
    MONTH(30, "月度"),
    SEASON(90, "季度"),
    YEAR(365, "年度");
    private final int code;
    private final String display;

    private PeriodType(int code, String display) {
        this.code = code;
        this.display = display;
    }

    public int getCode() {
        return code;
    }

    public String getDisplay() {
        return display;
    }

    public static PeriodType parseFrom(Integer code) {
        if (code == null)
            return PeriodType.WEEK;
        for (PeriodType type : PeriodType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        return PeriodType.WEEK;
    }
}
