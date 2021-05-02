package api.longpoll.bots.methods.other;

import api.longpoll.bots.methods.VkApiPostMethod;
import api.longpoll.bots.model.objects.media.FileType;
import api.longpoll.bots.model.response.other.UploadPhotoResult;

import java.util.Map;
import java.util.stream.Stream;

/**
 * Implements uploading photo in VK API.
 */
public class UploadPhoto extends VkApiPostMethod<UploadPhotoResult> {
    /**
     * Upload URL.
     */
    private String uploadUrl;

    @Override
    protected String getApi() {
        return uploadUrl;
    }

    @Override
    protected Stream<Map.Entry<String, Object>> getParamsStream() {
        return Stream.of();
    }

    @Override
    protected Class<? extends UploadPhotoResult> getResultType() {
        return UploadPhotoResult.class;
    }

    @Override
    protected FileType getType() {
        return FileType.PHOTO;
    }

    public UploadPhoto setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
}
