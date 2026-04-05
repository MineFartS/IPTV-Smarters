package c.f.a.b.e3.h1.f;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import c.f.a.b.e3.h1.f.a;
import c.f.a.b.i3.i0;
import c.f.a.b.j3.g;
import c.f.a.b.j3.j;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.m;
import c.f.a.b.w1;
import c.f.a.b.x2.w;
import c.f.a.b.z2.j0.l;
import c.f.a.b.z2.j0.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public class b implements i0.a<c.f.a.b.e3.h1.f.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XmlPullParserFactory f7799b;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f7802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Pair<String, Object>> f7803d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f7802c = aVar;
            this.f7800a = str;
            this.f7801b = str2;
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i2 = 0; i2 < this.f7803d.size(); i2++) {
                Pair<String, Object> pair = this.f7803d.get(i2);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f7802c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i2 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f7801b.equals(name)) {
                        n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i2 > 0) {
                            i2++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f7800a);
                            if (aVarE == null) {
                                i2 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i2 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i2 > 0) {
                    i2--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i2) throws w1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i2;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e2) {
                throw w1.c(null, e2);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j2) throws w1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j2;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e2) {
                throw w1.c(null, e2);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws w1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0129b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e2) {
                throw w1.c(null, e2);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws w1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0129b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e2) {
                throw w1.c(null, e2);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws C0129b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0129b(str);
        }

        public abstract void n(XmlPullParser xmlPullParser);

        public void o(XmlPullParser xmlPullParser) {
        }

        public final void p(String str, Object obj) {
            this.f7803d.add(Pair.create(str, obj));
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.e3.h1.f.b$b, reason: collision with other inner class name */
    public static class C0129b extends w1 {
        public C0129b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public UUID f7805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f7806g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < bArr.length; i2 += 2) {
                sb.append((char) bArr[i2]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static void t(byte[] bArr, int i2, int i3) {
            byte b2 = bArr[i2];
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public Object b() {
            UUID uuid = this.f7805f;
            return new a.C0128a(uuid, l.a(uuid, this.f7806g), q(this.f7806g));
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f7804e = false;
            }
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f7804e = true;
                this.f7805f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f7804e) {
                this.f7806g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k1 f7807e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrJ = x0.J(str);
                byte[][] bArrI = j.i(bArrJ);
                if (bArrI == null) {
                    arrayList.add(bArrJ);
                } else {
                    Collections.addAll(arrayList, bArrI);
                }
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public Object b() {
            return this.f7807e;
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void n(XmlPullParser xmlPullParser) throws w1 {
            k1.b bVar = new k1.b();
            String strR = r(m(xmlPullParser, "FourCC"));
            int iIntValue = ((Integer) c("Type")).intValue();
            if (iIntValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (iIntValue == 1) {
                if (strR == null) {
                    strR = "audio/mp4a-latm";
                }
                int iK = k(xmlPullParser, "Channels");
                int iK2 = k(xmlPullParser, "SamplingRate");
                List<byte[]> listQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listQ.isEmpty() && "audio/mp4a-latm".equals(strR)) {
                    listQ = Collections.singletonList(m.a(iK2, iK));
                }
                bVar.K("audio/mp4").H(iK).f0(iK2).T(listQ);
            } else if (iIntValue == 3) {
                int i2 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i2 = 64;
                    } else if (str.equals("DESC")) {
                        i2 = 1024;
                    }
                }
                bVar.K("application/mp4").c0(i2);
            } else {
                bVar.K("application/mp4");
            }
            this.f7807e = bVar.S(xmlPullParser.getAttributeValue(null, "Index")).U((String) c("Name")).e0(strR).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    public static class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<a.b> f7808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f7811h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f7812i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f7813j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7814k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f7815l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a.C0128a f7816m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f7814k = -1;
            this.f7816m = null;
            this.f7808e = new LinkedList();
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f7808e.add((a.b) obj);
            } else if (obj instanceof a.C0128a) {
                g.g(this.f7816m == null);
                this.f7816m = (a.C0128a) obj;
            }
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public Object b() {
            int size = this.f7808e.size();
            a.b[] bVarArr = new a.b[size];
            this.f7808e.toArray(bVarArr);
            if (this.f7816m != null) {
                a.C0128a c0128a = this.f7816m;
                w wVar = new w(new w.b(c0128a.f7781a, "video/mp4", c0128a.f7782b));
                for (int i2 = 0; i2 < size; i2++) {
                    a.b bVar = bVarArr[i2];
                    int i3 = bVar.f7784a;
                    if (i3 == 2 || i3 == 1) {
                        k1[] k1VarArr = bVar.f7793j;
                        for (int i4 = 0; i4 < k1VarArr.length; i4++) {
                            k1VarArr[i4] = k1VarArr[i4].b().L(wVar).E();
                        }
                    }
                }
            }
            return new c.f.a.b.e3.h1.f.a(this.f7809f, this.f7810g, this.f7811h, this.f7812i, this.f7813j, this.f7814k, this.f7815l, this.f7816m, bVarArr);
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f7809f = k(xmlPullParser, "MajorVersion");
            this.f7810g = k(xmlPullParser, "MinorVersion");
            this.f7811h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f7812i = l(xmlPullParser, "Duration");
            this.f7813j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f7814k = i(xmlPullParser, "LookaheadCount", -1);
            this.f7815l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f7811h));
        }
    }

    public static class f extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f7817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<k1> f7818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7819g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f7820h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f7821i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f7822j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f7823k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7824l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7825m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7826n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7827o;
        public String p;
        public ArrayList<Long> q;
        public long r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f7817e = str;
            this.f7818f = new LinkedList();
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void a(Object obj) {
            if (obj instanceof k1) {
                this.f7818f.add((k1) obj);
            }
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public Object b() {
            k1[] k1VarArr = new k1[this.f7818f.size()];
            this.f7818f.toArray(k1VarArr);
            return new a.b(this.f7817e, this.f7823k, this.f7819g, this.f7820h, this.f7821i, this.f7822j, this.f7824l, this.f7825m, this.f7826n, this.f7827o, this.p, k1VarArr, this.q, this.r);
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // c.f.a.b.e3.h1.f.b.a
        public void n(XmlPullParser xmlPullParser) throws w1 {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws w1 {
            int iS = s(xmlPullParser);
            this.f7819g = iS;
            p("Type", Integer.valueOf(iS));
            this.f7820h = this.f7819g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            p("Subtype", this.f7820h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f7822j = attributeValue;
            p("Name", attributeValue);
            this.f7823k = m(xmlPullParser, "Url");
            this.f7824l = i(xmlPullParser, "MaxWidth", -1);
            this.f7825m = i(xmlPullParser, "MaxHeight", -1);
            this.f7826n = i(xmlPullParser, "DisplayWidth", -1);
            this.f7827o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue2;
            p("Language", attributeValue2);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.f7821i = jI;
            if (jI == -1) {
                this.f7821i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList<>();
        }

        public final void r(XmlPullParser xmlPullParser) throws w1 {
            int size = this.q.size();
            long j2 = j(xmlPullParser, "t", -9223372036854775807L);
            int i2 = 1;
            if (j2 == -9223372036854775807L) {
                if (size == 0) {
                    j2 = 0;
                } else {
                    if (this.r == -1) {
                        throw w1.c("Unable to infer start time", null);
                    }
                    j2 = this.q.get(size - 1).longValue() + this.r;
                }
            }
            this.q.add(Long.valueOf(j2));
            this.r = j(xmlPullParser, "d", -9223372036854775807L);
            long j3 = j(xmlPullParser, "r", 1L);
            if (j3 > 1 && this.r == -9223372036854775807L) {
                throw w1.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j4 = i2;
                if (j4 >= j3) {
                    return;
                }
                this.q.add(Long.valueOf((this.r * j4) + j2));
                i2++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) throws w1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0129b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw w1.c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public b() {
        try {
            this.f7799b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // c.f.a.b.i3.i0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.f.a.b.e3.h1.f.a a(Uri uri, InputStream inputStream) throws w1 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f7799b.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (c.f.a.b.e3.h1.f.a) new e(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e2) {
            throw w1.c(null, e2);
        }
    }
}
