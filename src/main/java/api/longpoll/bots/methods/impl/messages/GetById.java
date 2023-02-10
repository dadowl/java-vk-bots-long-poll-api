package api.longpoll.bots.methods.impl.messages;

import api.longpoll.bots.methods.impl.VkMethod;
import api.longpoll.bots.utils.ParamUtils;
import api.longpoll.bots.utils.VkMethods;

import java.util.Arrays;

/**
 * Implements <b>messages.getById</b> method.
 * <p>
 * Returns messages by their IDs.
 *
 * @see <a href="https://vk.com/dev/messages.getById">https://vk.com/dev/messages.getById</a>
 */
public class GetById extends VkMethod<GetById.ResponseBody> {
    public GetById(String accessToken) {
        super(VkMethods.get("messages.getById"), accessToken);
    }

    @Override
    protected Class<ResponseBody> getResponseClass() {
        return ResponseBody.class;
    }

    public GetById setMessageIds(Integer... messageIds) {
        return setMessageIds(Arrays.asList(messageIds));
    }

    public GetById setMessageIds(Iterable<Integer> messageIds) {
        return addParam("message_ids", ParamUtils.csv(messageIds));
    }

    public GetById setPreviewLength(int previewLength) {
        return addParam("preview_length", previewLength);
    }

    public GetById setExtended(boolean extended) {
        return addParam("extended", extended ? 1 : 0);
    }

    public GetById setFields(String... fields) {
        return setFields(Arrays.asList(fields));
    }

    public GetById setFields(Iterable<String> fields) {
        return addParam("fields", ParamUtils.csv(fields));
    }

    public GetById setGroupId(int groupId) {
        return addParam("group_id", groupId);
    }

    @Override
    public GetById addParam(String key, Object value) {
        return (GetById) super.addParam(key, value);
    }

    /**
     * Response to <b>messages.getById</b> request.
     */
    public static class ResponseBody extends GetByConversationMessageId.ResponseBody {
    }
}
