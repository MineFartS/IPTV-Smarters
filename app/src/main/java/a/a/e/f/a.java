package a.a.e.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: a.a.e.f.a$a, reason: collision with other inner class name */
    public static final class C0001a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SuppressLint({"UnknownNullness"})
        public final T f14a;

        public C0001a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f14a = t;
        }

        @SuppressLint({"UnknownNullness"})
        public T a() {
            return this.f14a;
        }
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i2);

    public C0001a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i2) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i2, Intent intent);
}
