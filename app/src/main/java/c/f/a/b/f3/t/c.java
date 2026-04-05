package c.f.a.b.f3.t;

import android.text.Layout;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.y0;
import c.f.a.b.j3.z;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends c.f.a.b.f3.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f8279o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern u = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b v = new b(30.0f, 1, 1);
    public static final a w = new a(32, 15);
    public final XmlPullParserFactory x;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8281b;

        public a(int i2, int i3) {
            this.f8280a = i2;
            this.f8281b = i3;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f8282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8284c;

        public b(float f2, int i2, int i3) {
            this.f8282a = f2;
            this.f8283b = i2;
            this.f8284c = i3;
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.f3.t.c$c, reason: collision with other inner class name */
    public static final class C0134c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8286b;

        public C0134c(int i2, int i3) {
            this.f8285a = i2;
            this.f8286b = i3;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.x = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static g B(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment D(String str) {
        String strE = c.f.b.a.b.e(str);
        strE.hashCode();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static a E(XmlPullParser xmlPullParser, a aVar) throws c.f.a.b.f3.h {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = u.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int i2 = Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(1)));
                int i3 = Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(2)));
                if (i2 != 0 && i3 != 0) {
                    return new a(i2, i3);
                }
                throw new c.f.a.b.f3.h("Invalid cell resolution " + i2 + " " + i3);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        z.i("TtmlDecoder", sb.toString());
        return aVar;
    }

    public static void F(String str, g gVar) throws c.f.a.b.f3.h {
        Matcher matcher;
        String str2;
        String[] strArrU0 = x0.U0(str, "\\s+");
        if (strArrU0.length == 1) {
            matcher = q.matcher(str);
        } else {
            if (strArrU0.length != 2) {
                throw new c.f.a.b.f3.h("Invalid number of entries for fontSize: " + strArrU0.length + InstructionFileId.DOT);
            }
            matcher = q.matcher(strArrU0[1]);
            z.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new c.f.a.b.f3.h("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) c.f.a.b.j3.g.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new c.f.a.b.f3.h("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) c.f.a.b.j3.g.e(matcher.group(1))));
    }

    public static b G(XmlPullParser xmlPullParser) throws c.f.a.b.f3.h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f2 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (x0.U0(attributeValue2, " ").length != 2) {
                throw new c.f.a.b.f3.h("frameRateMultiplier doesn't have 2 parts");
            }
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        b bVar = v;
        int i3 = bVar.f8283b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = bVar.f8284c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new b(i2 * f2, i3, i4);
    }

    public static Map<String, g> H(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0134c c0134c, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "style")) {
                String strA = y0.a(xmlPullParser, "style");
                g gVarM = M(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : N(strA)) {
                        gVarM.a(map.get(str));
                    }
                }
                String strG = gVarM.g();
                if (strG != null) {
                    map.put(strG, gVarM);
                }
            } else if (y0.f(xmlPullParser, "region")) {
                e eVarK = K(xmlPullParser, aVar, c0134c);
                if (eVarK != null) {
                    map2.put(eVarK.f8300a, eVarK);
                }
            } else if (y0.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!y0.d(xmlPullParser, "head"));
        return map;
    }

    public static void I(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "image") && (strA = y0.a(xmlPullParser, Name.MARK)) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!y0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.f3.t.d J(org.xmlpull.v1.XmlPullParser r19, c.f.a.b.f3.t.d r20, java.util.Map<java.lang.String, c.f.a.b.f3.t.e> r21, c.f.a.b.f3.t.c.b r22) throws c.f.a.b.f3.h {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.t.c.J(org.xmlpull.v1.XmlPullParser, c.f.a.b.f3.t.d, java.util.Map, c.f.a.b.f3.t.c$b):c.f.a.b.f3.t.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.f3.t.e K(org.xmlpull.v1.XmlPullParser r17, c.f.a.b.f3.t.c.a r18, c.f.a.b.f3.t.c.C0134c r19) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.t.c.K(org.xmlpull.v1.XmlPullParser, c.f.a.b.f3.t.c$a, c.f.a.b.f3.t.c$c):c.f.a.b.f3.t.e");
    }

    public static float L(String str) {
        Matcher matcher = r.matcher(str);
        if (!matcher.matches()) {
            z.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) c.f.a.b.j3.g.e(matcher.group(1)))));
        } catch (NumberFormatException e2) {
            z.j("TtmlDecoder", "Failed to parse shear: " + str, e2);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.f3.t.g M(org.xmlpull.v1.XmlPullParser r12, c.f.a.b.f3.t.g r13) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.t.c.M(org.xmlpull.v1.XmlPullParser, c.f.a.b.f3.t.g):c.f.a.b.f3.t.g");
    }

    public static String[] N(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : x0.U0(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00ff. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long O(java.lang.String r13, c.f.a.b.f3.t.c.b r14) throws c.f.a.b.f3.h {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.t.c.O(java.lang.String, c.f.a.b.f3.t.c$b):long");
    }

    public static C0134c P(XmlPullParser xmlPullParser) {
        StringBuilder sb;
        String str;
        String strA = y0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = t.matcher(strA);
        if (matcher.matches()) {
            try {
                return new C0134c(Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(1))), Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb.append(str);
        sb.append(strA);
        z.i("TtmlDecoder", sb.toString());
        return null;
    }

    @Override // c.f.a.b.f3.d
    public c.f.a.b.f3.f y(byte[] bArr, int i2, boolean z) throws c.f.a.b.f3.h {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.x.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put(BuildConfig.FLAVOR, new e(BuildConfig.FLAVOR));
            C0134c c0134cP = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarG = v;
            a aVarE = w;
            h hVar = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarG = G(xmlPullParserNewPullParser);
                            aVarE = E(xmlPullParserNewPullParser, w);
                            c0134cP = P(xmlPullParserNewPullParser);
                        }
                        C0134c c0134c = c0134cP;
                        b bVar2 = bVarG;
                        a aVar = aVarE;
                        if (C(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                H(xmlPullParserNewPullParser, map, aVar, c0134c, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    d dVarJ = J(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarJ);
                                    if (dVar != null) {
                                        dVar.a(dVarJ);
                                    }
                                } catch (c.f.a.b.f3.h e2) {
                                    z.j("TtmlDecoder", "Suppressing parser error", e2);
                                    i3++;
                                }
                            }
                            bVarG = bVar;
                        } else {
                            z.g("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            bVarG = bVar2;
                        }
                        c0134cP = c0134c;
                        aVarE = aVar;
                    } else if (eventType == 4) {
                        ((d) c.f.a.b.j3.g.e(dVar)).a(d.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((d) c.f.a.b.j3.g.e(arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new c.f.a.b.f3.h("No TTML subtitles found");
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new c.f.a.b.f3.h("Unable to decode source", e4);
        }
    }
}
