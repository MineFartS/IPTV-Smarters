package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f23214a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23215b = 0;

    public static yr a(alx alxVar) {
        String string;
        String str;
        int iC = alxVar.c() + alxVar.e();
        int iE = alxVar.e();
        int i2 = (iE >> 24) & 255;
        yr ziVar = null;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = 16777215 & iE;
                if (i3 == 6516084) {
                    int iE2 = alxVar.e();
                    if (alxVar.e() == 1684108385) {
                        alxVar.J(8);
                        String strX = alxVar.x(iE2 - 16);
                        ziVar = new zi("und", strX, strX);
                    } else {
                        String strValueOf = String.valueOf(tz.g(iE));
                        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return ziVar;
                }
                if (i3 == 7233901 || i3 == 7631467) {
                    return e(iE, "TIT2", alxVar);
                }
                if (i3 == 6516589 || i3 == 7828084) {
                    return e(iE, "TCOM", alxVar);
                }
                if (i3 == 6578553) {
                    return e(iE, "TDRC", alxVar);
                }
                if (i3 == 4280916) {
                    return e(iE, "TPE1", alxVar);
                }
                if (i3 == 7630703) {
                    return e(iE, "TSSE", alxVar);
                }
                if (i3 == 6384738) {
                    return e(iE, "TALB", alxVar);
                }
                if (i3 == 7108978) {
                    return e(iE, "USLT", alxVar);
                }
                if (i3 == 6776174) {
                    return e(iE, "TCON", alxVar);
                }
                if (i3 == 6779504) {
                    return e(iE, "TIT1", alxVar);
                }
            } else {
                if (iE == 1735291493) {
                    int iB = b(alxVar);
                    String str2 = (iB <= 0 || iB > 192) ? null : f23214a[iB - 1];
                    if (str2 != null) {
                        ziVar = new zs("TCON", null, str2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return ziVar;
                }
                if (iE == 1684632427) {
                    return d(1684632427, "TPOS", alxVar);
                }
                if (iE == 1953655662) {
                    return d(1953655662, "TRCK", alxVar);
                }
                if (iE == 1953329263) {
                    return c(1953329263, "TBPM", alxVar, true, false);
                }
                if (iE == 1668311404) {
                    return c(1668311404, "TCMP", alxVar, true, true);
                }
                if (iE == 1668249202) {
                    int iE3 = alxVar.e();
                    if (alxVar.e() == 1684108385) {
                        int iE4 = tz.e(alxVar.e());
                        if (iE4 == 13) {
                            str = "image/jpeg";
                        } else if (iE4 == 14) {
                            str = "image/png";
                            iE4 = 14;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            alxVar.J(4);
                            int i4 = iE3 - 16;
                            byte[] bArr = new byte[i4];
                            alxVar.D(bArr, 0, i4);
                            ziVar = new zd(str, null, 3, bArr);
                            return ziVar;
                        }
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(iE4);
                        string = sb.toString();
                    } else {
                        string = "Failed to parse cover art attribute";
                    }
                    Log.w("MetadataUtil", string);
                    return ziVar;
                }
                if (iE == 1631670868) {
                    return e(1631670868, "TPE2", alxVar);
                }
                if (iE == 1936682605) {
                    return e(1936682605, "TSOT", alxVar);
                }
                if (iE == 1936679276) {
                    return e(1936679276, "TSO2", alxVar);
                }
                if (iE == 1936679282) {
                    return e(1936679282, "TSOA", alxVar);
                }
                if (iE == 1936679265) {
                    return e(1936679265, "TSOP", alxVar);
                }
                if (iE == 1936679791) {
                    return e(1936679791, "TSOC", alxVar);
                }
                if (iE == 1920233063) {
                    return c(1920233063, "ITUNESADVISORY", alxVar, false, false);
                }
                if (iE == 1885823344) {
                    return c(1885823344, "ITUNESGAPLESS", alxVar, false, true);
                }
                if (iE == 1936683886) {
                    return e(1936683886, "TVSHOWSORT", alxVar);
                }
                if (iE == 1953919848) {
                    return e(1953919848, "TVSHOW", alxVar);
                }
                if (iE == 757935405) {
                    String strX2 = null;
                    String strX3 = null;
                    int i5 = -1;
                    int i6 = -1;
                    while (alxVar.c() < iC) {
                        int iC2 = alxVar.c();
                        int iE5 = alxVar.e();
                        int iE6 = alxVar.e();
                        alxVar.J(4);
                        if (iE6 == 1835360622) {
                            strX2 = alxVar.x(iE5 - 12);
                        } else if (iE6 == 1851878757) {
                            strX3 = alxVar.x(iE5 - 12);
                        } else {
                            if (iE6 == 1684108385) {
                                i6 = iE5;
                            }
                            if (iE6 == 1684108385) {
                                i5 = iC2;
                            }
                            alxVar.J(iE5 - 12);
                        }
                    }
                    if (strX2 != null && strX3 != null && i5 != -1) {
                        alxVar.I(i5);
                        alxVar.J(16);
                        ziVar = new zp(strX2, strX3, alxVar.x(i6 - 16));
                    }
                    return ziVar;
                }
            }
            String strValueOf2 = String.valueOf(tz.g(iE));
            Log.d("MetadataUtil", strValueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            alxVar.I(iC);
        }
    }

    private static int b(alx alxVar) {
        alxVar.J(4);
        if (alxVar.e() == 1684108385) {
            alxVar.J(8);
            return alxVar.k();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zo c(int i2, String str, alx alxVar, boolean z, boolean z2) {
        int iB = b(alxVar);
        if (z2) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            return z ? new zs(str, null, Integer.toString(iB)) : new zi("und", str, Integer.toString(iB));
        }
        String strValueOf = String.valueOf(tz.g(i2));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zs d(int i2, String str, alx alxVar) {
        int iE = alxVar.e();
        if (alxVar.e() == 1684108385 && iE >= 22) {
            alxVar.J(10);
            int iO = alxVar.o();
            if (iO > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iO);
                String string = sb.toString();
                int iO2 = alxVar.o();
                if (iO2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iO2);
                    string = sb2.toString();
                }
                return new zs(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(tz.g(i2));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static zs e(int i2, String str, alx alxVar) {
        int iE = alxVar.e();
        if (alxVar.e() == 1684108385) {
            alxVar.J(8);
            return new zs(str, null, alxVar.x(iE - 16));
        }
        String strValueOf = String.valueOf(tz.g(i2));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }
}
