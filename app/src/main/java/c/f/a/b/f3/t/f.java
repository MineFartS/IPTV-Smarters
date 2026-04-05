package c.f.a.b.f3.t;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static void a(Spannable spannable, int i2, int i3, g gVar, d dVar, Map<String, g> map, int i4) {
        d dVarE;
        Object cVar;
        g gVarF;
        Object absoluteSizeSpan;
        int i5;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i2, i3, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (gVar.q()) {
            c.f.a.b.f3.q.d.a(spannable, new ForegroundColorSpan(gVar.c()), i2, i3, 33);
        }
        if (gVar.p()) {
            c.f.a.b.f3.q.d.a(spannable, new BackgroundColorSpan(gVar.b()), i2, i3, 33);
        }
        if (gVar.d() != null) {
            c.f.a.b.f3.q.d.a(spannable, new TypefaceSpan(gVar.d()), i2, i3, 33);
        }
        if (gVar.o() != null) {
            b bVar = (b) c.f.a.b.j3.g.e(gVar.o());
            int i6 = bVar.f8276f;
            if (i6 == -1) {
                i6 = (i4 == 2 || i4 == 1) ? 3 : 1;
                i5 = 1;
            } else {
                i5 = bVar.f8277g;
            }
            int i7 = bVar.f8278h;
            if (i7 == -2) {
                i7 = 1;
            }
            c.f.a.b.f3.q.d.a(spannable, new c.f.a.b.f3.q.e(i6, i5, i7), i2, i3, 33);
        }
        int iJ = gVar.j();
        if (iJ == 2) {
            d dVarD = d(dVar, map);
            if (dVarD != null && (dVarE = e(dVarD, map)) != null) {
                if (dVarE.g() != 1 || dVarE.f(0).f8288b == null) {
                    z.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) x0.i(dVarE.f(0).f8288b);
                    g gVarF2 = f(dVarE.f8292f, dVarE.l(), map);
                    int i8 = gVarF2 != null ? gVarF2.i() : -1;
                    if (i8 == -1 && (gVarF = f(dVarD.f8292f, dVarD.l(), map)) != null) {
                        i8 = gVarF.i();
                    }
                    cVar = new c.f.a.b.f3.q.c(str, i8);
                    spannable.setSpan(cVar, i2, i3, 33);
                }
            }
        } else if (iJ == 3 || iJ == 4) {
            cVar = new a();
            spannable.setSpan(cVar, i2, i3, 33);
        }
        if (gVar.n()) {
            c.f.a.b.f3.q.d.a(spannable, new c.f.a.b.f3.q.a(), i2, i3, 33);
        }
        int iF = gVar.f();
        if (iF == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) gVar.e(), true);
        } else if (iF == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.e());
        } else if (iF != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.e() / 100.0f);
        }
        c.f.a.b.f3.q.d.a(spannable, absoluteSizeSpan, i2, i3, 33);
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static d d(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g gVarF = f(dVar.f8292f, dVar.l(), map);
            if (gVarF != null && gVarF.j() == 1) {
                return dVar;
            }
            dVar = dVar.f8296j;
        }
        return null;
    }

    public static d e(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g gVarF = f(dVar2.f8292f, dVar2.l(), map);
            if (gVarF != null && gVarF.j() == 3) {
                return dVar2;
            }
            for (int iG = dVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(dVar2.f(iG));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i2 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i2 < length) {
                    gVar2.a(map.get(strArr[i2]));
                    i2++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    gVar.a(map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return gVar;
    }
}
