package a.i.i.e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    public interface a {
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0031c[] f1775a;

        public b(C0031c[] c0031cArr) {
            this.f1775a = c0031cArr;
        }

        public C0031c[] a() {
            return this.f1775a;
        }
    }

    /* JADX INFO: renamed from: a.i.i.e.c$c, reason: collision with other inner class name */
    public static final class C0031c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1781f;

        public C0031c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.f1776a = str;
            this.f1777b = i2;
            this.f1778c = z;
            this.f1779d = str2;
            this.f1780e = i3;
            this.f1781f = i4;
        }

        public String a() {
            return this.f1776a;
        }

        public int b() {
            return this.f1781f;
        }

        public int c() {
            return this.f1780e;
        }

        public String d() {
            return this.f1779d;
        }

        public int e() {
            return this.f1777b;
        }

        public boolean f() {
            return this.f1778c;
        }
    }

    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.i.o.d f1782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f1785d;

        public d(a.i.o.d dVar, int i2, int i3, String str) {
            this.f1782a = dVar;
            this.f1784c = i2;
            this.f1783b = i3;
            this.f1785d = str;
        }

        public int a() {
            return this.f1784c;
        }

        public a.i.o.d b() {
            return this.f1782a;
        }

        public String c() {
            return this.f1785d;
        }

        public int d() {
            return this.f1783b;
        }
    }

    public static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.i.g.f1657e);
        String string = typedArrayObtainAttributes.getString(a.i.g.f1658f);
        String string2 = typedArrayObtainAttributes.getString(a.i.g.f1662j);
        String string3 = typedArrayObtainAttributes.getString(a.i.g.f1663k);
        int resourceId = typedArrayObtainAttributes.getResourceId(a.i.g.f1659g, 0);
        int integer = typedArrayObtainAttributes.getInteger(a.i.g.f1660h, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(a.i.g.f1661i, 500);
        String string4 = typedArrayObtainAttributes.getString(a.i.g.f1664l);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new a.i.o.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0031c[]) arrayList.toArray(new C0031c[arrayList.size()]));
    }

    public static C0031c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.i.g.f1665m);
        int i2 = a.i.g.v;
        if (!typedArrayObtainAttributes.hasValue(i2)) {
            i2 = a.i.g.f1667o;
        }
        int i3 = typedArrayObtainAttributes.getInt(i2, 400);
        int i4 = a.i.g.t;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = a.i.g.p;
        }
        boolean z = 1 == typedArrayObtainAttributes.getInt(i4, 0);
        int i5 = a.i.g.w;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = a.i.g.q;
        }
        int i6 = a.i.g.u;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = a.i.g.r;
        }
        String string = typedArrayObtainAttributes.getString(i6);
        int i7 = typedArrayObtainAttributes.getInt(i5, 0);
        int i8 = a.i.g.s;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = a.i.g.f1666n;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i8, 0);
        String string2 = typedArrayObtainAttributes.getString(i8);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0031c(string2, i3, z, string, i7, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
