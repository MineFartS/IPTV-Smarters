package a.i.p;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class c implements Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1929b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Spannable f1930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f1931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PrecomputedText f1932e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f1933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f1934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f1937e;

        /* JADX INFO: renamed from: a.i.p.c$a$a, reason: collision with other inner class name */
        public static class C0038a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f1938a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f1939b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f1940c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f1941d;

            public C0038a(TextPaint textPaint) {
                this.f1938a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.f1940c = 1;
                    this.f1941d = 1;
                } else {
                    this.f1941d = 0;
                    this.f1940c = 0;
                }
                this.f1939b = i2 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public a a() {
                return new a(this.f1938a, this.f1939b, this.f1940c, this.f1941d);
            }

            public C0038a b(int i2) {
                this.f1940c = i2;
                return this;
            }

            public C0038a c(int i2) {
                this.f1941d = i2;
                return this;
            }

            public C0038a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1939b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f1933a = params.getTextPaint();
            this.f1934b = params.getTextDirection();
            this.f1935c = params.getBreakStrategy();
            this.f1936d = params.getHyphenationFrequency();
            this.f1937e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            this.f1937e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build() : null;
            this.f1933a = textPaint;
            this.f1934b = textDirectionHeuristic;
            this.f1935c = i2;
            this.f1936d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.f1935c != aVar.b() || this.f1936d != aVar.c())) || this.f1933a.getTextSize() != aVar.e().getTextSize() || this.f1933a.getTextScaleX() != aVar.e().getTextScaleX() || this.f1933a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.f1933a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f1933a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f1933a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.f1933a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.f1933a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f1933a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f1933a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f1935c;
        }

        public int c() {
            return this.f1936d;
        }

        public TextDirectionHeuristic d() {
            return this.f1934b;
        }

        public TextPaint e() {
            return this.f1933a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f1934b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return a.i.q.d.b(Float.valueOf(this.f1933a.getTextSize()), Float.valueOf(this.f1933a.getTextScaleX()), Float.valueOf(this.f1933a.getTextSkewX()), Float.valueOf(this.f1933a.getLetterSpacing()), Integer.valueOf(this.f1933a.getFlags()), this.f1933a.getTextLocales(), this.f1933a.getTypeface(), Boolean.valueOf(this.f1933a.isElegantTextHeight()), this.f1934b, Integer.valueOf(this.f1935c), Integer.valueOf(this.f1936d));
            }
            if (i2 >= 21) {
                return a.i.q.d.b(Float.valueOf(this.f1933a.getTextSize()), Float.valueOf(this.f1933a.getTextScaleX()), Float.valueOf(this.f1933a.getTextSkewX()), Float.valueOf(this.f1933a.getLetterSpacing()), Integer.valueOf(this.f1933a.getFlags()), this.f1933a.getTextLocale(), this.f1933a.getTypeface(), Boolean.valueOf(this.f1933a.isElegantTextHeight()), this.f1934b, Integer.valueOf(this.f1935c), Integer.valueOf(this.f1936d));
            }
            if (i2 < 18 && i2 < 17) {
                return a.i.q.d.b(Float.valueOf(this.f1933a.getTextSize()), Float.valueOf(this.f1933a.getTextScaleX()), Float.valueOf(this.f1933a.getTextSkewX()), Integer.valueOf(this.f1933a.getFlags()), this.f1933a.getTypeface(), this.f1934b, Integer.valueOf(this.f1935c), Integer.valueOf(this.f1936d));
            }
            return a.i.q.d.b(Float.valueOf(this.f1933a.getTextSize()), Float.valueOf(this.f1933a.getTextScaleX()), Float.valueOf(this.f1933a.getTextSkewX()), Integer.valueOf(this.f1933a.getFlags()), this.f1933a.getTextLocale(), this.f1933a.getTypeface(), this.f1934b, Integer.valueOf(this.f1935c), Integer.valueOf(this.f1936d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.i.p.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f1931d;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f1930c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f1930c.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f1930c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f1930c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f1930c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f1932e.getSpans(i2, i3, cls) : (T[]) this.f1930c.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1930c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f1930c.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1932e.removeSpan(obj);
        } else {
            this.f1930c.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1932e.setSpan(obj, i2, i3, i4);
        } else {
            this.f1930c.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f1930c.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f1930c.toString();
    }
}
