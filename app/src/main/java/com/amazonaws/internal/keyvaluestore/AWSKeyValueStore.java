package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class AWSKeyValueStore {
    private static final int AWS_KEY_VALUE_STORE_VERSION = 1;
    private static final String CHARSET_NAME = "UTF-8";
    private static final String CIPHER_AES_GCM_NOPADDING = "AES/GCM/NoPadding";
    private static final int CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES = 12;
    private static final int CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS = 128;
    public static final String SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX = ".encrypted";
    public static final String SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX = ".encryptionkey";
    public static final String SHARED_PREFERENCES_IV_SUFFIX = ".iv";
    public static final String SHARED_PREFERENCES_STORE_VERSION_SUFFIX = ".keyvaluestoreversion";
    private Map<String, String> cache;
    public Context context;
    private boolean isPersistenceEnabled;
    public KeyProvider keyProvider;
    private SecureRandom secureRandom = new SecureRandom();
    public SharedPreferences sharedPreferencesForData;
    public SharedPreferences sharedPreferencesForEncryptionMaterials;
    private final String sharedPreferencesName;
    private static final Log logger = LogFactory.getLog((Class<?>) AWSKeyValueStore.class);
    public static Map<String, HashMap<String, String>> cacheFactory = new HashMap();

    public AWSKeyValueStore(Context context, String str, boolean z) {
        this.cache = getCacheForKey(str);
        this.sharedPreferencesName = str;
        this.context = context;
        setPersistenceEnabled(z);
    }

    private String decrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            byte[] bArrDecode = Base64.decode(str);
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(2, key, algorithmParameterSpec);
            return new String(cipher.doFinal(bArrDecode), "UTF-8");
        } catch (Exception e2) {
            logger.error("Error in decrypting data. ", e2);
            return null;
        }
    }

    private String encrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(1, key, algorithmParameterSpec);
            return Base64.encodeAsString(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception e2) {
            logger.error("Error in encrypting data. ", e2);
            return null;
        }
    }

    private byte[] generateInitializationVector() {
        byte[] bArr = new byte[12];
        this.secureRandom.nextBytes(bArr);
        return bArr;
    }

    private AlgorithmParameterSpec getAlgorithmParameterSpecForIV(byte[] bArr) {
        return Build.VERSION.SDK_INT >= 23 ? new GCMParameterSpec(CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS, bArr) : new IvParameterSpec(bArr);
    }

    private static Map<String, String> getCacheForKey(String str) {
        if (cacheFactory.containsKey(str)) {
            return cacheFactory.get(str);
        }
        HashMap<String, String> map = new HashMap<>();
        cacheFactory.put(str, map);
        return map;
    }

    private String getDataKeyUsedInPersistentStore(String str) {
        if (str == null) {
            return null;
        }
        return str + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
    }

    private String getEncryptionKeyAlias() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return this.sharedPreferencesName + KeyProvider23.AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX;
        }
        if (i2 >= 18) {
            return this.sharedPreferencesName + KeyProvider18.AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_RSA_SUFFIX;
        }
        if (i2 >= 10) {
            return KeyProvider10.KEY_ALIAS;
        }
        logger.error("API Level " + String.valueOf(i2) + " not supported by the SDK. Setting persistence to false.");
        this.isPersistenceEnabled = false;
        return null;
    }

    private AlgorithmParameterSpec getInitializationVector(String str) throws Exception {
        String str2 = str + SHARED_PREFERENCES_IV_SUFFIX;
        if (!this.sharedPreferencesForData.contains(str2)) {
            throw new Exception("Initialization vector for " + str + " is missing from the SharedPreferences.");
        }
        String string = this.sharedPreferencesForData.getString(str2, null);
        if (string == null) {
            throw new Exception("Cannot read the initialization vector for " + str + " from SharedPreferences.");
        }
        byte[] bArrDecode = Base64.decode(string);
        if (bArrDecode != null && bArrDecode.length != 0) {
            return getAlgorithmParameterSpecForIV(bArrDecode);
        }
        throw new Exception("Cannot base64 decode the initialization vector for " + str + " read from SharedPreferences.");
    }

    private void initKeyProviderBasedOnAPILevel() {
        KeyProvider keyProvider10;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            keyProvider10 = new KeyProvider23();
        } else if (i2 >= 18) {
            keyProvider10 = new KeyProvider18(this.context, this.sharedPreferencesForEncryptionMaterials);
        } else {
            if (i2 < 10) {
                logger.error("API Level " + String.valueOf(i2) + " not supported by the SDK. Setting persistence to false.");
                this.isPersistenceEnabled = false;
                return;
            }
            keyProvider10 = new KeyProvider10(this.sharedPreferencesForEncryptionMaterials);
        }
        this.keyProvider = keyProvider10;
    }

    private void onMigrateFromNoEncryption() {
        String string;
        Object objValueOf;
        Map<String, ?> all = this.sharedPreferencesForData.getAll();
        for (String str : all.keySet()) {
            if (!str.endsWith(SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX) && !str.endsWith(SHARED_PREFERENCES_IV_SUFFIX) && !str.endsWith(SHARED_PREFERENCES_STORE_VERSION_SUFFIX)) {
                if (all.get(str) instanceof Long) {
                    objValueOf = Long.valueOf(this.sharedPreferencesForData.getLong(str, 0L));
                } else {
                    if (all.get(str) instanceof String) {
                        string = this.sharedPreferencesForData.getString(str, null);
                    } else if (all.get(str) instanceof Float) {
                        objValueOf = Float.valueOf(this.sharedPreferencesForData.getFloat(str, 0.0f));
                    } else if (all.get(str) instanceof Boolean) {
                        objValueOf = Boolean.valueOf(this.sharedPreferencesForData.getBoolean(str, false));
                    } else if (all.get(str) instanceof Integer) {
                        objValueOf = Integer.valueOf(this.sharedPreferencesForData.getInt(str, 0));
                    } else {
                        if (all.get(str) instanceof Set) {
                            Set set = (Set) all.get(str);
                            StringBuilder sb = new StringBuilder();
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                sb.append((String) it.next());
                                if (it.hasNext()) {
                                    sb.append(",");
                                }
                            }
                            string = sb.toString();
                        }
                        this.sharedPreferencesForData.edit().remove(str).apply();
                    }
                    put(str, string);
                    this.sharedPreferencesForData.edit().remove(str).apply();
                }
                string = String.valueOf(objValueOf);
                put(str, string);
                this.sharedPreferencesForData.edit().remove(str).apply();
            }
        }
    }

    private synchronized Key retrieveEncryptionKey(String str) {
        try {
        } catch (KeyNotFoundException e2) {
            Log log = logger;
            log.error(e2);
            log.info("Deleting the encryption key identified by the keyAlias: " + str);
            this.keyProvider.deleteKey(str);
            return null;
        }
        return this.keyProvider.retrieveKey(str);
    }

    public synchronized void clear() {
        this.cache.clear();
        if (this.isPersistenceEnabled) {
            this.sharedPreferencesForData.edit().clear().apply();
        }
    }

    public synchronized boolean contains(String str) {
        if (!this.isPersistenceEnabled) {
            return this.cache.containsKey(str);
        }
        if (this.cache.containsKey(str)) {
            return true;
        }
        return this.sharedPreferencesForData.contains(getDataKeyUsedInPersistentStore(str));
    }

    public synchronized Key generateEncryptionKey(String str) {
        try {
        } catch (KeyNotGeneratedException e2) {
            logger.error("Encryption Key cannot be generated successfully.", e2);
            return null;
        }
        return this.keyProvider.generateKey(str);
    }

    public synchronized String get(String str) {
        if (str == null) {
            return null;
        }
        if (!this.cache.containsKey(str) && this.isPersistenceEnabled) {
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            Key keyRetrieveEncryptionKey = retrieveEncryptionKey(getEncryptionKeyAlias());
            if (keyRetrieveEncryptionKey == null) {
                logger.error("Error in retrieving the decryption key used to decrypt the data from the persistent store. Returning null for the requested dataKey = " + str);
                return null;
            }
            if (!this.sharedPreferencesForData.contains(dataKeyUsedInPersistentStore)) {
                return null;
            }
            try {
                if (Integer.parseInt(this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null)) == 1) {
                    String strDecrypt = decrypt(keyRetrieveEncryptionKey, getInitializationVector(dataKeyUsedInPersistentStore), this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore, null));
                    this.cache.put(str, strDecrypt);
                    return strDecrypt;
                }
                logger.error("The version of the data read from SharedPreferences for " + str + " does not match the version of the store.");
                return null;
            } catch (Exception e2) {
                logger.error("Error in retrieving value for dataKey = " + str, e2);
                remove(str);
                return null;
            }
        }
        return this.cache.get(str);
    }

    public synchronized void put(String str, String str2) {
        byte[] bArrGenerateInitializationVector;
        if (str == null) {
            logger.error("dataKey is null.");
            return;
        }
        this.cache.put(str, str2);
        if (this.isPersistenceEnabled) {
            if (str2 == null) {
                logger.debug("Value is null. Removing the data, IV and version from SharedPreferences");
                this.cache.remove(str);
                remove(str);
                return;
            }
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            String encryptionKeyAlias = getEncryptionKeyAlias();
            Key keyRetrieveEncryptionKey = retrieveEncryptionKey(encryptionKeyAlias);
            if (keyRetrieveEncryptionKey == null) {
                Log log = logger;
                log.warn("No encryption key found for encryptionKeyAlias: " + encryptionKeyAlias);
                Key keyGenerateEncryptionKey = generateEncryptionKey(encryptionKeyAlias);
                if (keyGenerateEncryptionKey == null) {
                    log.error("Error in generating the encryption key for encryptionKeyAlias: " + encryptionKeyAlias + " used to encrypt the data before storing. Skipping persisting the data in the persistent store.");
                    return;
                }
                keyRetrieveEncryptionKey = keyGenerateEncryptionKey;
            }
            try {
                bArrGenerateInitializationVector = generateInitializationVector();
            } catch (Exception e2) {
                logger.error("Error in storing value for dataKey = " + str + ". This data has not been stored in the persistent store.", e2);
            }
            if (bArrGenerateInitializationVector == null) {
                throw new Exception("The generated IV for dataKey = " + str + " is null.");
            }
            String strEncrypt = encrypt(keyRetrieveEncryptionKey, getAlgorithmParameterSpecForIV(bArrGenerateInitializationVector), str2);
            String strEncodeAsString = Base64.encodeAsString(bArrGenerateInitializationVector);
            if (strEncodeAsString == null) {
                throw new Exception("Error in Base64 encoding the IV for dataKey = " + str);
            }
            this.sharedPreferencesForData.edit().putString(dataKeyUsedInPersistentStore, strEncrypt).putString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX, strEncodeAsString).putString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, String.valueOf(1)).apply();
        }
    }

    public synchronized void remove(String str) {
        this.cache.remove(str);
        if (this.isPersistenceEnabled) {
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            this.sharedPreferencesForData.edit().remove(dataKeyUsedInPersistentStore).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX).apply();
        }
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        try {
            boolean z2 = this.isPersistenceEnabled;
            this.isPersistenceEnabled = z;
            if (z && !z2) {
                this.sharedPreferencesForData = this.context.getSharedPreferences(this.sharedPreferencesName, 0);
                this.sharedPreferencesForEncryptionMaterials = this.context.getSharedPreferences(this.sharedPreferencesName + SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX, 0);
                initKeyProviderBasedOnAPILevel();
                Log log = logger;
                log.info("Detected Android API Level = " + Build.VERSION.SDK_INT);
                log.info("Creating the AWSKeyValueStore with key for sharedPreferencesForData = " + this.sharedPreferencesName);
                onMigrateFromNoEncryption();
            } else if (!z) {
                logger.info("Persistence is disabled. Data will be accessed from memory.");
            }
            if (!z && z2) {
                this.sharedPreferencesForData.edit().clear().apply();
            }
        } catch (Exception e2) {
            logger.error("Error in enabling persistence for " + this.sharedPreferencesName, e2);
        }
    }
}
