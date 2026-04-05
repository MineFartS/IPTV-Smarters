package c.f.a.b.e3.e1.p;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import c.f.a.b.e3.e1.p.k;
import c.f.a.b.i3.i0;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.w0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.y0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.w1;
import c.f.a.b.x2.w;
import c.f.b.b.b0;
import c.f.b.b.t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.simpleframework.xml.strategy.Name;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public class d extends DefaultHandler implements i0.a<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7169b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7170c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f7171d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f7172e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final XmlPullParserFactory f7173f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1 f7174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t<b> f7175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f7176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<w.b> f7178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<e> f7179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f7180g;

        public a(k1 k1Var, List<b> list, k kVar, String str, ArrayList<w.b> arrayList, ArrayList<e> arrayList2, long j2) {
            this.f7174a = k1Var;
            this.f7175b = t.D(list);
            this.f7176c = kVar;
            this.f7177d = str;
            this.f7178e = arrayList;
            this.f7179f = arrayList2;
            this.f7180g = j2;
        }
    }

    public d() {
        try {
            this.f7173f = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static int B(List<e> list) {
        String str;
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = list.get(i2);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f7181a) && (str = eVar.f7182b) != null) {
                Matcher matcher = f7170c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                z.i("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f7182b);
            }
        }
        return -1;
    }

    public static int C(List<e> list) {
        String str;
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = list.get(i2);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f7181a) && (str = eVar.f7182b) != null) {
                Matcher matcher = f7171d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                z.i("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f7182b);
            }
        }
        return -1;
    }

    public static long F(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : x0.I0(attributeValue);
    }

    public static e G(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", BuildConfig.FLAVOR);
        String strM02 = m0(xmlPullParser, "value", null);
        String strM03 = m0(xmlPullParser, Name.MARK, null);
        do {
            xmlPullParser.next();
        } while (!y0.d(xmlPullParser, str));
        return new e(strM0, strM02, strM03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int H(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r4 = r4.getAttributeValue(r0, r1)
            r0 = -1
            if (r4 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r4 = c.f.b.a.b.e(r4)
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 1596796: goto L3e;
                case 2937391: goto L33;
                case 3094035: goto L28;
                case 3133436: goto L1d;
                default: goto L1b;
            }
        L1b:
            r4 = -1
            goto L48
        L1d:
            java.lang.String r1 = "fa01"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L26
            goto L1b
        L26:
            r4 = 3
            goto L48
        L28:
            java.lang.String r1 = "f801"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L31
            goto L1b
        L31:
            r4 = 2
            goto L48
        L33:
            java.lang.String r1 = "a000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3c
            goto L1b
        L3c:
            r4 = 1
            goto L48
        L3e:
            java.lang.String r1 = "4000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L47
            goto L1b
        L47:
            r4 = 0
        L48:
            switch(r4) {
                case 0: goto L52;
                case 1: goto L51;
                case 2: goto L4f;
                case 3: goto L4c;
                default: goto L4b;
            }
        L4b:
            return r0
        L4c:
            r4 = 8
            return r4
        L4f:
            r4 = 6
            return r4
        L51:
            return r2
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.e1.p.d.H(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long I(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : x0.J0(attributeValue);
    }

    public static String J(List<e> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = list.get(i2);
            String str = eVar.f7181a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f7182b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f7182b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float N(XmlPullParser xmlPullParser, String str, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f2 : Float.parseFloat(attributeValue);
    }

    public static float O(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f2;
        }
        Matcher matcher = f7169b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f2;
        }
        int i2 = Integer.parseInt(matcher.group(1));
        float f3 = i2;
        return !TextUtils.isEmpty(matcher.group(2)) ? f3 / Integer.parseInt(r2) : f3;
    }

    public static int Q(XmlPullParser xmlPullParser, String str, int i2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i2 : Integer.parseInt(attributeValue);
    }

    public static long S(List<e> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = list.get(i2);
            if (c.f.b.a.b.a("http://dashif.org/guidelines/last-segment-number", eVar.f7181a)) {
                return Long.parseLong(eVar.f7182b);
            }
        }
        return -1L;
    }

    public static long T(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : Long.parseLong(attributeValue);
    }

    public static int V(XmlPullParser xmlPullParser) {
        int iQ = Q(xmlPullParser, "value", -1);
        if (iQ < 0) {
            return -1;
        }
        int[] iArr = f7172e;
        if (iQ < iArr.length) {
            return iArr[iQ];
        }
        return -1;
    }

    public static String m0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String n0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = BuildConfig.FLAVOR;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                u(xmlPullParser);
            }
        } while (!y0.d(xmlPullParser, str));
        return text;
    }

    public static int p(int i2, int i3) {
        if (i2 == -1) {
            return i3;
        }
        if (i3 == -1) {
            return i2;
        }
        c.f.a.b.j3.g.g(i2 == i3);
        return i2;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        c.f.a.b.j3.g.g(str.equals(str2));
        return str;
    }

    public static void r(ArrayList<w.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w.b bVar = arrayList.get(size);
            if (!bVar.d()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i2).b(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    public static long s(long j2, long j3) {
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        if (j2 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j2;
    }

    public static String t(String str, String str2) {
        if (d0.p(str)) {
            return d0.c(str2);
        }
        if (d0.s(str)) {
            return d0.o(str2);
        }
        if (d0.r(str)) {
            return "application/x-rawcc".equals(str) ? d0.j(str2) : str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strG = d0.g(str2);
        return "text/vtt".equals(strG) ? "application/x-mp4-vtt" : strG;
    }

    public static void u(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (y0.e(xmlPullParser)) {
            int i2 = 1;
            while (i2 != 0) {
                xmlPullParser.next();
                if (y0.e(xmlPullParser)) {
                    i2++;
                } else if (y0.c(xmlPullParser)) {
                    i2--;
                }
            }
        }
    }

    public List<b> A(XmlPullParser xmlPullParser, List<b> list) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 1;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i3 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strN0 = n0(xmlPullParser, "BaseURL");
        if (attributeValue3 == null) {
            attributeValue3 = strN0;
        }
        if (w0.b(strN0)) {
            return b0.k(new b(strN0, attributeValue3, i2, i3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            b bVar = list.get(i4);
            arrayList.add(new b(w0.d(bVar.f7152a, strN0), bVar.f7153b, bVar.f7154c, bVar.f7155d));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.String, c.f.a.b.x2.w.b> D(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.e1.p.d.D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public Pair<Long, c.f.a.b.b3.j.a> K(XmlPullParser xmlPullParser, String str, String str2, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, Name.MARK, 0L);
        long jT2 = T(xmlPullParser, "duration", -9223372036854775807L);
        long jT3 = T(xmlPullParser, "presentationTime", 0L);
        long jP0 = x0.P0(jT2, 1000L, j2);
        long jP02 = x0.P0(jT3, 1000000L, j2);
        String strM0 = m0(xmlPullParser, "messageData", null);
        byte[] bArrL = L(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jP02);
        if (strM0 != null) {
            bArrL = x0.k0(strM0);
        }
        return Pair.create(lValueOf, d(str, str2, jT, jP0, bArrL));
    }

    public byte[] L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, c.f.b.a.d.f15784c.name());
        while (true) {
            xmlPullParser.nextToken();
            if (y0.d(xmlPullParser, "Event")) {
                xmlSerializerNewSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    public f M(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", BuildConfig.FLAVOR);
        String strM02 = m0(xmlPullParser, "value", BuildConfig.FLAVOR);
        long jT = T(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "Event")) {
                arrayList.add(K(xmlPullParser, strM0, strM02, jT, byteArrayOutputStream));
            } else {
                u(xmlPullParser);
            }
        } while (!y0.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        c.f.a.b.b3.j.a[] aVarArr = new c.f.a.b.b3.j.a[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            jArr[i2] = ((Long) pair.first).longValue();
            aVarArr[i2] = (c.f.a.b.b3.j.a) pair.second;
        }
        return e(strM0, strM02, jT, jArr, aVarArr);
    }

    public i P(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, "sourceURL", "range");
    }

    public String R(XmlPullParser xmlPullParser) {
        return n0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7 A[LOOP:0: B:20:0x0082->B:76:0x01b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.a.b.e3.e1.p.c U(org.xmlpull.v1.XmlPullParser r44, c.f.a.b.e3.e1.p.b r45) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.e1.p.d.U(org.xmlpull.v1.XmlPullParser, c.f.a.b.e3.e1.p.b):c.f.a.b.e3.e1.p.c");
    }

    public Pair<g, Long> W(XmlPullParser xmlPullParser, List<b> list, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j7;
        k kVarG0;
        d dVar = this;
        Object obj2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, Name.MARK);
        long jI = I(xmlPullParser, "start", j2);
        long j8 = -9223372036854775807L;
        long j9 = j4 != -9223372036854775807L ? j4 + jI : -9223372036854775807L;
        long jI2 = I(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jZ = j3;
        long j10 = -9223372036854775807L;
        k kVarE0 = null;
        e eVarG = null;
        boolean z = false;
        while (true) {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "BaseURL")) {
                if (!z) {
                    jZ = dVar.z(xmlPullParser, jZ);
                    z = true;
                }
                arrayList6.addAll(A(xmlPullParser, list));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j7 = j8;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (y0.f(xmlPullParser, "AdaptationSet")) {
                    j6 = jZ;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(w(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, kVarE0, jI2, jZ, j10, j9, j5));
                    arrayList3 = arrayList5;
                } else {
                    j6 = jZ;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    if (y0.f(xmlPullParser, "EventStream")) {
                        arrayList7.add(M(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        arrayList3 = arrayList7;
                        if (y0.f(xmlPullParser, "SegmentBase")) {
                            kVarE0 = e0(xmlPullParser, null);
                            obj = null;
                            jZ = j6;
                            j7 = -9223372036854775807L;
                        } else {
                            if (y0.f(xmlPullParser, "SegmentList")) {
                                long jZ2 = z(xmlPullParser, -9223372036854775807L);
                                obj = null;
                                kVarG0 = f0(xmlPullParser, null, j9, jI2, j6, jZ2, j5);
                                j10 = jZ2;
                                jZ = j6;
                                j7 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (y0.f(xmlPullParser, "SegmentTemplate")) {
                                    long jZ3 = z(xmlPullParser, -9223372036854775807L);
                                    j7 = -9223372036854775807L;
                                    kVarG0 = g0(xmlPullParser, null, t.J(), j9, jI2, j6, jZ3, j5);
                                    j10 = jZ3;
                                    jZ = j6;
                                } else {
                                    j7 = -9223372036854775807L;
                                    if (y0.f(xmlPullParser, "AssetIdentifier")) {
                                        eVarG = G(xmlPullParser, "AssetIdentifier");
                                    } else {
                                        u(xmlPullParser);
                                    }
                                    jZ = j6;
                                }
                            }
                            kVarE0 = kVarG0;
                        }
                    }
                }
                obj = null;
                j7 = -9223372036854775807L;
                jZ = j6;
            }
            if (y0.d(xmlPullParser, "Period")) {
                return Pair.create(h(attributeValue, jI, arrayList2, arrayList3, eVarG), Long.valueOf(jI2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j8 = j7;
            dVar = this;
        }
    }

    public h X(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strM0 = m0(xmlPullParser, "moreInformationURL", null);
        String strM02 = m0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (y0.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (y0.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                u(xmlPullParser);
            }
            String str = strNextText3;
            if (y0.d(xmlPullParser, "ProgramInformation")) {
                return new h(strNextText, strNextText2, str, strM0, strM02);
            }
            strNextText3 = str;
        }
    }

    public i Y(XmlPullParser xmlPullParser, String str, String str2) {
        long j2;
        long j3;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j3 = (Long.parseLong(strArrSplit[1]) - j2) + 1;
            }
            return i(attributeValue, j2, j3);
        }
        j2 = 0;
        j3 = -1;
        return i(attributeValue, j2, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01e0 A[LOOP:0: B:3:0x006a->B:57:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e A[EDGE_INSN: B:58:0x018e->B:47:0x018e BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01e0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.a.b.e3.e1.p.d.a Z(org.xmlpull.v1.XmlPullParser r36, java.util.List<c.f.a.b.e3.e1.p.b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<c.f.a.b.e3.e1.p.e> r46, java.util.List<c.f.a.b.e3.e1.p.e> r47, java.util.List<c.f.a.b.e3.e1.p.e> r48, java.util.List<c.f.a.b.e3.e1.p.e> r49, c.f.a.b.e3.e1.p.k r50, long r51, long r53, long r55, long r57, long r59) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.e1.p.d.Z(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, c.f.a.b.e3.e1.p.k, long, long, long, long, long):c.f.a.b.e3.e1.p.d$a");
    }

    public int a0(List<e> list) {
        int iO0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            e eVar = list.get(i3);
            if (c.f.b.a.b.a("urn:mpeg:dash:role:2011", eVar.f7181a)) {
                iO0 = b0(eVar.f7182b);
            } else if (c.f.b.a.b.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f7181a)) {
                iO0 = o0(eVar.f7182b);
            }
            i2 |= iO0;
        }
        return i2;
    }

    public final long b(List<k.d> list, long j2, long j3, int i2, long j4) {
        int iL = i2 >= 0 ? i2 + 1 : (int) x0.l(j4 - j2, j3);
        for (int i3 = 0; i3 < iL; i3++) {
            list.add(m(j2, j3));
            j2 += j3;
        }
        return j2;
    }

    public int b0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public c.f.a.b.e3.e1.p.a c(int i2, int i3, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new c.f.a.b.e3.e1.p.a(i2, i3, list, list2, list3, list4);
    }

    public int c0(List<e> list) {
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (c.f.b.a.b.a("http://dashif.org/guidelines/trickmode", list.get(i3).f7181a)) {
                i2 |= 16384;
            }
        }
        return i2;
    }

    public c.f.a.b.b3.j.a d(String str, String str2, long j2, long j3, byte[] bArr) {
        return new c.f.a.b.b3.j.a(str, str2, j3, j2, bArr);
    }

    public int d0(List<e> list) {
        int iB0 = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = list.get(i2);
            if (c.f.b.a.b.a("urn:mpeg:dash:role:2011", eVar.f7181a)) {
                iB0 |= b0(eVar.f7182b);
            }
        }
        return iB0;
    }

    public f e(String str, String str2, long j2, long[] jArr, c.f.a.b.b3.j.a[] aVarArr) {
        return new f(str, str2, j2, jArr, aVarArr);
    }

    public k.e e0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long j2;
        long j3;
        long jT = T(xmlPullParser, "timescale", eVar != null ? eVar.f7216b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f7217c : 0L);
        long j4 = eVar != null ? eVar.f7230d : 0L;
        long j5 = eVar != null ? eVar.f7231e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j6 = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j6) + 1;
            j3 = j6;
        } else {
            j2 = j5;
            j3 = j4;
        }
        i iVarP = eVar != null ? eVar.f7215a : null;
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "Initialization")) {
                iVarP = P(xmlPullParser);
            } else {
                u(xmlPullParser);
            }
        } while (!y0.d(xmlPullParser, "SegmentBase"));
        return n(iVarP, jT, jT2, j3, j2);
    }

    public k1 f(String str, String str2, int i2, int i3, float f2, int i4, int i5, int i6, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str4;
        String strT = t(str2, str5);
        if ("audio/eac3".equals(strT)) {
            strT = J(list4);
            if ("audio/eac3-joc".equals(strT)) {
                str5 = "ec+3";
            }
        }
        int iK0 = k0(list);
        k1.b bVarV = new k1.b().S(str).K(str2).e0(strT).I(str5).Z(i6).g0(iK0).c0(d0(list) | a0(list2) | c0(list3) | c0(list4)).V(str3);
        if (d0.s(strT)) {
            bVarV.j0(i2).Q(i3).P(f2);
        } else if (d0.p(strT)) {
            bVarV.H(i4).f0(i5);
        } else if (d0.r(strT)) {
            int iC = -1;
            if ("application/cea-608".equals(strT)) {
                iC = B(list2);
            } else if ("application/cea-708".equals(strT)) {
                iC = C(list2);
            }
            bVarV.F(iC);
        }
        return bVarV.E();
    }

    public k.b f0(XmlPullParser xmlPullParser, k.b bVar, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "timescale", bVar != null ? bVar.f7216b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f7217c : 0L);
        long jT3 = T(xmlPullParser, "duration", bVar != null ? bVar.f7219e : -9223372036854775807L);
        long jT4 = T(xmlPullParser, "startNumber", bVar != null ? bVar.f7218d : 1L);
        long jS = s(j4, j5);
        List<k.d> listH0 = null;
        List<i> arrayList = null;
        i iVarP = null;
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "Initialization")) {
                iVarP = P(xmlPullParser);
            } else if (y0.f(xmlPullParser, "SegmentTimeline")) {
                listH0 = h0(xmlPullParser, jT, j3);
            } else if (y0.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(i0(xmlPullParser));
            } else {
                u(xmlPullParser);
            }
        } while (!y0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVarP == null) {
                iVarP = bVar.f7215a;
            }
            if (listH0 == null) {
                listH0 = bVar.f7220f;
            }
            if (arrayList == null) {
                arrayList = bVar.f7224j;
            }
        }
        return k(iVarP, jT, jT2, jT4, jT3, listH0, jS, arrayList, j6, j2);
    }

    public c g(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j2, j3, j4, z, j5, j6, j7, j8, hVar, oVar, lVar, uri, list);
    }

    public k.c g0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "timescale", cVar != null ? cVar.f7216b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f7217c : 0L);
        long jT3 = T(xmlPullParser, "duration", cVar != null ? cVar.f7219e : -9223372036854775807L);
        long jT4 = T(xmlPullParser, "startNumber", cVar != null ? cVar.f7218d : 1L);
        long jS = S(list);
        long jS2 = s(j4, j5);
        List<k.d> listH0 = null;
        n nVarP0 = p0(xmlPullParser, "media", cVar != null ? cVar.f7226k : null);
        n nVarP02 = p0(xmlPullParser, "initialization", cVar != null ? cVar.f7225j : null);
        i iVarP = null;
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "Initialization")) {
                iVarP = P(xmlPullParser);
            } else if (y0.f(xmlPullParser, "SegmentTimeline")) {
                listH0 = h0(xmlPullParser, jT, j3);
            } else {
                u(xmlPullParser);
            }
        } while (!y0.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVarP == null) {
                iVarP = cVar.f7215a;
            }
            if (listH0 == null) {
                listH0 = cVar.f7220f;
            }
        }
        return l(iVarP, jT, jT2, jT4, jS, jT3, listH0, jS2, nVarP02, nVarP0, j6, j2);
    }

    public g h(String str, long j2, List<c.f.a.b.e3.e1.p.a> list, List<f> list2, e eVar) {
        return new g(str, j2, list, list2, eVar);
    }

    public List<k.d> h0(XmlPullParser xmlPullParser, long j2, long j3) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long jT = -9223372036854775807L;
        boolean z = false;
        int iQ = 0;
        do {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "S")) {
                long jT2 = T(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jB = b(arrayList, jB, jT, iQ, jT2);
                }
                if (jT2 == -9223372036854775807L) {
                    jT2 = jB;
                }
                jT = T(xmlPullParser, "d", -9223372036854775807L);
                iQ = Q(xmlPullParser, "r", 0);
                jB = jT2;
                z = true;
            } else {
                u(xmlPullParser);
            }
        } while (!y0.d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            b(arrayList, jB, jT, iQ, x0.P0(j3, j2, 1000L));
        }
        return arrayList;
    }

    public i i(String str, long j2, long j3) {
        return new i(str, j2, j3);
    }

    public i i0(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, "media", "mediaRange");
    }

    public j j(a aVar, String str, String str2, ArrayList<w.b> arrayList, ArrayList<e> arrayList2) {
        k1.b bVarB = aVar.f7174a.b();
        if (str != null) {
            bVarB.U(str);
        }
        String str3 = aVar.f7177d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<w.b> arrayList3 = aVar.f7178e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            bVarB.L(new w(str2, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f7179f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f7180g, bVarB.E(), aVar.f7175b, aVar.f7176c, arrayList4);
    }

    public int j0(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("forced_subtitle")) {
            return 2;
        }
        return !str.equals("main") ? 0 : 1;
    }

    public k.b k(i iVar, long j2, long j3, long j4, long j5, List<k.d> list, long j6, List<i> list2, long j7, long j8) {
        return new k.b(iVar, j2, j3, j4, j5, list, j6, list2, c.f.a.b.w0.d(j7), c.f.a.b.w0.d(j8));
    }

    public int k0(List<e> list) {
        int iJ0 = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = list.get(i2);
            if (c.f.b.a.b.a("urn:mpeg:dash:role:2011", eVar.f7181a)) {
                iJ0 |= j0(eVar.f7182b);
            }
        }
        return iJ0;
    }

    public k.c l(i iVar, long j2, long j3, long j4, long j5, long j6, List<k.d> list, long j7, n nVar, n nVar2, long j8, long j9) {
        return new k.c(iVar, j2, j3, j4, j5, j6, list, j7, nVar, nVar2, c.f.a.b.w0.d(j8), c.f.a.b.w0.d(j9));
    }

    public l l0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jT = -9223372036854775807L;
        long jT2 = -9223372036854775807L;
        long jT3 = -9223372036854775807L;
        float fN = -3.4028235E38f;
        float fN2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (y0.f(xmlPullParser, "Latency")) {
                jT = T(xmlPullParser, "target", -9223372036854775807L);
                jT2 = T(xmlPullParser, "min", -9223372036854775807L);
                jT3 = T(xmlPullParser, "max", -9223372036854775807L);
            } else if (y0.f(xmlPullParser, "PlaybackRate")) {
                fN = N(xmlPullParser, "min", -3.4028235E38f);
                fN2 = N(xmlPullParser, "max", -3.4028235E38f);
            }
            long j2 = jT;
            long j3 = jT2;
            long j4 = jT3;
            float f2 = fN;
            float f3 = fN2;
            if (y0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j2, j3, j4, f2, f3);
            }
            jT = j2;
            jT2 = j3;
            jT3 = j4;
            fN = f2;
            fN2 = f3;
        }
    }

    public k.d m(long j2, long j3) {
        return new k.d(j2, j3);
    }

    public k.e n(i iVar, long j2, long j3, long j4, long j5) {
        return new k.e(iVar, j2, j3, j4, j5);
    }

    public o o(String str, String str2) {
        return new o(str, str2);
    }

    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public n p0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    public o q0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // c.f.a.b.i3.i0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) throws w1 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f7173f.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return U(xmlPullParserNewPullParser, new b(uri.toString()));
            }
            throw w1.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw w1.c(null, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0317 A[LOOP:0: B:3:0x007c->B:74:0x0317, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d8 A[EDGE_INSN: B:75:0x02d8->B:68:0x02d8 BREAK  A[LOOP:0: B:3:0x007c->B:74:0x0317], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.a.b.e3.e1.p.a w(org.xmlpull.v1.XmlPullParser r54, java.util.List<c.f.a.b.e3.e1.p.b> r55, c.f.a.b.e3.e1.p.k r56, long r57, long r59, long r61, long r63, long r65) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.e1.p.d.w(org.xmlpull.v1.XmlPullParser, java.util.List, c.f.a.b.e3.e1.p.k, long, long, long, long, long):c.f.a.b.e3.e1.p.a");
    }

    public void x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        u(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int y(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = m0(r4, r0, r1)
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1352850286: goto L35;
                case -1138141449: goto L2a;
                case -986633423: goto L1f;
                case 2036691300: goto L14;
                default: goto L12;
            }
        L12:
            r0 = -1
            goto L3f
        L14:
            java.lang.String r1 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L12
        L1d:
            r0 = 3
            goto L3f
        L1f:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto L12
        L28:
            r0 = 2
            goto L3f
        L2a:
            java.lang.String r1 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            goto L12
        L33:
            r0 = 1
            goto L3f
        L35:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            r0 = 0
        L3f:
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L48;
                case 2: goto L43;
                case 3: goto L48;
                default: goto L42;
            }
        L42:
            goto L53
        L43:
            int r2 = V(r4)
            goto L53
        L48:
            int r2 = H(r4)
            goto L53
        L4d:
            java.lang.String r0 = "value"
            int r2 = Q(r4, r0, r2)
        L53:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = c.f.a.b.j3.y0.d(r4, r0)
            if (r0 == 0) goto L53
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.e1.p.d.y(org.xmlpull.v1.XmlPullParser):int");
    }

    public long z(XmlPullParser xmlPullParser, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j2;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }
}
