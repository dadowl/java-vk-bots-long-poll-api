package api.longpoll.bots.methods.impl.users;

import api.longpoll.bots.methods.AuthorizedVkApiMethod;
import api.longpoll.bots.methods.VkApiProperties;
import api.longpoll.bots.model.objects.basic.User;
import api.longpoll.bots.model.response.GenericResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Implements <b>users.get</b> method.
 * <p>
 * Returns detailed information on users.
 *
 * @see <a href="https://vk.com/dev/users.get">https://vk.com/dev/users.get</a>
 */
public class Get extends AuthorizedVkApiMethod<Get.Response> {
    public Get(String accessToken) {
        super(accessToken);
    }

    @Override
    protected String getUrl() {
        return VkApiProperties.get("users.get");
    }

    @Override
    protected Class<Response> getResponseType() {
        return Response.class;
    }

    public Get setUserIds(Integer... userIds) {
        return setUserIds(Arrays.asList(userIds));
    }

    public Get setUserIds(List<Integer> userIds) {
        addParam("user_ids", userIds);
        return this;
    }

    public Get setFields(String... fields) {
        return setFields(Arrays.asList(fields));
    }

    public Get setFields(List<String> fields) {
        addParam("fields", fields);
        return this;
    }

    public Get setNameCase(String nameCase) {
        addParam("name_case", nameCase);
        return this;
    }

    /**
     * Response to <b>users.get</b>
     */
    public static class Response extends GenericResponse<List<User>> {
    }
}
