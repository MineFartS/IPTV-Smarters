package com.amplifyframework.util;

import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.core.model.annotations.ModelField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class FieldFinder {
    private FieldFinder() {
    }

    public static Object extractFieldValue(Object obj, String str) throws NoSuchFieldException {
        if (obj instanceof SerializedModel) {
            return ((SerializedModel) obj).getSerializedData().get(str);
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (NoSuchFieldException e2) {
            throw e2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<Field> findModelFieldsIn(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(ModelField.class)) {
                    arrayList.add(field);
                }
            }
            cls = cls.getSuperclass();
        }
        Collections.sort(arrayList, new Comparator() { // from class: c.b.f.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Field) obj).getName().compareTo(((Field) obj2).getName());
            }
        });
        return Immutable.of(arrayList);
    }

    public static List<Field> findNonTransientFieldsIn(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isTransient(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            cls = cls.getSuperclass();
        }
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: c.b.f.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Field) obj).getName();
            }
        }));
        return Immutable.of(arrayList);
    }
}
