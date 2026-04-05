package com.amazonaws.services.s3;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.HttpMethod;
import com.amazonaws.services.s3.internal.S3DirectSpi;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketPolicy;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketPolicyRequest;
import com.amazonaws.services.s3.model.DeleteBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectTaggingRequest;
import com.amazonaws.services.s3.model.DeleteObjectTaggingResult;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.DeleteVersionRequest;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.GetBucketAccelerateConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketAclRequest;
import com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketLocationRequest;
import com.amazonaws.services.s3.model.GetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketMetricsConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketNotificationConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketPolicyRequest;
import com.amazonaws.services.s3.model.GetBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.GetObjectAclRequest;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GetObjectTaggingRequest;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;
import com.amazonaws.services.s3.model.GetS3AccountOwnerRequest;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.HeadBucketResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsRequest;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsRequest;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsRequest;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketsRequest;
import com.amazonaws.services.s3.model.ListMultipartUploadsRequest;
import com.amazonaws.services.s3.model.ListNextBatchOfObjectsRequest;
import com.amazonaws.services.s3.model.ListNextBatchOfVersionsRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.RestoreObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketAclRequest;
import com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketInventoryConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketMetricsConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketPolicyRequest;
import com.amazonaws.services.s3.model.SetBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.SetObjectAclRequest;
import com.amazonaws.services.s3.model.SetObjectTaggingRequest;
import com.amazonaws.services.s3.model.SetObjectTaggingResult;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface AmazonS3 extends S3DirectSpi {
    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    void abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest);

    void changeObjectStorageClass(String str, String str2, StorageClass storageClass);

    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest);

    CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest);

    CopyObjectResult copyObject(String str, String str2, String str3, String str4);

    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    CopyPartResult copyPart(CopyPartRequest copyPartRequest);

    Bucket createBucket(CreateBucketRequest createBucketRequest);

    Bucket createBucket(String str);

    Bucket createBucket(String str, Region region);

    Bucket createBucket(String str, String str2);

    void deleteBucket(DeleteBucketRequest deleteBucketRequest);

    void deleteBucket(String str);

    DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(DeleteBucketAnalyticsConfigurationRequest deleteBucketAnalyticsConfigurationRequest);

    DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(String str, String str2);

    void deleteBucketCrossOriginConfiguration(DeleteBucketCrossOriginConfigurationRequest deleteBucketCrossOriginConfigurationRequest);

    void deleteBucketCrossOriginConfiguration(String str);

    DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(DeleteBucketInventoryConfigurationRequest deleteBucketInventoryConfigurationRequest);

    DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(String str, String str2);

    void deleteBucketLifecycleConfiguration(DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest);

    void deleteBucketLifecycleConfiguration(String str);

    DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(DeleteBucketMetricsConfigurationRequest deleteBucketMetricsConfigurationRequest);

    DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(String str, String str2);

    void deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest);

    void deleteBucketPolicy(String str);

    void deleteBucketReplicationConfiguration(DeleteBucketReplicationConfigurationRequest deleteBucketReplicationConfigurationRequest);

    void deleteBucketReplicationConfiguration(String str);

    void deleteBucketTaggingConfiguration(DeleteBucketTaggingConfigurationRequest deleteBucketTaggingConfigurationRequest);

    void deleteBucketTaggingConfiguration(String str);

    void deleteBucketWebsiteConfiguration(DeleteBucketWebsiteConfigurationRequest deleteBucketWebsiteConfigurationRequest);

    void deleteBucketWebsiteConfiguration(String str);

    void deleteObject(DeleteObjectRequest deleteObjectRequest);

    void deleteObject(String str, String str2);

    DeleteObjectTaggingResult deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest);

    DeleteObjectsResult deleteObjects(DeleteObjectsRequest deleteObjectsRequest);

    void deleteVersion(DeleteVersionRequest deleteVersionRequest);

    void deleteVersion(String str, String str2, String str3);

    void disableRequesterPays(String str);

    boolean doesBucketExist(String str);

    boolean doesObjectExist(String str, String str2);

    void enableRequesterPays(String str);

    URL generatePresignedUrl(GeneratePresignedUrlRequest generatePresignedUrlRequest);

    URL generatePresignedUrl(String str, String str2, Date date);

    URL generatePresignedUrl(String str, String str2, Date date, HttpMethod httpMethod);

    BucketAccelerateConfiguration getBucketAccelerateConfiguration(GetBucketAccelerateConfigurationRequest getBucketAccelerateConfigurationRequest);

    BucketAccelerateConfiguration getBucketAccelerateConfiguration(String str);

    AccessControlList getBucketAcl(GetBucketAclRequest getBucketAclRequest);

    AccessControlList getBucketAcl(String str);

    GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(GetBucketAnalyticsConfigurationRequest getBucketAnalyticsConfigurationRequest);

    GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(String str, String str2);

    BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(GetBucketCrossOriginConfigurationRequest getBucketCrossOriginConfigurationRequest);

    BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(String str);

    GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(GetBucketInventoryConfigurationRequest getBucketInventoryConfigurationRequest);

    GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(String str, String str2);

    BucketLifecycleConfiguration getBucketLifecycleConfiguration(GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest);

    BucketLifecycleConfiguration getBucketLifecycleConfiguration(String str);

    String getBucketLocation(GetBucketLocationRequest getBucketLocationRequest);

    String getBucketLocation(String str);

    BucketLoggingConfiguration getBucketLoggingConfiguration(GetBucketLoggingConfigurationRequest getBucketLoggingConfigurationRequest);

    BucketLoggingConfiguration getBucketLoggingConfiguration(String str);

    GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(GetBucketMetricsConfigurationRequest getBucketMetricsConfigurationRequest);

    GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(String str, String str2);

    BucketNotificationConfiguration getBucketNotificationConfiguration(GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest);

    BucketNotificationConfiguration getBucketNotificationConfiguration(String str);

    BucketPolicy getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest);

    BucketPolicy getBucketPolicy(String str);

    BucketReplicationConfiguration getBucketReplicationConfiguration(GetBucketReplicationConfigurationRequest getBucketReplicationConfigurationRequest);

    BucketReplicationConfiguration getBucketReplicationConfiguration(String str);

    BucketTaggingConfiguration getBucketTaggingConfiguration(GetBucketTaggingConfigurationRequest getBucketTaggingConfigurationRequest);

    BucketTaggingConfiguration getBucketTaggingConfiguration(String str);

    BucketVersioningConfiguration getBucketVersioningConfiguration(GetBucketVersioningConfigurationRequest getBucketVersioningConfigurationRequest);

    BucketVersioningConfiguration getBucketVersioningConfiguration(String str);

    BucketWebsiteConfiguration getBucketWebsiteConfiguration(GetBucketWebsiteConfigurationRequest getBucketWebsiteConfigurationRequest);

    BucketWebsiteConfiguration getBucketWebsiteConfiguration(String str);

    S3ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest);

    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    ObjectMetadata getObject(GetObjectRequest getObjectRequest, File file);

    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    S3Object getObject(GetObjectRequest getObjectRequest);

    S3Object getObject(String str, String str2);

    AccessControlList getObjectAcl(GetObjectAclRequest getObjectAclRequest);

    AccessControlList getObjectAcl(String str, String str2);

    AccessControlList getObjectAcl(String str, String str2, String str3);

    String getObjectAsString(String str, String str2);

    ObjectMetadata getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest);

    ObjectMetadata getObjectMetadata(String str, String str2);

    GetObjectTaggingResult getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest);

    Region getRegion();

    String getRegionName();

    Owner getS3AccountOwner();

    Owner getS3AccountOwner(GetS3AccountOwnerRequest getS3AccountOwnerRequest);

    URL getUrl(String str, String str2);

    HeadBucketResult headBucket(HeadBucketRequest headBucketRequest);

    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest initiateMultipartUploadRequest);

    boolean isRequesterPaysEnabled(String str);

    ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurations(ListBucketAnalyticsConfigurationsRequest listBucketAnalyticsConfigurationsRequest);

    ListBucketInventoryConfigurationsResult listBucketInventoryConfigurations(ListBucketInventoryConfigurationsRequest listBucketInventoryConfigurationsRequest);

    ListBucketMetricsConfigurationsResult listBucketMetricsConfigurations(ListBucketMetricsConfigurationsRequest listBucketMetricsConfigurationsRequest);

    List<Bucket> listBuckets();

    List<Bucket> listBuckets(ListBucketsRequest listBucketsRequest);

    MultipartUploadListing listMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest);

    ObjectListing listNextBatchOfObjects(ListNextBatchOfObjectsRequest listNextBatchOfObjectsRequest);

    ObjectListing listNextBatchOfObjects(ObjectListing objectListing);

    VersionListing listNextBatchOfVersions(ListNextBatchOfVersionsRequest listNextBatchOfVersionsRequest);

    VersionListing listNextBatchOfVersions(VersionListing versionListing);

    ObjectListing listObjects(ListObjectsRequest listObjectsRequest);

    ObjectListing listObjects(String str);

    ObjectListing listObjects(String str, String str2);

    ListObjectsV2Result listObjectsV2(ListObjectsV2Request listObjectsV2Request);

    ListObjectsV2Result listObjectsV2(String str);

    ListObjectsV2Result listObjectsV2(String str, String str2);

    PartListing listParts(ListPartsRequest listPartsRequest);

    VersionListing listVersions(ListVersionsRequest listVersionsRequest);

    VersionListing listVersions(String str, String str2);

    VersionListing listVersions(String str, String str2, String str3, String str4, String str5, Integer num);

    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    PutObjectResult putObject(PutObjectRequest putObjectRequest);

    PutObjectResult putObject(String str, String str2, File file);

    PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata);

    PutObjectResult putObject(String str, String str2, String str3);

    void restoreObject(RestoreObjectRequest restoreObjectRequest);

    void restoreObject(String str, String str2, int i2);

    void setBucketAccelerateConfiguration(SetBucketAccelerateConfigurationRequest setBucketAccelerateConfigurationRequest);

    void setBucketAccelerateConfiguration(String str, BucketAccelerateConfiguration bucketAccelerateConfiguration);

    void setBucketAcl(SetBucketAclRequest setBucketAclRequest);

    void setBucketAcl(String str, AccessControlList accessControlList);

    void setBucketAcl(String str, CannedAccessControlList cannedAccessControlList);

    SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(SetBucketAnalyticsConfigurationRequest setBucketAnalyticsConfigurationRequest);

    SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(String str, AnalyticsConfiguration analyticsConfiguration);

    void setBucketCrossOriginConfiguration(SetBucketCrossOriginConfigurationRequest setBucketCrossOriginConfigurationRequest);

    void setBucketCrossOriginConfiguration(String str, BucketCrossOriginConfiguration bucketCrossOriginConfiguration);

    SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(SetBucketInventoryConfigurationRequest setBucketInventoryConfigurationRequest);

    SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(String str, InventoryConfiguration inventoryConfiguration);

    void setBucketLifecycleConfiguration(SetBucketLifecycleConfigurationRequest setBucketLifecycleConfigurationRequest);

    void setBucketLifecycleConfiguration(String str, BucketLifecycleConfiguration bucketLifecycleConfiguration);

    void setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest);

    SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(SetBucketMetricsConfigurationRequest setBucketMetricsConfigurationRequest);

    SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(String str, MetricsConfiguration metricsConfiguration);

    void setBucketNotificationConfiguration(SetBucketNotificationConfigurationRequest setBucketNotificationConfigurationRequest);

    void setBucketNotificationConfiguration(String str, BucketNotificationConfiguration bucketNotificationConfiguration);

    void setBucketPolicy(SetBucketPolicyRequest setBucketPolicyRequest);

    void setBucketPolicy(String str, String str2);

    void setBucketReplicationConfiguration(SetBucketReplicationConfigurationRequest setBucketReplicationConfigurationRequest);

    void setBucketReplicationConfiguration(String str, BucketReplicationConfiguration bucketReplicationConfiguration);

    void setBucketTaggingConfiguration(SetBucketTaggingConfigurationRequest setBucketTaggingConfigurationRequest);

    void setBucketTaggingConfiguration(String str, BucketTaggingConfiguration bucketTaggingConfiguration);

    void setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest);

    void setBucketWebsiteConfiguration(SetBucketWebsiteConfigurationRequest setBucketWebsiteConfigurationRequest);

    void setBucketWebsiteConfiguration(String str, BucketWebsiteConfiguration bucketWebsiteConfiguration);

    void setEndpoint(String str);

    void setObjectAcl(SetObjectAclRequest setObjectAclRequest);

    void setObjectAcl(String str, String str2, AccessControlList accessControlList);

    void setObjectAcl(String str, String str2, CannedAccessControlList cannedAccessControlList);

    void setObjectAcl(String str, String str2, String str3, AccessControlList accessControlList);

    void setObjectAcl(String str, String str2, String str3, CannedAccessControlList cannedAccessControlList);

    void setObjectRedirectLocation(String str, String str2, String str3);

    SetObjectTaggingResult setObjectTagging(SetObjectTaggingRequest setObjectTaggingRequest);

    void setRegion(com.amazonaws.regions.Region region);

    void setS3ClientOptions(S3ClientOptions s3ClientOptions);

    @Override // com.amazonaws.services.s3.internal.S3DirectSpi
    UploadPartResult uploadPart(UploadPartRequest uploadPartRequest);
}
