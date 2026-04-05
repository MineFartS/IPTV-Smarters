package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayListView extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f4699b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BitmapDrawable f4700a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Rect f4702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Interpolator f4703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Rect f4705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4706g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f4709j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f4710k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f4711l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public InterfaceC0094a f4712m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f4701b = 1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f4707h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f4708i = 1.0f;

        /* JADX INFO: renamed from: androidx.mediarouter.app.OverlayListView$a$a, reason: collision with other inner class name */
        public interface InterfaceC0094a {
            void a();
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f4700a = bitmapDrawable;
            this.f4705f = rect;
            Rect rect2 = new Rect(rect);
            this.f4702c = rect2;
            BitmapDrawable bitmapDrawable2 = this.f4700a;
            if (bitmapDrawable2 == null || rect2 == null) {
                return;
            }
            bitmapDrawable2.setAlpha((int) (this.f4701b * 255.0f));
            this.f4700a.setBounds(this.f4702c);
        }

        public BitmapDrawable a() {
            return this.f4700a;
        }

        public boolean b() {
            return this.f4710k;
        }

        public a c(float f2, float f3) {
            this.f4707h = f2;
            this.f4708i = f3;
            return this;
        }

        public a d(InterfaceC0094a interfaceC0094a) {
            this.f4712m = interfaceC0094a;
            return this;
        }

        public a e(long j2) {
            this.f4704e = j2;
            return this;
        }

        public a f(Interpolator interpolator) {
            this.f4703d = interpolator;
            return this;
        }

        public a g(int i2) {
            this.f4706g = i2;
            return this;
        }

        public void h(long j2) {
            this.f4709j = j2;
            this.f4710k = true;
        }

        public void i() {
            this.f4710k = true;
            this.f4711l = true;
            InterfaceC0094a interfaceC0094a = this.f4712m;
            if (interfaceC0094a != null) {
                interfaceC0094a.a();
            }
        }

        public boolean j(long j2) {
            if (this.f4711l) {
                return false;
            }
            float fMax = this.f4710k ? Math.max(0.0f, Math.min(1.0f, (j2 - this.f4709j) / this.f4704e)) : 0.0f;
            Interpolator interpolator = this.f4703d;
            float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
            int i2 = (int) (this.f4706g * interpolation);
            Rect rect = this.f4702c;
            Rect rect2 = this.f4705f;
            rect.top = rect2.top + i2;
            rect.bottom = rect2.bottom + i2;
            float f2 = this.f4707h;
            float f3 = f2 + ((this.f4708i - f2) * interpolation);
            this.f4701b = f3;
            BitmapDrawable bitmapDrawable = this.f4700a;
            if (bitmapDrawable != null && rect != null) {
                bitmapDrawable.setAlpha((int) (f3 * 255.0f));
                this.f4700a.setBounds(this.f4702c);
            }
            if (this.f4710k && fMax >= 1.0f) {
                this.f4711l = true;
                InterfaceC0094a interfaceC0094a = this.f4712m;
                if (interfaceC0094a != null) {
                    interfaceC0094a.a();
                }
            }
            return !this.f4711l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4699b = new ArrayList();
    }

    public void a(a aVar) {
        this.f4699b.add(aVar);
    }

    public void b() {
        for (a aVar : this.f4699b) {
            if (!aVar.b()) {
                aVar.h(getDrawingTime());
            }
        }
    }

    public void c() {
        Iterator<a> it = this.f4699b.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4699b.size() > 0) {
            Iterator<a> it = this.f4699b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                BitmapDrawable bitmapDrawableA = next.a();
                if (bitmapDrawableA != null) {
                    bitmapDrawableA.draw(canvas);
                }
                if (!next.j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }
}
