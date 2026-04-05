package c.f.a.b.f3.r;

import android.text.Layout;
import c.f.a.b.f3.f;
import c.f.a.b.f3.r.c;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c.f.a.b.f3.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f8237o = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean p;
    public final b q;
    public Map<String, c> r;
    public float s;
    public float t;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.s = -3.4028235E38f;
        this.t = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.p = false;
            this.q = null;
            return;
        }
        this.p = true;
        String strE = x0.E(list.get(0));
        g.a(strE.startsWith("Format:"));
        this.q = (b) g.e(b.a(strE));
        G(new i0(list.get(1)));
    }

    public static int B(long j2, List<Long> list, List<List<c.f.a.b.f3.c>> list2) {
        int i2;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (list.get(size).longValue() == j2) {
                return size;
            }
            if (list.get(size).longValue() < j2) {
                i2 = size + 1;
                break;
            }
            size--;
        }
        list.add(i2, Long.valueOf(j2));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList(list2.get(i2 - 1)));
        return i2;
    }

    public static float C(int i2) {
        if (i2 == 0) {
            return 0.05f;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.f3.c D(java.lang.String r7, c.f.a.b.f3.r.c r8, c.f.a.b.f3.r.c.b r9, float r10, float r11) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.r.a.D(java.lang.String, c.f.a.b.f3.r.c, c.f.a.b.f3.r.c$b, float, float):c.f.a.b.f3.c");
    }

    public static Map<String, c> I(i0 i0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strP = i0Var.p();
            if (strP == null || (i0Var.a() != 0 && i0Var.h() == 91)) {
                break;
            }
            if (strP.startsWith("Format:")) {
                aVarA = c.a.a(strP);
            } else if (strP.startsWith("Style:")) {
                if (aVarA == null) {
                    z.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strP);
                } else {
                    c cVarB = c.b(strP, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f8243a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long J(String str) {
        Matcher matcher = f8237o.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) x0.i(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) x0.i(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) x0.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) x0.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int K(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                z.i("SsaDecoder", "Unknown alignment: " + i2);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int L(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                z.i("SsaDecoder", "Unknown alignment: " + i2);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment M(int i2) {
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                z.i("SsaDecoder", "Unknown alignment: " + i2);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public final void E(String str, b bVar, List<List<c.f.a.b.f3.c>> list, List<Long> list2) {
        int i2;
        StringBuilder sb;
        g.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", bVar.f8242e);
        if (strArrSplit.length != bVar.f8242e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long J = J(strArrSplit[bVar.f8238a]);
            if (J == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long J2 = J(strArrSplit[bVar.f8239b]);
                if (J2 != -9223372036854775807L) {
                    Map<String, c> map = this.r;
                    c cVar = (map == null || (i2 = bVar.f8240c) == -1) ? null : map.get(strArrSplit[i2].trim());
                    String str2 = strArrSplit[bVar.f8241d];
                    c.f.a.b.f3.c cVarD = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.s, this.t);
                    int iB = B(J2, list2, list);
                    for (int iB2 = B(J, list2, list); iB2 < iB; iB2++) {
                        list.get(iB2).add(cVarD);
                    }
                    return;
                }
                sb = new StringBuilder();
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        z.i("SsaDecoder", sb.toString());
    }

    public final void F(i0 i0Var, List<List<c.f.a.b.f3.c>> list, List<Long> list2) {
        b bVarA = this.p ? this.q : null;
        while (true) {
            String strP = i0Var.p();
            if (strP == null) {
                return;
            }
            if (strP.startsWith("Format:")) {
                bVarA = b.a(strP);
            } else if (strP.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    z.i("SsaDecoder", "Skipping dialogue line before complete format: " + strP);
                } else {
                    E(strP, bVarA, list, list2);
                }
            }
        }
    }

    public final void G(i0 i0Var) {
        while (true) {
            String strP = i0Var.p();
            if (strP == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strP)) {
                H(i0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strP)) {
                this.r = I(i0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(strP)) {
                z.g("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strP)) {
                return;
            }
        }
    }

    public final void H(i0 i0Var) {
        while (true) {
            String strP = i0Var.p();
            if (strP == null) {
                return;
            }
            if (i0Var.a() != 0 && i0Var.h() == 91) {
                return;
            }
            String[] strArrSplit = strP.split(":");
            if (strArrSplit.length == 2) {
                String strE = c.f.b.a.b.e(strArrSplit[0].trim());
                strE.hashCode();
                if (strE.equals("playresx")) {
                    this.s = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.t = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    @Override // c.f.a.b.f3.d
    public f y(byte[] bArr, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        i0 i0Var = new i0(bArr, i2);
        if (!this.p) {
            G(i0Var);
        }
        F(i0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
