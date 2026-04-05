package androidx.leanback.widget.picker;

import a.n.l;
import a.n.q.f1.b;
import a.n.q.f1.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.ads.AdError;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class DatePicker extends a.n.q.f1.a {
    public static final int[] u = {5, 2, 1};
    public int A;
    public int B;
    public final DateFormat C;
    public c.a D;
    public Calendar E;
    public Calendar F;
    public Calendar G;
    public Calendar H;
    public String v;
    public b w;
    public b x;
    public b y;
    public int z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f4611b;

        public a(boolean z) {
            this.f4611b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DatePicker.this.u(this.f4611b);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.C = new SimpleDateFormat("MM/dd/yyyy");
        q();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.K);
        String string = typedArrayObtainStyledAttributes.getString(l.L);
        String string2 = typedArrayObtainStyledAttributes.getString(l.M);
        this.H.clear();
        if (TextUtils.isEmpty(string) || !o(string, this.H)) {
            this.H.set(1900, 0, 1);
        }
        this.E.setTimeInMillis(this.H.getTimeInMillis());
        this.H.clear();
        if (TextUtils.isEmpty(string2) || !o(string2, this.H)) {
            this.H.set(AdError.BROKEN_MEDIA_ERROR_CODE, 0, 1);
        }
        this.F.setTimeInMillis(this.H.getTimeInMillis());
        String string3 = typedArrayObtainStyledAttributes.getString(l.N);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3);
    }

    public static boolean n(char c2, char[] cArr) {
        for (char c3 : cArr) {
            if (c2 == c3) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(b bVar, int i2) {
        if (i2 == bVar.d()) {
            return false;
        }
        bVar.h(i2);
        return true;
    }

    public static boolean s(b bVar, int i2) {
        if (i2 == bVar.e()) {
            return false;
        }
        bVar.i(i2);
        return true;
    }

    @Override // a.n.q.f1.a
    public final void c(int i2, int i3) {
        this.H.setTimeInMillis(this.G.getTimeInMillis());
        int iB = a(i2).b();
        if (i2 == this.A) {
            this.H.add(5, i3 - iB);
        } else if (i2 == this.z) {
            this.H.add(2, i3 - iB);
        } else {
            if (i2 != this.B) {
                throw new IllegalArgumentException();
            }
            this.H.add(1, i3 - iB);
        }
        p(this.H.get(1), this.H.get(2), this.H.get(5));
        t(false);
    }

    public long getDate() {
        return this.G.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.v;
    }

    public long getMaxDate() {
        return this.F.getTimeInMillis();
    }

    public long getMinDate() {
        return this.E.getTimeInMillis();
    }

    public List<CharSequence> l() {
        String strM = m(this.v);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        boolean z = false;
        char c2 = 0;
        for (int i2 = 0; i2 < strM.length(); i2++) {
            char cCharAt = strM.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (z || !n(cCharAt, cArr)) {
                        sb.append(cCharAt);
                    } else if (cCharAt != c2) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                    c2 = cCharAt;
                } else if (z) {
                    z = false;
                } else {
                    sb.setLength(0);
                    z = true;
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public String m(String str) {
        String localizedPattern;
        if (c.f2806a) {
            localizedPattern = android.text.format.DateFormat.getBestDateTimePattern(this.D.f2807a, str);
        } else {
            DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());
            localizedPattern = dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toLocalizedPattern() : "MM/dd/yyyy";
        }
        return TextUtils.isEmpty(localizedPattern) ? "MM/dd/yyyy" : localizedPattern;
    }

    public final boolean o(String str, Calendar calendar) {
        try {
            calendar.setTime(this.C.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    public final void p(int i2, int i3, int i4) {
        Calendar calendar;
        Calendar calendar2;
        this.G.set(i2, i3, i4);
        if (this.G.before(this.E)) {
            calendar = this.G;
            calendar2 = this.E;
        } else {
            if (!this.G.after(this.F)) {
                return;
            }
            calendar = this.G;
            calendar2 = this.F;
        }
        calendar.setTimeInMillis(calendar2.getTimeInMillis());
    }

    public final void q() {
        c.a aVarC = c.c(Locale.getDefault(), getContext().getResources());
        this.D = aVarC;
        this.H = c.b(this.H, aVarC.f2807a);
        this.E = c.b(this.E, this.D.f2807a);
        this.F = c.b(this.F, this.D.f2807a);
        this.G = c.b(this.G, this.D.f2807a);
        b bVar = this.w;
        if (bVar != null) {
            bVar.j(this.D.f2808b);
            d(this.z, this.w);
        }
    }

    public void setDatePickerFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (TextUtils.equals(this.v, str)) {
            return;
        }
        this.v = str;
        List<CharSequence> listL = l();
        if (listL.size() != str.length() + 1) {
            throw new IllegalStateException("Separators size: " + listL.size() + " must equal the size of datePickerFormat: " + str.length() + " + 1");
        }
        setSeparators(listL);
        this.x = null;
        this.w = null;
        this.y = null;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        String upperCase = str.toUpperCase();
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < upperCase.length(); i2++) {
            char cCharAt = upperCase.charAt(i2);
            if (cCharAt == 'D') {
                if (this.x != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                b bVar = new b();
                this.x = bVar;
                arrayList.add(bVar);
                this.x.g("%02d");
                this.A = i2;
            } else if (cCharAt != 'M') {
                if (cCharAt != 'Y') {
                    throw new IllegalArgumentException("datePicker format error");
                }
                if (this.y != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                b bVar2 = new b();
                this.y = bVar2;
                arrayList.add(bVar2);
                this.B = i2;
                this.y.g("%d");
            } else {
                if (this.w != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                b bVar3 = new b();
                this.w = bVar3;
                arrayList.add(bVar3);
                this.w.j(this.D.f2808b);
                this.z = i2;
            }
        }
        setColumns(arrayList);
        t(false);
    }

    public void setMaxDate(long j2) {
        this.H.setTimeInMillis(j2);
        if (this.H.get(1) != this.F.get(1) || this.H.get(6) == this.F.get(6)) {
            this.F.setTimeInMillis(j2);
            if (this.G.after(this.F)) {
                this.G.setTimeInMillis(this.F.getTimeInMillis());
            }
            t(false);
        }
    }

    public void setMinDate(long j2) {
        this.H.setTimeInMillis(j2);
        if (this.H.get(1) != this.E.get(1) || this.H.get(6) == this.E.get(6)) {
            this.E.setTimeInMillis(j2);
            if (this.G.before(this.E)) {
                this.G.setTimeInMillis(this.E.getTimeInMillis());
            }
            t(false);
        }
    }

    public final void t(boolean z) {
        post(new a(z));
    }

    public void u(boolean z) {
        int[] iArr = {this.A, this.z, this.B};
        boolean z2 = true;
        boolean z3 = true;
        for (int length = u.length - 1; length >= 0; length--) {
            if (iArr[length] >= 0) {
                int i2 = u[length];
                b bVarA = a(iArr[length]);
                boolean zS = s(bVarA, z2 ? this.E.get(i2) : this.G.getActualMinimum(i2)) | false | r(bVarA, z3 ? this.F.get(i2) : this.G.getActualMaximum(i2));
                z2 &= this.G.get(i2) == this.E.get(i2);
                z3 &= this.G.get(i2) == this.F.get(i2);
                if (zS) {
                    d(iArr[length], bVarA);
                }
                e(iArr[length], this.G.get(i2), z);
            }
        }
    }
}
