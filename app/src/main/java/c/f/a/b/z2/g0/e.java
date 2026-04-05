package c.f.a.b.z2.g0;

import c.f.a.b.j3.y0;
import c.f.a.b.j3.z;
import c.f.a.b.w1;
import c.f.a.b.z2.g0.b;
import c.f.b.b.t;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f10785a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f10786b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f10787c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (w1 | NumberFormatException | XmlPullParserException unused) {
            z.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static b b(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!y0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw w1.a("Couldn't find xmp metadata", null);
        }
        long jE = -9223372036854775807L;
        t<b.a> tVarJ = t.J();
        do {
            xmlPullParserNewPullParser.next();
            if (!y0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (y0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (y0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                tVarJ = f(xmlPullParserNewPullParser, str2, str3);
            } else {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                tVarJ = c(xmlPullParserNewPullParser);
            }
        } while (!y0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (tVarJ.isEmpty()) {
            return null;
        }
        return new b(jE, tVarJ);
    }

    public static t<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f10787c) {
            String strA = y0.a(xmlPullParser, str);
            if (strA != null) {
                return t.L(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return t.J();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f10785a) {
            String strA = y0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : f10786b) {
            String strA = y0.a(xmlPullParser, str);
            if (strA != null) {
                long j2 = Long.parseLong(strA);
                if (j2 == -1) {
                    return -9223372036854775807L;
                }
                return j2;
            }
        }
        return -9223372036854775807L;
    }

    public static t<b.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        t.a aVarB = t.B();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, str3)) {
                String strA = y0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = y0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = y0.a(xmlPullParser, str2 + ":Length");
                String strA4 = y0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return t.J();
                }
                aVarB.d(new b.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!y0.d(xmlPullParser, str4));
        return aVarB.e();
    }
}
