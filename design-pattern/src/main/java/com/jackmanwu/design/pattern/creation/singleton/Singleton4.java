package com.jackmanwu.design.pattern.creation.singleton;

/**
 * 枚举实现
 * 防止反射攻击
 * 其他实现均可通过反射将私有构造函数访问级别修改未public
 */
public enum Singleton4 {
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
