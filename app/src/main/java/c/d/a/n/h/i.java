package c.d.a.n.h;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class i extends g<InputStream> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UriMatcher f5516d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f5516d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public i(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // c.d.a.n.h.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // c.d.a.n.h.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream d(Uri uri, ContentResolver contentResolver) {
        return g(uri, contentResolver, f5516d.match(uri));
    }

    public final InputStream g(Uri uri, ContentResolver contentResolver, int i2) throws FileNotFoundException {
        if (i2 != 1 && i2 != 3) {
            return contentResolver.openInputStream(uri);
        }
        if (i2 == 1 && (uri = ContactsContract.Contacts.lookupContact(contentResolver, uri)) == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        return h(contentResolver, uri);
    }

    @TargetApi(14)
    public final InputStream h(ContentResolver contentResolver, Uri uri) {
        return Build.VERSION.SDK_INT < 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri) : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
