package c.f.a.b.z2.j0;

import c.f.a.b.b3.a;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.z2.t;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f10963a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static c.f.a.b.b3.m.f a(int i2, i0 i0Var) {
        int iN = i0Var.n();
        if (i0Var.n() == 1684108385) {
            i0Var.Q(8);
            String strY = i0Var.y(iN - 16);
            return new c.f.a.b.b3.m.f("und", strY, strY);
        }
        z.i("MetadataUtil", "Failed to parse comment attribute: " + e.a(i2));
        return null;
    }

    public static c.f.a.b.b3.m.b b(i0 i0Var) {
        String str;
        int iN = i0Var.n();
        if (i0Var.n() == 1684108385) {
            int iB = e.b(i0Var.n());
            String str2 = iB == 13 ? "image/jpeg" : iB == 14 ? "image/png" : null;
            if (str2 != null) {
                i0Var.Q(4);
                int i2 = iN - 16;
                byte[] bArr = new byte[i2];
                i0Var.j(bArr, 0, i2);
                return new c.f.a.b.b3.m.b(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + iB;
        } else {
            str = "Failed to parse cover art attribute";
        }
        z.i("MetadataUtil", str);
        return null;
    }

    public static a.b c(i0 i0Var) {
        int iE = i0Var.e() + i0Var.n();
        int iN = i0Var.n();
        int i2 = (iN >> 24) & 255;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = 16777215 & iN;
                if (i3 == 6516084) {
                    return a(iN, i0Var);
                }
                if (i3 == 7233901 || i3 == 7631467) {
                    return h(iN, "TIT2", i0Var);
                }
                if (i3 == 6516589 || i3 == 7828084) {
                    return h(iN, "TCOM", i0Var);
                }
                if (i3 == 6578553) {
                    return h(iN, "TDRC", i0Var);
                }
                if (i3 == 4280916) {
                    return h(iN, "TPE1", i0Var);
                }
                if (i3 == 7630703) {
                    return h(iN, "TSSE", i0Var);
                }
                if (i3 == 6384738) {
                    return h(iN, "TALB", i0Var);
                }
                if (i3 == 7108978) {
                    return h(iN, "USLT", i0Var);
                }
                if (i3 == 6776174) {
                    return h(iN, "TCON", i0Var);
                }
                if (i3 == 6779504) {
                    return h(iN, "TIT1", i0Var);
                }
            } else {
                if (iN == 1735291493) {
                    return g(i0Var);
                }
                if (iN == 1684632427) {
                    return d(iN, "TPOS", i0Var);
                }
                if (iN == 1953655662) {
                    return d(iN, "TRCK", i0Var);
                }
                if (iN == 1953329263) {
                    return i(iN, "TBPM", i0Var, true, false);
                }
                if (iN == 1668311404) {
                    return i(iN, "TCMP", i0Var, true, true);
                }
                if (iN == 1668249202) {
                    return b(i0Var);
                }
                if (iN == 1631670868) {
                    return h(iN, "TPE2", i0Var);
                }
                if (iN == 1936682605) {
                    return h(iN, "TSOT", i0Var);
                }
                if (iN == 1936679276) {
                    return h(iN, "TSO2", i0Var);
                }
                if (iN == 1936679282) {
                    return h(iN, "TSOA", i0Var);
                }
                if (iN == 1936679265) {
                    return h(iN, "TSOP", i0Var);
                }
                if (iN == 1936679791) {
                    return h(iN, "TSOC", i0Var);
                }
                if (iN == 1920233063) {
                    return i(iN, "ITUNESADVISORY", i0Var, false, false);
                }
                if (iN == 1885823344) {
                    return i(iN, "ITUNESGAPLESS", i0Var, false, true);
                }
                if (iN == 1936683886) {
                    return h(iN, "TVSHOWSORT", i0Var);
                }
                if (iN == 1953919848) {
                    return h(iN, "TVSHOW", i0Var);
                }
                if (iN == 757935405) {
                    return e(i0Var, iE);
                }
            }
            z.b("MetadataUtil", "Skipped unknown metadata entry: " + e.a(iN));
            return null;
        } finally {
            i0Var.P(iE);
        }
    }

    public static c.f.a.b.b3.m.m d(int i2, String str, i0 i0Var) {
        int iN = i0Var.n();
        if (i0Var.n() == 1684108385 && iN >= 22) {
            i0Var.Q(10);
            int iJ = i0Var.J();
            if (iJ > 0) {
                String str2 = BuildConfig.FLAVOR + iJ;
                int iJ2 = i0Var.J();
                if (iJ2 > 0) {
                    str2 = str2 + "/" + iJ2;
                }
                return new c.f.a.b.b3.m.m(str, null, str2);
            }
        }
        z.i("MetadataUtil", "Failed to parse index/count attribute: " + e.a(i2));
        return null;
    }

    public static c.f.a.b.b3.m.i e(i0 i0Var, int i2) {
        String strY = null;
        String strY2 = null;
        int i3 = -1;
        int i4 = -1;
        while (i0Var.e() < i2) {
            int iE = i0Var.e();
            int iN = i0Var.n();
            int iN2 = i0Var.n();
            i0Var.Q(4);
            if (iN2 == 1835360622) {
                strY = i0Var.y(iN - 12);
            } else if (iN2 == 1851878757) {
                strY2 = i0Var.y(iN - 12);
            } else {
                if (iN2 == 1684108385) {
                    i3 = iE;
                    i4 = iN;
                }
                i0Var.Q(iN - 12);
            }
        }
        if (strY == null || strY2 == null || i3 == -1) {
            return null;
        }
        i0Var.P(i3);
        i0Var.Q(16);
        return new c.f.a.b.b3.m.j(strY, strY2, i0Var.y(i4 - 16));
    }

    public static c.f.a.b.b3.n.b f(i0 i0Var, int i2, String str) {
        while (true) {
            int iE = i0Var.e();
            if (iE >= i2) {
                return null;
            }
            int iN = i0Var.n();
            if (i0Var.n() == 1684108385) {
                int iN2 = i0Var.n();
                int iN3 = i0Var.n();
                int i3 = iN - 16;
                byte[] bArr = new byte[i3];
                i0Var.j(bArr, 0, i3);
                return new c.f.a.b.b3.n.b(str, bArr, iN3, iN2);
            }
            i0Var.P(iE + iN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.b3.m.m g(c.f.a.b.j3.i0 r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = c.f.a.b.z2.j0.j.f10963a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            c.f.a.b.b3.m.m r1 = new c.f.a.b.b3.m.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            c.f.a.b.j3.z.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.j0.j.g(c.f.a.b.j3.i0):c.f.a.b.b3.m.m");
    }

    public static c.f.a.b.b3.m.m h(int i2, String str, i0 i0Var) {
        int iN = i0Var.n();
        if (i0Var.n() == 1684108385) {
            i0Var.Q(8);
            return new c.f.a.b.b3.m.m(str, null, i0Var.y(iN - 16));
        }
        z.i("MetadataUtil", "Failed to parse text attribute: " + e.a(i2));
        return null;
    }

    public static c.f.a.b.b3.m.i i(int i2, String str, i0 i0Var, boolean z, boolean z2) {
        int iJ = j(i0Var);
        if (z2) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z ? new c.f.a.b.b3.m.m(str, null, Integer.toString(iJ)) : new c.f.a.b.b3.m.f("und", str, Integer.toString(iJ));
        }
        z.i("MetadataUtil", "Failed to parse uint8 attribute: " + e.a(i2));
        return null;
    }

    public static int j(i0 i0Var) {
        i0Var.Q(4);
        if (i0Var.n() == 1684108385) {
            i0Var.Q(8);
            return i0Var.D();
        }
        z.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i2, t tVar, k1.b bVar) {
        if (i2 == 1 && tVar.a()) {
            bVar.M(tVar.f11499b).N(tVar.f11500c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(int r5, c.f.a.b.b3.a r6, c.f.a.b.b3.a r7, c.f.a.b.k1.b r8, c.f.a.b.b3.a... r9) {
        /*
            c.f.a.b.b3.a r0 = new c.f.a.b.b3.a
            r1 = 0
            c.f.a.b.b3.a$b[] r2 = new c.f.a.b.b3.a.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = 0
        L14:
            int r6 = r7.e()
            if (r5 >= r6) goto L3c
            c.f.a.b.b3.a$b r6 = r7.d(r5)
            boolean r3 = r6 instanceof c.f.a.b.b3.n.b
            if (r3 == 0) goto L39
            c.f.a.b.b3.n.b r6 = (c.f.a.b.b3.n.b) r6
            java.lang.String r3 = r6.f6595b
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            c.f.a.b.b3.a r5 = new c.f.a.b.b3.a
            c.f.a.b.b3.a$b[] r7 = new c.f.a.b.b3.a.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            c.f.a.b.b3.a r6 = r6.c(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.e()
            if (r5 <= 0) goto L52
            r8.X(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.j0.j.l(int, c.f.a.b.b3.a, c.f.a.b.b3.a, c.f.a.b.k1$b, c.f.a.b.b3.a[]):void");
    }
}
