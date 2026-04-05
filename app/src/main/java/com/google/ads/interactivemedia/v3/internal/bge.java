package com.google.ads.interactivemedia.v3.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class bge implements bgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f21063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f21064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bhb f21065c;

    public bge(Class cls, Type type) {
        bhb bhaVar;
        this.f21063a = cls;
        this.f21064b = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            bhaVar = new bgx(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    bhaVar = new bgy(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    bhaVar = new bha();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                bhaVar = new bgz(declaredMethod3);
            }
        }
        this.f21065c = bhaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bgw
    public final Object a() {
        try {
            return this.f21065c.a(this.f21063a);
        } catch (Exception e2) {
            String strValueOf = String.valueOf(this.f21064b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 119);
            sb.append("Unable to invoke no-args constructor for ");
            sb.append(strValueOf);
            sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}
