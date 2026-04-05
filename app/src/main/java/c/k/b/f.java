package c.k.b;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import c.k.b.t;
import c.k.b.y;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class f extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UriMatcher f18691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18692b;

    @TargetApi(14)
    public static class a {
        public static InputStream a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f18691a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public f(Context context) {
        this.f18692b = context;
    }

    @Override // c.k.b.y
    public boolean c(w wVar) {
        Uri uri = wVar.f18787e;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f18691a.match(wVar.f18787e) != -1;
    }

    @Override // c.k.b.y
    public y.a f(w wVar, int i2) {
        InputStream inputStreamJ = j(wVar);
        if (inputStreamJ != null) {
            return new y.a(inputStreamJ, t.e.DISK);
        }
        return null;
    }

    public final InputStream j(w wVar) {
        ContentResolver contentResolver = this.f18692b.getContentResolver();
        Uri uriLookupContact = wVar.f18787e;
        int iMatch = f18691a.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            return contentResolver.openInputStream(uriLookupContact);
        }
        uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
        if (uriLookupContact == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact) : a.a(contentResolver, uriLookupContact);
    }
}
