package c.f.a.d.v;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TypeEvaluator<e> f15246a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f15247b = new e();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f15247b.a(c.f.a.d.e0.a.c(eVar.f15250a, eVar2.f15250a, f2), c.f.a.d.e0.a.c(eVar.f15251b, eVar2.f15251b, f2), c.f.a.d.e0.a.c(eVar.f15252c, eVar2.f15252c, f2));
            return this.f15247b;
        }
    }

    public static class c extends Property<d, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f15248a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: c.f.a.d.v.d$d, reason: collision with other inner class name */
    public static class C0179d extends Property<d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f15249a = new C0179d("circularRevealScrimColor");

        public C0179d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f15250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15252c;

        public e() {
        }

        public e(float f2, float f3, float f4) {
            this.f15250a = f2;
            this.f15251b = f3;
            this.f15252c = f4;
        }

        public void a(float f2, float f3, float f4) {
            this.f15250a = f2;
            this.f15251b = f3;
            this.f15252c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
