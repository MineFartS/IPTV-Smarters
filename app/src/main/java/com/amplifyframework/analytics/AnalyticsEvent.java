package com.amplifyframework.analytics;

import a.i.q.d;
import com.amplifyframework.analytics.AnalyticsProperties;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsEvent implements AnalyticsEventBehavior {
    private final String name;
    private final AnalyticsProperties properties;

    public static final class Builder {
        private String name;
        private AnalyticsProperties.Builder propertiesBuilder;

        private Builder() {
            this.propertiesBuilder = AnalyticsProperties.builder();
        }

        public Builder addProperty(String str, Boolean bool) {
            str.getClass();
            bool.getClass();
            this.propertiesBuilder.add(str, bool);
            return this;
        }

        public Builder addProperty(String str, Double d2) {
            str.getClass();
            d2.getClass();
            this.propertiesBuilder.add(str, d2);
            return this;
        }

        public Builder addProperty(String str, Integer num) {
            str.getClass();
            num.getClass();
            this.propertiesBuilder.add(str, num);
            return this;
        }

        public Builder addProperty(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.propertiesBuilder.add(str, str2);
            return this;
        }

        public AnalyticsEvent build() {
            return new AnalyticsEvent(this.name, this.propertiesBuilder.build());
        }

        public Builder name(String str) {
            str.getClass();
            this.name = str;
            return this;
        }
    }

    private AnalyticsEvent(String str, AnalyticsProperties analyticsProperties) {
        this.name = str;
        this.properties = analyticsProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsEvent.class != obj.getClass()) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        if (d.a(getName(), analyticsEvent.getName())) {
            return d.a(getProperties(), analyticsEvent.getProperties());
        }
        return false;
    }

    @Override // com.amplifyframework.analytics.AnalyticsEventBehavior
    public String getName() {
        return this.name;
    }

    @Override // com.amplifyframework.analytics.AnalyticsEventBehavior
    public AnalyticsProperties getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (getName().hashCode() * 31) + getProperties().hashCode();
    }

    public String toString() {
        return "AnalyticsEvent{name='" + this.name + "', properties=" + this.properties + '}';
    }
}
