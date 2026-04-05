package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.io.IOException;
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

/* JADX INFO: loaded from: classes.dex */
public final class aet extends DefaultHandler implements akl<aer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19435a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f19436b = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f19437c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f19438d = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final XmlPullParserFactory f19439e;

    public aet() {
        try {
            this.f19439e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static int A(int i2, int i3) {
        if (i2 == -1) {
            return i3;
        }
        if (i3 == -1) {
            return i2;
        }
        ajr.f(i2 == i3);
        return i2;
    }

    private static long B(long j2, long j3) {
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        if (j2 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j2;
    }

    private static final long C(List<aff> list, long j2, long j3, int i2, long j4) {
        int iJ = i2 >= 0 ? i2 + 1 : (int) amn.j(j4 - j2, j3);
        for (int i3 = 0; i3 < iJ; i3++) {
            list.add(new aff(j2, j3));
            j2 += j3;
        }
        return j2;
    }

    public static float b(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f2;
        }
        Matcher matcher = f19435a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f2;
        }
        int i2 = Integer.parseInt(matcher.group(1));
        float f3 = i2;
        return !TextUtils.isEmpty(matcher.group(2)) ? f3 / Integer.parseInt(r2) : f3;
    }

    public static int c(XmlPullParser xmlPullParser, String str, int i2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i2 : Integer.parseInt(attributeValue);
    }

    public static long d(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : amn.p(attributeValue);
    }

    public static long e(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : Long.parseLong(attributeValue);
    }

    public static aeu g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strL = l(xmlPullParser, "schemeIdUri", BuildConfig.FLAVOR);
        String strL2 = l(xmlPullParser, "value", null);
        String strL3 = l(xmlPullParser, Name.MARK, null);
        do {
            xmlPullParser.next();
        } while (!arj.g(xmlPullParser, str));
        return new aeu(strL, strL2, strL3);
    }

    public static String l(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String m(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = BuildConfig.FLAVOR;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                o(xmlPullParser);
            }
        } while (!arj.g(xmlPullParser, str));
        return text;
    }

    public static void o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (arj.h(xmlPullParser)) {
            int i2 = 1;
            while (i2 != 0) {
                xmlPullParser.next();
                if (arj.h(xmlPullParser)) {
                    i2++;
                } else if (arj.f(xmlPullParser)) {
                    i2--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int p(org.xmlpull.v1.XmlPullParser r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aet.p(org.xmlpull.v1.XmlPullParser):int");
    }

    public static final long q(XmlPullParser xmlPullParser, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j2;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static final String r(XmlPullParser xmlPullParser, String str) {
        return arj.m(str, m(xmlPullParser, "BaseURL"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.util.Pair<java.lang.String, com.google.ads.interactivemedia.v3.internal.qf> s(org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aet.s(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static final int t(XmlPullParser xmlPullParser) {
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
        return !"text".equals(attributeValue) ? -1 : 3;
    }

    public static long u(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -9223372036854775807L;
        }
        return amn.o(attributeValue);
    }

    public static float v(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(attributeValue);
    }

    public static final aey w(XmlPullParser xmlPullParser, String str, String str2) {
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
            return new aey(attributeValue, j2, j3);
        }
        j2 = 0;
        j3 = -1;
        return new aey(attributeValue, j2, j3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int x(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aet.x(java.lang.String):int");
    }

    public static final int y(List<aeu> list) {
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (arq.d("http://dashif.org/guidelines/trickmode", list.get(i3).f19440a)) {
                i2 |= 16384;
            }
        }
        return i2;
    }

    public static final afk z(XmlPullParser xmlPullParser, String str, afk afkVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? afk.a(attributeValue) : afkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0c89 A[Catch: XmlPullParserException -> 0x1379, TryCatch #0 {XmlPullParserException -> 0x1379, blocks: (B:3:0x0010, B:5:0x0023, B:7:0x002d, B:9:0x0059, B:12:0x0066, B:15:0x0073, B:17:0x007e, B:21:0x008f, B:26:0x00b4, B:29:0x00bf, B:482:0x1317, B:494:0x1337, B:496:0x133d, B:498:0x134f, B:499:0x1356, B:491:0x132d, B:492:0x1334, B:31:0x0117, B:34:0x0121, B:35:0x012f, B:37:0x013c, B:45:0x0161, B:47:0x0167, B:38:0x0142, B:40:0x014a, B:41:0x0150, B:43:0x0158, B:44:0x015e, B:49:0x017a, B:53:0x0189, B:55:0x01a6, B:57:0x01ae, B:59:0x01d9, B:62:0x01f4, B:64:0x01ff, B:69:0x023a, B:71:0x0246, B:65:0x021a, B:67:0x0225, B:73:0x025c, B:76:0x0266, B:78:0x0280, B:80:0x0285, B:81:0x02a3, B:84:0x02ae, B:464:0x1259, B:466:0x1261, B:470:0x1286, B:471:0x12a2, B:472:0x12a3, B:476:0x12ba, B:475:0x12b4, B:86:0x031c, B:90:0x0333, B:91:0x03bf, B:94:0x03ca, B:371:0x0e85, B:373:0x0e8d, B:374:0x0e97, B:376:0x0e9d, B:378:0x0ead, B:379:0x0eb0, B:382:0x0eb6, B:384:0x0ec3, B:386:0x0ecb, B:389:0x0eda, B:391:0x0ee0, B:393:0x0eec, B:394:0x0ef0, B:395:0x0ef3, B:396:0x0ef8, B:398:0x0f05, B:400:0x0f16, B:404:0x0f29, B:401:0x0f1e, B:403:0x0f22, B:405:0x0f36, B:406:0x0f3d, B:407:0x0f3e, B:98:0x047c, B:100:0x0486, B:102:0x048e, B:103:0x0492, B:105:0x0496, B:107:0x04e9, B:109:0x04f1, B:115:0x0504, B:114:0x04fd, B:116:0x050e, B:118:0x0516, B:120:0x0571, B:122:0x0579, B:123:0x0581, B:125:0x0589, B:126:0x0593, B:128:0x0599, B:129:0x05a2, B:131:0x05a8, B:132:0x05b1, B:136:0x05c2, B:137:0x0647, B:140:0x0652, B:184:0x09bc, B:186:0x09c4, B:188:0x09ca, B:205:0x0a0d, B:208:0x0a16, B:210:0x0a1c, B:212:0x0a2c, B:214:0x0a36, B:216:0x0a3e, B:219:0x0a4b, B:222:0x0a52, B:226:0x0a5c, B:228:0x0a70, B:231:0x0a77, B:254:0x0ab9, B:256:0x0abf, B:258:0x0acf, B:259:0x0ad6, B:261:0x0adf, B:263:0x0ae5, B:265:0x0afb, B:290:0x0b54, B:266:0x0b05, B:268:0x0b11, B:289:0x0b53, B:271:0x0b17, B:272:0x0b1b, B:274:0x0b1f, B:277:0x0b29, B:280:0x0b34, B:283:0x0b3e, B:286:0x0b49, B:291:0x0b5f, B:293:0x0b9c, B:341:0x0c80, B:345:0x0c9c, B:344:0x0c89, B:295:0x0bae, B:297:0x0bb4, B:298:0x0bbd, B:300:0x0bc3, B:303:0x0bcc, B:305:0x0bd2, B:307:0x0be2, B:309:0x0be6, B:311:0x0bf2, B:340:0x0c7d, B:312:0x0bfc, B:314:0x0c0c, B:316:0x0c16, B:315:0x0c11, B:317:0x0c19, B:320:0x0c1f, B:323:0x0c28, B:325:0x0c2e, B:327:0x0c3e, B:329:0x0c42, B:331:0x0c4e, B:332:0x0c58, B:334:0x0c69, B:336:0x0c73, B:338:0x0c78, B:335:0x0c6e, B:190:0x09d1, B:192:0x09d7, B:193:0x09dc, B:195:0x09e2, B:197:0x09ec, B:199:0x09f3, B:201:0x09fd, B:144:0x0726, B:146:0x0730, B:147:0x077c, B:152:0x078e, B:155:0x07f4, B:157:0x0802, B:158:0x089b, B:160:0x08f0, B:162:0x0933, B:164:0x094c, B:166:0x0954, B:167:0x0958, B:169:0x095c, B:172:0x096d, B:174:0x0977, B:176:0x0989, B:178:0x0993, B:179:0x099f, B:181:0x09a9, B:182:0x09b3, B:347:0x0d40, B:351:0x0da0, B:354:0x0dc2, B:356:0x0dcc, B:357:0x0e07, B:359:0x0e1e, B:360:0x0e46, B:362:0x0e52, B:363:0x0e5c, B:365:0x0e66, B:366:0x0e72, B:368:0x0e78, B:409:0x0fb2, B:411:0x0fe9, B:412:0x100d, B:414:0x1018, B:415:0x105e, B:417:0x1066, B:418:0x106a, B:434:0x10e4, B:420:0x106f, B:421:0x1078, B:422:0x1080, B:423:0x1088, B:424:0x1090, B:425:0x1098, B:426:0x10a0, B:427:0x10a8, B:428:0x10b4, B:429:0x10c0, B:431:0x10c6, B:432:0x10d9, B:433:0x10de, B:435:0x10eb, B:437:0x10f8, B:439:0x1101, B:441:0x113b, B:443:0x1143, B:444:0x1150, B:446:0x1156, B:447:0x116f, B:440:0x112b, B:449:0x1196, B:451:0x11a7, B:453:0x11c6, B:455:0x11d1, B:456:0x1202, B:458:0x1211, B:459:0x123b, B:461:0x124c, B:462:0x1252, B:479:0x12ea, B:501:0x1371, B:502:0x1378), top: B:507:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0cda A[LOOP:8: B:137:0x0647->B:346:0x0cda, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0f65 A[LOOP:4: B:91:0x03bf->B:408:0x0f65, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x12c5 A[LOOP:3: B:81:0x02a3->B:478:0x12c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1357 A[LOOP:0: B:26:0x00b4->B:500:0x1357, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x131f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x1261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0e8d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x09c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0ab1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0251 A[LOOP:2: B:62:0x01f4->B:72:0x0251, LOOP_END] */
    @Override // com.google.ads.interactivemedia.v3.internal.akl
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.aer a(android.net.Uri r152, java.io.InputStream r153) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aet.a(android.net.Uri, java.io.InputStream):com.google.ads.interactivemedia.v3.internal.aer");
    }

    public final aey h(XmlPullParser xmlPullParser) {
        return w(xmlPullParser, "sourceURL", "range");
    }

    public final afd i(XmlPullParser xmlPullParser, afd afdVar, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        long jE = e(xmlPullParser, "timescale", afdVar != null ? afdVar.f19486i : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", afdVar != null ? afdVar.f19487j : 0L);
        long jE3 = e(xmlPullParser, "duration", afdVar != null ? afdVar.f19472b : -9223372036854775807L);
        long jE4 = e(xmlPullParser, "startNumber", afdVar != null ? afdVar.f19471a : 1L);
        long jB = B(j4, j5);
        List<aff> listN = null;
        List arrayList = null;
        aey aeyVarH = null;
        do {
            xmlPullParser.next();
            if (arj.i(xmlPullParser, "Initialization")) {
                aeyVarH = h(xmlPullParser);
            } else if (arj.i(xmlPullParser, "SegmentTimeline")) {
                listN = n(xmlPullParser, jE, j3);
            } else if (arj.i(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(w(xmlPullParser, "media", "mediaRange"));
            } else {
                o(xmlPullParser);
            }
        } while (!arj.g(xmlPullParser, "SegmentList"));
        if (afdVar != null) {
            if (aeyVarH == null) {
                aeyVarH = afdVar.f19485h;
            }
            if (listN == null) {
                listN = afdVar.f19473c;
            }
            if (arrayList == null) {
                arrayList = afdVar.f19477e;
            }
        }
        return new afd(aeyVarH, jE, jE2, jE4, jE3, listN, jB, arrayList, iw.b(j6), iw.b(j2));
    }

    public final afe j(XmlPullParser xmlPullParser, afe afeVar, List<aeu> list, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        long j7;
        long jE = e(xmlPullParser, "timescale", afeVar != null ? afeVar.f19486i : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", afeVar != null ? afeVar.f19487j : 0L);
        long jE3 = e(xmlPullParser, "duration", afeVar != null ? afeVar.f19472b : -9223372036854775807L);
        long jE4 = e(xmlPullParser, "startNumber", afeVar != null ? afeVar.f19471a : 1L);
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                j7 = -1;
                break;
            }
            aeu aeuVar = list.get(i2);
            if (arq.d("http://dashif.org/guidelines/last-segment-number", aeuVar.f19440a)) {
                j7 = Long.parseLong(aeuVar.f19441b);
                break;
            }
            i2++;
        }
        long j8 = j7;
        long jB = B(j4, j5);
        List<aff> listN = null;
        afk afkVarZ = z(xmlPullParser, "media", afeVar != null ? afeVar.f19479f : null);
        afk afkVarZ2 = z(xmlPullParser, "initialization", afeVar != null ? afeVar.f19478e : null);
        aey aeyVarH = null;
        do {
            xmlPullParser.next();
            if (arj.i(xmlPullParser, "Initialization")) {
                aeyVarH = h(xmlPullParser);
            } else if (arj.i(xmlPullParser, "SegmentTimeline")) {
                listN = n(xmlPullParser, jE, j3);
            } else {
                o(xmlPullParser);
            }
        } while (!arj.g(xmlPullParser, "SegmentTemplate"));
        if (afeVar != null) {
            if (aeyVarH == null) {
                aeyVarH = afeVar.f19485h;
            }
            if (listN == null) {
                listN = afeVar.f19473c;
            }
        }
        return new afe(aeyVarH, jE, jE2, jE4, j8, jE3, listN, jB, afkVarZ2, afkVarZ, iw.b(j6), iw.b(j2));
    }

    public final afg k(XmlPullParser xmlPullParser, afg afgVar) throws XmlPullParserException, IOException {
        long j2;
        long j3;
        long jE = e(xmlPullParser, "timescale", afgVar != null ? afgVar.f19486i : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", afgVar != null ? afgVar.f19487j : 0L);
        long j4 = afgVar != null ? afgVar.f19483a : 0L;
        long j5 = afgVar != null ? afgVar.f19484b : 0L;
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
        aey aeyVarH = afgVar != null ? afgVar.f19485h : null;
        do {
            xmlPullParser.next();
            if (arj.i(xmlPullParser, "Initialization")) {
                aeyVarH = h(xmlPullParser);
            } else {
                o(xmlPullParser);
            }
        } while (!arj.g(xmlPullParser, "SegmentBase"));
        return new afg(aeyVarH, jE, jE2, j3, j2);
    }

    public final List<aff> n(XmlPullParser xmlPullParser, long j2, long j3) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jC = 0;
        long jE = -9223372036854775807L;
        boolean z = false;
        int iC = 0;
        do {
            xmlPullParser.next();
            if (arj.i(xmlPullParser, "S")) {
                long jE2 = e(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jC = C(arrayList, jC, jE, iC, jE2);
                }
                if (jE2 == -9223372036854775807L) {
                    jE2 = jC;
                }
                jE = e(xmlPullParser, "d", -9223372036854775807L);
                iC = c(xmlPullParser, "r", 0);
                jC = jE2;
                z = true;
            } else {
                o(xmlPullParser);
            }
        } while (!arj.g(xmlPullParser, "SegmentTimeline"));
        if (z) {
            C(arrayList, jC, jE, iC, amn.q(j3, j2, 1000L));
        }
        return arrayList;
    }
}
