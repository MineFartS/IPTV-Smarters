package com.amplifyframework.analytics;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsStringProperty implements AnalyticsPropertyBehavior<String> {
    private final String value;

    private AnalyticsStringProperty(String str) {
        this.value = str;
    }

    public static AnalyticsStringProperty from(String str) {
        str.getClass();
        return new AnalyticsStringProperty(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsStringProperty.class != obj.getClass()) {
            return false;
        }
        return d.a(getValue(), ((AnalyticsStringProperty) obj).getValue());
    }

    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsStringProperty{value='" + this.value + "'}";
    }
}
