package api.longpoll.bots.methods.impl.market;

import api.longpoll.bots.methods.impl.VkMethod;
import api.longpoll.bots.model.objects.additional.VkList;
import api.longpoll.bots.model.objects.basic.MarketOrder;
import api.longpoll.bots.model.response.GenericResponseBody;

/**
 * Implements <b>market.getGroupOrders</b> method.
 * <p>
 * Returns community's orders.
 *
 * @see <a href="https://vk.com/dev/market.getGroupOrders">https://vk.com/dev/market.getGroupOrders</a>
 */
public class GetGroupOrders extends VkMethod<GetGroupOrders.ResponseBody> {
    public GetGroupOrders(String accessToken) {
        super(accessToken);
    }

    @Override
    public String getUri() {
        return VK_METHODS.getProperty("market.getGroupOrders");
    }

    @Override
    protected Class<ResponseBody> getResponseType() {
        return ResponseBody.class;
    }

    public GetGroupOrders setGroupId(int groupId) {
        return addParam("group_id", groupId);
    }

    public GetGroupOrders setOffset(int offset) {
        return addParam("offset", offset);
    }

    public GetGroupOrders setCount(int count) {
        return addParam("count", count);
    }

    @Override
    public GetGroupOrders addParam(String key, Object value) {
        return (GetGroupOrders) super.addParam(key, value);
    }

    /**
     * Response to <b>market.getGroupOrders</b> request.
     */
    public static class ResponseBody extends GenericResponseBody<VkList<MarketOrder>> {
    }
}
