package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bga implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f21056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f21057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type[] f21058c;

    public bga(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            art.e(z);
        }
        this.f21056a = type == null ? null : bgc.d(type);
        this.f21057b = bgc.d(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f21058c = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            art.f(this.f21058c[i2]);
            bgc.i(this.f21058c[i2]);
            Type[] typeArr3 = this.f21058c;
            typeArr3[i2] = bgc.d(typeArr3[i2]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && bgc.j(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f21058c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f21056a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f21057b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f21058c) ^ this.f21057b.hashCode();
        Type type = this.f21056a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.f21058c.length;
        if (length == 0) {
            return bgc.b(this.f21057b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(bgc.b(this.f21057b));
        sb.append("<");
        sb.append(bgc.b(this.f21058c[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(", ");
            sb.append(bgc.b(this.f21058c[i2]));
        }
        sb.append(">");
        return sb.toString();
    }
}
