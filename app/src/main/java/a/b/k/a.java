package a.b.k;

import a.b.p.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a.b.k.a$a, reason: collision with other inner class name */
    public static class C0002a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f135a;

        public C0002a(int i2, int i3) {
            super(i2, i3);
            this.f135a = 0;
            this.f135a = 8388627;
        }

        public C0002a(C0002a c0002a) {
            super((ViewGroup.MarginLayoutParams) c0002a);
            this.f135a = 0;
            this.f135a = c0002a.f135a;
        }

        public C0002a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f135a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.j.t);
            this.f135a = typedArrayObtainStyledAttributes.getInt(a.b.j.u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0002a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f135a = 0;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    public void n() {
    }

    public abstract boolean o(int i2, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(int i2);

    public abstract void u(boolean z);

    public abstract void v(CharSequence charSequence);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public a.b.p.b y(b.a aVar) {
        return null;
    }
}
