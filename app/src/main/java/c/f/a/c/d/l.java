package c.f.a.c.d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.achartengine.ChartFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c.f.a.c.f.p.a> f11681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f11682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f11684g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f11679b = {null, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<l> CREATOR = new i1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11680c = new b().a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", ChartFactory.TITLE, 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3).a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5).a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5).a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5).a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5).a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2).a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1).a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2).a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);

    public class a {
        public a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f11686a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f11687b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, Integer> f11688c = new HashMap();

        public final b a(String str, String str2, int i2) {
            this.f11686a.put(str, str2);
            this.f11687b.put(str2, str);
            this.f11688c.put(str, Integer.valueOf(i2));
            return this;
        }

        public final String b(String str) {
            return this.f11686a.get(str);
        }

        public final String c(String str) {
            return this.f11687b.get(str);
        }

        public final int d(String str) {
            Integer num = this.f11688c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    public l() {
        this(0);
    }

    public l(int i2) {
        this(new ArrayList(), new Bundle(), i2);
    }

    public l(List<c.f.a.c.f.p.a> list, Bundle bundle, int i2) {
        this.f11684g = new a();
        this.f11681d = list;
        this.f11682e = bundle;
        this.f11683f = i2;
    }

    public static void O(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int iD = f11680c.d(str);
        if (iD == i2 || iD == 0) {
            return;
        }
        String str2 = f11679b[i2];
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append("Value for ");
        sb.append(str);
        sb.append(" must be a ");
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    public List<c.f.a.c.f.p.a> I() {
        return this.f11681d;
    }

    public int J() {
        return this.f11683f;
    }

    public String K(String str) {
        O(str, 1);
        return this.f11682e.getString(str);
    }

    public long L(String str) {
        O(str, 5);
        return this.f11682e.getLong(str);
    }

    public boolean M() {
        List<c.f.a.c.f.p.a> list = this.f11681d;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void N(String str, String str2) {
        O(str, 1);
        this.f11682e.putString(str, str2);
    }

    public final JSONObject P() {
        String strB;
        double dB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f11683f);
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayE = c.f.a.c.d.v.c.b.e(this.f11681d);
        if (jSONArrayE != null && jSONArrayE.length() != 0) {
            try {
                jSONObject.put("images", jSONArrayE);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.f11683f;
        int i3 = 0;
        if (i2 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i2 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i2 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                if (this.f11682e.containsKey(str)) {
                    b bVar = f11680c;
                    int iD = bVar.d(str);
                    if (iD != 1) {
                        if (iD != 2) {
                            if (iD == 3) {
                                strB = bVar.b(str);
                                dB = this.f11682e.getDouble(str);
                            } else if (iD != 4) {
                                if (iD == 5) {
                                    strB = bVar.b(str);
                                    dB = c.f.a.c.d.v.a.b(this.f11682e.getLong(str));
                                }
                            }
                            jSONObject.put(strB, dB);
                        } else {
                            jSONObject.put(bVar.b(str), this.f11682e.getInt(str));
                        }
                    }
                    jSONObject.put(bVar.b(str), this.f11682e.getString(str));
                }
            }
            for (String str2 : this.f11682e.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj2 = this.f11682e.get(str2);
                    if ((obj2 instanceof String) || (obj2 instanceof Integer) || (obj2 instanceof Double)) {
                        jSONObject.put(str2, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final boolean Q(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !Q((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public void b(c.f.a.c.f.p.a aVar) {
        this.f11681d.add(aVar);
    }

    public void clear() {
        this.f11682e.clear();
        this.f11681d.clear();
    }

    public boolean e(String str) {
        return this.f11682e.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Q(this.f11682e, lVar.f11682e) && this.f11681d.equals(lVar.f11681d);
    }

    public final void h(JSONObject jSONObject) {
        Bundle bundle;
        clear();
        this.f11683f = 0;
        try {
            this.f11683f = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            c.f.a.c.d.v.c.b.a(this.f11681d, jSONArrayOptJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.f11683f;
        if (i2 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i2 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i2 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!"metadataType".equals(next)) {
                    b bVar = f11680c;
                    String strC = bVar.c(next);
                    if (strC == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.f11682e.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f11682e.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f11682e.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(strC)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int iD = bVar.d(strC);
                                if (iD != 1) {
                                    if (iD != 2) {
                                        if (iD == 3) {
                                            double dOptDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(dOptDouble)) {
                                                this.f11682e.putDouble(strC, dOptDouble);
                                            }
                                        } else if (iD != 4) {
                                            if (iD == 5) {
                                                this.f11682e.putLong(strC, c.f.a.c.d.v.a.c(jSONObject.optLong(next)));
                                            }
                                        } else if ((obj2 instanceof String) && c.f.a.c.d.v.c.b.b((String) obj2) != null) {
                                            bundle = this.f11682e;
                                            bundle.putString(strC, (String) obj2);
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f11682e.putInt(strC, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle = this.f11682e;
                                    bundle.putString(strC, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public int hashCode() {
        Iterator<String> it = this.f11682e.keySet().iterator();
        int iHashCode = 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + this.f11682e.get(it.next()).hashCode();
        }
        return (iHashCode * 31) + this.f11681d.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.w(parcel, 2, I(), false);
        c.f.a.c.f.q.w.c.e(parcel, 3, this.f11682e, false);
        c.f.a.c.f.q.w.c.l(parcel, 4, J());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
