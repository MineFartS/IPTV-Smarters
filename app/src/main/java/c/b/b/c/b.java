package c.b.b.c;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelProvider;
import com.amplifyframework.core.model.ModelSchema;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static Set a(ModelProvider modelProvider) {
        HashSet hashSet = new HashSet();
        if (modelProvider.models() == null) {
            return hashSet;
        }
        Iterator<Class<? extends Model>> it = modelProvider.models().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getSimpleName());
        }
        return hashSet;
    }

    public static Map b(ModelProvider modelProvider) {
        HashMap map = new HashMap();
        if (modelProvider.models() == null) {
            return map;
        }
        for (Class<? extends Model> cls : modelProvider.models()) {
            try {
                map.put(cls.getSimpleName(), ModelSchema.fromModelClass(cls));
            } catch (AmplifyException e2) {
                e2.printStackTrace();
            }
        }
        return map;
    }
}
