// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.options;

import com.azure.core.annotation.Fluent;
import com.azure.storage.blob.models.BlobRange;
import com.azure.storage.blob.models.BlobRequestConditions;
import com.azure.storage.blob.models.DownloadRetryOptions;
import com.azure.storage.common.ParallelTransferOptions;
import com.azure.storage.common.implementation.StorageImplUtils;

import java.nio.file.OpenOption;
import java.util.Set;

/**
 * Extended options that may be passed when downloading a blob to a file.
 */
@Fluent
public class BlobDownloadToFileOptions {
    private final String filePath;
    private BlobRange range;
    private ParallelTransferOptions parallelTransferOptions;
    private DownloadRetryOptions downloadRetryOptions;
    private BlobRequestConditions requestConditions;
    private boolean retrieveContentRangeMd5;
    private Set<OpenOption> openOptions;

    /**
     * Constructs a {@link BlobDownloadToFileOptions}.
     *
     * @param filePath Path of the file to download to.
     * @throws NullPointerException If {@code filePath} is null.
     */
    public BlobDownloadToFileOptions(String filePath) {
        StorageImplUtils.assertNotNull("filePath", filePath);
        this.filePath = filePath;
    }

    /**
     * Gets the path of the file to download to.
     *
     * @return The path of the file to download to.
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Gets the {@link BlobRange}.
     *
     * @return {@link BlobRange}
     */
    public BlobRange getRange() {
        return range;
    }

    /**
     * Gets the {@link ParallelTransferOptions}.
     *
     * @return {@link ParallelTransferOptions}
     */
    public ParallelTransferOptions getParallelTransferOptions() {
        return parallelTransferOptions;
    }

    /**
     * Gets the {@link DownloadRetryOptions}.
     *
     * @return {@link DownloadRetryOptions}
     */
    public DownloadRetryOptions getDownloadRetryOptions() {
        return downloadRetryOptions;
    }

    /**
     * Gets the {@link BlobRequestConditions}.
     *
     * @return {@link BlobRequestConditions}
     */
    public BlobRequestConditions getRequestConditions() {
        return requestConditions;
    }

    /**
     * Gets whether the contentMD5 for the specified blob range should be returned.
     *
     * @return Whether the contentMD5 for the specified blob range should be returned.
     */
    public boolean isRetrieveContentRangeMd5() {
        return retrieveContentRangeMd5;
    }

    /**
     * Gets the {@link OpenOption OpenOptions} to use to configure how to open or create the file.
     *
     * @return {@link OpenOption OpenOptions} to use to configure how to open or create the file.
     */
    public Set<OpenOption> getOpenOptions() {
        return openOptions;
    }

    /**
     * Sets the {@link BlobRange}.
     *
     * @param range {@link BlobRange}
     * @return The updated options.
     */
    public BlobDownloadToFileOptions setRange(BlobRange range) {
        this.range = range;
        return this;
    }

    /**
     * Sets the {@link ParallelTransferOptions}.
     *
     * @param parallelTransferOptions {@link ParallelTransferOptions}
     * @return The updated options.
     */
    public BlobDownloadToFileOptions setParallelTransferOptions(ParallelTransferOptions parallelTransferOptions) {
        this.parallelTransferOptions = parallelTransferOptions;
        return this;
    }

    /**
     * Sets the {@link DownloadRetryOptions}.
     *
     * @param downloadRetryOptions {@link DownloadRetryOptions}
     * @return The updated options.
     */
    public BlobDownloadToFileOptions setDownloadRetryOptions(DownloadRetryOptions downloadRetryOptions) {
        this.downloadRetryOptions = downloadRetryOptions;
        return this;
    }

    /**
     * Sets the {@link BlobRequestConditions}.
     *
     * @param requestConditions {@link BlobRequestConditions}
     * @return The updated options.
     */
    public BlobDownloadToFileOptions setRequestConditions(BlobRequestConditions requestConditions) {
        this.requestConditions = requestConditions;
        return this;
    }

    /**
     * Sets whether the contentMD5 for the specified blob range should be returned.
     *
     * @param retrieveContentRangeMd5 Whether the contentMD5 for the specified blob range should be returned.
     * @return The updated options.
     */
    public BlobDownloadToFileOptions setRetrieveContentRangeMd5(boolean retrieveContentRangeMd5) {
        this.retrieveContentRangeMd5 = retrieveContentRangeMd5;
        return this;
    }

    /**
     * Sets the {@link OpenOption OpenOptions} to use to configure how to open or create the file.
     *
     * @param openOptions {@link OpenOption OpenOptions} to use to configure how to open or create the file.
     * @return The updated options.
     */
    public BlobDownloadToFileOptions setOpenOptions(Set<OpenOption> openOptions) {
        this.openOptions = openOptions;
        return this;
    }
}
