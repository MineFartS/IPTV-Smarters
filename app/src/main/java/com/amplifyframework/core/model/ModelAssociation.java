package com.amplifyframework.core.model;

import a.i.q.d;
import com.amplifyframework.core.model.annotations.BelongsTo;

/* JADX INFO: loaded from: classes.dex */
public final class ModelAssociation {
    private final String associatedName;
    private final String associatedType;
    private final String name;
    private final String targetName;

    public static final class Builder {
        private String associatedName;
        private String associatedType;
        private String name;
        private String targetName;

        public Builder associatedName(String str) {
            this.associatedName = str;
            return this;
        }

        public Builder associatedType(String str) {
            this.associatedType = str;
            return this;
        }

        public ModelAssociation build() {
            return new ModelAssociation(this);
        }

        public Builder name(String str) {
            str.getClass();
            this.name = str;
            return this;
        }

        public Builder targetName(String str) {
            this.targetName = str;
            return this;
        }
    }

    private ModelAssociation(Builder builder) {
        String str = builder.name;
        str.getClass();
        this.name = str;
        this.targetName = builder.targetName;
        this.associatedName = builder.associatedName;
        this.associatedType = builder.associatedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelAssociation.class != obj.getClass()) {
            return false;
        }
        ModelAssociation modelAssociation = (ModelAssociation) obj;
        if (d.a(this.name, modelAssociation.name) && d.a(this.targetName, modelAssociation.targetName) && d.a(this.associatedName, modelAssociation.associatedName)) {
            return d.a(this.associatedType, modelAssociation.associatedType);
        }
        return false;
    }

    public String getAssociatedName() {
        return this.associatedName;
    }

    public String getAssociatedType() {
        return this.associatedType;
    }

    public String getName() {
        return this.name;
    }

    public String getTargetName() {
        return this.targetName;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.targetName;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.associatedName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.associatedType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean isOwner() {
        return BelongsTo.class.getSimpleName().equals(getName());
    }

    public String toString() {
        return "ModelAssociation{name='" + this.name + "', targetName='" + this.targetName + "', associatedName='" + this.associatedName + "', associatedType='" + this.associatedType + "'}";
    }
}
