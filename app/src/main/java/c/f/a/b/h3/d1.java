package c.f.a.b.h3;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import c.f.a.b.f3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 {
    public static /* synthetic */ boolean a(Object obj) {
        return !(obj instanceof c.f.a.b.f3.q.b);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void c(c.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) c.f.a.b.j3.g.e(bVar.e()), new c.f.b.a.l() { // from class: c.f.a.b.h3.b0
                @Override // c.f.b.a.l
                public final boolean apply(Object obj) {
                    return d1.a(obj);
                }
            });
        }
        d(bVar);
    }

    public static void d(c.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) c.f.a.b.j3.g.e(bVar.e()), new c.f.b.a.l() { // from class: c.f.a.b.h3.c0
                @Override // c.f.b.a.l
                public final boolean apply(Object obj) {
                    return d1.b(obj);
                }
            });
        }
    }

    public static void e(Spannable spannable, c.f.b.a.l<Object> lVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (lVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i2, float f2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = i4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i3;
        }
        return f2 * f3;
    }
}
