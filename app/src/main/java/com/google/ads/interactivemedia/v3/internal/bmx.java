package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bmx {
    public static String a(bkd bkdVar) {
        String str;
        bmw bmwVar = new bmw(bkdVar);
        StringBuilder sb = new StringBuilder(bmwVar.a());
        for (int i2 = 0; i2 < bmwVar.a(); i2++) {
            int iA = bmwVar.f21432a.a(i2);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb.append('\\');
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static final Object b(Object obj) {
        return ((bkx) obj).av(4);
    }
}
