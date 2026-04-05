package a.v;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f3571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3573c;

    public j(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public j(Uri uri, String str, String str2) {
        this.f3571a = uri;
        this.f3572b = str;
        this.f3573c = str2;
    }

    public String a() {
        return this.f3572b;
    }

    public String b() {
        return this.f3573c;
    }

    public Uri c() {
        return this.f3571a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.f3571a != null) {
            sb.append(" uri=");
            sb.append(this.f3571a.toString());
        }
        if (this.f3572b != null) {
            sb.append(" action=");
            sb.append(this.f3572b);
        }
        if (this.f3573c != null) {
            sb.append(" mimetype=");
            sb.append(this.f3573c);
        }
        sb.append(" }");
        return sb.toString();
    }
}
