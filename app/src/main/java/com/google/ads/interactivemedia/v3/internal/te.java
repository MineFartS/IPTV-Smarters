package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f23047a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f23048b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f23049c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.ads.interactivemedia.v3.internal.ta a(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.te.a(java.lang.String):com.google.ads.interactivemedia.v3.internal.ta");
    }

    private static aty<sz> b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        atu atuVarI = aty.i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (arj.i(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strE = arj.e(xmlPullParser, strConcat3);
                String strE2 = arj.e(xmlPullParser, strConcat4);
                String strE3 = arj.e(xmlPullParser, strConcat5);
                String strE4 = arj.e(xmlPullParser, strConcat6);
                if (strE == null || strE2 == null) {
                    return aty.n();
                }
                atuVarI.d(new sz(strE, strE3 != null ? Long.parseLong(strE3) : 0L, strE4 != null ? Long.parseLong(strE4) : 0L));
            }
        } while (!arj.g(xmlPullParser, strConcat2));
        return atuVarI.c();
    }
}
