package c.f.a.b.x2;

import c.f.a.b.j3.x0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static byte[] a(byte[] bArr) {
        return x0.f9296a >= 27 ? bArr : x0.k0(c(x0.E(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (x0.f9296a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(x0.E(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return x0.k0(sb.toString());
        } catch (JSONException e2) {
            c.f.a.b.j3.z.e("ClearKeyUtil", "Failed to adjust response data: " + x0.E(bArr), e2);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
