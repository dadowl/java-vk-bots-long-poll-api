package api.longpoll.bots.methods.impl.messages;

import api.longpoll.bots.methods.impl.VkMethod;
import api.longpoll.bots.model.response.IntegerResponseBody;

/**
 * Implements <b>messages.setActivity</b> method.
 * <p>
 * Changes the status of a user as typing in a conversation.
 *
 * @see <a href="https://vk.com/dev/messages.setActivity">https://vk.com/dev/messages.setActivity</a>
 */
public class SetActivity extends VkMethod<IntegerResponseBody> {
    public SetActivity(String accessToken) {
        super(, accessToken);
    }

    @Override
    public String getUri() {
        return property("messages.setActivity");
    }

    @Override
    protected Class<IntegerResponseBody> getResponseClass() {
        return IntegerResponseBody.class;
    }

    public SetActivity setUserId(int userId) {
        return addParam("user_id", userId);
    }

    public SetActivity setType(String type) {
        return addParam("type", type);
    }

    public SetActivity setPeerId(int peerId) {
        return addParam("peer_id", peerId);
    }

    public SetActivity setGroupId(int groupId) {
        return addParam("group_id", groupId);
    }

    @Override
    public SetActivity addParam(String key, Object value) {
        return (SetActivity) super.addParam(key, value);
    }
}
